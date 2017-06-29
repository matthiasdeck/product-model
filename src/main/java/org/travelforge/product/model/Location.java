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

/**
 * @author Matthias Deck
 */
public final class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Country country;
    private final Region region;
    private final City city;
    private final Float latitude;
    private final Float longitude;

    private Location(Country country, Region region, City city, Float latitude, Float longitude) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Country getCountry() {
        return this.country;
    }

    public Region getRegion() {
        return this.region;
    }

    public City getCity() {
        return this.city;
    }

    public Float getLatitude() {
        return this.latitude;
    }

    public Float getLongitude() {
        return this.longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (country != null ? !country.equals(location.country) : location.country != null) return false;
        if (region != null ? !region.equals(location.region) : location.region != null) return false;
        if (city != null ? !city.equals(location.city) : location.city != null) return false;
        if (latitude != null ? !latitude.equals(location.latitude) : location.latitude != null) return false;
        return longitude != null ? longitude.equals(location.longitude) : location.longitude == null;
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country=" + country +
                ", region=" + region +
                ", city=" + city +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public static final class Builder {

        private Country country;
        private Region region;
        private City city;
        private Float latitude;
        private Float longitude;

        private Builder() {
        }

        public Location.Builder country(Country country) {
            this.country = country;
            return this;
        }

        public Location.Builder region(Region region) {
            this.region = region;
            return this;
        }

        public Location.Builder city(City city) {
            this.city = city;
            return this;
        }

        public Location.Builder latitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }

        public Location.Builder longitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }

        public Location build() {
            return new Location(country, region, city, latitude, longitude);
        }
    }
}
