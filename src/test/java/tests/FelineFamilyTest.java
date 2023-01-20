package tests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineFamilyTest {
    @Test
    public void getFamilyReturnsFeline() {
        try {
            Feline feline = new Feline();
            String result = feline.getFamily();
            assertEquals("Кошачьи", result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
