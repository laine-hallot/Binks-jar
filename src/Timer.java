import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Timer extends Thread{

	private BinksUtils utils = new BinksUtils();
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat hour = new SimpleDateFormat("HH");
    private SimpleDateFormat min = new SimpleDateFormat("mm");
    private SimpleDateFormat all = new SimpleDateFormat("HH:mm");

    @Override
	public void run(){

		int c = utils.randInt(0, 23); //chooses a random hour
		int i = utils.randInt(0, 60); //chooses a random minute
		
		System.out.println(c+":"+i);
        System.out.println(all.format(cal.getTime()));
		while (true){

			//System.out.println(date.getHours() +":"+date.getMinutes());
			if (Integer.toString(c).equals(hour.format(cal.getTime())) && Integer.toString(i).equals(min.format(cal.getTime())) ){
                utils.playSound("JarJarBinks/meesa.au");
				try {
					Thread.sleep(500); //to prevent the sound from being played twice a the same time if the same number is picked.
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Too woke to sleep");
				}
				c = utils.randInt(0, 23); //chooses a new random hour
                i = utils.randInt(0, 60); //chooses a new random minute
                System.out.println(c+":"+i);
			}
		}
	}
}
