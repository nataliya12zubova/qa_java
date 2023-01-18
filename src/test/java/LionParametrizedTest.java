package test.java;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasMane;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] doesHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Тема Лебедев", false},
        };
    }

    @Mock
    Feline felineMock;

    @Test
    public void checkLionHasMane() {
        try {
            Lion lion = new Lion(sex, felineMock);
            boolean result = lion.doesHaveMane();
            Assert.assertTrue(result == hasMane);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}