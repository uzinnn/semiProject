package song.vo;

public class SongVo {
	
	private String title;
	private String artistName;
	private String url;
	private String album;
	
	
	

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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "SongVo [title=" + title + ", artistName=" + artistName + ", url=" + url + ", album=" + album + "]";
	}
	
	

}
