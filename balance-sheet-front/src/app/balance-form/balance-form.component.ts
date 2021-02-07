import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {NonCurrentAssets} from "../interfaces/non-current-assets";

@Component({
  selector: 'app-balance-form',
  templateUrl: './balance-form.component.html',
  styleUrls: ['./balance-form.component.scss']
})
export class BalanceFormComponent implements OnInit {

  balanceForm: FormGroup = this.formBuilder.group({});

  constructor(private formBuilder: FormBuilder, private router: Router) {
  }

  ngOnInit(): void {
  }

  saveBalanceForm(): void {
    let nonCurrentAssets: NonCurrentAssets;
    console.log("asdas");
  }

}
