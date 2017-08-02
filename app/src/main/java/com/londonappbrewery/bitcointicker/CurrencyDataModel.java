package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MRSFU on 8/2/2017.
 */

public class CurrencyDataModel {
    private String price;

    public static CurrencyDataModel fromJson(JSONObject jsonObject){
        try{
            CurrencyDataModel currencyData = new CurrencyDataModel();
            currencyData.price = jsonObject.getString("ask");
            return currencyData;

        }catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice() {
        return price;
    }
}
