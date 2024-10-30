import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows
class NumbersTest {

    @Test
   fun test_sum(){
       //12, 4
       // 16 , sum 12 & 4

       val expected =16
        val numbers= Numbers.Base(12, 4)
       val actual = numbers.sum()
       assertEquals(expected, actual)
   }
    @Test
    fun test_diff(){
        val expected =8
        val numbers= Numbers.Base(12, 4)
        val actual = numbers.diff()
        assertEquals(expected, actual)
    }
  @Test
    fun test_sum_three_num(){
      val expected =22
      val numbers= Numbers.ThreeNumbers(12, 4,6)
      val actual = numbers.sum()
      assertEquals(expected, actual)
  }
  @Test
    fun test_diff_three_num(){
        val expected =2
        val numbers= Numbers.ThreeNumbers(12, 4,6)
        val actual = numbers.diff()
        assertEquals(expected, actual)
    }
  @Test
    fun test_divide(){
        val expected =2.5
        val numbers= Numbers.Base(10, 4)
        val actual = numbers.divide()
        assertEquals(expected,actual)
    }
    @Test
    fun test_divide_zero() {
        assertThrows<IllegalArgumentException> {
            val numbers = Numbers.Base(12, 0)
            numbers.divide()
        }
    }
}