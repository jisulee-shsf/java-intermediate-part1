package lang.immutable.address;

public class MemberV2 {
    private ImmutableAddress address;

    public MemberV2(ImmutableAddress address) {
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "address=" + address +
                '}';
    }
}
