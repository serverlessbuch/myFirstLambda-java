package de.serverlessbuch.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
public class MyFirstLambdaTest {
    @Test
    public void testHandleRequest() {
        Map<String, String> input = Collections.singletonMap("name", "Lambda");
        MyFirstLambda handler = new MyFirstLambda();
        String result = handler.handleRequest(input, null);
        Assert.assertEquals("Hello, Lambda", result);
    }
}
