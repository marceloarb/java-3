package concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
    	Reasoning rs = new Reasoning();
    	rs.run();
    	rs.start();
    	rs.distinguish();
    	Thread team = new Thread(new TeamTC1());
    	team.start();
    	
    }
}