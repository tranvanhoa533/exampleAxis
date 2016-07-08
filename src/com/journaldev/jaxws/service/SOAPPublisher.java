package com.journaldev.jaxws.service;
 
import javax.xml.ws.Endpoint;
 
public class SOAPPublisher {
 
    public static void main(String[] args) {
         Endpoint.publish("http://localhost:8800/ws/person", new PersonServiceImpl());  
    }
 
}