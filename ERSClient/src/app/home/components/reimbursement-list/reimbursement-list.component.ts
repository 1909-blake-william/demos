import { Component, OnInit } from '@angular/core';
import { ReimbursmentService, Reimbursement } from '../../services/reimbursment.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-reimbursement-list',
  templateUrl: './reimbursement-list.component.html',
  styleUrls: ['./reimbursement-list.component.css']
})
export class ReimbursementListComponent implements OnInit {

  reimbursements$: Observable<Reimbursement[]>;

  constructor(
    private reimbursementService: ReimbursmentService
  ) { 
    this.reimbursements$ = this.reimbursementService.getAllReimbursements();
  }

  ngOnInit() {
  }

}
