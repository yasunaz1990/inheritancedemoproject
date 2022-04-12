package tests;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CreatePage;
import pages.HomePage;
import pages.LearnPage;
import pages.RunPage;
import utils.Browser;


public class SmokeTest {

    @BeforeMethod
    public void setUp() {
        Browser.openBrowser();
    }

    @AfterMethod
    public void reset() {
        Browser.closeBrowser();
    }

    @Test
    public void verifyUserCanVisitAilab() {
        // --- Test Steps
        HomePage home = new HomePage();
        home.openAilab();
        boolean ret = home.pageDisplayed();

        // Assertion
        Assert.assertTrue(ret);
    }

    @Test
    public void verifyLearnPageTopVideos() {

        HomePage home = new HomePage();
        home.openAilab();
        home.visitLearn();

        LearnPage learn = new LearnPage();
        boolean ret1 = learn.pageDisplayed();
        boolean ret2 = learn.verifyTopRowVids();

        // Assertion
        Assert.assertTrue(ret1 && ret2 );
    }

    @Test
    public void verifyUserCanRunModel() {
        HomePage home = new HomePage();
        home.openAilab();
        home.visitRun();

        RunPage run = new RunPage();
        boolean ret1 = run.pageDisplayed();
        boolean ret2 = run.verifyModelRuns();

        // Assertions
        Assert.assertTrue(ret1 && ret2);
    }

    @Test
    public void verifyUserCanTrainModel() {
        HomePage home = new HomePage();
        home.openAilab();
        home.visitCreate();

        CreatePage create = new CreatePage();
        create.defineModel();
        create.prepareData();
        create.trainModel();
        boolean actual = create.verifyTrainingResult();

        Assert.assertTrue(actual);
    }
}//end::class
