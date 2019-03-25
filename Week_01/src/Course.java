
public class Course implements Comparable<Course>{
	private String code;
	private String name;
	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	public int compareTo(Course c) {
		return code.compareTo(c.getCode());
	}
	@Override
	public String toString() {
		return this.getCode()+": "+this.getName();
	}
	

}
