import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Survey } from '../survey';
import { SurveyServiceService } from '../survey-service.service';

@Component({
  selector: 'app-update-survey',
  templateUrl: './update-survey.component.html',
  styleUrls: ['./update-survey.component.css']
})
export class UpdateSurveyComponent implements OnInit {
  survey: Survey=new Survey();
  id!:number;
  constructor(private surveyService:SurveyServiceService, private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.surveyService.getSurveyById(this.id).subscribe(data=>{this.survey=data;});
  }
  onSubmit(){
    this.surveyService.updateSurvey(this.id,this.survey).subscribe(data=>{
      this.getAllSurvey();});
  }
  getAllSurvey() {
    this.router.navigate([`/survey`]);
  }
}
