import java.util.ArrayList;

public class ObjectsSailorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
		Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
		Sailor thirdSailor = new Sailor("John", "john@sailors.com");
		Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");

		Crew firstCrew = new Crew();
		Crew secondCrew = new Crew();

		firstCrew.addCrewMember(firstSailor);
		firstCrew.addCrewMember(secondSailor);
		firstCrew.addCrewMember(fourthSailor);

		secondCrew.addCrewMember(thirdSailor);
		secondCrew.addCrewMember(secondSailor);

		System.out.println("=== First crew ===\n" + firstCrew);
		System.out.println("=== Second crew ===\n" + secondCrew);
		secondSailor.setEmail("Susan@sailors.com");
		System.out.println("=== Second crew ===\n" + secondCrew);
	}

}

class Sailor {
	private String name;
	private String email;

	public Sailor(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

class Crew {
	private ArrayList<Sailor> list;
	Sailor sailor;

	public Crew() {
		this.list = new ArrayList<Sailor>();
		this.sailor = sailor;
	}

	public Sailor getSailor() {
		return sailor;
	}

	public void addCrewMember(Sailor sailor) {
		this.list.add(sailor);
	}

	public String toString() {
		String sailor_description = "";
		for (Sailor s : this.list) {
			sailor_description += s.getName() + " (" + s.getEmail() + ")" + "\n";
		}
		return sailor_description;
	}

}