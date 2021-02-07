import {Component, OnInit, ViewChild} from '@angular/core';
import {Assets} from "../../interfaces/assets";
import {NonCurrentAssetsComponent} from "../non-current-assets/non-current-assets.component";
import {CurrentAssetsComponent} from "../current-assets/current-assets.component";

@Component({
  selector: 'app-assets',
  templateUrl: './assets.component.html',
  styleUrls: ['./assets.component.scss']
})
export class AssetsComponent implements OnInit {

  @ViewChild('nonCurrentAssets') nonCurrentAssets: NonCurrentAssetsComponent;
  @ViewChild('currentAssets') currentAssets: CurrentAssetsComponent;

  sum = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  saveAssets(): Assets {
    const assets: Assets = {};
    assets.nonCurrentAssets = this.nonCurrentAssets.saveNonCurrentAssetsForm();
    assets.currentAssets = this.currentAssets.saveCurrentAssets();
    this.sum = this.nonCurrentAssets.sum + this.currentAssets.sum;
    console.log(assets);
    return assets;
  }

}
