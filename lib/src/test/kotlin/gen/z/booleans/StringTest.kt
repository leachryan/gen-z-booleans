package gen.z.booleans

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringTest {

    @Test
    fun `test fact with strings when result should be true`() {
        assertTrue("Fact" fact "Fact")
    }

    @Test
    fun `test fact with strings when result should be false`() {
        assertFalse("Fact" fact "Facts")
    }

    @Test
    fun `test cap with strings when result should be true`() {
        assertTrue("Cap" cap "Caps")
    }

    @Test
    fun `test cap with strings when result should be false`() {
        assertFalse("Cap" cap "Cap")
    }
}