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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Derek Kedrowski, Eric Hagar
 *
 */

class InvalidChars {

  @Test
  void test() {
    fail("Not yet implemented");
  }
  
  @Test
  void testNoChangeEncrypt() {
    //fail("Not yet implemented");
    String message = "stuff";
    String key="aaaaa";
    
    EncryptedMessage noEncrypt=new EncryptedMessage(message,key);
    
    Assertions.assertEquals("tuvgg", noEncrypt.getMessage());
  }

}
