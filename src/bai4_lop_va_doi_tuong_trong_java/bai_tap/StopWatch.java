package bai4_lop_va_doi_tuong_trong_java.bai_tap;

public class StopWatch {
    long startTime;
    long endTime;
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis(); // 3h00
    }
    public void stop() {
        this.endTime = System.currentTimeMillis(); //3h15
    }
    public long getDisPlay() {
        return this.endTime - this.startTime;
    }

}
