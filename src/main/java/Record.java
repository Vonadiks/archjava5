import java.util.List;

public class Record {

    int numberAZ;

    public void setNumberAZ(int numberAZ) {
        this.numberAZ = numberAZ;
    }

    public void registration(RegistrationStrategy strategy) {
        int numberAZ = getNumberAZ();
        strategy.registration(numberAZ);
    }

    private int getNumberAZ() {
        return numberAZ;
    }

}
