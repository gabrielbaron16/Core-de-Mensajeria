package M06_DataOrigin;

import Entities.M06_DataOrigin.Encrypter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncrypterTest {
    private Encrypter encrypter = new Encrypter();

    @Test
    private void encryptTokenTest(){
        assertNotNull(encrypter.encryptToken("RT5453E0B1BF09A7TY020A4B87W7N0A9W003YTUEB403E918E352D10WE35007Q"));
    }

}
