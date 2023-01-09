package test;

import com.example.Feline;
import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline;

    @Test
    public void catIsAPredator () throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getSound()).thenReturn("Мяу");
    }
}