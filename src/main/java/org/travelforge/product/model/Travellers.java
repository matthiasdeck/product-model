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
import java.time.LocalDate;
import java.util.List;

/**
 * @author Matthias Deck
 */
public class Travellers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer adults;
    private List<Integer> childrenAge;
    private List<LocalDate> childrenDateOfBirth;

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public List<Integer> getChildrenAge() {
        return childrenAge;
    }

    public void setChildrenAge(List<Integer> childrenAge) {
        this.childrenAge = childrenAge;
    }

    public List<LocalDate> getChildrenDateOfBirth() {
        return childrenDateOfBirth;
    }

    public void setChildrenDateOfBirth(List<LocalDate> childrenDateOfBirth) {
        this.childrenDateOfBirth = childrenDateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Travellers)) return false;

        Travellers that = (Travellers) o;

        if (adults != null ? !adults.equals(that.adults) : that.adults != null) return false;
        if (childrenAge != null ? !childrenAge.equals(that.childrenAge) : that.childrenAge != null) return false;
        return childrenDateOfBirth != null ? childrenDateOfBirth.equals(that.childrenDateOfBirth) : that.childrenDateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = adults != null ? adults.hashCode() : 0;
        result = 31 * result + (childrenAge != null ? childrenAge.hashCode() : 0);
        result = 31 * result + (childrenDateOfBirth != null ? childrenDateOfBirth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Travellers{" +
                "adults=" + adults +
                ", childrenAge=" + childrenAge +
                ", childrenDateOfBirth=" + childrenDateOfBirth +
                '}';
    }
}
