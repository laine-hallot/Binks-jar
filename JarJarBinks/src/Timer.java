import java.util.Date;
import java.util.Random;


public class Timer extends Binks {
	static int randomNum;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		int c = 2;//randInt(0, 23); //chooses a random hour
		int i = 59;//randInt(0, 60); //chooses a random minute
		
		System.out.println(c+":"+i);
		while (true){
			Date date = new Date();
			//System.out.println(date.getHours() +":"+date.getMinutes());
			if (c == date.getHours()  && i == date.getMinutes()  ){
					playSound("meesa.au");
					Thread.sleep(500); //to prevent the sound from being played twice a the same time if the same number is picked.
					c = randInt(0, 23); //chooses a new random hour
					i = randInt(0, 60); //chooses a new random minute
					System.out.println(c+":"+i);
			}else;
		}
	}
	
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();

	    randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	//outline2
	//get one random number 1-24 for hour,set hour variable equal to that
	//get one random number 1-60 for minutes, set min variable equal to that
	//put hour and min together, set randTime variable equal to that
	//get time once every minute 
	//check if current time equals randTime, if it does play sound, pick new hour and min variables, then repeat process
	//if time does not equal randTime then check time in one minute. Repeat this step till it is the correct time.
}
