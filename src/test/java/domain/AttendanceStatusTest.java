package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AttendanceStatusTest {

    @Test
    void create() {
        AttendanceStatus attendanceStatus = new AttendanceStatus();

        assertThat(attendanceStatus).isNotNull();
        assertThat(attendanceStatus.size()).isEqualTo(AttendanceStatus.TOTAL_NUMBER_OF_STUDY);
    }
}