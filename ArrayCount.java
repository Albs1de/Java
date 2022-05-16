public class ArrayCount {
 static int[] input = new int[10000];
    public static void main(String[] args) {
        
       
        for(int i = 0; i< input.length; i++) {
            input[i] = (int) (Math.random() * 999);
            System.out.println(input[i]);
        }
        long startTime = System.nanoTime();
        long beforeTime = startTime;
        System.out.println("Zeit vor countNumbers: " + beforeTime);
        
        System.out.println("Anzahl der >100 Zahlen " + countNumbers(input, 0, 999));
        long afterTime = System.nanoTime();
      System.out.println("Zeit nach countNumbers: " + afterTime);
       
        long durchschnitt = afterTime - beforeTime;
    System.out.println("Die Zeit nach countNumbers minus die Zeit vor countNumbers: " + durchschnitt );

    long newTime = System.nanoTime();
    System.out.println("Neue Zeit vor den zwei Threads: " + newTime);
    /* CountThread t1 = new CountThread(input, 0, 4999);
     CountThread t2 = new CountThread(input, 5000, 9999);
     t1.start();
     t2.start();

     System.out.println("GetResult vom t1: " +  t1.getResult() );

     System.out.println("GetResult vom t2: " + t2.getResult() ); */

     CountThread eins = new CountThread(input, 0, (input.length -1)/2);
     CountThread zwei = new CountThread(input, ((input.length -1)/2)+1, (input.length -1));
     long startTwo = System.nanoTime();
     eins.run();
     zwei.run();
     long finishTime = System.nanoTime();
     System.out.println( "Resultat von eins: " + eins.getResult() + " Resultat von zwei: b" + zwei.getResult());
     System.out.println(startTwo + " " + finishTime);
    }
    // Array data geht die übergebenen Zahlen im Bereich lo und hi durch. Dann
    // Die Zahlen >100 zählen und dann Ausgeben wie viele Zahlen größer als 100 sind.
    public static int countNumbers(int[] data, int lo, int hi) {
        input = data;
        int anzahl = 0;
        for(  int i = lo; i <= hi; i++) {
            if ( data[i] > 100)
             {
                 anzahl++;

            }
           

        }
        return anzahl;




        }
      
                 
             
            
            
            
       


        

    }
