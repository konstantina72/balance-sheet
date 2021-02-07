import {Component, OnInit, ViewChild} from '@angular/core';
import {CurrentAssets} from "../../interfaces/currentAssets";
import {InventoriesComponent} from "../inventories/inventories.component";
import {FinAssPayOnAccComponent} from "../fin-ass-pay-on-acc/fin-ass-pay-on-acc.component";

@Component({
  selector: 'app-current-assets',
  templateUrl: './current-assets.component.html',
  styleUrls: ['./current-assets.component.scss']
})
export class CurrentAssetsComponent implements OnInit {

  @ViewChild('inventories') inventories: InventoriesComponent;
  @ViewChild('finAssPayOnAcc') finAssPayOnAcc: FinAssPayOnAccComponent;

  sum = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  saveCurrentAssets(): CurrentAssets {
    const currentAssets: CurrentAssets = {};
    currentAssets.financialAssetsPaymentsOnAccount = this.finAssPayOnAcc.totalfinAssPayOnAcc()
    currentAssets.inventories = this.inventories.totalInventories();
    this.sum = this.finAssPayOnAcc.sum + this.inventories.sum;
    console.log(currentAssets);
    return currentAssets;
  }

}
