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
public final class HotelBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String code;
    private final String opCode;
    private final String key;
    private final String name;

    private HotelBoard(String code, String opCode, String key, String name) {
        this.code = code;
        this.opCode = opCode;
        this.key = key;
        this.name = name;
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

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelBoard that = (HotelBoard) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (opCode != null ? !opCode.equals(that.opCode) : that.opCode != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (opCode != null ? opCode.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelBoard{" +
                "code='" + code + '\'' +
                ", opCode='" + opCode + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static final class Builder {
        private String code;
        private String opCode;
        private String key;
        private String name;

        private Builder() {
        }

        public HotelBoard.Builder code(String code) {
            this.code = code;
            return this;
        }

        public HotelBoard.Builder opCode(String opCode) {
            this.opCode = opCode;
            return this;
        }

        public HotelBoard.Builder key(String key) {
            this.key = key;
            return this;
        }

        public HotelBoard.Builder name(String name) {
            this.name = name;
            return this;
        }

        public HotelBoard build() {
            return new HotelBoard(code, opCode, key, name);
        }
    }
}
