import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RegistrationService } from './registration.service';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SurveyPortal';
  user!:User;
  constructor(private route:Router, private router: ActivatedRoute) { }

  ngOnInit(): void {
  }
 onLogin(){
   this.route.navigate(['/login']);
 }
}
