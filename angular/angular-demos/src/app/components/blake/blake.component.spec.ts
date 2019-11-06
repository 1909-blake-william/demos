import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BlakeComponent } from './blake.component';

describe('BlakeComponent', () => {
  let component: BlakeComponent;
  let fixture: ComponentFixture<BlakeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BlakeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BlakeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
