package CollectionFramework;

public class Songs {
	
	String title;
	String artist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Songs(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

}
