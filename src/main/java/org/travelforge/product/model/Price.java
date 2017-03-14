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
public class Price implements Serializable {

    private static final long serialVersionUID = 1L;

    private String currency;
    private Float amountTotal;
    private Float amountPerPerson;
    private List<PricePerPerson> pricesPerPerson;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Float amountTotal) {
        this.amountTotal = amountTotal;
    }

    public Float getAmountPerPerson() {
        return amountPerPerson;
    }

    public void setAmountPerPerson(Float amountPerPerson) {
        this.amountPerPerson = amountPerPerson;
    }

    public List<PricePerPerson> getPricesPerPerson() {
        return pricesPerPerson;
    }

    public void setPricesPerPerson(List<PricePerPerson> pricesPerPerson) {
        this.pricesPerPerson = pricesPerPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;

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
}
