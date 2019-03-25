import java.util.Scanner;
public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Applicant []a = new Applicant[4];
		for(int i = 0; i < a.length; i++) {
			System.out.print("Enter "  + (i+1) + ". name: ");
			String s = reader.next();
			System.out.print("Enter points: ");
			int p = reader.nextInt();
			a[i] = new Applicant(s,p);
		}
		System.out.print("Enter the minimum of required points: ");
		int point = reader.nextInt();
		String text = "The following applicants achived the minimum of " + point + " points:";
		for(int i = 0; i < a.length; i++) {
			
		if(a[i].getPoints()>=point) {
			System.out.println(a[i].getName()+ ", "+ a[i].getPoints() + " points");
		}
		}
		
		// TODO Auto-generated method stub

	}

}
