import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BirthdayCalendar 
{

     ArrayList<Person> liste = new ArrayList<Person>();

    BirthdayCalendar() {

    }

    public boolean addPerson(Person p) {

        if (liste.contains(p)) {

            return false;
        }
        liste.add(new Person());
        return true;
    }

    public boolean removePerson(Person p) {
        if (liste.contains(p)) {
            liste.remove(liste.size() - 1);
            return true;
        }
        return false;
    }

    public Person nextBirthday(Date date) {
        return null;

    }

    public Collection<Person> persons() {
        
        return null;

    }

    public static void main(String[] args) {
        ArrayList<Person> liste2 = new ArrayList<Person>();
        HashMap<Key,Date> hashmap = new HashMap<>();
        Key key12 = new Key("lisa","Schmidt"); 
        Person lisa = new Person("Lisa", "Schmidt", new Date(01,01,1990));
        Person max = new Person("Max", "Mustermann", new Date(23,01,1995));
        liste2.add(lisa);
        liste2.add(lisa);
        System.out.println(liste2);
//System.out.println(liste2.isEmpty());
      //  System.out.println("Folgende Person wurde entfernt: " + liste2.remove(lisa));
        System.out.println("Es sind noch folgene Person(en) in der Liste: " + liste2);
      //  System.out.println("Folgende Person wurde entfernt: " + liste2.remove(lisa));
        System.out.println(liste2);
    }

}
