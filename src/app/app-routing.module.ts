import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { SpdfComponent } from './spdf/spdf.component';
import { AmsdComponent } from './amsd/amsd.component';

const routes: Routes = [
  { path: 'Home', component: WelcomePageComponent },
  { path: 'spdf',      component: SpdfComponent },
  { path: 'AMSD',      component: AmsdComponent },
  { path: '', redirectTo: '/Home', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
