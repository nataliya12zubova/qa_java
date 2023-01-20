package tests;

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
    private final boolean haveMane;

    public LionParametrizedTest(String sex, boolean haveMane) {
        this.sex = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Object[] doesHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline felineMock;

    @Test
    public void checkLionHasMane() throws Exception {
        Lion lion = new Lion(sex, felineMock);
        boolean result = lion.doesHaveMane();
        Assert.assertEquals(result, haveMane);
    }
}

