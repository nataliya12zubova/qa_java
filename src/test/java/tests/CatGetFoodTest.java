package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {
    @Before
    public void open(){
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    Feline feline;

    @Test
    public void getCatFoodShouldReturnPredatorFood() throws Exception {
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> result = cat.getFood();
        Assert.assertTrue("Список еды не соответствует. По факту: " + result, result.equals(predatorFood));
    }
}
