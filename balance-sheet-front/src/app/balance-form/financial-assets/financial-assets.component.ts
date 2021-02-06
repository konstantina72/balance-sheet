import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {FinancialAssets} from "../../interfaces/financialAssets";

@Component({
  selector: 'app-financial-assets',
  templateUrl: './financial-assets.component.html',
  styleUrls: ['./financial-assets.component.scss']
})
export class FinancialAssetsComponent implements OnInit {

  sum = 0;

  financialAssetsForm: FormGroup = this.formBuilder.group({
    id: [null],
    loansAndReceivables: [],
    heldToMaturityInvestments: [],
    particInterestsInSubsAssJointVent: [],
    availableForSaleFinancialAssets: [],
    assetsIntendedToHedging: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  totalFinancialAssets(): FinancialAssets {
    let financialAssets: FinancialAssets;
    console.log(this.financialAssetsForm.value);
    financialAssets = this.financialAssetsForm.value;
    this.sum = Number(financialAssets.loansAndReceivables) + Number(financialAssets.heldToMaturityInvestments) +
      Number(financialAssets.particInterestsInSubsAssJointVent) + Number(financialAssets.availableForSaleFinancialAssets) +
      Number(financialAssets.assetsIntendedToHedging);
    return financialAssets;
  }

}
