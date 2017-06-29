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
import java.util.*;

/**
 * @author Matthias Deck
 */
public final class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String provider;
    private final Integer code;
    private final String productCode;
    private final String name;
    private final Float category;
    private final Location location;
    private final List<HotelAttribute> attributes;
    private final Map<String, Number> recommendations;
    private final HotelRoom room;
    private final HotelBoard board;

    private Hotel(String provider, Integer code, String productCode, String name, Float category, Location location, List<HotelAttribute> attributes, Map<String, Number> recommendations, HotelRoom room, HotelBoard board) {
        this.provider = provider;
        this.code = code;
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.location = location;
        this.attributes = attributes;
        this.recommendations = recommendations;
        this.room = room;
        this.board = board;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getProvider() {
        return this.provider;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getName() {
        return this.name;
    }

    public Float getCategory() {
        return this.category;
    }

    public Location getLocation() {
        return this.location;
    }

    public List<HotelAttribute> getAttributes() {
        return this.attributes;
    }

    public Map<String, Number> getRecommendations() {
        return this.recommendations;
    }

    public HotelRoom getRoom() {
        return this.room;
    }

    public HotelBoard getBoard() {
        return this.board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (provider != null ? !provider.equals(hotel.provider) : hotel.provider != null) return false;
        if (code != null ? !code.equals(hotel.code) : hotel.code != null) return false;
        if (productCode != null ? !productCode.equals(hotel.productCode) : hotel.productCode != null) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if (category != null ? !category.equals(hotel.category) : hotel.category != null) return false;
        if (location != null ? !location.equals(hotel.location) : hotel.location != null) return false;
        if (attributes != null ? !attributes.equals(hotel.attributes) : hotel.attributes != null) return false;
        if (recommendations != null ? !recommendations.equals(hotel.recommendations) : hotel.recommendations != null)
            return false;
        if (room != null ? !room.equals(hotel.room) : hotel.room != null) return false;
        return board != null ? board.equals(hotel.board) : hotel.board == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (productCode != null ? productCode.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + (recommendations != null ? recommendations.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (board != null ? board.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "provider='" + provider + '\'' +
                ", code=" + code +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", location=" + location +
                ", attributes=" + attributes +
                ", recommendations=" + recommendations +
                ", room=" + room +
                ", board=" + board +
                '}';
    }

    public static final class Builder {

        private String provider;
        private Integer code;
        private String productCode;
        private String name;
        private Float category;
        private Location location;
        private List<HotelAttribute> attributes;
        private Map<String, Number> recommendations;
        private HotelRoom room;
        private HotelBoard board;

        private Builder() {
        }

        public Hotel.Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public Hotel.Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Hotel.Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        public Hotel.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Hotel.Builder category(Float category) {
            this.category = category;
            return this;
        }

        public Hotel.Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Hotel.Builder attribute(HotelAttribute attribute) {
            if (this.attributes == null) this.attributes = new ArrayList<>();
            this.attributes.add(attribute);
            return this;
        }

        public Hotel.Builder attributes(Collection<? extends HotelAttribute> attributes) {
            if (this.attributes == null) this.attributes = new ArrayList<>();
            this.attributes.addAll(attributes);
            return this;
        }

        public Hotel.Builder clearAttributes() {
            if (this.attributes != null)
                this.attributes.clear();
            return this;
        }

        public Hotel.Builder recommendation(String key, Number value) {
            if (this.recommendations == null) {
                this.recommendations = new LinkedHashMap<>();
            }
            this.recommendations.put(key, value);
            return this;
        }

        public Hotel.Builder recommendations(Map<? extends String, ? extends Number> recommendations) {
            if (this.recommendations == null) {
                this.recommendations = new LinkedHashMap<>();
            }
            this.recommendations.putAll(recommendations);
            return this;
        }

        public Hotel.Builder clearRecommendations() {
            if (this.recommendations != null) {
                this.recommendations.clear();
            }
            return this;
        }

        public Hotel.Builder room(HotelRoom room) {
            this.room = room;
            return this;
        }

        public Hotel.Builder board(HotelBoard board) {
            this.board = board;
            return this;
        }

        public Hotel build() {
            List<HotelAttribute> attributes = null;
            if (this.attributes != null && !this.attributes.isEmpty()) {
                attributes = java.util.Collections.unmodifiableList(new ArrayList<>(this.attributes));
            }
            Map<String, Number> recommendations = null;
            if (this.recommendations != null && !this.recommendations.isEmpty()) {
                recommendations = Collections.unmodifiableMap(new LinkedHashMap<>(this.recommendations));
            }
            return new Hotel(provider, code, productCode, name, category, location, attributes, recommendations, room, board);
        }
    }
}
