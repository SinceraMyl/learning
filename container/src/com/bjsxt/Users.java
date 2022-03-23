package com.bjsxt;

public class Users implements Comparable<Users> {
    private String username;
    private int userage;

    public Users() {
    }

    public Users(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }
    //定义比较规则
    @Override
    public int compareTo(Users o) {
        if (this.userage > o.getUserage()){
            return 1;
        }

        if (this.userage == o.getUserage()){
            return this.username.compareTo(o.getUsername());
        }
        return -1;
    }
}
