import { Component, OnInit, Input } from '@angular/core';
import { Reimbursement } from '../../services/reimbursment.service';
import { UserInfo } from 'src/app/auth.service';

@Component({
  selector: 'app-reimbursement-detail',
  templateUrl: './reimbursement-detail.component.html',
  styleUrls: ['./reimbursement-detail.component.css']
})
export class ReimbursementDetailComponent implements OnInit {

  // Presentational Component
  @Input("data") reimbursement: Reimbursement;
  @Input("user") currentUser: UserInfo;

  constructor() { }

  ngOnInit() {
  }

}
