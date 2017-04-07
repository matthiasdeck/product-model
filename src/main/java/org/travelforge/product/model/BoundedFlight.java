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
import java.util.List;

/**
 * @author Matthias Deck
 */
public abstract class BoundedFlight implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private Airline airline;
    private String flightNumber;
    private String flightClass;
    private String flightId;
    private String flightCode;
    private String flightKey;
    private String bookingClass;
    private String bookingCode;
    private Airport departureAirport;
    private LocalDateTime departureDateTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalDateTime;
    private Integer stopOver;
    private Integer duration;
    private List<FlightSegment> segments;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Integer getStopOver() {
        return stopOver;
    }

    public void setStopOver(Integer stopOver) {
        this.stopOver = stopOver;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<FlightSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<FlightSegment> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoundedFlight that = (BoundedFlight) o;

        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (flightClass != null ? !flightClass.equals(that.flightClass) : that.flightClass != null) return false;
        if (flightId != null ? !flightId.equals(that.flightId) : that.flightId != null) return false;
        if (flightCode != null ? !flightCode.equals(that.flightCode) : that.flightCode != null) return false;
        if (flightKey != null ? !flightKey.equals(that.flightKey) : that.flightKey != null) return false;
        if (bookingClass != null ? !bookingClass.equals(that.bookingClass) : that.bookingClass != null) return false;
        if (bookingCode != null ? !bookingCode.equals(that.bookingCode) : that.bookingCode != null) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(that.departureDateTime) : that.departureDateTime != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        if (arrivalDateTime != null ? !arrivalDateTime.equals(that.arrivalDateTime) : that.arrivalDateTime != null)
            return false;
        if (stopOver != null ? !stopOver.equals(that.stopOver) : that.stopOver != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        return segments != null ? segments.equals(that.segments) : that.segments == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (airline != null ? airline.hashCode() : 0);
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (flightClass != null ? flightClass.hashCode() : 0);
        result = 31 * result + (flightId != null ? flightId.hashCode() : 0);
        result = 31 * result + (flightCode != null ? flightCode.hashCode() : 0);
        result = 31 * result + (flightKey != null ? flightKey.hashCode() : 0);
        result = 31 * result + (bookingClass != null ? bookingClass.hashCode() : 0);
        result = 31 * result + (bookingCode != null ? bookingCode.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalDateTime != null ? arrivalDateTime.hashCode() : 0);
        result = 31 * result + (stopOver != null ? stopOver.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (segments != null ? segments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BoundedFlight{" +
                "provider='" + provider + '\'' +
                ", airline=" + airline +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", flightId='" + flightId + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", flightKey='" + flightKey + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", departureAirport=" + departureAirport +
                ", departureDateTime=" + departureDateTime +
                ", arrivalAirport=" + arrivalAirport +
                ", arrivalDateTime=" + arrivalDateTime +
                ", stopOver=" + stopOver +
                ", duration=" + duration +
                ", segments=" + segments +
                '}';
    }
}
