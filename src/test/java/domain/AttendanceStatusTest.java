package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AttendanceStatusTest {

    @Test
    void create() {
        AttendanceStatus attendanceStatus = new AttendanceStatus();

        assertThat(attendanceStatus).isNotNull();
        assertThat(attendanceStatus.size()).isEqualTo(AttendanceStatus.TOTAL_NUMBER_OF_STUDY);
    }

    @Test
    @DisplayName("3주차 스터디를 성공적으로 참여")
    void attend_study_success() {
        AttendanceStatus attendanceStatus = new AttendanceStatus();
        attendanceStatus.attendStudy(3);

        assertThat(attendanceStatus.get(0)).isFalse();
        assertThat(attendanceStatus.get(2)).isTrue();
    }

    @Test
    @DisplayName("유효하지 않는 스터디 주차 입력으로 인한 실패")
    void attend_study_fail() {
        AttendanceStatus attendanceStatus = new AttendanceStatus();

        assertThrows(IllegalArgumentException.class, () -> attendanceStatus.attendStudy(21));
    }
}