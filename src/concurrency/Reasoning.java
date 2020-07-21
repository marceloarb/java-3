package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    void distinguish() {
    	
        //print to the console the difference between a thread and a process
    	System.out.println("Thread is the part of a process. Thread share memory, consume less resources, takes less time to terminate, etc. It is a light weight process.");
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
    }
    
    public void run() {
    	System.out.println("When the run() method is invoked it's executed on the calling, just like any other method, but with the start() method it's starting a new thread and calling the run method.");
    }
}

