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

public class InfoEvento2 extends Composite {

	private static InfoEvento2UiBinder uiBinder = GWT
			.create(InfoEvento2UiBinder.class);
	@UiField Button indietro;
	@UiField Button vedi_partecipanti;
	@UiField Button cancella;
	@UiField Button seleziona;
	@UiField Button chiudi_sondaggio;

	interface InfoEvento2UiBinder extends UiBinder<Widget, InfoEvento2>
	{
	}

	public InfoEvento2() 
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("indietro")
	void onIndietroClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		InfoEvento obj = new InfoEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("vedi_partecipanti")
	void onVedi_partecipantiClick(ClickEvent event)
	{
	}
	@UiHandler("cancella")
	void onCancellaClick(ClickEvent event)
	{
	}
	@UiHandler("seleziona")
	void onSelezionaClick(ClickEvent event)
	{
	}
	@UiHandler("chiudi_sondaggio")
	void onChiudi_sondaggioClick(ClickEvent event)
	{
	}
}
