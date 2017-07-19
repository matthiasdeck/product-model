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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;
import java.util.*;

/**
 * @author Matthias Deck
 */
@JsonDeserialize(builder=PackageProductGroup.Builder.class)
public final class PackageProductGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String name;
    private final Map<String, Object> properties;
    private final List<PackageProductGroup> productGroups;
    private final List<PackageProduct> products;

    private PackageProductGroup(Integer id, String name, Map<String, Object> properties, List<PackageProductGroup> productGroups, List<PackageProduct> products) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.productGroups = productGroups;
        this.products = products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public List<PackageProductGroup> getProductGroups() {
        return this.productGroups;
    }

    public List<PackageProduct> getProducts() {
        return this.products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageProductGroup that = (PackageProductGroup) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
        if (productGroups != null ? !productGroups.equals(that.productGroups) : that.productGroups != null)
            return false;
        return products != null ? products.equals(that.products) : that.products == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        result = 31 * result + (productGroups != null ? productGroups.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProductGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                ", productGroups=" + productGroups +
                ", products=" + products +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {

        private Integer id;
        private String name;
        private Map<String, Object> properties;
        private List<PackageProductGroup> productGroups;
        private List<PackageProduct> products;

        private Builder() {
        }

        public PackageProductGroup.Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public PackageProductGroup.Builder name(String name) {
            this.name = name;
            return this;
        }

        public PackageProductGroup.Builder properties(Map<? extends String, ?> properties) {
            if (properties != null) {
                this.properties = new LinkedHashMap<>(properties);
            }
            return this;
        }

        public PackageProductGroup.Builder productGroups(Collection<? extends PackageProductGroup> productGroups) {
            if (productGroups != null) {
                this.productGroups = new ArrayList<>(productGroups);
            }
            return this;
        }

        public PackageProductGroup.Builder products(Collection<? extends PackageProduct> products) {
            if (products != null) {
                this.products = new ArrayList<>(products);
            }
            return this;
        }

        public PackageProductGroup build() {
            Map<String, Object> properties = null;
            if (this.properties != null && !this.properties.isEmpty()) {
                properties = Collections.unmodifiableMap(this.properties);
            }
            List<PackageProductGroup> productGroups = null;
            if (this.productGroups != null && !this.productGroups.isEmpty()) {
                productGroups = java.util.Collections.unmodifiableList(this.productGroups);
            }
            List<PackageProduct> products = null;
            if (this.products != null && !this.products.isEmpty()) {
                products = java.util.Collections.unmodifiableList(this.products);
            }
            return new PackageProductGroup(id, name, properties, productGroups, products);
        }
    }
}
