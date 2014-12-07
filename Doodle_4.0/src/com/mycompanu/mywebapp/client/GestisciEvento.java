package com.mycompanu.mywebapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.TextBox;

public class GestisciEvento extends Composite
{
	private static GestisciEventoUiBinder uiBinder = GWT.create(GestisciEventoUiBinder.class);
	private String username;
	private int livSic;
	
	
	@UiField Button crea_evento;
	@UiField Button partecipa_evento;
	@UiField Button apri_evento;
	@UiField TextBox User;

	interface GestisciEventoUiBinder extends UiBinder<Widget, GestisciEvento>
	{
	}

	public GestisciEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	void setDati(String username,int livSic){
		this.username=username;
		this.livSic=livSic;
		User.setText(username);
		System.out.println(username);
	}
	
	@UiHandler("crea_evento")
	void onCrea_eventoClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		CreaEvento obj = new CreaEvento();
		obj.setDati(username, livSic);
		root.clear();
		root.add(obj);
	}
	@UiHandler("partecipa_evento")
	void onPartecipa_eventoClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		obj.setDati(username, livSic);
		root.clear();
		root.add(obj);
	}
	@UiHandler("apri_evento")
	void onApri_eventoClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		InfoEvento obj = new InfoEvento();
		root.clear();
		root.add(obj);
	}
}