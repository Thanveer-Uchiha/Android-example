package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceProductPurchase {

        @SerializedName("respose")
        @Expose
        private Boolean respose;
        @SerializedName("message")
        @Expose
        private String message;

        public Boolean getRespose() {
            return respose;
        }

        public void setRespose(Boolean respose) {
            this.respose = respose;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

}
