package test.java;

import com.example.Feline;
import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void catSaidMeow () {
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertTrue(cat.getSound().equals("Мяу"));
    }
}