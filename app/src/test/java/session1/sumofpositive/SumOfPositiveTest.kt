package session1

import junit.framework.TestCase
import org.junit.Test

class SumOfPositiveTest : TestCase(){
    @Test
    fun testSomething() {
        assertEquals(15, sum(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sum(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sum(intArrayOf()))
        assertEquals(0, sum(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sum(intArrayOf(-1, 2, 3, 4, -5)))
    }
}