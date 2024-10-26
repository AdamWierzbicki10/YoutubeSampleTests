import org.testng.annotations.Test;
import pages.HomePagePO;

public class SearchTest extends BaseTest {

    @Test
    public void SearchForVideo(){
        new HomePagePO(driver).searchForVideo("Rickroll");
    }

}
