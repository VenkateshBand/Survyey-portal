import { DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Option } from '../option';
import { Question } from '../question';
import { QuestionService } from '../question-service.service';

import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-add-question',
  templateUrl: './add-question.component.html',
  styleUrls: ['./add-question.component.css']
})
export class AddQuestionComponent implements OnInit {

  question:Question;
 

 constructor(private route: ActivatedRoute,private router:Router, private questionService:QuestionService){
    this.question=new Question();

  }
  saveQuestion(){
    this.questionService.save(this.question).subscribe(data=>{console.log(data);});
    
    this.getAllQuestion;
  }


  getAllQuestion(){
    this.router.navigate(['/question']);
  }

  onSubmit(){
    console.log(this.question);
    this.saveQuestion();
    alert("Added Sucessfully");
   }
  ngOnInit(): void {
  }
}
