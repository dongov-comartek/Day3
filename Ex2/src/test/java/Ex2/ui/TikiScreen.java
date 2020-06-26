package Ex2.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TikiScreen {
    public static Target MENU_BUTTON = Target.the("danh muc button")
            .located(By.xpath("(//*[@text=\"Danh mục\"])[1]"));
    public static Target SCROLL_LEFT_BUTTON = Target.the("scroll left button")
            .located(By.id("vn.tiki.app.tikiandroid.category2:id/ervLeft"));
    public static Target BOOK_HOME_BUTTON = Target.the("book home button")
            .located(By.xpath("(//*[@text=\"Nhà Sách Tiki\"])[1]"));
    public static Target VIEW_ALL_BUTTON = Target.the("view all button")
            .located(By.id("vn.tiki.app.tikiandroid.category2:id/tvTitle"));
    public static Target VIEW_MORE_BUTTON = Target.the("view more button")
            .located(By.id("vn.tiki.app.tikiandroid:id/tvViewMore"));
    public static Target LITERATURE_FIELD = Target.the("Literature field")
            .located(By.xpath("//*[@text='Sách văn học']"));
    public static Target NORMAL_BOOK_FIELD = Target.the("Normal Books field")
            .located(By.xpath("//*[@text='Sách Thường Thức - Gia Đình']"));
    public static Target LITS_ITEMS_FIELD = Target.the("list items field")
            .located(By.id("vn.tiki.app.tikiandroid:id/tvName"));

}
