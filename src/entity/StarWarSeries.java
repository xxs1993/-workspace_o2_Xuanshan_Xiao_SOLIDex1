package entity;

/*
 * Open-Closed Principle
 * 
 * */
public class StarWarSeries extends ScifiMovie {
	private int seriesNumber;
	public void playSeries(int series) {
		System.out.println("Play movie Star War, series" + series);
	}
}
