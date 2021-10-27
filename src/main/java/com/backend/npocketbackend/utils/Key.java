package com.backend.npocketbackend.utils;

public class Key {
    String key="";
    String secret="";

}

    public Key() {
    }


    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Key key(String key) {
        setKey(key);
        return this;
    }

    public Key secret(String secret) {
        setSecret(secret);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Key)) {
            return false;
        }
        Key key = (Key) o;
        return Objects.equals(key, key.key) && Objects.equals(secret, key.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, secret);
    }

    @Override
    public String toString() {
        return "{" +
            " key='" + getKey() + "'" +
            ", secret='" + getSecret() + "'" +
            "}";
    }
