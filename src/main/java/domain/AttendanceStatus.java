package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AttendanceStatus {
    public final static int TOTAL_NUMBER_OF_STUDY = 18;

    private List<Boolean> attendanceStatus = new ArrayList<>();

    public AttendanceStatus() {
        for (int i = 0; i < TOTAL_NUMBER_OF_STUDY; i++) {
            attendanceStatus.add(false);
        }
    }

    public void attendStudy(int numberOfStudy) {
        if (numberOfStudy < 1 || numberOfStudy > TOTAL_NUMBER_OF_STUDY) {
            throw new IllegalArgumentException("유효하지 않는 스터디 주차입니다.");
        }

        attendanceStatus.add(numberOfStudy - 1, true);
    }

    public double calculateAttendanceRate() {
        long countOfAttendance = attendanceStatus.stream()
                .filter(as -> as)
                .count();

        return (double) countOfAttendance / TOTAL_NUMBER_OF_STUDY;
    }

    public int size() {
        return attendanceStatus.size();
    }

    public boolean get(int index) {
        return attendanceStatus.get(index);
    }

    public List<Boolean> getAttendanceStatus() {
        return Collections.unmodifiableList(attendanceStatus);
    }

    @Override
    public String toString() {
        return attendanceStatus.toString();
    }
}
