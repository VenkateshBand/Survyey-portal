import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SurveyServiceService } from '../survey-service.service';
import { Topic } from '../topic';
import { TopicService } from '../topic.service';

@Component({
  selector: 'app-add-topic',
  templateUrl: './add-topic.component.html',
  styleUrls: ['./add-topic.component.css']
})
export class AddTopicComponent implements OnInit {

  topicsurve: Topic;
  constructor(private topicservice:TopicService,private router:Router) {
     this.topicsurve=new Topic();
   }

   saveTopic(){
     this.topicservice.save(this.topicsurve).subscribe(data=>{console.log(data);});
     this.gettopic;
   }
   gettopic(){
     this.router.navigate([`/topics`]);
   }

   onSubmit(){
     console.log(this.topicsurve);
     this.saveTopic();
     alert("Added Successfully")
   }
  ngOnInit(): void {
  }
}
