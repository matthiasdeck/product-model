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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Matthias Deck
 */
@JsonDeserialize(builder=TravelPeriod.Builder.class)
public final class TravelPeriod implements Serializable {

    private static final long serialVersionUID = 1L;

    private final LocalDate departureDate;
    private final LocalDate returnDate;
    private final Integer duration;

    private TravelPeriod(LocalDate departureDate, LocalDate returnDate, Integer duration) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.duration = duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public LocalDate getDepartureDate() {
        return this.departureDate;
    }

    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    public Integer getDuration() {
        return this.duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelPeriod that = (TravelPeriod) o;

        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (returnDate != null ? !returnDate.equals(that.returnDate) : that.returnDate != null) return false;
        return duration != null ? duration.equals(that.duration) : that.duration == null;
    }

    @Override
    public int hashCode() {
        int result = departureDate != null ? departureDate.hashCode() : 0;
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TravelPeriod{" +
                "departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", duration=" + duration +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {

        private LocalDate departureDate;
        private LocalDate returnDate;
        private Integer duration;

        private Builder() {
        }

        public TravelPeriod.Builder departureDate(LocalDate departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public TravelPeriod.Builder returnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public TravelPeriod.Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public TravelPeriod build() {
            return new TravelPeriod(departureDate, returnDate, duration);
        }
    }
}
