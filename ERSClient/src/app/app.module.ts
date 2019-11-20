import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { AuthService } from './auth.service';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,     // Enables the HttpClient to be injected into any instance
    FormsModule,          // Brings in ngModel directive, enabling us to perform 2-way data binding
    AppRoutingModule, 
  ],
  providers: [
    AuthService           // AuthService can now be injected into any component/service
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
