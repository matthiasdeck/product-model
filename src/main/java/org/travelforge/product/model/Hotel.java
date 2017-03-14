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
import java.util.List;
import java.util.Map;

/**
 * @author Matthias Deck
 */
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCategory() {
        return category;
    }

    public void setCategory(Float category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<HotelAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HotelAttribute> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Number> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Map<String, Number> recommendations) {
        this.recommendations = recommendations;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public HotelBoard getBoard() {
        return board;
    }

    public void setBoard(HotelBoard board) {
        this.board = board;
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
}
