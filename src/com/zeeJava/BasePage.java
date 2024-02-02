package task;

import java.sql.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id ="myTextInput")
    public static WebElement textInputField;

     //Iframe
     @FindBy (xpath="//iframe[@id='myFrame3']")
     public static Webelement iframeCheckbox;

     //Iframe text 
     @FindBy (xpath="//iframe[@id='myFrame2']")
     public static Webelement iframe;

     
     //Checkbox
     @FindBy (id="//body//input[@id='checkBox6']")
     public static WebElement checkbox;


    //Dropdwon
    @FindBy(id ="mySelect")
    public static WebElement dropdown;

    //rgb
    @FindBy(xpath ="//*[@id='mySVG']")
    public static WebElement svgRectLocator;


    //Set to 50%
    @FindBy(xpath = "//label[.='HTML Meter: (50%)']")
    public static WebElement expectedSelectedText;
    




    
}
