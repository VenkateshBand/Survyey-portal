import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { SurveyComponentComponent } from './survey-component/survey-component.component';
import { AddSurveyComponent } from './add-survey/add-survey.component';
import { ListSurveyComponent } from './list-survey/list-survey.component';
import { FormsModule } from '@angular/forms';
import { UpdateSurveyComponent } from './update-survey/update-survey.component';
import { AddQuestionComponent } from './add-question/add-question.component';
import { ListQuestionComponent } from './list-question/list-question.component';
import { UpdateQuestionComponent } from './update-question/update-question.component';
import { AddFeedbackComponent } from './add-feedback/add-feedback.component';
import { ListFeedbackComponent } from './list-feedback/list-feedback.component';
import { UpdateFeedbackComponent } from './update-feedback/update-feedback.component';
import { AddSurveyorComponent } from './add-surveyor/add-surveyor.component';
import { ListSurveyorComponent } from './list-surveyor/list-surveyor.component';
import { UpdateSurveyorComponent } from './update-surveyor/update-surveyor.component';
import { AddTopicComponent } from './add-topic/add-topic.component';
import { ListTopicComponent } from './list-topic/list-topic.component';
import { UpdateTopicComponent } from './update-topic/update-topic.component';
import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatIconModule } from '@angular/material/icon';
import { ParicipantHomeComponent } from './paricipant-home/paricipant-home.component';
import { SurveyorHomeComponent } from './surveyor-home/surveyor-home.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { SurveylistComponent } from './surveylist/surveylist.component';

import { AboutusComponent } from './aboutus/aboutus.component';

@NgModule({
  declarations: [
    AppComponent,
    SurveyComponentComponent,
    AddSurveyComponent,
    ListSurveyComponent,
    UpdateSurveyComponent,
    AddQuestionComponent,
    ListQuestionComponent,
    UpdateQuestionComponent,
    AddFeedbackComponent,
    ListFeedbackComponent,
    UpdateFeedbackComponent,
    AddSurveyorComponent,
    ListSurveyorComponent,
    UpdateSurveyorComponent,
    AddTopicComponent,
    ListTopicComponent,
    UpdateTopicComponent,
    HomeComponent,
    ParicipantHomeComponent,
    SurveyorHomeComponent,
    LoginComponent,
    RegistrationComponent,
    SurveylistComponent,
   
    AboutusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
