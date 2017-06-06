
import static org.junit.Assert.*;

import org.junit.Test;

import com.rtj.dealer.util.TimeManagementSnippet;

public class timeMgmtTests {

	TimeManagementSnippet time=new TimeManagementSnippet();
	@Test
	public void testGetTimeInSeconds() {

		assertEquals(60, time.getTimeInSeconds("00:01:00"));
	
	}

	@Test
	public void testConvertToHMS() {
 		assertEquals("00:01:00", time.convertToHMS(60));
	}

}
