package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Before
    public void open(){
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void getLionPredatorFood() throws Exception {
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> result = lion.getFood();
        Assert.assertEquals("Список еды не соответствует. По факту: " + result, result, predatorFood);
    }
}
