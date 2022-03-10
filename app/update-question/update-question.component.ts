import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Question } from '../question';
import { QuestionService } from '../question-service.service';

import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-update-question',
  templateUrl: './update-question.component.html',
  styleUrls: ['./update-question.component.css']
})
export class UpdateQuestionComponent implements OnInit {
  question:Question=new Question();
  id!:number;
  constructor(private route: ActivatedRoute,private router:Router, private questionService:QuestionService){
     this.question=new Question();
   }
 
  updateQuestion(): void {
    this.router.navigate(['/question']);
  }   
   ngOnInit(): void {
     this.id=this.route.snapshot.params['id'];
     this.questionService.getQuestionById(this.id).subscribe(data=>(this.question=data));
   }   
   onSubmit(){
    this.questionService.updateQuestion(this.id,this.question).subscribe(data=>{
      this.getQuestion();
    });
  }
  getQuestion(){
    this.router.navigate([`/question`]);
  }

}
