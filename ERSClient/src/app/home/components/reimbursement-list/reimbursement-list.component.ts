import { Component, OnInit } from '@angular/core';
import { ReimbursmentService, Reimbursement } from '../../services/reimbursment.service';
import { Observable } from 'rxjs';
import { AuthService, UserInfo } from 'src/app/auth.service';

@Component({
  selector: 'app-reimbursement-list',
  templateUrl: './reimbursement-list.component.html',
  styleUrls: ['./reimbursement-list.component.css']
})
export class ReimbursementListComponent implements OnInit {

  reimbursements$: Observable<Reimbursement[]>;
  currentUser$: Observable<UserInfo>

  constructor(
    private reimbursementService: ReimbursmentService,
    private authService: AuthService
  ) { 
    this.reimbursements$ = this.reimbursementService.getAllReimbursements();
    this.currentUser$ = this.authService.getCurrentUser();
  }

  ngOnInit() {
  }

}
