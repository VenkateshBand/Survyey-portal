import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Topic } from './topic';

@Injectable({
  providedIn: 'root'
})
export class TopicService {
  private topicUrl="http://localhost:8086/topic/gettopic";
  private topicUrl1="http://localhost:8086/topic/updateT";
  private topicUrl2="http://localhost:8086/topic/delete";
  constructor(private http:HttpClient) { }
  findAll():Observable<Topic[]>{
    return this.http.get<Topic[]> (`http://localhost:8086/topic/getAllT`);
  }

  save(topic :Topic):Observable<Object>{
    return this.http.post(`http://localhost:8086/topic/addT`,topic);
  }

  getTopicById(id : number):Observable<Topic>{
    return this.http.get<Topic>(`${this.topicUrl}/${id}`);
  }

  updateTopics(id:number,topic:Topic):Observable<Object>{
    return this.http.put(`${this.topicUrl1}/${id}`,topic);
  }

  deleteTopic(id:number):Observable<object>{
    return this.http.delete(`${this.topicUrl2}/${id}`);
  }

}
