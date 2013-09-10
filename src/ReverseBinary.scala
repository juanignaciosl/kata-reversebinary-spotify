import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * @author juanignaciosl
 * @see https://www.spotify.com/es/jobs/tech/reversed-binary/
 */
class ReverseBinarySpec extends FlatSpec with ShouldMatchers {
  
  "reversing 0" should "return 0" in {
    ReverseBinary.reverse(0) should equal (0)
  }
  
  "reversing 1" should "return 1" in {
    ReverseBinary.reverse(1) should equal (1)
  }
  
  "reversing 2" should "return 1" in {
    ReverseBinary.reverse(2) should equal (1)
  }
  
  "reversing 13" should "return 11" in {
    ReverseBinary.reverse(13) should equal (11)
  }
  
  "reversing 47" should "return 61" in {
    ReverseBinary.reverse(47) should equal (61)
  }
}

object ReverseBinary {
  
  def reverse(x: Int): Int = {
    return Integer.parseInt(Integer.toBinaryString(x).reverse, 2);
  }

}