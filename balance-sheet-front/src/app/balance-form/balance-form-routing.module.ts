import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {BalanceFormComponent} from './balance-form.component';

const routes: Routes = [{path: '', component: BalanceFormComponent}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BalanceFormRoutingModule {
}
