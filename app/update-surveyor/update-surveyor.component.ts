import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Surveyor } from '../surveyor';
import { SurveyorService } from '../surveyor.service';

@Component({
  selector: 'app-update-surveyor',
  templateUrl: './update-surveyor.component.html',
  styleUrls: ['./update-surveyor.component.css']
})
export class UpdateSurveyorComponent implements OnInit {

  surveyor :Surveyor = new Surveyor();
  id!:number;
 constructor(private surveyorservice: SurveyorService, private route:ActivatedRoute, private router :Router) { }

 

 ngOnInit(): void {
   this.id=this.route.snapshot.params['id'];
    this.surveyorservice.getSurveyorById(this.id).subscribe(data=>{this.surveyor=data;});
 }
 onSubmit(){
   this.surveyorservice.updateSurveyor(this.id,this.surveyor).subscribe(data=>{
     this.getAllSurveyor();});
 }
 getAllSurveyor() {
   this.router.navigate([`/surveyors`]);
 }
}
