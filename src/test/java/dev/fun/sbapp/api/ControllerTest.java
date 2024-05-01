package dev.fun.sbapp.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatusCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTest {

    @Test
    @DisplayName("Should return a proper string")
    void getResponse() {
        // given
        var subject = new Controller();

        // when
        subject.getResponse();
        subject.getResponse();

        var actual = subject.getResponse();

        // then
        assertEquals(HttpStatusCode.valueOf(200), actual.getStatusCode());
        assertEquals("Spring Boot App call #3\n", actual.getBody());
    }
}
