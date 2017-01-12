package com.me.sparta.login.authentication;

public class UserCredentials {

    private String preference;
    private String password;

    public UserCredentials() {
    }

    public UserCredentials(String preference, String password) {
        this.preference = preference;
        this.password = password;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCredentials that = (UserCredentials) o;

        if (preference != null ? !preference.equals(that.preference) : that.preference != null) return false;
        return password != null ? password.equals(that.password) : that.password == null;

    }

    @Override
    public int hashCode() {
        int result = preference != null ? preference.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "preference='" + preference + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
