package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn, checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		super();
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: ");
		sb.append("Room: ");
		sb.append(roomNumber + ", ");
		sb.append("Check-in: ");
		sb.append(sdf.format(checkIn) + ", ");
		sb.append("Check-out: ");
		sb.append(sdf.format(checkOut) + ", ");
		sb.append(duration() + " nights");
		
		return sb.toString();
	}
	
	

}
