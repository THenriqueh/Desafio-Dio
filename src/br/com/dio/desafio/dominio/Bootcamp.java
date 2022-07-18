package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate dateStart = LocalDate.now();
	private final LocalDate dateFinsh = dateStart.plusDays(45);
	private Set<Dev> subscribeDevs = new HashSet<>();
	private Set<Contents> contents = new LinkedHashSet<Contents>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Dev> getSubscribeDevs() {
		return subscribeDevs;
	}

	public void setSubscribeDevs(Set<Dev> subscribeDevs) {
		this.subscribeDevs = subscribeDevs;
	}

	public Set<Contents> getContents() {
		return contents;
	}

	public void setContents(Set<Contents> contents) {
		this.contents = contents;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public LocalDate getDateFinsh() {
		return dateFinsh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, dateFinsh, dateStart, description, name, subscribeDevs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(dateFinsh, other.dateFinsh)
				&& Objects.equals(dateStart, other.dateStart) && Objects.equals(description, other.description)
				&& Objects.equals(name, other.name) && Objects.equals(subscribeDevs, other.subscribeDevs);
	}

}
