import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreate2 {
	Pawn2 pa2 = new Pawn2("black");

	@Test
	public void test2() {	
		Assert.assertEquals(pa2.color, "black");
	}

}
