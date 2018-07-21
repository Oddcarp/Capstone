import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PeriodicElementsTableComponent } from './periodic-elements-table.component';

describe('PeriodicElementsTableComponent', () => {
  let component: PeriodicElementsTableComponent;
  let fixture: ComponentFixture<PeriodicElementsTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PeriodicElementsTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PeriodicElementsTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
