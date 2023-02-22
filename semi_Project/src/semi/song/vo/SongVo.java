package semi.song.vo;

public class SongVo {
	
	private int id;
	private String title;
	private String artistName;
	private String album;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SongVo(int id, String title, String artistName, String album) {
		super();
		this.id = id;
		this.title = title;
		this.artistName = artistName;
		this.album = album;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "SongVo [title=" + title + ", artistName=" + artistName + ",  album=" + album + "]";
	}
	
	
	

}
