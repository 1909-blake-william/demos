import { Component, OnInit } from '@angular/core';
import { LoginForm, LoginService } from '../../services/login.service';

@Component({
  selector: 'app-login-container',
  templateUrl: './login-container.component.html',
  styleUrls: ['./login-container.component.css']
})
export class LoginContainerComponent implements OnInit {


  constructor(
    private loginService: LoginService,
  ) { }

  ngOnInit() {
  }

  handleLogin(form: LoginForm) {
    // Attempt to sign in
    this.loginService.attemptLogin(form);
  }

}
