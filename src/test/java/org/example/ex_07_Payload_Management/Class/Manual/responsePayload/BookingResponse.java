package org.example.ex_07_Payload_Management.Class.Manual.responsePayload;

import org.example.ex_07_Payload_Management.Class.Manual.requestPayload.Booking;

public class BookingResponse {

    private Booking booking;
    private Integer bookingId;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
}
