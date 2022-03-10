import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Feedback } from './feedback';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
  private feedbackUrl = "http://localhost:8086/feedback/getF";
  private feedbackUrl1="http://localhost:8086/feedback/updateF";
  private feedbackUrl2="http://localhost:8086/feedback/delF";
  constructor(private http : HttpClient) {}
  findAllF():Observable <Feedback[]>
 {
    return this.http.get<Feedback[]>(`http://localhost:8086/feedback/getAllF`);
 }
 saveF(feedback:Feedback ): Observable<Object> {
   return this.http.post(`http://localhost:8086/feedback/addF`, feedback);
 }
 getFeedbackById(id :number):Observable<Feedback>{
   return this.http.get<Feedback>(`${this.feedbackUrl}/${id}`);
 }
 updateFeedback(id:number, feedback:Feedback ):Observable<Object>{
   return this.http.put(`${this.feedbackUrl1}/${id}`,feedback);
 }
 deleteFeedback(id:number):Observable<Object>{
   return this.http.delete(`${this.feedbackUrl2}/${id}`);
 }
}
