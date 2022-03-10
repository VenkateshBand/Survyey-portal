import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Surveyor } from './surveyor';

@Injectable({
  providedIn: 'root'
})
export class SurveyorService {
  private baseUrl = "http://localhost:8086/surveyor/getAll";
  private baseUrl1 = "http://localhost:8086/surveyor/addSurveyor";
  private baseUrl2 = "http://localhost:8086/surveyor/updateSur";
  private baseUrl3 = "http://localhost:8086/surveyor/getSurveyor";
  private baseUrl4 = "http://localhost:8086/surveyor/deleteS";
  constructor(private http:HttpClient) { }

  getSurveyorList(): Observable<Surveyor[]> {
    return this.http.get<Surveyor[]>(`${this.baseUrl}`);
  }

  addSurveyor(surveyor: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl1}`, surveyor);
  }

  getSurveyorById(id :number):Observable<Surveyor>{
    return this.http.get<Surveyor>(`${this.baseUrl3}/${id}`);
  }

  updateSurveyor(id: number, surveyor:Surveyor): Observable<Object> {
    return this.http.put(`${this.baseUrl2}/${id}`, surveyor);
  }

  deleteSurveyor(id: number): Observable<Object> {
    return this.http.delete(`${this.baseUrl4}/${id}`);
  }
}
