package week5_item_example;

public class cd {
	private String title;
	private int numberOfTracks;
	private String artist;
	private String date;
	private String review;
	
	public cd() {

	}

	public cd(String title, 
			int numberOfTracks, 
			String artist, 
			String date, 
			String review) {
		super();
		this.title = title;
		this.numberOfTracks = numberOfTracks;
		this.artist = artist;
		this.date = date;
		this.review = review;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
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
		return "cd [title=" + title + 
				", numberOfTracks=" + numberOfTracks 
				+ ", artist=" + artist 
				+ ", date=" + date
				+ ", review=" + review 
				+ "]";
	}
	
	
	
	

}
