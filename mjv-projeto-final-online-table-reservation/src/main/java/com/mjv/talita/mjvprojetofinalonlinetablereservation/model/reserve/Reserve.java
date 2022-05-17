package com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve;

import java.awt.TextArea;
import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.NotificationType;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.UnitRestaurant;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.cadastro.Customer;

public class Reserve {

	private int Idreservation;
	private UnitRestaurant unit;
	private LocalDate data;
	private LocalTime hora;
	private Hall hall;
	private NumberPeople numberPeople;
	private TextArea note;
	private StatusReservation status;
	private Customer customer;
	private NotificationType notification;
	
	public int getIdreservation() {
		return Idreservation;
	}
	public void setIdreservation(int idreservation) {
		Idreservation = idreservation;
	}
	public UnitRestaurant getUnit() {
		return unit;
	}
	public void setUnit(UnitRestaurant unit) {
		this.unit = unit;
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
	public TextArea getNote() {
		return note;
	}
	public void setNote(TextArea note) {
		this.note = note;
	}
	public StatusReservation getStatus() {
		return status;
	}
	public void setStatus(StatusReservation status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public NotificationType getNotification() {
		return notification;
	}
	public void setNotification(NotificationType notification) {
		this.notification = notification;
	}
	
	@Override
	public String toString() {
		return "Reserve [Idreservation=" + Idreservation + ", unit=" + unit + ", data=" + data + ", hora=" + hora
				+ ", hall=" + hall + ", numberPeople=" + numberPeople + ", note=" + note + ", status=" + status
				+ ", customer=" + customer + ", notification=" + notification + "]";
	}
	
}
