public class Time {
	
	public static void main (String[] args) {
		
		//variable declaration
		int hour = 12;
		int minute = 33;
		int second = 23;
		int SecondsSinceMidnight = (hour * 3600 + minute * 60 + second);
		int PercentageSecondsSinceMidnight = (100 * SecondsSinceMidnight);
		
		//current time
		System.out.println("the time I started the assignmnet: " + hour + ":" + minute + "." + second);
		
		//seconds since midnight
		System.out.println("number of seconds since midnight: " + hour * 3600 + minute * 60 + second);
		
		//seconds remaining in the day 
		System.out.println("number of seconds remaining in the day: " + (24 * 3600 - (hour * 3600 + minute * 60 + second)));
		
		//percentage of the day that has passed 
		System.out.println("percentage of the day that has passed: " + PercentageSecondsSinceMidnight / (24 * 3600) + "%");
		
		//change variables to reflect the current time
		hour = 13;
		minute = 15;
		second = 29;
		System.out.println("the time I finished the assignmnet: " + hour + ":" + minute + "." + second);
		
	}

}
