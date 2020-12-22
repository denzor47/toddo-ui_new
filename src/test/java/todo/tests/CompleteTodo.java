package object;

import org.testng.annotations.Test;
import todo.object.DoIt;
import todo.tests.Base;

import static com.codeborne.selenide.CollectionCondition.allMatch;
import static com.codeborne.selenide.Condition.text;

public class CompleteTodo extends Base {

    @Test
    public void shouldMarkTodoItemAsCompleted() {
        DoIt.create("Fuck You Java");

        DoIt.markCompleted("Fuck You Java");

        DoIt.count().shouldHave(text("0 items left"));
        DoIt.list().shouldHave(allMatch(
                "Should be completed",
                el -> el.getAttribute("class").contains("completed"))
        );
    }
}
