package session1

import junit.framework.TestCase
import org.junit.Test

class EvenOrOddTest : TestCase() {
    @Test
    fun testFixed() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }
}