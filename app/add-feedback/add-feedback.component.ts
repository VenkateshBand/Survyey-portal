import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Feedback } from '../feedback';
import { FeedbackService } from '../feedback.service';
import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-add-feedback',
  templateUrl: './add-feedback.component.html',
  styleUrls: ['./add-feedback.component.css']
})
export class AddFeedbackComponent implements OnInit {
  feedback!:Feedback;
  constructor(private route: ActivatedRoute,private router:Router,  private feedService:FeedbackService) { 
    this.feedback=new Feedback();
  }

  saveFeedback(){
    this.feedService.saveF(this.feedback).subscribe(data=>{console.log(data);});
    this.getAllFeedback;
  }


  getAllFeedback(){
    this.router.navigate(['/question']);
  }

  onSubmit(){
    console.log(this.feedback);
    this.saveFeedback();
    alert("Added Sucessfully");
   }
  ngOnInit(): void {
  }

}
