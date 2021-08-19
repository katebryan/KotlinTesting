package session1.multiply

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class MultiplyTest : TestCase() {
    @Test
    @Throws(Exception::class)
    fun test_Associativity_Of_Multiplication() {
        for (i in 0..99) {
            val a = Math.random()
            val b = Math.random()
            val c = Math.random()
            val message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c)
            Assert.assertEquals(
                message,
                multiply(multiply(a, b), c),
                multiply(a, multiply(b, c)),
                1E-14
            )
            Assert.assertEquals(multiply(a, b), a * b, 1e-3)
        }
    }

    @Test
    fun test_Multiply_By_Zero() {
        Assert.assertEquals(multiply(0.0, 5.0), 0)
    }

}