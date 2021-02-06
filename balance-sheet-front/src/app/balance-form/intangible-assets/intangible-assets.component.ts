import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {IntangibleAssets} from "../../interfaces/intangibleAssets";

@Component({
  selector: 'app-intangible-assets',
  templateUrl: './intangible-assets.component.html',
  styleUrls: ['./intangible-assets.component.scss']
})
export class IntangibleAssetsComponent implements OnInit {

  sum = 0;

  intangibleAssetsForm: FormGroup = this.formBuilder.group({
    id: [null],
    developmentCosts: [],
    goodwill: [],
    otherIntangibleAssets: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  totalIntangibleAssets(): IntangibleAssets {
    let intangibleAssets: IntangibleAssets;
    console.log(this.intangibleAssetsForm.value);
    intangibleAssets = this.intangibleAssetsForm.value;
    this.sum = Number(intangibleAssets.developmentCosts) + Number(intangibleAssets.goodwill) +
      Number(intangibleAssets.otherIntangibleAssets);
    return intangibleAssets;
  }

}
