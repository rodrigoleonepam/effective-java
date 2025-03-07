package com.epam.task;

import java.util.LinkedHashMap;

import lombok.extern.log4j.Log4j2;

/**
 * Simple Cache Implementation.
 */
@Log4j2
public class SimpleCache {

    private static final int MAX_ENTRIES = 100000;

    private LinkedHashMap<String, CacheValue> cache;

    public SimpleCache() {
        log.info("Instantiating SimpleCache");
        cache = new LinkedHashMap<>();
    }

    public void put(String key, String value) {
        log.info("putting key: {} value: {}", key, value);
        if (cache.size() >= MAX_ENTRIES) {
            throw new RuntimeException("Cache is full");
        }
        cache.put(key, new CacheValue(value));
    }

    public void put(String key, String value, long ttl) {
        log.info("putting key: {} value: {} ttl: {}", key, value, ttl);
        if (cache.size() >= MAX_ENTRIES) {
            throw new RuntimeException("Cache is full");
        }
        cache.put(key, new CacheValue(value, ttl));
    }

    public String get(String key) {
        log.info("getting key: {}", key);
        if (!cache.containsKey(key)) {
            return null;
        }
        CacheValue cacheValue = cache.get(key);
        if (cacheValue.isExpired()) {
            cache.remove(key);
            return null;
        }
        return cache.get(key).getValue();
    }

    public void printStats() {
        System.out.println("Cache size: " + cache.size());
    }

    public static void main(String[] args) {
        SimpleCache cache = new SimpleCache();
        cache.put("hello", "world");
        cache.put("foo", "bar");
        System.out.println("Cache: " + cache.get("foo"));
        cache.printStats();
    }

}
