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

public class Sondaggi extends Composite
{
	private static SondaggiUiBinder uiBinder = GWT.create(SondaggiUiBinder.class);
	@UiField Button vai_partecipa_eventi;
	@UiField Button aggiungi;
	@UiField Button cancella;
	@UiField Button salva_modifiche;
	@UiField TextBox ora;
	@UiField TextBox giorno;
	@UiField TextBox luogo_evento;

	interface SondaggiUiBinder extends UiBinder<Widget, Sondaggi>
	{
	}

	public Sondaggi()
	{
		initWidget(uiBinder.createAndBindUi(this));
		luogo_evento.setText("luogo");
	}
	@UiHandler("vai_partecipa_eventi")
	void onVai_partecipa_eventiClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		root.clear();
		root.add(obj);
	}
}