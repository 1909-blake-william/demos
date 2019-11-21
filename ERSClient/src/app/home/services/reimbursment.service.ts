import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class ReimbursmentService {

  constructor(
    private http: HttpClient
  ) { }

  getAllReimbursements(): Observable<Reimbursement[]> {
    return this.http.get<Reimbursement[]>("http://localhost:8080/ERSDemo/api/reimbursements");
  }
}

export interface Reimbursement {
  id: number;
  amount: number;
  description: string;
  createdBy: string;
  resolvedBy?: string;
  createdOn: Date;
  resolvedOn?: Date;
  type: string;
  status: string;
}