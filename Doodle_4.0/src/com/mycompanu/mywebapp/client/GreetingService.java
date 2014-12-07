package com.mycompanu.mywebapp.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService
{

	String inserisciUtente(String name) throws IllegalArgumentException;

	String controlloUsername(String name) throws IllegalArgumentException;

	String inserisciEvento(String evento) throws IllegalArgumentException;
	
}
