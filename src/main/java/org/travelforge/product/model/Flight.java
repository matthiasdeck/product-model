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
import java.util.Map;

/**
 *
 * @author Matthias Deck
 */
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;

    private String provider;
    private OutboundFlight outbound;
    private InboundFlight inbound;
    private Map<String, Object> references;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public OutboundFlight getOutbound() {
        return outbound;
    }

    public void setOutbound(OutboundFlight outbound) {
        this.outbound = outbound;
    }

    public InboundFlight getInbound() {
        return inbound;
    }

    public void setInbound(InboundFlight inbound) {
        this.inbound = inbound;
    }

    public Map<String, Object> getReferences() {
        return references;
    }

    public void setReferences(Map<String, Object> references) {
        this.references = references;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (provider != null ? !provider.equals(flight.provider) : flight.provider != null) return false;
        if (outbound != null ? !outbound.equals(flight.outbound) : flight.outbound != null) return false;
        if (inbound != null ? !inbound.equals(flight.inbound) : flight.inbound != null) return false;
        return references != null ? references.equals(flight.references) : flight.references == null;
    }

    @Override
    public int hashCode() {
        int result = provider != null ? provider.hashCode() : 0;
        result = 31 * result + (outbound != null ? outbound.hashCode() : 0);
        result = 31 * result + (inbound != null ? inbound.hashCode() : 0);
        result = 31 * result + (references != null ? references.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "provider='" + provider + '\'' +
                ", outbound=" + outbound +
                ", inbound=" + inbound +
                ", references=" + references +
                '}';
    }
}
