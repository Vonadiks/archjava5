public class App {
    public static void main(String[] args) {
        Human mother = new Human("Петрова", "Анна", "Петровна", 22);
        Human father = new Human("Петров", "Николай", "Васильевич", 25);
        Human child = new Human("Петров", "Антон", "Николаевич");

        Record bRecord = new Record();
        bRecord.setNumberAZ(1);

        RegistrationStrategy birthRegistrationStrategy = new BirthRegistrationStrategy(mother,father,child);
        bRecord.registration(birthRegistrationStrategy);

        Human bridegroom = new Human("Иванова", "Ольга", "Петровна", 25);
        Human bride = new Human("Сидоров", "Алексей", "Васильевич", 26);

        Record wRecord = new Record();
        wRecord.setNumberAZ(7);

        RegistrationStrategy weddingRegistrationStrategy = new WeddingRegistrationStrategy(bridegroom, bride);
        wRecord.registration(weddingRegistrationStrategy);
    }

}
