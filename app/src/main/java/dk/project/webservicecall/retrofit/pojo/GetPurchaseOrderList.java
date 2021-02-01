package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPurchaseOrderList {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("purchaselist")
        @Expose
        private List<Purchaselist> purchaselist = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Purchaselist> getPurchaselist() {
            return purchaselist;
        }

        public void setPurchaselist(List<Purchaselist> purchaselist) {
            this.purchaselist = purchaselist;
        }

    public class Purchaselist {

        @SerializedName("purchase_productid")
        @Expose
        private String purchaseProductid;
        @SerializedName("product_name")
        @Expose
        private String productName;
        @SerializedName("product_category")
        @Expose
        private String productCategory;
        @SerializedName("product_saleprice")
        @Expose
        private String productSaleprice;
        @SerializedName("product_image1")
        @Expose
        private String productImage1;
        @SerializedName("purchase_rate")
        @Expose
        private String purchaseRate;
        @SerializedName("purchase_shippingstatus")
        @Expose
        private String purchaseShippingstatus;

        public String getPurchaseProductid() {
            return purchaseProductid;
        }

        public void setPurchaseProductid(String purchaseProductid) {
            this.purchaseProductid = purchaseProductid;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public String getProductSaleprice() {
            return productSaleprice;
        }

        public void setProductSaleprice(String productSaleprice) {
            this.productSaleprice = productSaleprice;
        }

        public String getProductImage1() {
            return productImage1;
        }

        public void setProductImage1(String productImage1) {
            this.productImage1 = productImage1;
        }

        public String getPurchaseRate() {
            return purchaseRate;
        }

        public void setPurchaseRate(String purchaseRate) {
            this.purchaseRate = purchaseRate;
        }

        public String getPurchaseShippingstatus() {
            return purchaseShippingstatus;
        }

        public void setPurchaseShippingstatus(String purchaseShippingstatus) {
            this.purchaseShippingstatus = purchaseShippingstatus;
        }

    }
}
