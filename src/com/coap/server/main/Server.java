package com.coap.server.main;

import java.net.SocketException;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Server extends CoapServer {

    public static void main(String[] args) {
        try {
            Server server = new Server();
            server.start();
        } catch (SocketException e) {
            System.err.println("Failed to initialize server: " + e.getMessage());
        }
    }

    public Server() throws SocketException {
        add(new PublishResource());
    }

    class PublishResource extends CoapResource {
        public PublishResource() {
            super("SQpublish");
            getAttributes().setTitle("Publish Resource");
        }
        public void handlePOST(CoapExchange exchange) {
            System.out.println(exchange.getRequestText());
            exchange.respond("POST_REQUEST_SUCCESS");
        }
        public void handleGET(CoapExchange exchange) {
            exchange.respond("GET_REQUEST_SUCCESS");
        }
    }
}
