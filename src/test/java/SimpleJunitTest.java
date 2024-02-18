import org.junit.jupiter.api.*;


public class SimpleJunitTest {
    int result;
    @BeforeEach
    void BeforeEach()
    {System.out.println("###    BeforeEach");
        result = getResult();
    }
    @AfterEach
    void AfterEach()
    {System.out.println("###    AfterEach");
        result = getResult();
    }
    @Test
    void firstTest() {
        Assertions.assertTrue(3>2);
        System.out.println("###    firstTest");
    }
    @Test
    void secondTest() {
        Assertions.assertTrue(3>2);
        System.out.println("###    secondTest");
    }
    @Test
    void thirdTest() {
        Assertions.assertTrue(3>2);
        System.out.println("###    thirdTest");
    }
    private int getResult(){
        return 3;

    }
}
