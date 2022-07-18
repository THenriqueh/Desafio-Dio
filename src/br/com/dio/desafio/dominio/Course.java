package br.com.dio.desafio.dominio;

public class Course extends Contents {

	private Integer workload;

	public Course(String title, String description, Integer workload) {
		super(title, description);
		this.workload = workload;
	}


	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course [workload=" + workload + "]";
	}

	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
