package tests;

import com.example.Feline;
import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = new Feline();

    @Test
    public void catSaidMeow () {
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Мяу", cat.getSound());
    }
}
