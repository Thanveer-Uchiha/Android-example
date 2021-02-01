package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetGradingScalesByGrader {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("gradingscales")
        @Expose
        private List<Gradingscale> gradingscales = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Gradingscale> getGradingscales() {
            return gradingscales;
        }

        public void setGradingscales(List<Gradingscale> gradingscales) {
            this.gradingscales = gradingscales;
        }


    public class Gradingscale {

        @SerializedName("gradingscale_id")
        @Expose
        private String gradingscaleId;
        @SerializedName("gradingscale_grader")
        @Expose
        private String gradingscaleGrader;
        @SerializedName("gradingscale_value")
        @Expose
        private String gradingscaleValue;
        @SerializedName("gradingscale_points")
        @Expose
        private String gradingscalePoints;

        public String getGradingscaleId() {
            return gradingscaleId;
        }

        public void setGradingscaleId(String gradingscaleId) {
            this.gradingscaleId = gradingscaleId;
        }

        public String getGradingscaleGrader() {
            return gradingscaleGrader;
        }

        public void setGradingscaleGrader(String gradingscaleGrader) {
            this.gradingscaleGrader = gradingscaleGrader;
        }

        public String getGradingscaleValue() {
            return gradingscaleValue;
        }

        public void setGradingscaleValue(String gradingscaleValue) {
            this.gradingscaleValue = gradingscaleValue;
        }

        public String getGradingscalePoints() {
            return gradingscalePoints;
        }

        public void setGradingscalePoints(String gradingscalePoints) {
            this.gradingscalePoints = gradingscalePoints;
        }
    }
}
