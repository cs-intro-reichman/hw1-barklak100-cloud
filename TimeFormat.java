// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String timeInput = args[0];
		String[] parts = timeInput.split(":");
		if (parts.length !=2) {
			System.out.println("time must be in hh:mm format");
			return;
		}
		int hour24 = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);
		if (hour24 < 0 || hour24 > 23 || minutes < 0 || minutes > 59) 
		System.out.println("hours must be 0-23 and minutes 0-59,");
		return; 
	}
	int hour12;
	String suffix; 
}   if (hour24 == 0) {
		hour12 = 12;
		suffix = "AM";
	}	else if (hours24 >= 1 && hours24 <= 11) {
			hour12 = hour24;
			suffix = "AM";
		} else if (hour24 == 12) {
		hour12 = 12;
	} else {
hour12 = hour24 - 12;
	}
	String formattedMinutes = String.format("%02d" , "minutes");
	String outputMessage = hour12 + ":" + formattedMinutes + " ";
System.out.println(outputMessage);
	}
}
