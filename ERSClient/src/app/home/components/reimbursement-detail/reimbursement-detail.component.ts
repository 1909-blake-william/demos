import { Component, OnInit, Input } from '@angular/core';
import { Reimbursement } from '../../services/reimbursment.service';

@Component({
  selector: 'app-reimbursement-detail',
  templateUrl: './reimbursement-detail.component.html',
  styleUrls: ['./reimbursement-detail.component.css']
})
export class ReimbursementDetailComponent implements OnInit {

  // Presentational Component
  @Input("data") reimbursement: Reimbursement;

  constructor() { }

  ngOnInit() {
  }

}
