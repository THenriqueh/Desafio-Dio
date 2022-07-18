package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String name;

	private Set<Contents> subscribeContets = new LinkedHashSet<>();
	private Set<Contents> concluidsContents = new LinkedHashSet<>();

	public Dev(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Contents> getSubscribeContets() {
		return subscribeContets;
	}

	public void setSubscribeContets(Set<Contents> subscribeContets) {
		this.subscribeContets = subscribeContets;
	}

	public Set<Contents> getConcluidsContents() {
		return concluidsContents;
	}

	public void setConcluidsContents(Set<Contents> concluidsContents) {
		this.concluidsContents = concluidsContents;
	}

	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.subscribeContets.addAll(bootcamp.getContents());
		bootcamp.getSubscribeDevs().add(this);
	}

	public void progress() {
		Optional<Contents> contents = this.subscribeContets.stream().findFirst();
		if (contents.isPresent()) {
			this.concluidsContents.add(contents.get());
			this.subscribeContets.remove(contents.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}

	}

	public double calculateTotalXp() {
		return this.concluidsContents.stream().mapToDouble(Contents::calculateXp).sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(concluidsContents, name, subscribeContets);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(concluidsContents, other.concluidsContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribeContets, other.subscribeContets);
	}

}
