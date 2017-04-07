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

/**
 * @author Matthias Deck
 */
public class HotelRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private List<String> codes;
    private String opCode;
    private String bookingCode;
    private String key;
    private String name;
    private List<HotelRoomAttribute> attributes;
    private List<HotelRoomView> views;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HotelRoomAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HotelRoomAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<HotelRoomView> getViews() {
        return views;
    }

    public void setViews(List<HotelRoomView> views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelRoom hotelRoom = (HotelRoom) o;

        if (code != null ? !code.equals(hotelRoom.code) : hotelRoom.code != null) return false;
        if (codes != null ? !codes.equals(hotelRoom.codes) : hotelRoom.codes != null) return false;
        if (opCode != null ? !opCode.equals(hotelRoom.opCode) : hotelRoom.opCode != null) return false;
        if (bookingCode != null ? !bookingCode.equals(hotelRoom.bookingCode) : hotelRoom.bookingCode != null)
            return false;
        if (key != null ? !key.equals(hotelRoom.key) : hotelRoom.key != null) return false;
        if (name != null ? !name.equals(hotelRoom.name) : hotelRoom.name != null) return false;
        if (attributes != null ? !attributes.equals(hotelRoom.attributes) : hotelRoom.attributes != null) return false;
        return views != null ? views.equals(hotelRoom.views) : hotelRoom.views == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (codes != null ? codes.hashCode() : 0);
        result = 31 * result + (opCode != null ? opCode.hashCode() : 0);
        result = 31 * result + (bookingCode != null ? bookingCode.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + (views != null ? views.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "code='" + code + '\'' +
                ", codes=" + codes +
                ", opCode='" + opCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                ", views=" + views +
                '}';
    }
}
