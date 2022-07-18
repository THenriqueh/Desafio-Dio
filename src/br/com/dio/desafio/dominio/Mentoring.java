package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Contents {

	private LocalDate date;

	public Mentoring(String title, String description, LocalDate date) {
		super(title, description);
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Mentoring [date=" + date + "]";
	}

}
