package pages;

import org.openqa.selenium.By;

import static utils.Automations.*;

public class LearnPage {
    // -- Field --//
    private By loc_text = By.cssSelector("[class='mb-4 ml-35']");
    private By loc_title_v1 = By.xpath("(//h5)[1]");
    private By loc_title_v2 = By.xpath("(//h5)[2]");
    private By loc_title_v3 = By.xpath("(//h5)[3]");
    private By loc_title_v4 = By.xpath("(//h5)[4]");

    // -- element locations for page navigation --- //
    private By loc_home_tab = By.xpath("//span[text()='Home']");
    private By loc_evaluate_tab = By.xpath("//span[text()='Evaluate']");
    private By loc_run_tab = By.xpath("//span[text()='Run']");
    private By loc_create_tab = By.xpath("//span[text()='Create']");

    // -- Constructors -- //
    public LearnPage() {
    }

    // -- Methods -- //
    public boolean pageDisplayed() {
        boolean result = isVisible(loc_text);
        litBackground(loc_text);
        pause(3);
        return result;
    }

    public boolean verifyTopRowVids() {
        By[] vid_titles = {loc_title_v1, loc_title_v2, loc_title_v3, loc_title_v4};
        boolean ret = false;
        for (int i = 0; i < vid_titles.length; i++) {
            ret = isVisible(vid_titles[i]);
            highlight(vid_titles[i]);
            pause(1);
        }
        return ret;
    }

    // --- Methods for page navigation --- //
    public void visitHome() {
        click(loc_home_tab);
        pause(1);
    }

    public void visitEvaluate() {
        click(loc_evaluate_tab);
        pause(1);
    }

    public void visitRun() {
        click(loc_run_tab);
        pause(1);
    }

    public void visitCreate() {
        click(loc_create_tab);
        pause(1);
    }

}//end::class