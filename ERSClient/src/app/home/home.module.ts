import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeContainerComponent } from './components/home-container/home-container.component';
import { HomeRoutingModule } from './home-routing.module';
import { ReimbursmentService } from './services/reimbursment.service';
import { ReimbursementListComponent } from './components/reimbursement-list/reimbursement-list.component';
import { ReimbursementDetailComponent } from './components/reimbursement-detail/reimbursement-detail.component';



@NgModule({
  declarations: [NavbarComponent, HomeContainerComponent, ReimbursementListComponent, ReimbursementDetailComponent],
  imports: [
    CommonModule,
    HomeRoutingModule
  ],
  providers: [
    ReimbursmentService
  ]
})
export class HomeModule { }
