import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Survey } from './survey';


@Injectable({
  providedIn: 'root'
})
export class SurveyServiceService {
  private surveyUrl = "http://localhost:8086/survey/getS";
  private surveyUrl1="http://localhost:8086/survey/updateS";
  private surveyUrl2="http://localhost:8086/survey/delS";
 
  constructor(private http : HttpClient) { }
  
   findAll() : Observable <Survey[]> {
    return this.http.get<Survey[]>(`http://localhost:8086/survey/getAllS`);
 }

 save(survey : Survey): Observable<Object> {
   return this.http.post(`http://localhost:8086/survey/addS`, survey);
 }

 getSurveyById(id :number):Observable<Survey>{
   return this.http.get<Survey>(`${this.surveyUrl}/${id}`);
 }
 updateSurvey(id:number, survey: Survey):Observable<Object>{
   return this.http.put(`${this.surveyUrl1}/${id}`,survey);
 }
 deleteSurvey(id:number):Observable<Object>{
   return this.http.delete(`${this.surveyUrl2}/${id}`);
 }

 

 

}
