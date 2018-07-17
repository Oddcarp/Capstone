import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpdfComponent } from './spdf.component';

describe('SpdfComponent', () => {
  let component: SpdfComponent;
  let fixture: ComponentFixture<SpdfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpdfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
