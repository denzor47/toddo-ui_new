package todo.tests;

import org.testng.annotations.Test;
import todo.object.DoIt;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;

public class CreateTodo extends Base {

    @Test
    public void createTodo() {
        DoIt.create("Fuck You Java");
        DoIt.list().shouldHave(size(1));
        DoIt.list().first().shouldHave(text("Fuck You Java"));
        DoIt.count().shouldHave(text("1 item left"));
    }
}
