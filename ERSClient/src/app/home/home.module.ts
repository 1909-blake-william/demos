import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeContainerComponent } from './components/home-container/home-container.component';
import { HomeRoutingModule } from './home-routing.module';



@NgModule({
  declarations: [NavbarComponent, HomeContainerComponent],
  imports: [
    CommonModule,
    HomeRoutingModule
  ]
})
export class HomeModule { }
