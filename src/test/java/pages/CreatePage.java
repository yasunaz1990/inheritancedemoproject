package pages;

import org.openqa.selenium.By;

import static utils.Automations.*;

public class CreatePage {
    // ---- Fields ---- //
    private By loc_usecase = By.cssSelector("select#useCases");
    private By loc_drd_option = By.cssSelector("option[value='26']");
    private By loc_training_data = By.cssSelector("select#datapercentage");
    private By loc_10000_photos = By.cssSelector("[value='10000']");
    private By loc_augmentation = By.cssSelector("#augmentation");
    private By loc_random_flip = By.cssSelector("#augmentation [value='true']");
    private By loc_start_prepros = By.cssSelector("button#btnStartProcessing");
    private By loc_architecture = By.cssSelector("select#architecture");
    private By loc_rasnet = By.cssSelector("[value='resnet']");
    private By loc_sampling = By.cssSelector("#equalsampling");
    private By loc_equal_class = By.cssSelector("#equalsampling [value='true']");
    private By loc_loss_function = By.cssSelector("select#lossfunction");
    private By loc_categorical = By.cssSelector("[value='categorical-crossentropy']");
    private By loc_pretraining = By.cssSelector("#pretraining");
    private By loc_pretrained_weights = By.cssSelector("#pretraining [value='true']");
    private By loc_early_stopping = By.cssSelector("#earlystopping");
    private By loc_early_stopping_true = By.cssSelector("#earlystopping [value='true']");
    private By loc_train_button = By.cssSelector("button#btnTrainAndTest");
    private By loc_result_text = By.xpath("//div[contains(text(), 'Data Sampling Method')]");

    // -- element locations for page navigation --- //
    private By loc_home_tab = By.xpath("//span[text()='Home']");
    private By loc_learn_tab = By.xpath("//span[text()='Learn']");
    private By loc_evaluate_tab = By.xpath("//span[text()='Evaluate']");
    private By loc_run_tab = By.xpath("//span[text()='Run']");


    // ---- Methods --- //
    public void defineModel() {
        click(loc_usecase);
        click(loc_drd_option);
    }

    public void prepareData() {
        click(loc_training_data);
        click(loc_10000_photos);
        click(loc_augmentation);
        click(loc_random_flip);
        click(loc_start_prepros);
    }

    public void trainModel() {
        click(loc_architecture);
        click(loc_rasnet);
        click(loc_sampling);
        click(loc_equal_class);
        click(loc_loss_function);
        click(loc_categorical);
        click(loc_pretraining);
        click(loc_pretrained_weights);
        click(loc_early_stopping);
        click(loc_early_stopping_true);
        click(loc_train_button);
    }

    public boolean verifyTrainingResult() {
        boolean isVisible = webElement(loc_result_text).isDisplayed();
        return isVisible;
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
}
