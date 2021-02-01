package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSellerRatingByUser {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("sellerrating")
        @Expose
        private List<Sellerrating> sellerrating = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Sellerrating> getSellerrating() {
            return sellerrating;
        }

        public void setSellerrating(List<Sellerrating> sellerrating) {
            this.sellerrating = sellerrating;
        }


    public class Sellerrating {

        @SerializedName("sellerrating_id")
        @Expose
        private String sellerratingId;
        @SerializedName("sellerrating_user_serial")
        @Expose
        private String sellerratingUserSerial;
        @SerializedName("sellerrating_rating")
        @Expose
        private String sellerratingRating;
        @SerializedName("sellerrating_comments")
        @Expose
        private String sellerratingComments;
        @SerializedName("sellerrating_updatedby")
        @Expose
        private String sellerratingUpdatedby;

        public String getSellerratingId() {
            return sellerratingId;
        }

        public void setSellerratingId(String sellerratingId) {
            this.sellerratingId = sellerratingId;
        }

        public String getSellerratingUserSerial() {
            return sellerratingUserSerial;
        }

        public void setSellerratingUserSerial(String sellerratingUserSerial) {
            this.sellerratingUserSerial = sellerratingUserSerial;
        }

        public String getSellerratingRating() {
            return sellerratingRating;
        }

        public void setSellerratingRating(String sellerratingRating) {
            this.sellerratingRating = sellerratingRating;
        }

        public String getSellerratingComments() {
            return sellerratingComments;
        }

        public void setSellerratingComments(String sellerratingComments) {
            this.sellerratingComments = sellerratingComments;
        }

        public String getSellerratingUpdatedby() {
            return sellerratingUpdatedby;
        }

        public void setSellerratingUpdatedby(String sellerratingUpdatedby) {
            this.sellerratingUpdatedby = sellerratingUpdatedby;
        }
    }
}
