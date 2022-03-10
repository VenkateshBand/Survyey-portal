import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Feedback } from '../feedback';
import { FeedbackService } from '../feedback.service';
import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-list-feedback',
  templateUrl: './list-feedback.component.html',
  styleUrls: ['./list-feedback.component.css']
})
export class ListFeedbackComponent implements OnInit {
  feedback!:Feedback[];
  constructor(private feedService:FeedbackService,private router:Router) { }

  ngOnInit():void {
    this.getAll();
  }
  private getAll(){
    this.feedService.findAllF().subscribe(data=>{
    this.feedback=data;
   });
  
  }
  updateFeedback(id:number){
    this.router.navigate(['updateFeedback',id]);
  }
  deleteFeedback(id:number){
    this.feedService.deleteFeedback(id).subscribe(data=>{console.log(data);this.getAll();})
  }

}
