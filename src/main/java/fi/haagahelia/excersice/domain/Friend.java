package fi.haagahelia.excersice.domain;

public class Friend {

    private String friendName;

    public Friend() {

    }

    public Friend(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    @Override
    public String toString() {
        return "Friend [friendName]";
    }

}
