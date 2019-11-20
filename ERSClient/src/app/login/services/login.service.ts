import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService, UserInfo } from 'src/app/auth.service';
import { Router } from '@angular/router';

@Injectable()
export class LoginService {

  constructor(
    private http: HttpClient,
    private authService: AuthService,
    private router: Router
  ) { }

  attemptLogin(form: LoginForm) {
    this.http.post<UserInfo>("http://localhost:8080/ERSDemo/api/login", form).subscribe(
      data => {
        this.authService.setCurrentUser(data);
        this.router.navigateByUrl("/home");
      }, 
      err => {
        console.error(err.error);
      }
    )
  }
}

export interface LoginForm {
  username: string;
  password: string;
}