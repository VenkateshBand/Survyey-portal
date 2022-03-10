import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Surveyor } from '../surveyor';
import { SurveyorService } from '../surveyor.service';

@Component({
  selector: 'app-list-surveyor',
  templateUrl: './list-surveyor.component.html',
  styleUrls: ['./list-surveyor.component.css']
})
export class ListSurveyorComponent implements OnInit {

  surveyors!: Surveyor[] ;
  id!:number;
  constructor(private surveyorservice:SurveyorService,private router : Router) { }

  ngOnInit() {
   this.getSurveyors();

  }
  private getSurveyors(){
    this.surveyorservice.getSurveyorList().subscribe(data =>{
      this.surveyors=data;
    });
  }
    updateSurveyor(id:number){
      this.router.navigate(['update-surveyor',id]);
    }

    deleteSurveyor(id:number){
      this.surveyorservice.deleteSurveyor(id).subscribe(data => {
        console.log(data);
        this.getSurveyors();
      });
    }


}
