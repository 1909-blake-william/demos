import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReimbursementDetailComponent } from './reimbursement-detail.component';

describe('ReimbursementDetailComponent', () => {
  let component: ReimbursementDetailComponent;
  let fixture: ComponentFixture<ReimbursementDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReimbursementDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReimbursementDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
