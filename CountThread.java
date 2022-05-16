public class CountThread extends Thread{
  
   int result;
   private int[] eingabeArray;
   private int untergrenze;
   private int obergrenze;

    // Erzeugt ein Eingabe Array und Unter- sowie Obergrenze
    public CountThread ( int[] eingabeArray , int untergrenze, int obergrenze) {
        this.eingabeArray = eingabeArray;
        this.untergrenze = untergrenze;
        this.obergrenze = obergrenze;
       

    }

    public void run () {
        
     ArrayCount.countNumbers(eingabeArray, untergrenze, obergrenze);
        
    }
    public int getResult() {
        return result;
    }
    
}
