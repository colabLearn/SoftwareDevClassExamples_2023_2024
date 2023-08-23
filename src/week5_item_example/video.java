package week5_item_example;

public class video {
	private String title;
	private double timeLenght;
	private String director;
	private String date;
	private String review;
	public video() {
	
	}
	public video(String title, 
			double timeLenght, 
			String director, 
			String date, 
			String review) {
		
		this.title = title;
		this.timeLenght = timeLenght;
		this.director = director;
		this.date = date;
		this.review = review;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getTimeLenght() {
		return timeLenght;
	}
	public void setTimeLenght(double timeLenght) {
		this.timeLenght = timeLenght;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "video [title=" + title 
				+ ", timeLenght=" + timeLenght 
				+ ", director=" + director 
				+ ", date=" + date
				+ ", review=" + review 
				+ "]";
	}
	
	
	
	
	

}
