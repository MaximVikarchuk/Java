package hw.lesson5;

public class homeWorkApp5 {

    public static void main(String[] args) {

        Person mainEmployee = new Person("Петр", "Петрович",
                "Ури", "8(495)000-00-00",
                "QA Engeneer", 80000, 1978);

        Person[] office = {
                mainEmployee,
                new Person("Артем", "Васильевич",
                        "Шпак", "8(495)111-11-11",
                        "project owner", 120000, 1981),
                new Person("Фёдор", "Флександрович",
                        "Игнатьев", "8(495)222-22-22",
                        "project manager", 110000, 1987),
                new Person("Виктор", "Петрович",
                        "Копейкин", "8(495)333-33-33",
                        "senior developer", 100000, 1996),
                new Person("Игнат", "Ерофеич",
                        "Батутов", "8(495)444-44-44",
                        "engineer", 60000, 1990)
        };

        getAllPersonsInOffice(office);
        System.out.println("----------------------");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}

