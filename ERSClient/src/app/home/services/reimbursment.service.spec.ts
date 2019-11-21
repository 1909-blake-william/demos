import { TestBed } from '@angular/core/testing';

import { ReimbursmentService } from './reimbursment.service';

describe('ReimbursmentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReimbursmentService = TestBed.get(ReimbursmentService);
    expect(service).toBeTruthy();
  });
});
