package constants;

import static constants.Constants.Path.SWAPI_PATH;
import static constants.Constants.Servers.*;

public class Constants {

    public static class RunVeriable{
        public static String server = JSON_PLACEHOLDER_URL;
        public static String path = "";
    }

    public static class Servers {
        public static String SWAPI_URL = "https://swapi.co/";
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/";
        public static String GOOGLE_PLACES_URL;
        public static String REQUESTBIN_URL = "https://enycj1rl89tt.x.pipedream.net";
    }

    public static class Path {
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;
    }

    public static class Action {
        // swapi
        public static String SWAPI_GET_PEOPLE = "people/";

        // google places

        //jsonplaceholder
        public static String JSONPLACEHOLDER_GET = "comments/";
        public static String JSONPLACEHOLDER_PUT = "posts/1/";
        public static String JSONPLACEHOLDER_DELETE = "posts/1/";
        public static String JSONPLACEHOLDER_POST = "posts/";
    }
}
