public class Date {
    private int day;
    private int month;
    private int year;

    

    public Date(Date other) {

        /** Kopie des übergebenen Datumobjektes */
 
        this.day = other.day;

        this.month = other.month;

        this.year = other.year;


        
        
    }

    public Date nextDay() {
        Date nextDay = new Date();

        /**
         * Neues Datumsobjekt, welches ein Tag nach dem Datum liegt. Auf Tage, Monat
         * Regel achten.
         */

        if (isValidDate(nextDay.day, nextDay.month, nextDay.year)) {

            nextDay.day++;

            return nextDay;

        }
        return nextDay;

    }

    public String getWeekday() {
        int weekDay;

        if (month < 3) {
            month = month + 12;
            year = year - 1;
        }
        weekDay = (day + 2 * month + (3 * month + 3) / 5 + year + year / 4 - year / 100 + year / 400 + 1) % 7;

        if (weekDay == 0)
            return "Sonntag";
        else if (weekDay == 1)
            return "Montag";
        else if (weekDay == 2)
            return "Dienstag";
        else if (weekDay == 3)
            return "Mittwoch";
        else if (weekDay == 4)
            return "Donnerstag";
        else if (weekDay == 5)
            return "Freitag";
        else if (weekDay == 6)
            return "Samstag";
        else {
            return getWeekday();
        }

    }

    public boolean isEqual(Date other) {
        if (this.day == other.day && this.month == other.month && this.year == other.year) {
            return true;
        }
        return false;

    }

    public Date() {
        /** Konstruktor erzeugt neues Date-Objekt mit dem Datum 01.01.2000 */
        day = 01;
        month = 01;
        year = 2000;

    }

    public Date(int myDay, int myMonth, int myYear) {
        this();

        if (isValidDate(myDay, myMonth, myYear)) {
            /**
             * Kontruktur in dem Tag, Monat und Jahr angegeben werden können. Also
             * In.readInt() Wenn die Werte gültig DANN soll der 01.01.2000 als Datum
             * ausgewählt werden
             */

            this.day = myDay;
            this.month = myMonth;
            this.year = myYear;
        }
    }
    // myDay = In.readInt();
    // myMonth = In.readInt();
    // myYear = In.readInt();

    public int getDay() {
        return day;

    }

    public int getMonth() {
        return month;

    }

    public int getYear() {
        return year;

    }

    public Date callBase() {
        return new Date();
    }

    public boolean isValidDate(int anyDay, int anyMonth, int anyYear) {
        /**
         * Überprüft Tag, Monat und Jahr auf Validität und auch Schaltjahre. Lösung von
         * DateChecker nachschauen
         */
        this.day = anyDay;
        this.month = anyMonth;
        this.year = anyYear;

        if ((anyMonth == 1 || anyMonth == 3 || anyMonth == 5 || anyMonth == 7 || anyMonth == 8 || anyMonth == 10
                || anyMonth == 12) && anyDay >= 1 && anyDay <= 31) {
            return true;
        }

        else if ((anyMonth == 4 || anyMonth == 6 || anyMonth == 9 || anyMonth == 11) && anyDay <= 30) {
            return true;
        } else if (anyMonth == 2 && anyDay <= 29) {
            return true;
        } else if (anyMonth == 2 && anyDay >= 1 && anyDay <= 28) {
            return true;
        } else if (anyMonth >= 32) {
            return false;
        } else if (day > 31 || month > 12) {

            return false;

        }
        return false;

    }

    public boolean setDate(int newDay, int newMonth, int newYear) {
        if (isValidDate(newDay, newMonth, newYear)) {
            this.day = newDay;
            this.month = newMonth;
            this.year = newYear;
            return true;

        }
        return false;

        /**
         * Setz das Datum auf die übergebenen Werte aus public Date(int myDay, int
         * myMonth, int myYear) und gibt true zurück, WENN die Werte ein gültiges Datum
         * darstellen. D.h Gültigkeitsbereich festlegen! Für ein ungültiges Datum return
         * false; und ändert das Datum nicht
         */

    }

    public boolean isBefore(Date otherDate) {
        if ((isBeforeYear(otherDate) == true && isBeforeMonth(otherDate) == true)
                || (isBeforeYear(otherDate) == true && isBeforeMonth(otherDate) == true && isBeforeDay(otherDate))) {
            return true;
        } else {
            return false;
        }

        /**
         * liefert true zurück wenn Das Datum vor dem übergebenen anderen Datum liegt
         * Ansonsten return false;
         */
    }

    public boolean isBeforeDay(Date otherDate) {
        if (otherDate.day < this.day) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isBeforeMonth(Date otherDate) {
        if (otherDate.month < this.month) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBeforeYear(Date otherDate) {
        if (otherDate.year < this.year) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (day <= 9 && month >= 10) {
            return String.format("Das Datum: 0%s.%s.%s", day, month, year);
        } else if (day <= 9 && month <= 9) {
            return String.format("Das Datum: 0%s.0%s.%s", day, month, year);
        } else if (day > 9 && month <= 9) {
            return String.format("Das Datum: %s.0%s.%s", day, month, year);
        }

        return String.format("Das Datum: %s.%s.%s", day, month, year);

    }
}
