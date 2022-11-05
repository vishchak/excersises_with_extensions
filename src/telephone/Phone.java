package telephone;

public class Phone {
    private Long number;

    public Phone() {
    }

    public Phone(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void call(Long number) {
        Boolean outgoingNumber = Network.ifRegistered(this.number);
        Boolean incomingNumber = Network.ifRegistered(number);

        if (outgoingNumber.equals(true) && incomingNumber.equals(true)) {
            System.out.println("outgoing call to " + number);
            incomingCall(this.number);
        } else if (outgoingNumber.equals(false)) {
            System.out.println("You have to register first");
        } else System.out.println("The number u're calling " + number + " is not registered");
    }

    public void incomingCall(Long number) {
        System.out.println("incoming call from " + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                '}';
    }
}
