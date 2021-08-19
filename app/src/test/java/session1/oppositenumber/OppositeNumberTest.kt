package session1

import junit.framework.TestCase
import org.junit.Test

class OppositeNumberTest : TestCase(){

    @Test
    fun testFixed() {
        assertEquals(-1, opposite(1));
        assertEquals(0, opposite(0));
        assertEquals(25, opposite(-25));
    }
}