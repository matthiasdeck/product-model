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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
@JsonDeserialize(builder=PackageProduct.Builder.class)
public class PackageProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String provider;
    private final TourOperator tourOperator;
    private final Travellers travellers;
    private final TravelPeriod travelPeriod;
    private final Flight flight;
    private final Hotel hotel;
    private final List<Extra> extras;
    private final Price price;

    private PackageProduct(String provider, TourOperator tourOperator, Travellers travellers, TravelPeriod travelPeriod, Flight flight, Hotel hotel, List<Extra> extras, Price price) {
        this.provider = provider;
        this.tourOperator = tourOperator;
        this.travellers = travellers;
        this.travelPeriod = travelPeriod;
        this.flight = flight;
        this.hotel = hotel;
        this.extras = extras;
        this.price = price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getProvider() {
        return this.provider;
    }

    public TourOperator getTourOperator() {
        return this.tourOperator;
    }

    public Travellers getTravellers() {
        return this.travellers;
    }

    public TravelPeriod getTravelPeriod() {
        return this.travelPeriod;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public List<Extra> getExtras() {
        return this.extras;
    }

    public Price getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageProduct that = (PackageProduct) o;

        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (tourOperator != null ? !tourOperator.equals(that.tourOperator) : that.tourOperator != null) return false;
        if (travellers != null ? !travellers.equals(that.travellers) : that.travellers != null) return false;
        if (travelPeriod != null ? !travelPeriod.equals(that.travelPeriod) : that.travelPeriod != null) return false;
        if (flight != null ? !flight.equals(that.flight) : that.flight != null) return false;
        if (hotel != null ? !hotel.equals(that.hotel) : that.hotel != null) return false;
        if (extras != null ? !extras.equals(that.extras) : that.extras != null) return false;
        return price != null ? price.equals(that.price) : that.price == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (tourOperator != null ? tourOperator.hashCode() : 0);
        result = 31 * result + (travellers != null ? travellers.hashCode() : 0);
        result = 31 * result + (travelPeriod != null ? travelPeriod.hashCode() : 0);
        result = 31 * result + (flight != null ? flight.hashCode() : 0);
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        result = 31 * result + (extras != null ? extras.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProduct{" +
                "provider='" + provider + '\'' +
                ", tourOperator=" + tourOperator +
                ", travellers=" + travellers +
                ", travelPeriod=" + travelPeriod +
                ", flight=" + flight +
                ", hotel=" + hotel +
                ", extras=" + extras +
                ", price=" + price +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        private String provider;
        private TourOperator tourOperator;
        private Travellers travellers;
        private TravelPeriod travelPeriod;
        private Flight flight;
        private Hotel hotel;
        private List<Extra> extras;
        private Price price;

        private Builder() {
        }

        public PackageProduct.Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public PackageProduct.Builder tourOperator(TourOperator tourOperator) {
            this.tourOperator = tourOperator;
            return this;
        }

        public PackageProduct.Builder travellers(Travellers travellers) {
            this.travellers = travellers;
            return this;
        }

        public PackageProduct.Builder travelPeriod(TravelPeriod travelPeriod) {
            this.travelPeriod = travelPeriod;
            return this;
        }

        public PackageProduct.Builder flight(Flight flight) {
            this.flight = flight;
            return this;
        }

        public PackageProduct.Builder hotel(Hotel hotel) {
            this.hotel = hotel;
            return this;
        }

        public PackageProduct.Builder extras(Collection<? extends Extra> extras) {
            if (extras != null) {
                this.extras = new ArrayList<>(extras);
            }
            return this;
        }

        public PackageProduct.Builder price(Price price) {
            this.price = price;
            return this;
        }

        public PackageProduct build() {
            List<Extra> extras = null;
            if (this.extras != null && !this.extras.isEmpty()) {
                extras = java.util.Collections.unmodifiableList(this.extras);
            }
            return new PackageProduct(provider, tourOperator, travellers, travelPeriod, flight, hotel, extras, price);
        }
    }
}
