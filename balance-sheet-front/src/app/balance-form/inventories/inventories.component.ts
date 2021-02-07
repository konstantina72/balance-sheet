import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Inventories} from "../../interfaces/inventories";

@Component({
  selector: 'app-inventories',
  templateUrl: './inventories.component.html',
  styleUrls: ['./inventories.component.scss']
})
export class InventoriesComponent implements OnInit {

  sum = 0;

  inventoriesForm: FormGroup = this.formBuilder.group({
    id: [null],
    finishedSemiFinishedProducts: [],
    merchandise: [],
    rawMaterialsConsumables: [],
    biologicalAssets: [],
    paymentsOnAccountForInventories: [],
    otherInventories: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }


  totalInventories(): Inventories {
    let inventories: Inventories;
    console.log(this.inventoriesForm.value);
    inventories = this.inventoriesForm.value;
    this.sum = Number(inventories.biologicalAssets) + Number(inventories.finishedSemiFinishedProducts) +
      Number(inventories.merchandise) + Number(inventories.paymentsOnAccountForInventories) +
      Number(inventories.rawMaterialsConsumables) + Number(inventories.otherInventories);
    return inventories;
  }


}
