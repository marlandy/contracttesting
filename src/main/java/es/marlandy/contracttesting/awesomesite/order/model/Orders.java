package es.marlandy.contracttesting.awesomesite.order.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marlandy
 */
@XmlRootElement
public class Orders {

    private List<Order> orders;
	
	private Integer total;

    public Orders() {
        this.orders = new ArrayList<>();
    }

    public Orders(List<Order> orders) {
        this.orders = orders;
		this.total = orders != null ? orders.size() : 0;
    }

	public Orders(List<Order> orders, Integer total){
		this.orders = orders;
		this.total = total;
	}	
	
    @XmlElement(name = "order")
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

	public Integer getTotal(){
		return total;
	}

	public void setTotal(Integer total){
		this.total = total;
	}
	
	

}
