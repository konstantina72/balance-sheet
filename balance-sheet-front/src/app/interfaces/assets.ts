import {CurrentAssets} from "./currentAssets";
import {NonCurrentAssets} from "./non-current-assets";

export interface Assets {
  id?: string;
  currentAssets?: CurrentAssets;
  nonCurrentAssets?: NonCurrentAssets;
}
