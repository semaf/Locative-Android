package io.kida.geofancy.app;

import java.util.Currency;

/**
 * Created by mkida on 3/08/2014.
 */
public class Constants {
    public static String LOG = "io.kida.geofancy.app";
    public static String PREFS_NAME = "GeofancyPreferences";
    public static String API_ENDPOINT = "https://my.geofancy.com";
    public static String API_ORIGIN =  android.os.Build.MODEL;//"Android App";
    public static String SESSION_ID = "sessionId";
    public static String TOS_URI = "https://my.geofancy.com/tos";

    public enum TriggerType {
        ARRIVAL,
        DEPARTURE
    };

    public enum HttpMethod {
        POST,
        GET;
    };
}
