package test.java;

import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest2 {

    @Test
    public void getFamilyRetursFeline() {
        try {
            Feline feline = new Feline();
            String result = feline.getFamily();
            Assert.assertTrue(result.equals("Кошачьи"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
