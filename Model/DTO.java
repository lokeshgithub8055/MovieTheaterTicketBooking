package Model;

public class DTO {
	private int id;
	private String movieName;
	private String movieTheater;
	private int noOfTickets;
	private double pricePerTicket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTheater() {
		return movieTheater;
	}
	public void setMovieTheater(String movieTheater) {
		this.movieTheater = movieTheater;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getPricePerTicket() {
		return pricePerTicket;
	}
	public void setPricePerTicket(double pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}
	@Override
	public String toString() {
		return "DTO [id=" + id + ", movieName=" + movieName + ", movieTheater=" + movieTheater + ", noOfTickets="
				+ noOfTickets + ", pricePerTicket=" + pricePerTicket + "]";
	}
	
	
	
}
