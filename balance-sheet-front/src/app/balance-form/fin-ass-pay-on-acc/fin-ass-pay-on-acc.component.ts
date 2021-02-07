import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {FinAssPayOnAcc} from "../../interfaces/finAssPayOnAcc";

@Component({
  selector: 'app-fin-ass-pay-on-acc',
  templateUrl: './fin-ass-pay-on-acc.component.html',
  styleUrls: ['./fin-ass-pay-on-acc.component.scss']
})
export class FinAssPayOnAccComponent implements OnInit {

  sum = 0;

  finAssPayOnAccForm: FormGroup = this.formBuilder.group({
    id: [null],
    tradeReceivables: [],
    accruedIncome: [],
    otherReceivables: [],
    tradingPortfolio: [],
    prepaidExpenses: [],
    cashAndCashEquivalents: []
  });

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
  }

  totalfinAssPayOnAcc(): FinAssPayOnAcc {
    let fins: FinAssPayOnAcc;
    console.log(this.finAssPayOnAccForm.value);
    fins = this.finAssPayOnAccForm.value;
    this.sum = Number(fins.accruedIncome) + Number(fins.cashAndCashEquivalents) +
      Number(fins.otherReceivables) + Number(fins.prepaidExpenses) +
      Number(fins.tradeReceivables) + Number(fins.tradingPortfolio);
    return fins;
  }


}
