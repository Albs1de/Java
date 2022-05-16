public class Person implements Comparable<Person> {
    // private int age;
    private String firstName;
    private String lastName;
    private Date newDate;
    private Date birthday;

    // Person Konstruktor
    public Person() {

    }

    public Person(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.birthday = birthday;

    }
    public String toString() 
    {
        return firstName + " " + lastName + " " + birthday;
    }

    public boolean equals(Object obj) {
      
        return false;
    }

    // Setzt den Vornamen und gibt diesen zurück
    public String setFirstName(String setFirstName) {
        this.firstName = setFirstName;
        return setFirstName;
    }

    // Setzt den Nachnamen und gibt diesen zurück
    public String setLastName(String setLastName) {
        this.lastName = setLastName;
        return setLastName;
    }

    // Gibt das Alter zurück
    /*public int getAge() {
        return age;
    }*/

    

    // Gibt den Vornamen zurück
    public String getFirstName() {
        return firstName;
    }

    // Gibt den Nachnamen zurück
    public String getLastName() {
        return lastName;
    }

    /*
     * public String toString() { return firstName + " " + lastName + "(" + age +
     * ")"; }
     */

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub

        if ((birthday.getMonth() < o.birthday.getMonth())
                || ((birthday.getMonth() == o.birthday.getMonth()) && birthday.getDay() < o.birthday.getDay())) {
            return 10;
        } else if (birthday.getDay() == o.birthday.getDay() && birthday.getMonth() == o.birthday.getMonth()) {
            int vergleich = lastName.compareTo(o.lastName);
            if (vergleich < 0) {
                System.out.println(this.lastName + " ist vor " + o.lastName + " im Alphabet dran.");
            } else if (vergleich > 0) {
                System.out.println(o.lastName + " ist vor " + this.lastName + " im Alphabet dran.");
            } else if (this.lastName == o.lastName) {
                int vergleich2 = firstName.compareTo(o.firstName);
                if (vergleich2 < 0) {
                    System.out.println(this.firstName + " ist vor " + o.firstName + " im Alphabet dran.");
                } else if (vergleich2 > 0) {
                    System.out.println(o.firstName + " ist vor " + this.firstName + " im Alphabet dran.");
                } else if (this.lastName == o.lastName && this.firstName == o.firstName) {
                    if (birthday.getYear() < o.birthday.getYear()) {
                        System.out
                                .println(this.firstName + " " + this.lastName + " ist älter und somit der Vorgänger.");
                    } else if (o.birthday.getYear() < birthday.getYear()) {
                        System.out.println(o.firstName + " " + o.lastName + " ist älter und somit der Vorgänger");
                    }
                }
            } else if ((birthday.getDay() == o.birthday.getDay()) && (birthday.getMonth() == o.birthday.getMonth())
                    && (this.firstName == o.firstName) && (this.lastName == o.lastName)
                    && (birthday.getYear() == o.birthday.getYear())) {
                System.out.println("Die Personen sind gleich.");
            }
        }

        else {
            return 8;
        }
        /*
         * if( this.birthday.getDay() == o.birthday.getDay()) { return 0; }
         */
        return 0;

    }

}
