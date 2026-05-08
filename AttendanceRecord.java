package main;
import java.time.LocalDateTime;

public class AttendanceRecord {
	private String employeeId;
    private LocalDateTime clockIn;
    private LocalDateTime clockOut;

    public AttendanceRecord(String employeeId, LocalDateTime clockIn, LocalDateTime clockOut) {
        this.employeeId = employeeId;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDateTime getClockIn() {
        return clockIn;
    }

    public LocalDateTime getClockOut() {
        return clockOut;
    }
}
