
public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
		
	public Song(String title, String artist, String album, String composer,
			int year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public Song(String title, String artist){
		this(title, artist,"","",0,0);
	}

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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	

	public void show(){
		System.out.println("가수:"+artist);
		System.out.println("제목:"+title);
		System.out.println("앨범이름:"+album);
		System.out.println("트랙번호:"+track);
		System.out.println("년도:"+year);
		System.out.println("작곡가:"+composer);
	}
}
