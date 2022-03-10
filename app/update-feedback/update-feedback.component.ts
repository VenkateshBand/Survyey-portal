import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Feedback } from '../feedback';
import { FeedbackService } from '../feedback.service';
import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-update-feedback',
  templateUrl: './update-feedback.component.html',
  styleUrls: ['./update-feedback.component.css']
})
export class UpdateFeedbackComponent implements OnInit {
  feedback:Feedback=new Feedback();
  id!:number;
  constructor(private route: ActivatedRoute,private router:Router, private feedService:FeedbackService) { 
    this.feedback=new Feedback();
  }
  updateFeedback(): void {
    this.router.navigate(['/feedback']);
  }
   
   ngOnInit(): void {
     this.id=this.route.snapshot.params['id'];
     this.feedService.getFeedbackById(this.id).subscribe(data=>(this.feedback=data));
   }

   
   onSubmit(){
    this.feedService.updateFeedback(this.id,this.feedback).subscribe(data=>{
      this.getFeedback();
    });
  }
  getFeedback(){
    this.router.navigate([`/feedback`]);
  }
}
