package com.mycompanu.mywebapp.client;

import java.io.Serializable;

public class Evento implements Serializable
{
	/**
	 * 
	 */
	private String nomeEvento;
	private String luogo;
	private String descrizione;
	private String[] date;
	
	public Evento(String nomeEvento,String luogo,String descrizione,String[] date){
		this.nomeEvento = nomeEvento;
		this.luogo = luogo;
		this.descrizione = descrizione;
		this.date = date;
	}
	
	public String getNomeEvento(){
		return nomeEvento;
	}
	
	public String getLuogo(){
		return luogo;
	}
	
	public String getDescrizione(){
		return descrizione;
	}
	
	public String[] getDate(){
		return date;
	}
	public String toString(){
		return nomeEvento +" "+ luogo +" "+ descrizione ;
	}
	
	
	//private String[] date = new String[20];
	//private String[] commenti = new String[20];
	
	/*
	public Evento()
	{
		super();
	}
	
	public String getNomeEvento()
	{
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento)
	{
		this.nomeEvento = nomeEvento;
	}
	public String getDescrizione()
	{
		return descrizione;
	}
	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
	}
	public String getLuogo()
	{
		return luogo;
	}
	public void setLuogo(String luogo)
	{
		this.luogo = luogo;
	}
	
	
	public String[] getDate()
	{
		return date;
	}
	public void setDate(String[] date)
	{
		this.date = date;
	}
	public String[] getCommenti() 
	{
		return commenti;
	}
	public void setCommenti(String[] commenti)
	{
		this.commenti = commenti;
	}
	public String getCreatore()
	{
		return creatore;
	}
	public void setCreatore(String creatore)
	{
		this.creatore = creatore;
	}*/
}