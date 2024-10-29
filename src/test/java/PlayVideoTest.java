import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePagePO;
import pages.ResultsPagePO;
import pages.VideoPlayerPO;

public class PlayVideoTest extends BaseTest {

    @Test
    public void SearchForVideoTest() {
        ResultsPagePO resultsPagePO = new HomePagePO(driver)
                .searchForVideo("Rickroll");

        Assert.assertTrue(resultsPagePO.getRickRollVideoLink().isDisplayed());
    }

    @Test
    public void playVideoTest() {
        VideoPlayerPO videoPlayer = new HomePagePO(driver)
                .searchForVideo("Rickroll")
                .enterVideo();

        Assert.assertEquals(videoPlayer.getVideoTitleDiv().getText(),
                "Rick Astley - Never Gonna Give You Up (Official Music Video)", "Unexpected video title");
        Assert.assertEquals(videoPlayer.getChannelNameContainer().getText(),
                "Rick Astley", "Channel name is not Rick Astley");
    }
}
