package gen.z.booleans

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BooleansTest {

    @Test
    fun `test fact is true`() {
        assertTrue(fact)
    }

    @Test
    fun `test facts is true`() {
        assertTrue(facts)
    }

    @Test
    fun `test cap is false`() {
        assertFalse(cap)
    }

    @Test
    fun `test noCap is true`() {
        assertTrue(noCap)
    }

    @Test
    fun `test no cap is true`() {
        assertTrue(`no cap`)
    }

    @Test
    fun `test 💯 is true`() {
        assertTrue(`💯`)
    }

    @Test
    fun `test 🧢 is false`() {
        assertFalse(`🧢`)
    }

    @Test
    fun `test 🚫🧢 is true`() {
        assertTrue(`🚫🧢`)
    }

    @Test
    fun `test isCapping when boolean value is true`() {
        assertFalse(true.isCapping())
    }

    @Test
    fun `test isCapping when boolean value is false`() {
        assertTrue(false.isCapping())
    }

    @Test
    fun `test is capping when boolean value is true`() {
        assertFalse(true.`is capping`())
    }

    @Test
    fun `test is capping when boolean value is false`() {
        assertTrue(false.`is capping`())
    }
}