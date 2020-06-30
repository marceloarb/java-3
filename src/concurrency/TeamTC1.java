package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable{

    List<String> team = new ArrayList<>();

	@Override
	public void run() {
		 String[] names = {"Emilios","Amir","Craig", "Jonanthan", "Abram" , "Marcelo","Adam","Christian","Julian","Monica","Phoenix","Abigail","Devon","Gabe","Jose","Michael"};
		Thread.currentThread().setName(names[0]);
		 for(int i = 0; i<names.length; i++) {
			 System.out.println(names[i]);
			 team.add(Color.values()[i] + names[i]);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 
		 }
		 System.out.println("My TA name is "+Thread.currentThread().getName());
		 System.out.println(team);
	}
	
    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class. 
    //In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).
    //There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List 
    //After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well! 
    //All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).
    //Kick off the thread in the Main class of the concurrency package.  
}