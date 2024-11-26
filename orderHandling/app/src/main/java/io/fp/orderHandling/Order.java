package io.fp.orderHandling;

public class Order implements Comparable<Order>{
    
    private boolean vip;
    private String orderDescription;
    private long customerId;

    public Order(String orderDescriptipn, long consumerId){
        this.orderDescription = orderDescriptipn;
        this.customerId = consumerId;
        this.vip = false;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", orderDescription=" + orderDescription + ", vip=" + vip + "]";
    }

    @Override
    public int compareTo(Order o) {

        return o.vip.compareTo(this.vip);
    }
}
