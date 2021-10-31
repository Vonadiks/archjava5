import java.util.List;

public final class BirthRegistrationStrategy implements RegistrationStrategy{
    private  Human mother;
    private  Human father;
    private  Human child;

    public BirthRegistrationStrategy(Human mother, Human father, Human child) {
        this.mother = mother;
        this.father = father;
        this.child = child;
    }

    @Override
    public void registration(int numberAZ) {
        System.out.println();
        System.out.println("Registration of birth. Number: " + numberAZ);
        System.out.println("Mother: " + mother.getFirstName() + " " + mother.getLastName() + " " + mother.getPatronymic() + " " + mother.getAge());
        System.out.println("Father: " + father.getFirstName() + " " + father.getLastName() + " " + father.getPatronymic() + " " + father.getAge());
        System.out.println("Child: " + child.getFirstName() + " " + child.getLastName() + " " + child.getPatronymic() + " " + child.getAge());
    }
}
