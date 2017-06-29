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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class OutboundFlight extends BoundedFlight {

    private static final long serialVersionUID = 1L;

    private OutboundFlight(String provider, Airline airline, String flightNumber, String flightClass, String flightId, String flightCode, String flightKey, String bookingClass, String bookingCode, Airport departureAirport, LocalDateTime departureDateTime, Airport arrivalAirport, LocalDateTime arrivalDateTime, Integer stopOver, Integer duration, List<FlightSegment> segments) {
        super(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, duration, segments);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends BoundedFlight.Builder<OutboundFlight> {

        private Builder() {
            super();
        }

        @Override
        public OutboundFlight build() {
            List<FlightSegment> segments = null;
            if (this.segments != null && !this.segments.isEmpty()) {
                segments = java.util.Collections.unmodifiableList(new ArrayList<>(this.segments));
            }
            return new OutboundFlight(provider, airline, flightNumber, flightClass, flightId, flightCode, flightKey, bookingClass, bookingCode, departureAirport, departureDateTime, arrivalAirport, arrivalDateTime, stopOver, duration, segments);
        }
    }
}
