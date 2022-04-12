package pages;

import org.openqa.selenium.By;

import static utils.Automations.*;

public class RunPage {
    // -- Fields -- //
    private By loc_page_title = By.cssSelector("#headerTitle");
    private By loc_usecase = By.cssSelector("#useCases");
    private By loc_mdc_option = By.cssSelector("option[value='25']");
    private By loc_img_2 = By.xpath("(//div[@id='imageList']/div)[2]");
    private By loc_run_button = By.cssSelector("#btnPredictionModelDesktop");
    private By loc_result_title = By.xpath("(//h4)[1]");

    // -- element locations for page navigation --- //
    private By loc_home_tab = By.xpath("//span[text()='Home']");
    private By loc_learn_tab = By.xpath("//span[text()='Learn']");
    private By loc_evaluate_tab = By.xpath("//span[text()='Evaluate']");
    private By loc_create_tab = By.xpath("//span[text()='Create']");


    // -- Methods -- //
    public boolean pageDisplayed() {
        boolean result = isVisible(loc_page_title);
        highlight(loc_page_title);
        pause(1);
        return result;
    }

    public boolean verifyModelRuns() {
        click(loc_usecase);
        pause(1);
        click(loc_mdc_option);
        pause(1);
        click(loc_img_2);
        pause(1);
        click(loc_run_button);
        boolean ret = isVisible(loc_result_title);
        pause(1);
        litBackground(loc_run_button);
        pause(1);
        return ret;
    }

    // --- Methods for page navigation --- //
    public void visitHome() {
        click(loc_home_tab);
        pause(1);
    }

    public void visitLearn() {
        click(loc_learn_tab);
        pause(2);
    }

    public void visitEvaluate() {
        click(loc_evaluate_tab);
        pause(1);
    }

    public void visitCreate() {
        click(loc_create_tab);
        pause(1);
    }

}//end::class
