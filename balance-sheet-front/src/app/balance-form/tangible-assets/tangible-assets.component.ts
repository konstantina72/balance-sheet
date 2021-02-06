import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {TangibleAssets} from "../../interfaces/tangible-assets";

@Component({
  selector: 'app-tangible-assets',
  templateUrl: './tangible-assets.component.html',
  styleUrls: ['./tangible-assets.component.scss']
})
export class TangibleAssetsComponent implements OnInit {

  sum = 0;

  tangibleAssetsForm: FormGroup = this.formBuilder.group({
    id: [null],
    landBuildings: [],
    mechanicalEquipment: [],
    otherEquipment: [],
    investmentProperty: [],
    biologicalAssets: [],
    otherTangibleAssets: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  totalTangibleAssets(): TangibleAssets {
    let tangibleAssets: TangibleAssets;
    console.log(this.tangibleAssetsForm.value);
    tangibleAssets = this.tangibleAssetsForm.value;
    this.sum = Number(tangibleAssets.landBuildings) + Number(tangibleAssets.mechanicalEquipment) +
      Number(tangibleAssets.otherEquipment) + Number(tangibleAssets.investmentProperty) +
      Number(tangibleAssets.biologicalAssets) + Number(tangibleAssets.otherTangibleAssets);
    return tangibleAssets;
  }
}
