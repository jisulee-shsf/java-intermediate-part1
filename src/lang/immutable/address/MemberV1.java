package lang.immutable.address;

public class MemberV1 {
    private Address address;

    public MemberV1(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "address=" + address +
                '}';
    }
}
