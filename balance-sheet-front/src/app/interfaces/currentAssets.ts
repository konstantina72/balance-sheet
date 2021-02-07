import {Inventories} from "./inventories";
import {FinAssPayOnAcc} from "./finAssPayOnAcc";

export interface CurrentAssets {
  id?: string;
  inventories?: Inventories;
  financialAssetsPaymentsOnAccount?: FinAssPayOnAcc;
}
