package domain;

import java.util.Objects;

public class Participant {
    private String userLoginId;
    private AttendanceStatus attendanceStatus;

    public Participant(String userLoginId) {
        this.userLoginId = userLoginId;
        this.attendanceStatus = new AttendanceStatus();
    }

    public double getAttendanceRate() {
        return attendanceStatus.calculateAttendanceRate();
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return userLoginId.equals(that.userLoginId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userLoginId);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "userLoginId='" + userLoginId + '\'' +
                ", attendanceStatus=" + attendanceStatus +
                '}';
    }
}
