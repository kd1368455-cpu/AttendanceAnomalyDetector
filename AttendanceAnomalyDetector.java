package main;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AttendanceAnomalyDetector {

	public static void main(String[] args) {
		// ダミー勤怠データ（テスト用）
        List<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord("E001",
                LocalDateTime.of(2024, 5, 1, 9, 30),
                LocalDateTime.of(2024, 5, 1, 18, 0)));

        records.add(new AttendanceRecord("E002",
                LocalDateTime.of(2024, 5, 1, 8, 55),
                LocalDateTime.of(2024, 5, 1, 22, 30)));

        // 異常検知の実行
        AttendanceAnalyzer analyzer = new AttendanceAnalyzer();
        analyzer.analyze(records);

	}

}
