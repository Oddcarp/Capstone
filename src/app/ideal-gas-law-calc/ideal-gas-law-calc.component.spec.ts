import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IdealGasLawCalcComponent } from './ideal-gas-law-calc.component';

describe('IdealGasLawCalcComponent', () => {
  let component: IdealGasLawCalcComponent;
  let fixture: ComponentFixture<IdealGasLawCalcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IdealGasLawCalcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IdealGasLawCalcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
