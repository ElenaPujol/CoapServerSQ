package main.resources;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class MyResource extends CoapResource {
    public MyResource(String name) {
        super(name);
    }

    @Override
    public void handleGET(CoapExchange exchange) {
        // do something when a GET request is received
        // e.g., reply with a text/plain message
        exchange.respond("Hello, World! from GET");
    }

    @Override
    public void handlePOST(CoapExchange exchange) {
        String txt = "This is ";
        //if (exchange.getRequestOptions()....) {
        if(true) {
            // do something specific to the request options
            txt += "TRUE";
            System.out.printf("IF is TRUE!!\n");
        }
        // reply with response code only (shortcut)
        exchange.respond(txt + " CREATED");
    }
}
