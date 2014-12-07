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

public class PartecipaEvento extends Composite
{
	private static PartecipaEventoUiBinder uiBinder = GWT.create(PartecipaEventoUiBinder.class);
	private String username;
	private int livSic;
	@UiField Button rierca_ID;
	@UiField Button gestisci_eventi;
	@UiField Button esci;
	@UiField TextBox ID_evento;

	interface PartecipaEventoUiBinder extends UiBinder<Widget, PartecipaEvento>
	{
	}

	public PartecipaEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	void setDati(String username,int livSic){
		this.username = username;
		this.livSic = livSic;
	}
	@UiHandler("rierca_ID")
	void onRierca_IDClick(ClickEvent event)
	{
		System.out.println(ID_evento.getText());
		RootPanel root = RootPanel.get();
		InfoEvento obj = new InfoEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("gestisci_eventi")
	void onGestisci_eventiClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		GestisciEvento obj = new GestisciEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("esci")
	void onEsciClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		Login obj = new Login();
		root.clear();
		root.add(obj);
	}
}