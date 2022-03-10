import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Topic } from '../topic';
import { TopicService } from '../topic.service';

@Component({
  selector: 'app-update-topic',
  templateUrl: './update-topic.component.html',
  styleUrls: ['./update-topic.component.css']
})
export class UpdateTopicComponent implements OnInit {
  topicsurve :Topic=new Topic();

  id!:number;
  constructor(private topicservice:TopicService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.topicservice.getTopicById(this.id).subscribe(data=>{this.topicsurve=data;});
  }
onSubmit(){
  this.topicservice.updateTopics(this.id,this.topicsurve).subscribe(data=>{
    this.getTopic();
  });
  
}
getTopic(){
  this.router.navigate([`/topic`]);
}
}
