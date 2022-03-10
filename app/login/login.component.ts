import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user=new User();
  msg='';

  constructor(private service:RegistrationService,private route:Router) { }

  ngOnInit(): void {
  }
  loginUser(){
    alert("Success!!");
    this.service.loginUserFromRemote(this.user).subscribe(
      data=>{
        console.log("response received")
        this.route.navigate(['/phome'])
      },
      error=>{
      console.log("exception occured");
     this.msg="Bad credentials,please enter valid emailid and password";
      }
      
    );
    
   
   
  }
  gotoregistration(){
    this.route.navigate(['/registration'])
  }


}


