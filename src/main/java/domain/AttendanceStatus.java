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

    public int size() {
        return attendanceStatus.size();
    }

    public List<Boolean> getAttendanceStatus() {
        return Collections.unmodifiableList(attendanceStatus);
    }

    @Override
    public String toString() {
        return attendanceStatus.toString();
    }
}
