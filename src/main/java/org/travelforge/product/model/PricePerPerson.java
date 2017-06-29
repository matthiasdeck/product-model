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
public final class PricePerPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String type;
    private final Float amount;

    private PricePerPerson(String type, Float amount) {
        this.type = type;
        this.amount = amount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public Float getAmount() {
        return this.amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricePerPerson that = (PricePerPerson) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return amount != null ? amount.equals(that.amount) : that.amount == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PricePerPerson{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static final class Builder {

        private String type;
        private Float amount;

        private Builder() {
        }

        public PricePerPerson.Builder type(String type) {
            this.type = type;
            return this;
        }

        public PricePerPerson.Builder amount(Float amount) {
            this.amount = amount;
            return this;
        }

        public PricePerPerson build() {
            return new PricePerPerson(type, amount);
        }
    }
}
