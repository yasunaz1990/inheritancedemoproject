package pages;

import org.openqa.selenium.By;

import static utils.Automations.*;

public class HomePage {

    // ---- Fields ---- //
    private String url = "https://ailab.acr.org";
    private By loc_enter_button = By.cssSelector("a > button");
    private By loc_page_banner = By.xpath("(//h1)[1]");

    // -- element locations for page navigation --- //
    private By loc_home_tab = By.xpath("//span[text()='Home']");
    private By loc_learn_tab = By.xpath("//span[text()='Learn']");
    private By loc_evaluate_tab = By.xpath("//span[text()='Evaluate']");
    private By loc_run_tab = By.xpath("//span[text()='Run']");
    private By loc_create_tab = By.xpath("//span[text()='Create']");

    // ---- Methods --- //
    public void openAilab() {
        visit(url);
        click(loc_enter_button);
        pause(2);
    }

    public boolean pageDisplayed() {
        boolean result = isVisible(loc_page_banner);
        highlight(loc_page_banner);
        pause(1);
        return result;
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

    public void visitRun() {
        click(loc_run_tab);
        pause(1);
    }

    public void visitCreate() {
        click(loc_create_tab);
        pause(1);
    }
}//end::class
