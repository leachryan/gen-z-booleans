package gen.z.booleans

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ObjectTest {

    @Test
    fun `test fact with object where result should be true`() {
        val myDrip = Drip(style = "shoes")
        val yourDrip = Drip(style = "shoes")

        assertTrue(myDrip fact yourDrip)
    }

    @Test
    fun `test fact with object where result should be false`() {
        val myDrip = Drip(style = "shoes")
        val yourDrip = Drip(style = "clothes")

        assertFalse(myDrip fact yourDrip)
    }
}

data class Drip(val style: String)