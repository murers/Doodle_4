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

public class CreaEvento extends Composite
{
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
	private static CreaEventoUiBinder uiBinder = GWT.create(CreaEventoUiBinder.class);
	private String username,nome,luogo,descrizione;
	private int livSic;
	
	@UiField Button button;
	@UiField TextBox textbox_nome;
	@UiField TextBox textbox_luogo;
	@UiField TextBox textbox_descrizione;
	@UiField Button salva_dati;
	@UiField Button aggiorna;
	@UiField Button modifica_dati;
	@UiField Button sondaggio;
	@UiField Button registra_evento;
	String totale = null;

	interface CreaEventoUiBinder extends UiBinder<Widget, CreaEvento>
	{
	}

	public CreaEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	void setDati(String username,int livSic){
		this.username = username;
		this.livSic = livSic;
		System.out.println("username: " + username);
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		GestisciEvento obj = new GestisciEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("salva_dati")
	void onSalva_datiClick(ClickEvent event)
	{
		nome =textbox_nome.getText();
		luogo = textbox_luogo.getText();
		descrizione = textbox_descrizione.getText();
	}
	
	@UiHandler("registra_evento")
	void onRegistra_eventoClick(ClickEvent event)
	{
	totale = nome +" , "+luogo+" , "+descrizione+" , "+username;
		greetingService.inserisciEvento(totale, new AsyncCallback<String>()
		{
			public void onFailure(Throwable caught)
			{
				System.out.println("Errore in crea evento, in particolare registra evento");
				
			}

			public void onSuccess(String result)
			{
				System.out.println("Evento creato");
				
			}
			
		});
		
		RootPanel root = RootPanel.get();
		GestisciEvento obj = new GestisciEvento();
		root.clear();
		root.add(obj);
	}
}