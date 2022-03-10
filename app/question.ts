import { Feedback } from "./feedback";


export class Question {
    id!:number;
    questionText!:string;
    answer!:string; 
   feedback:Feedback=new Feedback();
}
