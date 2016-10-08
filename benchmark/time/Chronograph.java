package benchmark.time;

public class Chronograph {
	
	private long milliseconds;
	
	public void startTimer() {
		setNanoSec(System.currentTimeMillis());
	}
	
	public long stopTimer() {
		return System.currentTimeMillis() - getMilliseconds();
	}
	
    public void setNanoSec(long milliseconds) {
    	 this.milliseconds= milliseconds;
    }
    
    public long getMilliseconds() {
    	return milliseconds;
    }
}
