package br.com.dio.desafio.dominio;

public abstract class Contents {

	protected static final double PATERN_XP = 20;

	protected String title;
	protected String description;

	public Contents(String title, String description) {
	
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double calculateXp();

}
