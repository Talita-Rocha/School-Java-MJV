package com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reserve")
public class Reserve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserve;

	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "hora")
	private LocalTime hora;
	
	@Column(name = "customer_id")
	private Integer customerId;    //PARA RETORNAR APENAS O ID.
	
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

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	@Override
	public int hashCode() {
		return Objects.hash(idReserve);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserve other = (Reserve) obj;
		return Objects.equals(idReserve, other.idReserve);
	}

}
