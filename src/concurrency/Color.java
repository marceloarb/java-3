package concurrency;

import java.util.Random;

public enum Color {
	
	BLACK("\033[0;30m"),    
    RED("\033[0;31m"),      
    GREEN("\033[0;32m"),    
    YELLOW("\033[0;33m"),   
    BLUE("\033[0;34m"),     
    MAGENTA("\033[0;35m"),  
    CYAN("\033[0;36m"),     
    WHITE("\033[0;37m"),
    ANSI_RESET( "\u001B[0m"),
    ANSI_BLACK1 ("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE ("\u001B[35m"),
     ANSI_CYAN( "\u001B[36m"),
    ANSI_WHITE1 ("\u001B[37m"),
    BLACK1("\033[0;30m"),    
    RED1("\033[0;31m"),      
    GREEN1("\033[0;32m"),    
    YELLOW1("\033[0;33m"),   
    BLUE1("\033[0;34m"),     
    MAGENTA1("\033[0;35m"),  
    CYAN1("\033[0;36m"),     
    WHITE1("\033[0;37m"),
    ANSI_RESET1( "\u001B[0m"),
    ANSI_BLACK ("\u001B[30m"),
    ANSI_RED1("\u001B[31m"),
    ANSI_GREEN1("\u001B[32m"),
    ANSI_YELLOW1("\u001B[33m"),
    ANSI_BLUE1("\u001B[34m"),
    ANSI_PURPLE1 ("\u001B[35m"),
     ANSI_CYAN1( "\u001B[36m"),
    ANSI_WHITE11("\u001B[37m");
	
	
	
	
	 String code;
	Color(String i) {
		this.code = i;
	}
	 @Override
	    public String toString() {
		 System.out.println(code);
	        return code;
	    }
	
	
    

   
}
