package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCartlistProducts {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("wishlist")
        @Expose
        private List<Wishlist> wishlist = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Wishlist> getWishlist() {
            return wishlist;
        }

        public void setWishlist(List<Wishlist> wishlist) {
            this.wishlist = wishlist;
        }

    public class Wishlist {

        @SerializedName("cart_productid.")
        @Expose
        private String cartProductid;
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

        public String getCartProductid() {
            return cartProductid;
        }

        public void setCartProductid(String cartProductid) {
            this.cartProductid = cartProductid;
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

    }
}
