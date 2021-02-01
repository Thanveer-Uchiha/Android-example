package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetOrderlistByStatus {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("orders")
        @Expose
        private List<Order> orders = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }


    public class Order {

        @SerializedName("order_id")
        @Expose
        private String orderId;
        @SerializedName("order_serial")
        @Expose
        private String orderSerial;
        @SerializedName("order_productcount")
        @Expose
        private String orderProductcount;
        @SerializedName("order_totalrate")
        @Expose
        private String orderTotalrate;
        @SerializedName("order_iscouponapplied")
        @Expose
        private String orderIscouponapplied;
        @SerializedName("order_couponpercentage")
        @Expose
        private String orderCouponpercentage;
        @SerializedName("order_priceaftercoupon")
        @Expose
        private String orderPriceaftercoupon;
        @SerializedName("order_payment_transactionid")
        @Expose
        private String orderPaymentTransactionid;
        @SerializedName("order_payment_transactionsstatus")
        @Expose
        private String orderPaymentTransactionsstatus;
        @SerializedName("order_payment_transactionresponse")
        @Expose
        private String orderPaymentTransactionresponse;
        @SerializedName("order_payment_transactiondetails")
        @Expose
        private String orderPaymentTransactiondetails;
        @SerializedName("order_status")
        @Expose
        private String orderStatus;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderSerial() {
            return orderSerial;
        }

        public void setOrderSerial(String orderSerial) {
            this.orderSerial = orderSerial;
        }

        public String getOrderProductcount() {
            return orderProductcount;
        }

        public void setOrderProductcount(String orderProductcount) {
            this.orderProductcount = orderProductcount;
        }

        public String getOrderTotalrate() {
            return orderTotalrate;
        }

        public void setOrderTotalrate(String orderTotalrate) {
            this.orderTotalrate = orderTotalrate;
        }

        public String getOrderIscouponapplied() {
            return orderIscouponapplied;
        }

        public void setOrderIscouponapplied(String orderIscouponapplied) {
            this.orderIscouponapplied = orderIscouponapplied;
        }

        public String getOrderCouponpercentage() {
            return orderCouponpercentage;
        }

        public void setOrderCouponpercentage(String orderCouponpercentage) {
            this.orderCouponpercentage = orderCouponpercentage;
        }

        public String getOrderPriceaftercoupon() {
            return orderPriceaftercoupon;
        }

        public void setOrderPriceaftercoupon(String orderPriceaftercoupon) {
            this.orderPriceaftercoupon = orderPriceaftercoupon;
        }

        public String getOrderPaymentTransactionid() {
            return orderPaymentTransactionid;
        }

        public void setOrderPaymentTransactionid(String orderPaymentTransactionid) {
            this.orderPaymentTransactionid = orderPaymentTransactionid;
        }

        public String getOrderPaymentTransactionsstatus() {
            return orderPaymentTransactionsstatus;
        }

        public void setOrderPaymentTransactionsstatus(String orderPaymentTransactionsstatus) {
            this.orderPaymentTransactionsstatus = orderPaymentTransactionsstatus;
        }

        public String getOrderPaymentTransactionresponse() {
            return orderPaymentTransactionresponse;
        }

        public void setOrderPaymentTransactionresponse(String orderPaymentTransactionresponse) {
            this.orderPaymentTransactionresponse = orderPaymentTransactionresponse;
        }

        public String getOrderPaymentTransactiondetails() {
            return orderPaymentTransactiondetails;
        }

        public void setOrderPaymentTransactiondetails(String orderPaymentTransactiondetails) {
            this.orderPaymentTransactiondetails = orderPaymentTransactiondetails;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

    }
}
