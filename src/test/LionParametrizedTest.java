package test;

import com.example.Feline;
import com.example.Lion;
import com.example.Animal;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String Sex;
    private final boolean hasManeValue;
    public LionParametrizedTest(String sex, boolean hasManeValue) {
        this.Sex = sex;
        this.hasManeValue = hasManeValue;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
        };
    }
    @Test
    public void shouldCheckDoesHaveMane() throws Exception {
        Lion lion= new Lion(Sex);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(Sex, hasMane);
    }
}
