package main.resources;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class MyResource extends CoapResource {
    @Override
    public void handleGET(CoapExchange exchange) {
        // do something when a GET request is received
        // e.g., reply with a text/plain message
        exchange.respond("Hello, World!");
    }

    @Override
    public void handlePOST(CoapExchange exchange) {
        if (exchange.getRequestOptions()....) {
            // do something specific to the request options
        }
        // reply with response code only (shortcut)
        exchange.respond(CREATED);
    }
}
