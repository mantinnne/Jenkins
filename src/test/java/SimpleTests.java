import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {
    @Test
    @Tag("positive")
    void successTest() {
        assertTrue(true);
//        assertTrue(true);
    }

    @Test
    @Tag("negative")

    void negativeTest() {
        assertTrue(false);
    }

    @Test
    @Tag("positive")
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    @Tag("negative")
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));
    }

    @Test
    @Tag("positive")
    @DisplayName("Some positive test")
    void successWithHamcrestAndStepsTest() {
        step("Assert that true is true", () ->
                assertThat(true, is(true)));
    }

    @Test
    @Tag("negative")
    void negativeWithHamcrestAndStepsTest() {
        step("Assert that true is false", () ->
                assertThat(true, is(false)));
    }
}
