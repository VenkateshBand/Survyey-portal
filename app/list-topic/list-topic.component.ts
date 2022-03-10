import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SurveyServiceService } from '../survey-service.service';
import { Topic } from '../topic';
import { TopicService } from '../topic.service';

@Component({
  selector: 'app-list-topic',
  templateUrl: './list-topic.component.html',
  styleUrls: ['./list-topic.component.css']
})
export class ListTopicComponent implements OnInit {
  topicsurve!: Topic[];
  

  constructor(private topicsservice:TopicService,private router:Router) { }

  ngOnInit(): void {
    this.getAlltopicsList();
  

  }
  private getAlltopicsList(){
    this.topicsservice.findAll().subscribe(data=>{
      this.topicsurve=data;
    });
   
  }

  updateTopics(id:number){
    this.router.navigate(['/updateTopics', id]);
  }
  deleteTopic(id:number){
    this.topicsservice.deleteTopic(id).subscribe(data=>{console.log(data);this.getAlltopicsList();})
  }
 
}
