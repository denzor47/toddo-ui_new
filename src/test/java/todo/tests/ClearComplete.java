package todo.tests;

import org.testng.annotations.Test;
import todo.object.DoIt;

import static com.codeborne.selenide.Condition.exist;

public class ClearComplete extends Base {

    @Test
    public void createTodo() {
        DoIt.create("Fuck You Java");

        DoIt.markCompleted("Fuck You Java");

        DoIt.clearCompleted();

        DoIt.count().shouldNot(exist);
        DoIt.main().shouldNot(exist);
        DoIt.footer().shouldNot(exist);
    }
}
