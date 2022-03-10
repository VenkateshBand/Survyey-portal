import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  returnUrl = '/';

  constructor(private route:Router,private router: ActivatedRoute) { }

  ngOnInit(): void {
  }
  onLogin(){
     this.route.navigate(['/login']);
  }

}
