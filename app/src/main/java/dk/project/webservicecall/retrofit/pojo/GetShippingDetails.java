package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetShippingDetails {

        @SerializedName("success")
        @Expose
        private Boolean success;
        @SerializedName("shippingresults")
        @Expose
        private List<Shippingresult> shippingresults = null;

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public List<Shippingresult> getShippingresults() {
            return shippingresults;
        }

        public void setShippingresults(List<Shippingresult> shippingresults) {
            this.shippingresults = shippingresults;
        }

    public class Shippingresult {

        @SerializedName("shipping_personname")
        @Expose
        private String shippingPersonname;
        @SerializedName("shipping_street")
        @Expose
        private String shippingStreet;
        @SerializedName("shipping_housenumber")
        @Expose
        private String shippingHousenumber;
        @SerializedName("shipping_postalcode")
        @Expose
        private String shippingPostalcode;
        @SerializedName("shipping_city")
        @Expose
        private String shippingCity;
        @SerializedName("shipping_country")
        @Expose
        private String shippingCountry;
        @SerializedName("shipping_phonenumber")
        @Expose
        private String shippingPhonenumber;
        @SerializedName("shipping_emailid")
        @Expose
        private String shippingEmailid;
        @SerializedName("shipping_orderserial")
        @Expose
        private String shippingOrderserial;

        public String getShippingPersonname() {
            return shippingPersonname;
        }

        public void setShippingPersonname(String shippingPersonname) {
            this.shippingPersonname = shippingPersonname;
        }

        public String getShippingStreet() {
            return shippingStreet;
        }

        public void setShippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
        }

        public String getShippingHousenumber() {
            return shippingHousenumber;
        }

        public void setShippingHousenumber(String shippingHousenumber) {
            this.shippingHousenumber = shippingHousenumber;
        }

        public String getShippingPostalcode() {
            return shippingPostalcode;
        }

        public void setShippingPostalcode(String shippingPostalcode) {
            this.shippingPostalcode = shippingPostalcode;
        }

        public String getShippingCity() {
            return shippingCity;
        }

        public void setShippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
        }

        public String getShippingCountry() {
            return shippingCountry;
        }

        public void setShippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
        }

        public String getShippingPhonenumber() {
            return shippingPhonenumber;
        }

        public void setShippingPhonenumber(String shippingPhonenumber) {
            this.shippingPhonenumber = shippingPhonenumber;
        }

        public String getShippingEmailid() {
            return shippingEmailid;
        }

        public void setShippingEmailid(String shippingEmailid) {
            this.shippingEmailid = shippingEmailid;
        }

        public String getShippingOrderserial() {
            return shippingOrderserial;
        }

        public void setShippingOrderserial(String shippingOrderserial) {
            this.shippingOrderserial = shippingOrderserial;
        }

    }
}
