package com.epam.task;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CacheValueTest {

    @Test
    @DisplayName("Test isExpired")
    public void testIsExpired() {
        
        CacheValue cacheValue = new CacheValue("value", 1000);
        assertFalse(cacheValue.isExpired());
        cacheValue.setExpirationTime(System.currentTimeMillis() - 1000);
        assertTrue(cacheValue.isExpired());
    }

    @Test
    @DisplayName("Test putWithTtl") 
    public void testPutWithTtl() {
        SimpleCache cache = new SimpleCache();
        cache.put("hello","world", 1000);
        assertNotNull(cache.get("hello"));
    }

    @Test
    @DisplayName("Test putWithoutTtl")  
    public void testPutWithoutTtl() {
        SimpleCache cache = new SimpleCache();
        cache.put("hello","world");
        assertNotNull(cache.get("hello"));
    }

    @Test
    @DisplayName("Test getKeyNotFound")
    public void testGetKeyNotFound() {
        SimpleCache cache = new SimpleCache();
        assertNull(cache.get("notfound"));
    }
}
