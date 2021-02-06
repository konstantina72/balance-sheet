import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomePageComponent} from "./home-page/home-page.component";


const routes: Routes = [
  {path: 'home-page', component: HomePageComponent},
  {path: '', redirectTo: 'home-page', pathMatch: 'full'},
  {
    path: 'balance-form',
    loadChildren: () => import('./balance-form/balance-form.module').then(m => m.BalanceFormModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
