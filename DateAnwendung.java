public class DateAnwendung {
    public static void main(String[] args) {
        // Date neuesDatum = new Date();
        /**
         * Date neuesDatum1 = new Date(10,11,2015); Date neuesDatum2 = new
         * Date(29,02,2016); Date neuesDatum3 = new Date(20,20,2020); Date neuesDatum4 =
         * new Date(29,02,1900); Date neuesDatum5 = new Date(1,8,1999); Date neuesDatum6
         * = new Date(23,1,1995);
         * 
         * 
         * /** System.out.println(neuesDatum.getDay());
         * System.out.println(neuesDatum.getMonth());
         * System.out.println(neuesDatum.getYear());
         * 
         * System.out.println(neuesDatum2.getDay());
         * System.out.println(neuesDatum2.getMonth());
         */
        /**
         * 
         * System.out.println(neuesDatum1.toString());
         * System.out.println(neuesDatum2.toString());
         * System.out.println(neuesDatum3.toString());
         * System.out.println(neuesDatum4.toString());
         * System.out.println(neuesDatum5.toString());
         * System.out.println(neuesDatum6.toString());
         */

        Date myDay = new Date(04, 05, 2021);
        Date myBirthday = new Date(04, 05, 2021);

        Person firstPerson = new Person("Driton", "Koskovik",  myDay);
        Person secondPerson = new Person("Driton","Koskovik", myBirthday);
      
        System.out.println("Vergleich der Personen: "+firstPerson.compareTo(secondPerson) );

    }

}
