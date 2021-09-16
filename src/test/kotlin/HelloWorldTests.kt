import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class HelloWorldTests {
    @Test
    internal fun `should assert`() {
        HelloWorld().hello() shouldBe "Hello"
    }
}