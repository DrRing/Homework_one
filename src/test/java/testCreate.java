import org.testng.Assert;
import org.testng.annotations.Test;


public class testCreate {
	Pawn pa = new Pawn();
	String col = pa.color;
	
	@Test
	public void testPawn() {
		Assert.assertEquals(col,"white");
	}
	
		
	
	

}
