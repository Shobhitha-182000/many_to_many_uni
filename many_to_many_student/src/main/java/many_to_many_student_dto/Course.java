package many_to_many_student_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Course {
	@Id
	private int id;
	private String couse_name;
	private double fees;
	private int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCouse_name() {
		return couse_name;
	}
	public void setCouse_name(String couse_name) {
		this.couse_name = couse_name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", couse_name=" + couse_name + ", fees=" + fees + ", duration=" + duration + "]";
	}
	
}
