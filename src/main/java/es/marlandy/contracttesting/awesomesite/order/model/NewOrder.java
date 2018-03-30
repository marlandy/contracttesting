/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.marlandy.contracttesting.awesomesite.order.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author marlandy
 */
@XmlRootElement
@XmlType(propOrder = {"price", "voucher"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewOrder{

    private Double price;
	
    private String voucher;

    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

	@Override
	public int hashCode(){
		int hash = 7;
		hash = 67 * hash + Objects.hashCode(this.price);
		hash = 67 * hash + Objects.hashCode(this.voucher);
		return hash;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final NewOrder other = (NewOrder) obj;
		if(!Objects.equals(this.voucher, other.voucher)){
			return false;
		}
		if(!Objects.equals(this.price, other.price)){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "NewOrder{" + "price=" + price + ", voucher=" + voucher + '}';
	}

    
    

	
}
