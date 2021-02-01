package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserSignInResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("userresults")
    @Expose
    private List<Userresult> userresults = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Userresult> getUserresults() {
        return userresults;
    }

    public void setUserresults(List<Userresult> userresults) {
        this.userresults = userresults;
    }

    public class Userresult {

        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("lastname")
        @Expose
        private String lastname;
        @SerializedName("dateofbirth")
        @Expose
        private String dateofbirth;
        @SerializedName("housenumber")
        @Expose
        private String housenumber;
        @SerializedName("street")
        @Expose
        private String street;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("zipcode")
        @Expose
        private String zipcode;
        @SerializedName("emailid")
        @Expose
        private String emailid;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("usertype")
        @Expose
        private String usertype;
        @SerializedName("user_serial")
        @Expose
        private String userSerial;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getDateofbirth() {
            return dateofbirth;
        }

        public void setDateofbirth(String dateofbirth) {
            this.dateofbirth = dateofbirth;
        }

        public String getHousenumber() {
            return housenumber;
        }

        public void setHousenumber(String housenumber) {
            this.housenumber = housenumber;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

        public String getUserSerial() {
            return userSerial;
        }

        public void setUserSerial(String userSerial) {
            this.userSerial = userSerial;
        }

    }

}
