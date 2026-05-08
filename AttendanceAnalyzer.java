package main;
import java.util.List;

public class AttendanceAnalyzer {
	public void analyze(List<AttendanceRecord> records) {

        for (AttendanceRecord record : records) {

            // 遅刻チェック（9:00より後に出勤）
            if (record.getClockIn().getHour() >= 9 && record.getClockIn().getMinute() > 0) {
                System.out.println(record.getEmployeeId() + " は遅刻の可能性があります");
            }

            // 長時間労働チェック（10時間以上）
            long workHours = java.time.Duration.between(
                    record.getClockIn(), record.getClockOut()).toHours();

            if (workHours >= 10) {
                System.out.println(record.getEmployeeId() + " は長時間労働の可能性があります");
            }
        }
    }
}
