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

public class Registrazione extends Composite
{
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	RootPanel rootPanel;
	private static RegistrazioneUiBinder uiBinder = GWT.create(RegistrazioneUiBinder.class);
	@UiField TextBox textbox_nome;
	@UiField TextBox textbox_username;
	@UiField TextBox textbox_email;
	@UiField TextBox textbox_password;
	@UiField Button registrazione;
	@UiField Button annulla;

	interface RegistrazioneUiBinder extends UiBinder<Widget, Registrazione>
	{
	}

	public Registrazione()
	{
		initWidget(uiBinder.createAndBindUi(this));
		rootPanel = RootPanel.get();
	}
	@UiHandler("registrazione")
	void onButtonClick(ClickEvent event)
	{
		String userPass= textbox_nome.getText() + "," + textbox_username.getText() + "," + 
				textbox_email.getText() + "," + textbox_password.getText();
		
		greetingService.inserisciUtente(userPass, new AsyncCallback<String>()
		{
			public void onFailure(Throwable caught)
			{
				System.out.println("Errore durante invio dati [registrazione.java]");
			}
			public void onSuccess(String result)
			{
				
				if(!result.contains("X")){
					System.out.println("registrazione del nuovo utente OK");

					RootPanel rootPanel = RootPanel.get();
					Login obj = new Login();
					rootPanel.clear();
					rootPanel.add(obj);
					
				}else{
					System.out.println("Username o email già usate");
					textbox_username.setText("username usato");
					textbox_email.setText("email usato");
					System.out.println(result);
				}
				
			}
		});
	}
	
	@UiHandler("annulla")
	void onButton_1Click(ClickEvent event)
	{
		RootPanel rootPanel = RootPanel.get();
		Login obj = new Login();
		rootPanel.clear();
		rootPanel.add(obj);
	}
}