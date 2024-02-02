package task;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DemoPage extends BasePage {
   
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeena\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://seleniumbase.io/demo_page");


        //1. Fill in the Text Input Field with "MAPS is boring" and verify it filled in correctly.
        WebElement fillTextInputField = driver.findElement(textInputField);
        fillTextInputField.sendKey("MAPS is boring");
        String text = getText(fillTextInputField);
        Assert.assertTrue(text.isDisplayed());
        //Assert.assertEquals("MAPS is boring", text);
        

        

        //2. Grab the rgb color from "HTML SVG with rect" and populate a variable with the result.

        WebElement svgRectElement = driver.findElement(svgRectLocator);
        String rgbColor = svgRectElement.getCssValue("fill")
                .replaceFirst("rgba?\\((.*?)\\)", "$1");
        System.out.println("RGB Color: " + rgbColor);

           // JavascriptExecutor to get the fill color attribute
        WebElement svgRect = driver.findElement(svgRectLocator);

        String fillColor = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].getAttribute('fill')", svgRect);



       // 3. Toggle the CheckBox in the iFrame and confirm it is checked.
       driver.switchTo().frame(driver.findElement(iframeCheckbox));
 
       WebElement checkboxToclick = driver.findElement(checkbox).click();
       boolean isChecked = checkboxToclick.isSelected();
       Assert.assertTrue(isChecked);

    //This is the second way
    //    if (isChecked) {
    //        System.out.println("Checkbox is checked");
    //    } else {
    //        System.out.println("Checkbox is not checked");
    //    }
       driver.switchTo().defaultContent();


      //  4. Change Select Dropdown to "Set to 50%" and Assert the HTML meter changes to what is selected.
      WebElement dropdownElement = driver.findElement(dropdown);
      Select select = new Select(dropdownElement);
      select.selectByValue("Set to 50%");
    //current select option
      WebElement selectedOption = select.getFirstSelectedOption();
      String actualSelectedText = selectedOption.getText();
      Assert.assertEquals(actualSelectedText, expectedSelectedText);




      //Andrew asked to assert the iframe text during interview.
      driver.switchTo().frame(iframe);
      WebElement iframeText = driver.findElement(iframeText);
      String actualText = iframeText.getText();
      String expectedText = "iFrame Text";
      Assert.assertEquals(expectedText, actualText);
      driver.switchTo().defaultContent();
      
        driver.quit();
    }
}

    

