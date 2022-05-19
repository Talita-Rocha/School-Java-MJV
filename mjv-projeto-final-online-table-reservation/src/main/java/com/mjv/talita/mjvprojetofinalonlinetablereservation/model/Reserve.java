package com.mjv.talita.mjvprojetofinalonlinetablereservation.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "reserve")
public class Reserve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserve;

	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "hora")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
	private LocalTime hora;
	
	@Enumerated(EnumType.STRING)
	private UnitRestaurant unit;
	
	@Enumerated(EnumType.STRING)
	private Hall hall;
	
	@Enumerated(EnumType.STRING)
	private NumberPeople numberPeople;
	
	@Enumerated(EnumType.STRING)
	private ReserveStatus status;
	
	@Enumerated(EnumType.STRING)
	private NotificationType notification;
	
	@Column(name = "note")
	private String note;

	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	public Integer getIdReserve() {
		return idReserve;
	}

	public void setIdReserve(Integer idReserve) {
		this.idReserve = idReserve;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public UnitRestaurant getUnit() {
		return unit;
	}

	public void setUnit(UnitRestaurant unit) {
		this.unit = unit;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public NumberPeople getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(NumberPeople numberPeople) {
		this.numberPeople = numberPeople;
	}

	public ReserveStatus getStatus() {
		return status;
	}

	public void setStatus(ReserveStatus status) {
		this.status = status;
	}

	public NotificationType getNotification() {
		return notification;
	}

	public void setNotification(NotificationType notification) {
		this.notification = notification;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
}
