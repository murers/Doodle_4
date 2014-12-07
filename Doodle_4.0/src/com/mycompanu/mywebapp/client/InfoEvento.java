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
import com.google.gwt.user.client.ui.AbsolutePanel;

public class InfoEvento extends Composite {

	private static InfoEventoUiBinder uiBinder = GWT
			.create(InfoEventoUiBinder.class);
	@UiField Button partecipa_eventi;
	@UiField Button gestisci_eventi;
	@UiField Button vedi_commenti;
	@UiField Button sondaggio;
	@UiField Button button_4;
	@UiField TextBox ID_evento;
	@UiField TextBox luogo_evento;
	@UiField TextBox stato;
	@UiField TextBox partecipanti;
	@UiField AbsolutePanel sondaggio_2;
	@UiField Button salva;

	interface InfoEventoUiBinder extends UiBinder<Widget, InfoEvento>
	{
	}

	public InfoEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
		ID_evento.setText("Id evento");
		luogo_evento.setText("luogo");
		stato.setText("stato");
		partecipanti.setText("10000");
	}

	@UiHandler("partecipa_eventi")
	void onPartecipa_eventiClick(ClickEvent event) 
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("gestisci_eventi")
	void onGestisci_eventiClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		CommentiEvento obj = new CommentiEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("vedi_commenti")
	void onVedi_commentiClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		CommentiEvento obj = new CommentiEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("sondaggio")
	void onSondaggioClick(ClickEvent event)
	{
		RootPanel rootPanel = RootPanel.get();
		InfoEvento2 obj = new InfoEvento2();
		rootPanel.clear();
		rootPanel.add(obj);
	}
	@UiHandler("button_4")
	void onButton_4Click(ClickEvent event)
	{
		RootPanel rootPanel = RootPanel.get();
		InfoEvento2 obj = new InfoEvento2();
		rootPanel.clear();
		rootPanel.add(obj);
	}
	@UiHandler("salva")
	void onSalvaClick(ClickEvent event) {
	}
}