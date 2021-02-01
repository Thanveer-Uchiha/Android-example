package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetProductsListByRecentAdded {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("products")
        @Expose
        private List<Product> products = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }


    public class Product {

        @SerializedName("product_name")
        @Expose
        private String productName;
        @SerializedName("product_category")
        @Expose
        private String productCategory;
        @SerializedName("product_short_desc")
        @Expose
        private String productShortDesc;
        @SerializedName("product_long_desc")
        @Expose
        private String productLongDesc;
        @SerializedName("product_cardcode")
        @Expose
        private String productCardcode;
        @SerializedName("product_grader")
        @Expose
        private String productGrader;
        @SerializedName("product_condition")
        @Expose
        private String productCondition;
        @SerializedName("product_gradepoint")
        @Expose
        private String productGradepoint;
        @SerializedName("product_year")
        @Expose
        private String productYear;
        @SerializedName("product_saleprice")
        @Expose
        private String productSaleprice;
        @SerializedName("product_immediateprice")
        @Expose
        private String productImmediateprice;
        @SerializedName("produt_quantity")
        @Expose
        private String produtQuantity;
        @SerializedName("product_image1")
        @Expose
        private String productImage1;
        @SerializedName("product_image2")
        @Expose
        private String productImage2;
        @SerializedName("product_region")
        @Expose
        private String productRegion;
        @SerializedName("product_discount")
        @Expose
        private String productDiscount;
        @SerializedName("product_skuid")
        @Expose
        private String productSkuid;
        @SerializedName("product_thumbnail1")
        @Expose
        private Object productThumbnail1;
        @SerializedName("product_thumbnail2")
        @Expose
        private Object productThumbnail2;
        @SerializedName("product_thumbnailstatus")
        @Expose
        private Object productThumbnailstatus;
        @SerializedName("product_status")
        @Expose
        private String productStatus;
        @SerializedName("product_serial")
        @Expose
        private String productSerial;

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

        public String getProductShortDesc() {
            return productShortDesc;
        }

        public void setProductShortDesc(String productShortDesc) {
            this.productShortDesc = productShortDesc;
        }

        public String getProductLongDesc() {
            return productLongDesc;
        }

        public void setProductLongDesc(String productLongDesc) {
            this.productLongDesc = productLongDesc;
        }

        public String getProductCardcode() {
            return productCardcode;
        }

        public void setProductCardcode(String productCardcode) {
            this.productCardcode = productCardcode;
        }

        public String getProductGrader() {
            return productGrader;
        }

        public void setProductGrader(String productGrader) {
            this.productGrader = productGrader;
        }

        public String getProductCondition() {
            return productCondition;
        }

        public void setProductCondition(String productCondition) {
            this.productCondition = productCondition;
        }

        public String getProductGradepoint() {
            return productGradepoint;
        }

        public void setProductGradepoint(String productGradepoint) {
            this.productGradepoint = productGradepoint;
        }

        public String getProductYear() {
            return productYear;
        }

        public void setProductYear(String productYear) {
            this.productYear = productYear;
        }

        public String getProductSaleprice() {
            return productSaleprice;
        }

        public void setProductSaleprice(String productSaleprice) {
            this.productSaleprice = productSaleprice;
        }

        public String getProductImmediateprice() {
            return productImmediateprice;
        }

        public void setProductImmediateprice(String productImmediateprice) {
            this.productImmediateprice = productImmediateprice;
        }

        public String getProdutQuantity() {
            return produtQuantity;
        }

        public void setProdutQuantity(String produtQuantity) {
            this.produtQuantity = produtQuantity;
        }

        public String getProductImage1() {
            return productImage1;
        }

        public void setProductImage1(String productImage1) {
            this.productImage1 = productImage1;
        }

        public String getProductImage2() {
            return productImage2;
        }

        public void setProductImage2(String productImage2) {
            this.productImage2 = productImage2;
        }

        public String getProductRegion() {
            return productRegion;
        }

        public void setProductRegion(String productRegion) {
            this.productRegion = productRegion;
        }

        public String getProductDiscount() {
            return productDiscount;
        }

        public void setProductDiscount(String productDiscount) {
            this.productDiscount = productDiscount;
        }

        public String getProductSkuid() {
            return productSkuid;
        }

        public void setProductSkuid(String productSkuid) {
            this.productSkuid = productSkuid;
        }

        public Object getProductThumbnail1() {
            return productThumbnail1;
        }

        public void setProductThumbnail1(Object productThumbnail1) {
            this.productThumbnail1 = productThumbnail1;
        }

        public Object getProductThumbnail2() {
            return productThumbnail2;
        }

        public void setProductThumbnail2(Object productThumbnail2) {
            this.productThumbnail2 = productThumbnail2;
        }

        public Object getProductThumbnailstatus() {
            return productThumbnailstatus;
        }

        public void setProductThumbnailstatus(Object productThumbnailstatus) {
            this.productThumbnailstatus = productThumbnailstatus;
        }

        public String getProductStatus() {
            return productStatus;
        }

        public void setProductStatus(String productStatus) {
            this.productStatus = productStatus;
        }

        public String getProductSerial() {
            return productSerial;
        }

        public void setProductSerial(String productSerial) {
            this.productSerial = productSerial;
        }
    }
}