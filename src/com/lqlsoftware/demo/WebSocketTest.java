package com.lqlsoftware.demo;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/")
public class WebSocketTest {

  @OnMessage
  public void onMessage(String message, Session session) 
    throws IOException, InterruptedException {
  
    // Print the client message for testing purposes
    session.getBasicRemote().sendText("Received: " + message);
  }
  
  @OnOpen
  public void onOpen() {
    System.out.println("Client connected");
  }

  @OnClose
  public void onClose() {
    System.out.println("Connection closed");
  }
}