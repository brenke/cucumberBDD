package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class StandardPageSteps {

    private final ElementsCollection button = $$(byXpath(".//div[@class='sc-yfk21i-0 jeFZmS']"));

    private final SelenideElement catalog = $(byXpath(".//div[text()='Каталог']"));

    @Пусть("Открыта страница \\\"([^\\\"]*)\\\"$")
    public void pageIsOpen(String url){
        open(url);
    }

    @И("Пользователь выбирает категорию курса \\\"([^\\\"]*)\\\"$")
    public void clientChooseTheCategoryOfCourse(String nameOfCourse){
        button.findBy(text(nameOfCourse)).click();
    }

    @Тогда("Открылся каталог курсов")
    public void catalogOfCoursesIsOpen(){
        catalog.shouldBe(visible);
    }
}
