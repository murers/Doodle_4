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

public class CommentiEvento extends Composite
{
	private static CommentiEventoUiBinder uiBinder = GWT.create(CommentiEventoUiBinder.class);
	@UiField Button indietro;
	@UiField TextBox textbox_aggiungicomm;
	@UiField Button aggiugi;
	@UiField TextBox mostra_commenti;
	@UiField Button clear;
	@UiField TextBox nome_utente;

	interface CommentiEventoUiBinder extends UiBinder<Widget, CommentiEvento>
	{
	}

	public CommentiEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
		nome_utente.setText("jake smith");
	}
	@UiHandler("indietro")
	void onIndietroClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("aggiugi")
	void onAggiugiClick(ClickEvent event)
	{
		String commenti = (mostra_commenti.getText() + textbox_aggiungicomm.getText() + "    ");
		mostra_commenti.setText(commenti);
	}
	@UiHandler("clear")
	void onClearClick(ClickEvent event)
	{
		textbox_aggiungicomm.setText("");
	}
}