
public class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}


	public int getMinutes() {
		return minutes;
	}

	

	public  int addHours(int hoursToAdd) {
		if(hoursToAdd > 0) {
			hours = this.getHours() + hoursToAdd;
		}
		return hours;
	}

	public int  addMinutes(int minutesToAdd) {
		if(minutesToAdd > 0) {
			minutes = this.getMinutes() + minutesToAdd;
			if(minutes > 59) {
				minutes = this.getMinutes()- 60;
				hours = this.getHours() + 1;
				return minutes;
			}
			else if(minutesToAdd < 1) {
				return minutes;
			}
		}
		return hours;
		
	
		
	}

	@Override
	public String toString() {
		String x = this.getHours() + " h "+ this.getMinutes() + " min ";
		if(this.getHours() < 99 && this.getMinutes() < 59) {
			 return x;
		}
		return x;
		
	}
	

}
