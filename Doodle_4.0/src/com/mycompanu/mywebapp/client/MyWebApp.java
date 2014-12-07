package com.mycompanu.mywebapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyWebApp implements EntryPoint
{
	public void onModuleLoad()
	{
		RootPanel rootPanel = RootPanel.get();
		Login obj = new Login();
		rootPanel.clear();
		rootPanel.add(obj);
	}
}