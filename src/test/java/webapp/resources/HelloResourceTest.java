package webapp.resources;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResourceTest {

    private HelloResource resource = new HelloResource();

    @Test
    public void shouldRespondWithHello() {
        // When
        String response = resource.hello();

        // Then
        assertThat(response).isEqualTo("Hello");
    }
}
