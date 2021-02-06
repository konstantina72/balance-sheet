import {Component, OnInit, ViewChild} from '@angular/core';
import {TangibleAssetsComponent} from "../tangible-assets/tangible-assets.component";
import {IntangibleAssetsComponent} from "../intangible-assets/intangible-assets.component";
import {FinancialAssetsComponent} from "../financial-assets/financial-assets.component";
import {NonCurrentAssets} from "../../interfaces/non-current-assets";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-non-current-assets',
  templateUrl: './non-current-assets.component.html',
  styleUrls: ['./non-current-assets.component.scss']
})
export class NonCurrentAssetsComponent implements OnInit {

  @ViewChild('tangibleAssets') tangibleAssets: TangibleAssetsComponent;
  @ViewChild('intangibleAssets') intangibleAssets: IntangibleAssetsComponent;
  @ViewChild('financialAssets') financialAssets: FinancialAssetsComponent;

  sum = 0;

  nonCurrentAssetsForm: FormGroup = this.formBuilder.group({
    payAccNonCurAssetsInCourseCon: [],
    deferredTaxes: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  saveNonCurrentAssetsForm(): NonCurrentAssets {
    let nonCurrentAssets: NonCurrentAssets;
    nonCurrentAssets = this.nonCurrentAssetsForm.value;
    nonCurrentAssets.tangibleAssets = this.tangibleAssets.totalTangibleAssets();
    nonCurrentAssets.intangibleAssets = this.intangibleAssets.totalIntangibleAssets();
    nonCurrentAssets.financialAssets = this.financialAssets.totalFinancialAssets();
    this.sum = this.tangibleAssets.sum + this.intangibleAssets.sum +
      this.financialAssets.sum + Number(nonCurrentAssets.payAccNonCurAssetsInCourseCon) +
      Number(nonCurrentAssets.deferredTaxes);
    console.log(nonCurrentAssets);
    return nonCurrentAssets;
  }


}
