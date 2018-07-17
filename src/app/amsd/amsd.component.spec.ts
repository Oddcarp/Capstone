import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AmsdComponent } from './amsd.component';

describe('AmsdComponent', () => {
  let component: AmsdComponent;
  let fixture: ComponentFixture<AmsdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AmsdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AmsdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
