package lang.object.equals;

public class UserV1 {

    private String id;

    public UserV1(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV1 user = (UserV1) obj;
        return id.equals(user.id);
    }
}
