package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Before
    public void open(){
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline felineMock;

    @Test
    public void LionGetKittensReturn5 () throws Exception {
        Lion lion = new Lion("Самец",felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(5);
        Assert.assertEquals(5, lion.getKittens());
    }

    @Test
    public void LionGetKittensReturn1() throws Exception {
        Lion lion = new Lion("Самец",felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Assert.assertTrue(lion.getKittens()==1);
    }
}
