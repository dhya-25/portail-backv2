package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqClient")
    @SequenceGenerator(name = "seqClient", sequenceName = "SEQ_CLIENT", allocationSize = 1)
	private Long id_client;
	
	@Column(name="NAME")
	private String name;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="CIN")
	private String cin;
	
	
	public Client() {
		super();
	}
	
	public Client(Long id_client, String name, String lastName, String cin) {
		super();
		this.id_client = id_client;
		this.name = name;
		this.lastName = lastName;
		this.cin = cin;
	}
	
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	@Override
	public String toString() {
		return "Client{" +
                "id_client='" + id_client + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cin='" + cin + '\'' +                 
                '}';
	}
}
