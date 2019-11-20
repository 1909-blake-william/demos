import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { LoginForm } from '../../services/login.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  // Used to tell any parent component that a particular event has occured
  @Output('onFormSubmit') formSubmitEmitter: EventEmitter<LoginForm> = new EventEmitter<LoginForm>();

  username: string;
  password: string;

  constructor() { }

  ngOnInit() {
  }

  attemptLogin() {
    this.formSubmitEmitter.emit({ username: this.username, password: this.password });
  }

}
