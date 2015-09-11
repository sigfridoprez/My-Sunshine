package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sigfrido.perez on 14/07/2015.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        JSONObject jsonDay = jsonArray.getJSONObject(dayIndex);
        JSONObject jsonTem = jsonDay.getJSONObject("temp");

        return jsonTem.getDouble("max");
    }
}
