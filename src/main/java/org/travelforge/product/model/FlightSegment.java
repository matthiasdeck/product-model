/*
 * The Travelforge Project
 * http://www.travelforge.org
 *
 * Copyright (c) 2015 - 2017 Matthias Deck
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to 
 * deal in the Software without restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or 
 * sell copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */
package org.travelforge.product.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Matthias Deck
 */
public final class FlightSegment implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Airline airline;
    private final String flightNumber;
    private final String flightClass;
    private final String bookingClass;
    private final Airport departureAirport;
    private final LocalDateTime departureDateTime;
    private final Airport arrivalAirport;
    private final LocalDateTime arrivalDateTime;
    private final Integer duration;

    private FlightSegment(Airline airline, String flightNumber, String flightClass, String bookingClass, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer duration) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.bookingClass = bookingClass;
        this.departureAirport = departureAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Airline getAirline() {
        return this.airline;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightClass() {
        return this.flightClass;
    }

    public String getBookingClass() {
        return this.bookingClass;
    }

    public Airport getDepartureAirport() {
        return this.departureAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return this.departureDateTime;
    }

    public Airport getArrivalAirport() {
        return this.arrivalAirport;
    }

    public LocalDateTime getArrivalDateTime() {
        return this.arrivalDateTime;
    }

    public Integer getDuration() {
        return this.duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSegment that = (FlightSegment) o;

        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (flightClass != null ? !flightClass.equals(that.flightClass) : that.flightClass != null) return false;
        if (bookingClass != null ? !bookingClass.equals(that.bookingClass) : that.bookingClass != null) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(that.departureDateTime) : that.departureDateTime != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        if (arrivalDateTime != null ? !arrivalDateTime.equals(that.arrivalDateTime) : that.arrivalDateTime != null)
            return false;
        return duration != null ? duration.equals(that.duration) : that.duration == null;
    }

    @Override
    public int hashCode() {
        int result = airline != null ? airline.hashCode() : 0;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (flightClass != null ? flightClass.hashCode() : 0);
        result = 31 * result + (bookingClass != null ? bookingClass.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalDateTime != null ? arrivalDateTime.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightSegment{" +
                "airline=" + airline +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", departureAirport=" + departureAirport +
                ", departureDateTime=" + departureDateTime +
                ", arrivalAirport=" + arrivalAirport +
                ", arrivalDateTime=" + arrivalDateTime +
                ", duration=" + duration +
                '}';
    }

    public static final class Builder {

        private Airline airline;
        private String flightNumber;
        private String flightClass;
        private String bookingClass;
        private Airport departureAirport;
        private LocalDateTime departureDateTime;
        private Airport arrivalAirport;
        private LocalDateTime arrivalDateTime;
        private Integer duration;

        private Builder() {
        }

        public FlightSegment.Builder airline(Airline airline) {
            this.airline = airline;
            return this;
        }

        public FlightSegment.Builder flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public FlightSegment.Builder flightClass(String flightClass) {
            this.flightClass = flightClass;
            return this;
        }

        public FlightSegment.Builder bookingClass(String bookingClass) {
            this.bookingClass = bookingClass;
            return this;
        }

        public FlightSegment.Builder departureAirport(Airport departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }

        public FlightSegment.Builder departureDateTime(LocalDateTime departureDateTime) {
            this.departureDateTime = departureDateTime;
            return this;
        }

        public FlightSegment.Builder arrivalAirport(Airport arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }

        public FlightSegment.Builder arrivalDateTime(LocalDateTime arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return this;
        }

        public FlightSegment.Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public FlightSegment build() {
            return new FlightSegment(airline, flightNumber, flightClass, bookingClass, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, duration);
        }
    }
}
