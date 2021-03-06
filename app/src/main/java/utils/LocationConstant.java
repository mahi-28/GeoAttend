package utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class LocationConstant
{

    public static double DistanceOrg = 200;


    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference using the Haversine method as its base.
     * <p>
     * Elevation should be in meters. If you are not interested in elevation, pass 0.
     *
     * @return Distance in meters
     */
    private double distanceBetween(double lat1, double lat2, double lon1,
                                   double lon2, double el1, double el2)
    {

        final int R = 6371; // Radius of the earth
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }




    public static boolean IsInRange(double lat1, double lon1) {
        try {
            boolean isinrange = false;

            if (Haversine.distance(lat1, 17.652356, lon1, 75.283372) <= 50) {
                isinrange = true;
            }

            return isinrange;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

}
