package labquestions;

public class Numberprinter extends Thread {
	public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) 
            {

            }
        }
    }
	public static void main(String[] args) {
		
Numberprinter thread = new Numberprinter();
        
        // Start the thread
        thread.start();
    }
}