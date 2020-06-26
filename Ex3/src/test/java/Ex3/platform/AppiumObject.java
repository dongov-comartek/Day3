package Ex3.platform;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class AppiumObject extends ProxiedDriver<AndroidDriver<MobileElement>> {
    public TouchAction withAction(Actor actor) {
        return new TouchAction(getDriver(actor));
    }

    public void swipeDownLeft(Actor actor) {
        Dimension size = getScreenSize(actor);
        int startY = (int) (size.getHeight() * 0.80);
        int endY = (int) (size.getHeight() * 0.20);
        int startX = size.getWidth() / 4;
        withAction(actor).press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void swipeDownCenter(Actor actor) {
        Dimension size = getScreenSize(actor);
        int startY = (int) (size.getHeight() * 0.75);
        int endY = (int) (size.getHeight() * 0.20);
        int startX = size.getWidth() / 2;
        withAction(actor).press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

    }
    public  void  swipeUp(Target element, Actor actor){
        Dimension size =getScreenSize(actor);
        int startY= (int) (size.getHeight()*0.60);
        int endY = (int) (size.getHeight()*0.20);
        int startX=size.getWidth()/2;
        withAction(actor).press(PointOption.point(startX,endY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX,startY))
                .release()
                .perform();
    }

    public final static Dimension getScreenSize(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().manage().window().getSize();
    }
}
