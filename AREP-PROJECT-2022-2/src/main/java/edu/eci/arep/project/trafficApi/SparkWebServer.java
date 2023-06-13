package edu.eci.arep.project.trafficApi;

import edu.eci.arep.project.trafficApi.model.Solution;
import edu.eci.arep.project.trafficApi.service.TrafficApiService;
import edu.eci.arep.project.trafficApi.service.impl.TrafficApiServiceDB;
import spark.Request;
import spark.Response;

import java.util.List;

import static spark.Spark.*;

public class SparkWebServer {

    private static final TrafficApiService service;

    static {
        service = new TrafficApiServiceDB();
    }

    public static void main( String[] args ) {
        port(getPort());
        get("/hello", (req, res) -> "Hello, spark!");
        get("/data", SparkWebServer::uploadData);
        get("/get/users", SparkWebServer::getAllUsers);
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String getAllUsers(Request request, Response response) {
        response.type("application/json");
        String result;
        try {
            List<Solution> solutions = service.getAllSolutions();
            System.out.println("Solutions: " + solutions);
            result = "{\"result\": \"nice\"}";
        } catch (Exception e) {
            e.printStackTrace();
            result = "{\"result\": \"bad\"}";;
        }
        return result;
    }

    private static String uploadData(Request request, Response response) {
        response.type("application/json");
        String data = request.queryParams("data");
        return "" +
                "{" +
                    "Saved: " + data +
                "}";
    }
}