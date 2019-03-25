import java.util.Arrays;

public class CourseObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course[] courseArray = {
				new Course("055", "C#"), 
				new Course("4024", "Java"),
				new Course("144", "Python"),
				new Course("4034", "Ruby")

				};
		Arrays.sort(courseArray);
		for (Course courseObject : courseArray) {
		System.out.println(courseObject.getName() + " :" + courseObject.getCode());
		}
	}

}
