import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MolecularMassCalcComponent } from './molecular-mass-calc.component';

describe('MolecularMassCalcComponent', () => {
  let component: MolecularMassCalcComponent;
  let fixture: ComponentFixture<MolecularMassCalcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MolecularMassCalcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MolecularMassCalcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
