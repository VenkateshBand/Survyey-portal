import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user=new User();
  msg='';
  constructor(private __service:RegistrationService,private __router:Router) { }

  ngOnInit(): void {
  }
  registerUser(){
    this.__service.registerUserFromRemote(this.user).subscribe(
      data =>{
        console.log("response received");
        this.__router.navigate(['/login']);
      }
      // error=>{
      //   console.log("exception occured");
      //   this.msg=error.error;
      //}
    );
  }

}
