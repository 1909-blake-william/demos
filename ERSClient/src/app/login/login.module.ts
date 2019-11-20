import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginContainerComponent } from './components/login-container/login-container.component';
import { LoginRoutingModule } from './login-routing.module';
import { LoginService } from './services/login.service';
import { LoginFormComponent } from './components/login-form/login-form.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    LoginContainerComponent,
    LoginFormComponent
  ],
  imports: [
    CommonModule,
    LoginRoutingModule,
    FormsModule
  ],
  providers: [
    LoginService
  ]
})
export class LoginModule { }
