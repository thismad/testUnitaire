package cs108;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBoundedBuggy {

    @Test
    void testCapacityNormalQueue() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(5);
        int actual= a.capacity();
        int expected = 5; 
        assertEquals(expected,actual);
    }
    
    @Test
    void testNegativeQueue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BoundedIntQueueBuggy(-1);
        });
    }
    
    @Test
    void testNormalSize() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(7);
        int actualSize = a.size();
        assertEquals(7,actualSize);
    }
    
    @Test
    void testEmptySize() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(0);
        int actualSize = a.size();
        assertEquals(0,actualSize);
    }
    
    @Test
    void testIsReallyEmpty() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(0);
        assertTrue(a.isEmpty());
    }
    
    @Test
    void testIsNotEmpty() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(10);
        assertTrue(a.isEmpty());
    }
    
    
    @Test
    void testIsFull() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(10);
        assertTrue(a.isFull());
    }
    
    @Test 
    void addLastNormalUse() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(1);
        assertThrows(IllegalStateException.class, () -> {
            a.addLast(3);
        });
    }
    
    @Test
    void addLastFullQueue() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(1);
        assertThrows(IllegalStateException.class, () -> {
            a.addLast(3);
            a.addLast(4);
        });
    }
    
    @Test
    void removeFirstEmptyQueue() {
        BoundedIntQueueBuggy a = new BoundedIntQueueBuggy(1);
        assertThrows(IllegalStateException.class, () -> {
            a.removeFirst();
        });
    }
    
}

