public class WeddingRegistrationStrategy implements RegistrationStrategy{
    private Human bridegroom;
    private Human bride;

    public WeddingRegistrationStrategy(Human bridegroom, Human bride) {
        this.bridegroom = bridegroom;
        this.bride = bride;
    }


    @Override
    public void registration(int numberAZ) {
        System.out.println();
        System.out.println("Registration of marriage. Number: " + numberAZ );
        System.out.println("Bridegroom: " + bridegroom.getFirstName() + " " + bridegroom.getLastName()+ " " + bridegroom.getPatronymic() + " " + bridegroom.getAge());
        System.out.println("Bride: " + bride.getFirstName() + " " + bride.getLastName()+ " " + bride.getPatronymic() + " " + bride.getAge());
    }
}
