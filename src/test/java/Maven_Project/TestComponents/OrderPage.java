package Maven_Project.TestComponents;

import Maven_Project.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends AbstractComponents
{
    WebDriver driver;

    @FindBy(css = ".totalRow button")
    WebElement checkoutEle;

    @FindBy(css = "tr td:nth-child(3)")
    private List<WebElement> productNames;

    public OrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public Boolean VerifyOrderDisplay(String productName) {
        Boolean match = this.productNames.stream().anyMatch(product ->
        {
            return product.getText().equalsIgnoreCase(productName);
        });

        return match;

    }


}
