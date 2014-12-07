package com.mycompanu.mywebapp.client;

import java.io.Serializable;

public class Utente implements Serializable
{
	private String nomeUtente;
	private String username;
	private String email;
	private String password;
	
	public Utente (String nomeUtente , String username, String email, String password)
	{
		//super();
		this.nomeUtente=nomeUtente;
		this.username=username;
		this.email=email;
		this.password=password;
	}
	
	
	public String getNomeUtente()
	{
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente)
	{
		this.nomeUtente = nomeUtente;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String toString()
	{
		return nomeUtente + " " + username + " " + email + " " + password;
	}
}