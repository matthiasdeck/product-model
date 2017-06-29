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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public abstract class BoundedFlight implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String provider;
    private final Airline airline;
    private final String flightNumber;
    private final String flightClass;
    private final String flightId;
    private final String flightCode;
    private final String flightKey;
    private final String bookingClass;
    private final String bookingCode;
    private final Airport departureAirport;
    private final LocalDateTime departureDateTime;
    private final Airport arrivalAirport;
    private final LocalDateTime arrivalDateTime;
    private final Integer stopOver;
    private final Integer duration;
    private final List<FlightSegment> segments;

    BoundedFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer duration, List<FlightSegment> segments) {

        this.provider = provider;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.flightId = flightId;
        this.flightCode = flightCode;
        this.flightKey = flightKey;
        this.bookingClass = bookingClass;
        this.bookingCode = bookingCode;
        this.departureAirport = departureAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDateTime = arrivalDateTime;
        this.stopOver = stopOver;
        this.duration = duration;
        this.segments = segments;
    }

    public String getProvider() {
        return this.provider;
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

    public String getFlightId() {
        return this.flightId;
    }

    public String getFlightCode() {
        return this.flightCode;
    }

    public String getFlightKey() {
        return this.flightKey;
    }

    public String getBookingClass() {
        return this.bookingClass;
    }

    public String getBookingCode() {
        return this.bookingCode;
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

    public Integer getStopOver() {
        return this.stopOver;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public List<FlightSegment> getSegments() {
        return this.segments;
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
        int result = getClass().getName().hashCode();
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
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
        return getClass().getSimpleName() + "{" +
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

    public abstract static class Builder<T extends BoundedFlight> {

        String provider;
        Airline airline;
        String flightNumber;
        String flightClass;
        String flightId;
        String flightCode;
        String flightKey;
        String bookingClass;
        String bookingCode;
        Airport departureAirport;
        LocalDateTime departureDateTime;
        Airport arrivalAirport;
        LocalDateTime arrivalDateTime;
        Integer stopOver;
        Integer duration;
        List<FlightSegment> segments;

        Builder() {
        }

        public Builder<T> provider(String provider) {
            this.provider = provider;
            return this;
        }

        public Builder<T> airline(Airline airline) {
            this.airline = airline;
            return this;
        }

        public Builder<T> flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder<T> flightClass(String flightClass) {
            this.flightClass = flightClass;
            return this;
        }

        public Builder<T> flightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder<T> flightCode(String flightCode) {
            this.flightCode = flightCode;
            return this;
        }

        public Builder<T> flightKey(String flightKey) {
            this.flightKey = flightKey;
            return this;
        }

        public Builder<T> bookingClass(String bookingClass) {
            this.bookingClass = bookingClass;
            return this;
        }

        public Builder<T> bookingCode(String bookingCode) {
            this.bookingCode = bookingCode;
            return this;
        }

        public Builder<T> departureAirport(Airport departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }

        public Builder<T> departureDateTime(LocalDateTime departureDateTime) {
            this.departureDateTime = departureDateTime;
            return this;
        }

        public Builder<T> arrivalAirport(Airport arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }

        public Builder<T> arrivalDateTime(LocalDateTime arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return this;
        }

        public Builder<T> stopOver(Integer stopOver) {
            this.stopOver = stopOver;
            return this;
        }

        public Builder<T> duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Builder<T> segment(FlightSegment segment) {
            if (this.segments == null) this.segments = new ArrayList<>();
            this.segments.add(segment);
            return this;
        }

        public Builder<T> segments(Collection<? extends FlightSegment> segments) {
            if (this.segments == null) this.segments = new ArrayList<>();
            this.segments.addAll(segments);
            return this;
        }

        public Builder<T> clearSegments() {
            if (this.segments != null)
                this.segments.clear();
            return this;
        }

        public abstract T build();
    }
}
