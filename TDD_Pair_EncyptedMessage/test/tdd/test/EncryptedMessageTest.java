/**
 * 
 */
package tdd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.EncryptedMessage;

/**
 * @author Derek Kedrowski, Eric Hagar
 *
 */
class EncryptedMessageTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

//	 @Test
//	  void test2() {
//	    fail("Not yet implemented");
//	  }
	 
	 @Test
	  void testNoChangeEncrypt() {

	    String message = "stuff";
	    String key="bbbbb";
	    
	    
	    EncryptedMessage noEncrypt=new EncryptedMessage(message,key);
	    
	    System.out.print(noEncrypt.getMessage());
	    
	    Assertions.assertEquals("tuvgg", noEncrypt.getMessage());
	 }
	 
   
	 
	 
	 
	
	 
	 
}
