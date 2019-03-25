import java.util.*;
class RecordInput implements Comparable<RecordInput>{
	private int age;
	private int phone;
	public RecordInput(int age, int phone) {
		this.age = age;
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "RecordInput [age = " + age + ", phone = " + phone + "]";
	}
	
	
	public int compareTo(RecordInput x) {
		if(x.getAge() >= this.age) {return 1;}
		else {return -1;}
	}
	
	
	
	
}



public class Records {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean flag = false;
		ArrayList<RecordInput> myArray = new ArrayList<RecordInput>();
		while(!flag) {
			System.out.print("Enter age: ");
			String age = reader.nextLine();
			if(age.equals("quit")||age.isEmpty()) {
				flag = true;
				break;
			}
			int ages = Integer.parseInt(age);
			System.out.print("Enter phone: ");
			int phone = reader.nextInt();
			RecordInput r = new RecordInput(ages, phone);
			myArray.add(r);
			reader.nextLine();
			
		}
		
		Collections.sort(myArray);
		int max = 0;
		for(RecordInput c:myArray) {
			if(max < c.getAge()) {max = c.getAge();}
		}
		for(RecordInput p:myArray) {
			System.out.println(p.toString());
		}
		// TODO Auto-generated method stub
	}

}
