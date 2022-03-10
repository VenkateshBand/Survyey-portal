import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddFeedbackComponent } from './add-feedback/add-feedback.component';
import { AddQuestionComponent } from './add-question/add-question.component';
import { AddSurveyComponent } from './add-survey/add-survey.component';
import { AddSurveyorComponent } from './add-surveyor/add-surveyor.component';
import { AddTopicComponent } from './add-topic/add-topic.component';
import { HomeComponent } from './home/home.component';
import { ListFeedbackComponent } from './list-feedback/list-feedback.component';
import { ListQuestionComponent } from './list-question/list-question.component';
import { ListSurveyComponent } from './list-survey/list-survey.component';
import { ListSurveyorComponent } from './list-surveyor/list-surveyor.component';
import { ListTopicComponent } from './list-topic/list-topic.component';
import { LoginComponent } from './login/login.component';
import { ParicipantHomeComponent } from './paricipant-home/paricipant-home.component';
import { RegistrationComponent } from './registration/registration.component';
import { UpdateFeedbackComponent } from './update-feedback/update-feedback.component';
import { UpdateQuestionComponent } from './update-question/update-question.component';
import { UpdateSurveyComponent } from './update-survey/update-survey.component';
import { UpdateSurveyorComponent } from './update-surveyor/update-surveyor.component';
import { UpdateTopicComponent } from './update-topic/update-topic.component';


const routes: Routes = [
  { path: 'survey', component: ListSurveyComponent },
  { path: 'addSurvey', component: AddSurveyComponent },
  { path:'updateSurvey/:id', component:UpdateSurveyComponent},
  { path: 'question', component: ListQuestionComponent },
  { path: 'addQuestion', component: AddQuestionComponent },
  { path:'updateQuestion/:id', component:UpdateQuestionComponent},
  { path: 'feedback', component: ListFeedbackComponent },
  { path: 'addFeedback', component: AddFeedbackComponent },
  { path: 'updateFeedback/:id', component: UpdateFeedbackComponent},
  { path: 'topic', component: ListTopicComponent },
  { path: 'addTopic', component: AddTopicComponent },
  { path: 'updateTopics/:id', component: UpdateTopicComponent},
  { path: 'surveyors', component: ListSurveyorComponent },
  { path: 'add', component: AddSurveyorComponent },
  { path:'update-surveyor/:id', component:UpdateSurveyorComponent},
  { path:'registration',component:RegistrationComponent},
  { path:'login',component:LoginComponent},
  { path:'phome', component:ParicipantHomeComponent},
  { path: 'aboutus', component:AboutusComponent},
  { path: 'home', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[LoginComponent,RegistrationComponent]
