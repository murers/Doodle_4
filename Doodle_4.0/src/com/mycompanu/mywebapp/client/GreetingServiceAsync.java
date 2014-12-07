package com.mycompanu.mywebapp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync
{
	void controlloUsername (String input, AsyncCallback<String> callback) throws IllegalArgumentException;
	void inserisciUtente(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
	void inserisciEvento(String evento,  AsyncCallback<String> callback) throws IllegalArgumentException;
}