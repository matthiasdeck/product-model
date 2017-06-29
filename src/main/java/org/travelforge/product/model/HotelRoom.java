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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class HotelRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String code;
    private final String opCode;
    private final String bookingCode;
    private final String key;
    private final String name;
    private final List<HotelRoomAttribute> attributes;
    private final List<HotelRoomView> views;

    private HotelRoom(String code, String opCode, String bookingCode, String key, String name, List<HotelRoomAttribute> attributes, List<HotelRoomView> views) {
        this.code = code;
        this.opCode = opCode;
        this.bookingCode = bookingCode;
        this.key = key;
        this.name = name;
        this.attributes = attributes;
        this.views = views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCode() {
        return this.code;
    }

    public String getOpCode() {
        return this.opCode;
    }

    public String getBookingCode() {
        return this.bookingCode;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<HotelRoomAttribute> getAttributes() {
        return this.attributes;
    }

    public List<HotelRoomView> getViews() {
        return this.views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelRoom hotelRoom = (HotelRoom) o;

        if (code != null ? !code.equals(hotelRoom.code) : hotelRoom.code != null) return false;
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
                ", opCode='" + opCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                ", views=" + views +
                '}';
    }

    public static final class Builder {

        private String code;
        private String opCode;
        private String bookingCode;
        private String key;
        private String name;
        private List<HotelRoomAttribute> attributes;
        private List<HotelRoomView> views;

        private Builder() {
        }

        public HotelRoom.Builder code(String code) {
            this.code = code;
            return this;
        }

        public HotelRoom.Builder opCode(String opCode) {
            this.opCode = opCode;
            return this;
        }

        public HotelRoom.Builder bookingCode(String bookingCode) {
            this.bookingCode = bookingCode;
            return this;
        }

        public HotelRoom.Builder key(String key) {
            this.key = key;
            return this;
        }

        public HotelRoom.Builder name(String name) {
            this.name = name;
            return this;
        }

        public HotelRoom.Builder attribute(HotelRoomAttribute attribute) {
            if (this.attributes == null) this.attributes = new ArrayList<>();
            this.attributes.add(attribute);
            return this;
        }

        public HotelRoom.Builder attributes(Collection<? extends HotelRoomAttribute> attributes) {
            if (this.attributes == null) this.attributes = new ArrayList<>();
            this.attributes.addAll(attributes);
            return this;
        }

        public HotelRoom.Builder clearAttributes() {
            if (this.attributes != null)
                this.attributes.clear();
            return this;
        }

        public HotelRoom.Builder view(HotelRoomView view) {
            if (this.views == null) this.views = new ArrayList<>();
            this.views.add(view);
            return this;
        }

        public HotelRoom.Builder views(Collection<? extends HotelRoomView> views) {
            if (this.views == null) this.views = new ArrayList<>();
            this.views.addAll(views);
            return this;
        }

        public HotelRoom.Builder clearViews() {
            if (this.views != null)
                this.views.clear();
            return this;
        }

        public HotelRoom build() {
            List<HotelRoomAttribute> attributes = null;
            if (this.attributes != null && !this.attributes.isEmpty()) {
                attributes = java.util.Collections.unmodifiableList(new ArrayList<>(this.attributes));
            }
            List<HotelRoomView> views = null;
            if (this.views != null && !this.views.isEmpty()) {
                views = java.util.Collections.unmodifiableList(new ArrayList<>(this.views));
            }
            return new HotelRoom(code, opCode, bookingCode, key, name, attributes, views);
        }
    }
}
