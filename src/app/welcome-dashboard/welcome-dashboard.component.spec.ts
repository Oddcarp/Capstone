
import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomeDashboardComponent } from './welcome-dashboard.component';

describe('WelcomeDashboardComponent', () => {
  let component: WelcomeDashboardComponent;
  let fixture: ComponentFixture<WelcomeDashboardComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ WelcomeDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WelcomeDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
