package methodoverloading;

public class HourMinuteSeconds {
	
	private static final String INVALID_VALUE = "Invalid value";
	private static final String SOMETHING_WRONG = "You did something wrong!";

	private static String getDurationString(long minute, long seconds) {

		if (minute < 0) {
			System.out.println(INVALID_VALUE + " : minute " + minute);
			return String.valueOf(-1);
		} else if (minute >= 0 && (seconds < 0 || seconds > 59)) {
			System.out.println(INVALID_VALUE + " : seconds " + seconds);
			return String.valueOf(-1);
			
		} else if (minute >= 0 && (seconds >= 0 && seconds <= 59)) {
			
			long hour = ((minute / 60) + (seconds / 3600));
			minute = minute % 60;

			String stringHour = hour + "h";
			String stringMinute = minute + "m";
			String stringSeconds = seconds + "s";

			if (hour < 10) {
				stringHour = "0" + stringHour;
			}

			if (minute < 10) {
				stringMinute = "0" + stringMinute;
			}

			if (seconds < 10) {
				stringSeconds = "0" + stringSeconds;
			}

			return (stringHour + " " + stringMinute + " " + stringSeconds);

			// return String.valueOf(hour) + "HH " + String.valueOf(minute) + "MM " + String.valueOf(seconds) + "SS";
		} else {
			System.out.println(SOMETHING_WRONG);
			return String.valueOf(-1);
		}
	}

	private static String getDurationString(long seconds) {

		if (seconds < 0) {
			System.out.println(INVALID_VALUE + " : seconds " + seconds);
			return String.valueOf(-1);
		} else if (seconds >= 0) {
			long minute = (long) seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minute, seconds);
		} else {
			System.out.println(SOMETHING_WRONG);
			return String.valueOf(-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(getDurationString(65L, 45L));
		System.out.println(getDurationString(5400));
		System.out.println(getDurationString(-40));
		System.out.println(getDurationString(65, 9));

	}
};