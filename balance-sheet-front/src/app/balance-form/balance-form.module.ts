import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {BalanceFormRoutingModule} from './balance-form-routing.module';
import {BalanceFormComponent} from './balance-form.component';
import {MatCardModule} from "@angular/material/card";
import {FlexLayoutModule} from "@angular/flex-layout";
import {ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {MatTabsModule} from "@angular/material/tabs";
import {TangibleAssetsComponent} from './tangible-assets/tangible-assets.component';
import {IntangibleAssetsComponent} from './intangible-assets/intangible-assets.component';
import {FinancialAssetsComponent} from './financial-assets/financial-assets.component';
import {NonCurrentAssetsComponent} from './non-current-assets/non-current-assets.component';


@NgModule({
  declarations: [BalanceFormComponent, TangibleAssetsComponent, IntangibleAssetsComponent, FinancialAssetsComponent, NonCurrentAssetsComponent],
  imports: [
    CommonModule,
    BalanceFormRoutingModule,
    MatCardModule,
    FlexLayoutModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatTabsModule
  ]
})
export class BalanceFormModule {
}
