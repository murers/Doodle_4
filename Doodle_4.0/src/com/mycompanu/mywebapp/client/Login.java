package com.mycompanu.mywebapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.TextBox;

public class Login extends Composite
{
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
	@UiField Button button;
	@UiField Button button_1;
	@UiField Button button_2;
	@UiField Button button_3;
	@UiField TextBox textbox_user;
	@UiField TextBox textbox_pass;

	interface LoginUiBinder extends UiBinder<Widget, Login>
	{
	}

	public Login()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	

	/*
	 * Login Button
	 */
	
	@UiHandler("button")
	void onButtonClick(ClickEvent event)
	{
		String userPass = textbox_user.getText()+" , "+ textbox_pass.getText();
		System.out.println("***********************");
		// commentata [filippo maccarelli]
		greetingService.controlloUsername(userPass, new AsyncCallback<String>()
		{
			public void onFailure(Throwable caught)
			{
				System.out.println("MALEEEE");
			}

			public void onSuccess(String result)
			{
				if(!result.contains("X"))
				{
					System.out.println("andata bene");
					System.out.println("Utente trovato - "+ result);
					RootPanel root = RootPanel.get();
					GestisciEvento obj = new GestisciEvento();
					obj.setDati(result,2);
					root.clear();
					root.add(obj);
				}
				else
				{
					System.out.println("dati inseriti sbagliati");
					textbox_pass.setText("PASSWORD ERRATA");
				}
				
			}
		});
	}
	

	/*
	 * LoginNR Button
	 */
	
	@UiHandler("button_1")
	void onButton_1Click(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		root.clear();
		root.add(obj);
	}

	/*
	 * Registrazione Button
	 */
	
	@UiHandler("button_2")
	void onButton_2Click(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		Registrazione obj = new Registrazione();
		root.clear();
		root.add(obj);
	}

	/*
	 * Close Button
	 */
	
	@UiHandler("button_3")
	void onButton_3Click(ClickEvent event)
	{

	}
}