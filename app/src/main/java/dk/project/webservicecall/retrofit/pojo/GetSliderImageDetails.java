package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSliderImageDetails {

        @SerializedName("success")
        @Expose
        private Boolean success;
        @SerializedName("sliderImages")
        @Expose
        private List<SliderImage> sliderImages = null;

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public List<SliderImage> getSliderImages() {
            return sliderImages;
        }

        public void setSliderImages(List<SliderImage> sliderImages) { this.sliderImages = sliderImages; }


    public class SliderImage {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("sliderimagename")
        @Expose
        private String sliderimagename;
        @SerializedName("sliderurl")
        @Expose
        private String sliderurl;
        @SerializedName("sliderstatus")
        @Expose
        private String sliderstatus;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSliderimagename() {
            return sliderimagename;
        }

        public void setSliderimagename(String sliderimagename) {
            this.sliderimagename = sliderimagename;
        }

        public String getSliderurl() {
            return sliderurl;
        }

        public void setSliderurl(String sliderurl) {
            this.sliderurl = sliderurl;
        }

        public String getSliderstatus() {
            return sliderstatus;
        }

        public void setSliderstatus(String sliderstatus) {
            this.sliderstatus = sliderstatus;
        }
    }
}
