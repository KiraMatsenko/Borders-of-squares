import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.border.bordersofsquares.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/squares.csv")
    public void testWithDifferentI(int expected, int i) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(i);

        Assertions.assertEquals(expected, actual);
    }
}

    /*
    @Test
    public void testWithDifferentI3() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(16);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithDifferentI4() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(17);

        Assertions.assertEquals(expected, actual);
    }
}
*/



