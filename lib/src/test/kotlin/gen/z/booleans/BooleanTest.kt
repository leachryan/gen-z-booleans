package gen.z.booleans

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BooleanTest {

    @Test
    fun `test fact with boolean where result should be true`() {
        assertTrue(true fact true)
    }

    @Test
    fun `test fact with boolean where result should be false`() {
        assertFalse(true fact false)
    }

    @Test
    fun `test cap with boolean where result should be true`() {
        assertTrue(true cap false)
    }

    @Test
    fun `test cap with boolean where result should be false`() {
        assertFalse(true cap true)
    }

    @Test
    fun `test no cap with boolean where result should be true`() {
        assertTrue(true `no cap` true)
    }
}