import {TangibleAssets} from "./tangible-assets";
import {IntangibleAssets} from "./intangibleAssets";
import {FinancialAssets} from "./financialAssets";

export interface NonCurrentAssets {

  id?: string;
  tangibleAssets: TangibleAssets;
  intangibleAssets: IntangibleAssets;
  financialAssets: FinancialAssets;
  payAccNonCurAssetsInCourseCon: number;
  deferredTaxes: number;

}
