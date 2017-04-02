package de.serverlessbuch.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
public class MyFirstLambda implements RequestHandler<Map<String, String>, String> {
    public String handleRequest(Map<String, String> input, Context context) {
        System.out.println("Received event: " + input);
        return "Hello, " + input.get("name");
    }
}
