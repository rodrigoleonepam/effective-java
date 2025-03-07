package com.epam.task;

public class CacheValue {

    // Default time to live in milliseconds	
    private static final long DEFAULT_TTL = 3600000;

    private String value;
    private long expirationTime;

    public CacheValue(String value) {
        this.value = value;
        this.expirationTime = System.currentTimeMillis() + DEFAULT_TTL;
    }

    public CacheValue(String value, long ttl) {
        this.value = value;
        this.expirationTime = System.currentTimeMillis() + ttl;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > expirationTime;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public long getExpirationTime() {
        return expirationTime;
    }
}
