import { Feedback } from "./feedback";
import { Topic } from "./topic";



export class Survey {
    id!:number;
    description:string | undefined;
    topic:Topic=new Topic();
    postedBy:any;
    publishedDateTime:any;
    endDateTime : any;
    active:boolean | undefined;
    feedbacks:Feedback=new Feedback();
    
    
}
