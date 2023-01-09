package test;
import com.example.Feline;
import com.example.Animal;
import com.example.Predator;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

    @RunWith(MockitoJUnitRunner.class)
    public class FelineTest {
        @Spy
        Feline feline;

        @Test
        public void eatMeatReturnsPredatorMeal () throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List actualResult = feline.eatMeat();
        List expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
}
