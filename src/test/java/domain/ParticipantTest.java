package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParticipantTest {

    @Test
    @DisplayName("유저 로그인 ID가 같으면 같은 객체로 취급")
    void equal() {
        Participant p1 = new Participant("codemcd");
        Participant p2 = new Participant("codemcd");

        assertThat(p1).isEqualTo(p2);
        assertThat(p2).isEqualTo(p1);
    }
}