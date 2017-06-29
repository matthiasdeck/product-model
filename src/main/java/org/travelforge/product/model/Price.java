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
public final class Price implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String currency;
    private final Float amountTotal;
    private final Float amountPerPerson;
    private final List<PricePerPerson> pricesPerPerson;

    private Price(String currency, Float amountTotal, Float amountPerPerson, List<PricePerPerson> pricesPerPerson) {
        this.currency = currency;
        this.amountTotal = amountTotal;
        this.amountPerPerson = amountPerPerson;
        this.pricesPerPerson = pricesPerPerson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCurrency() {
        return this.currency;
    }

    public Float getAmountTotal() {
        return this.amountTotal;
    }

    public Float getAmountPerPerson() {
        return this.amountPerPerson;
    }

    public List<PricePerPerson> getPricesPerPerson() {
        return this.pricesPerPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        if (currency != null ? !currency.equals(price.currency) : price.currency != null) return false;
        if (amountTotal != null ? !amountTotal.equals(price.amountTotal) : price.amountTotal != null) return false;
        if (amountPerPerson != null ? !amountPerPerson.equals(price.amountPerPerson) : price.amountPerPerson != null)
            return false;
        return pricesPerPerson != null ? pricesPerPerson.equals(price.pricesPerPerson) : price.pricesPerPerson == null;
    }

    @Override
    public int hashCode() {
        int result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (amountTotal != null ? amountTotal.hashCode() : 0);
        result = 31 * result + (amountPerPerson != null ? amountPerPerson.hashCode() : 0);
        result = 31 * result + (pricesPerPerson != null ? pricesPerPerson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency='" + currency + '\'' +
                ", amountTotal=" + amountTotal +
                ", amountPerPerson=" + amountPerPerson +
                ", pricesPerPerson=" + pricesPerPerson +
                '}';
    }

    public static final class Builder {

        private String currency;
        private Float amountTotal;
        private Float amountPerPerson;
        private List<PricePerPerson> pricesPerPerson;

        private Builder() {
        }

        public Price.Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Price.Builder amountTotal(Float amountTotal) {
            this.amountTotal = amountTotal;
            return this;
        }

        public Price.Builder amountPerPerson(Float amountPerPerson) {
            this.amountPerPerson = amountPerPerson;
            return this;
        }

        public Price.Builder pricePerPerson(PricePerPerson pricePerPerson) {
            if (this.pricesPerPerson == null) this.pricesPerPerson = new ArrayList<>();
            this.pricesPerPerson.add(pricePerPerson);
            return this;
        }

        public Price.Builder pricesPerPerson(Collection<? extends PricePerPerson> pricesPerPerson) {
            if (this.pricesPerPerson == null) this.pricesPerPerson = new ArrayList<>();
            this.pricesPerPerson.addAll(pricesPerPerson);
            return this;
        }

        public Price.Builder clearPricesPerPerson() {
            if (this.pricesPerPerson != null)
                this.pricesPerPerson.clear();
            return this;
        }

        public Price build() {
            List<PricePerPerson> pricesPerPerson = null;
            if (this.pricesPerPerson != null && !this.pricesPerPerson.isEmpty()) {
                pricesPerPerson = java.util.Collections.unmodifiableList(new ArrayList<>(this.pricesPerPerson));
            }
            return new Price(currency, amountTotal, amountPerPerson, pricesPerPerson);
        }
    }
}
