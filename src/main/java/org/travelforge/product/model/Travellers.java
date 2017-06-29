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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Matthias Deck
 */
public final class Travellers implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer adults;
    private final List<Integer> childrenAge;
    private final List<LocalDate> childrenDateOfBirth;

    private Travellers(Integer adults, List<Integer> childrenAge, List<LocalDate> childrenDateOfBirth) {
        this.adults = adults;
        this.childrenAge = childrenAge;
        this.childrenDateOfBirth = childrenDateOfBirth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getAdults() {
        return this.adults;
    }

    public List<Integer> getChildrenAge() {
        return this.childrenAge;
    }

    public List<LocalDate> getChildrenDateOfBirth() {
        return this.childrenDateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

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

    public static final class Builder {

        private Integer adults;
        private List<Integer> childrenAge;
        private List<LocalDate> childrenDateOfBirth;

        private Builder() {
        }

        public Travellers.Builder adults(Integer adults) {
            this.adults = adults;
            return this;
        }

        public Travellers.Builder childAge(Integer childAge) {
            if (this.childrenAge == null) this.childrenAge = new ArrayList<>();
            this.childrenAge.add(childAge);
            return this;
        }

        public Travellers.Builder childrenAge(Collection<? extends Integer> childrenAge) {
            if (this.childrenAge == null) this.childrenAge = new ArrayList<>();
            this.childrenAge.addAll(childrenAge);
            return this;
        }

        public Travellers.Builder clearChildrenAge() {
            if (this.childrenAge != null)
                this.childrenAge.clear();
            return this;
        }

        public Travellers.Builder childDateOfBirth(LocalDate childDateOfBirth) {
            if (this.childrenDateOfBirth == null) this.childrenDateOfBirth = new ArrayList<>();
            this.childrenDateOfBirth.add(childDateOfBirth);
            return this;
        }

        public Travellers.Builder childrenDateOfBirth(Collection<? extends LocalDate> childrenDateOfBirth) {
            if (this.childrenDateOfBirth == null) this.childrenDateOfBirth = new ArrayList<>();
            this.childrenDateOfBirth.addAll(childrenDateOfBirth);
            return this;
        }

        public Travellers.Builder clearChildrenDateOfBirth() {
            if (this.childrenDateOfBirth != null)
                this.childrenDateOfBirth.clear();
            return this;
        }

        public Travellers build() {
            List<Integer> childrenAge = null;
            if (this.childrenAge != null && !this.childrenAge.isEmpty()) {
                childrenAge = java.util.Collections.unmodifiableList(new ArrayList<>(this.childrenAge));
            }
            List<LocalDate> childrenDateOfBirth = null;
            if (this.childrenDateOfBirth != null && !this.childrenDateOfBirth.isEmpty()) {
                childrenDateOfBirth = java.util.Collections.unmodifiableList(new ArrayList<>(this.childrenDateOfBirth));
            }
            return new Travellers(adults, childrenAge, childrenDateOfBirth);
        }
    }
}
