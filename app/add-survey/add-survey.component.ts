import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Feedback } from '../feedback';
import { Survey } from '../survey';
import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-add-survey',
  templateUrl: './add-survey.component.html',
  styleUrls: ['./add-survey.component.css']
})
export class AddSurveyComponent implements OnInit {
      survey:Survey ;
    
  constructor(private surveyService:SurveyServiceService,private router:Router) {
    this.survey=new Survey();
   }
  
   saveSurvey(){
     this.surveyService.save(this.survey).subscribe(data=>{console.log(data);});
     this.getAllSurvey;
   }
   getAllSurvey() {
     this.router.navigate([`/survey`]);
   }
   onSubmit(){
    console.log(this.survey);
    this.saveSurvey();
    alert("Added Successfully!!");
  }
  ngOnInit(): void {
  }

}
