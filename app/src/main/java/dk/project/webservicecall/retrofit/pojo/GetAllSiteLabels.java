package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllSiteLabels {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("sitelabel")
        @Expose
        private List<Sitelabel> sitelabel = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Sitelabel> getSitelabel() {
            return sitelabel;
        }

        public void setSitelabel(List<Sitelabel> sitelabel) {
            this.sitelabel = sitelabel;
        }

    public class Sitelabel {

        @SerializedName("sitelabel_id")
        @Expose
        private String sitelabelId;
        @SerializedName("sitelabel_description")
        @Expose
        private String sitelabelDescription;
        @SerializedName("sitelabel_value")
        @Expose
        private String sitelabelValue;

        public String getSitelabelId() {
            return sitelabelId;
        }

        public void setSitelabelId(String sitelabelId) {
            this.sitelabelId = sitelabelId;
        }

        public String getSitelabelDescription() {
            return sitelabelDescription;
        }

        public void setSitelabelDescription(String sitelabelDescription) {
            this.sitelabelDescription = sitelabelDescription;
        }

        public String getSitelabelValue() {
            return sitelabelValue;
        }

        public void setSitelabelValue(String sitelabelValue) {
            this.sitelabelValue = sitelabelValue;
        }
    }
}
