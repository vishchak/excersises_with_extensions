package telephone;


import java.util.HashSet;
import java.util.Set;

public class Network {
    private static final Set<Long> REGISTERED_PHONES = new HashSet<>();

    public void registerNumber(Phone phone) {
        Long number = phone.getNumber();
        if (REGISTERED_PHONES.contains(number)) {
            System.out.println("Your number " + phone.getNumber() + " has already been registered");
        } else {
            REGISTERED_PHONES.add(number);
            System.out.println("Your number " + phone.getNumber() + " successfully been added");
        }
    }

    public static Boolean ifRegistered(Long number) {
        return REGISTERED_PHONES.contains(number);
    }

}
