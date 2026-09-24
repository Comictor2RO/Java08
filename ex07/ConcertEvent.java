package ex07;

public class ConcertEvent {
	private final String artist;
	private final String venue;
	private final String date;

	public ConcertEvent(String artist, String venue, String date) {
		this.artist = artist;
		this.venue = venue;
		this.date = date;
	}

	public String getArtist() {
		return artist;
	}

	public String getVenue() {
		return venue;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return artist + " - " + venue + " (" + date + ")";
	}
}
