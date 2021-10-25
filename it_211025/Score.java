package basic_api;

public class Score {
	String id;
	int score;
	
	public Score(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean b = false;
		Score s = (Score)obj;
		b = s.id.equals(this.id);
		return b;
	}
}
