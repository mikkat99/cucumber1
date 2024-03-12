import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/scenario"},
        glue = {"steps"},
        tags = "@all",
        plugin = {"pretty", "summary"}, snippets = CAMELCASE
)

public final class CucumberRunner {
}