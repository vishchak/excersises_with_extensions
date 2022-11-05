package telephone;

public class Main {
    /**
     * create class Network.
     * methods: registration of a mobile operator in the network
     * create class Phone.
     * fields: number
     * methods: the method implements outgoing and incoming calls. if one or all of the phones have not been registered in the network, terminate the method.
     */
    public static void main(String[] args) {
        Network network = new Network();
        Phone phone1 = new Phone(12345L);
        Phone phone2 = new Phone(67890L);

        network.registerNumber(phone1);
        network.registerNumber(phone2);

        phone1.call(phone2.getNumber());
        phone1.call(312453432423L);

    }
}
