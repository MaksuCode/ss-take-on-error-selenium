import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)
public class BaseTest implements DriverInterface{


    @BeforeAll
    void setUp(){
        driver.get("https://github.com/MaksuCode");
    }

    @AfterAll
    void tearDown(){
        driver.close();
    }

}
