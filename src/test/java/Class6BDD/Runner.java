package Class6BDD;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/*"
        },
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber.html"
        },
        tags = "not @ignore"
)
public class Runner {

}