import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private __http : HttpClient) { }

  public loginUserFromRemote(user: User):Observable<any>{
    return this.__http.post<any>("http://localhost:8086/login",user)

  }
  public registerUserFromRemote(user:User):Observable<any>{
    return this.__http.post<any>("http://localhost:8086/registeruser",user);
  }
}
