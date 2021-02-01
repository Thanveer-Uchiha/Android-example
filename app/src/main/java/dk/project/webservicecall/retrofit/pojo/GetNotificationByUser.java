package dk.project.webservicecall.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetNotificationByUser {

        @SerializedName("response")
        @Expose
        private Boolean response;
        @SerializedName("notifications")
        @Expose
        private List<Notification> notifications = null;

        public Boolean getResponse() {
            return response;
        }

        public void setResponse(Boolean response) {
            this.response = response;
        }

        public List<Notification> getNotifications() {
            return notifications;
        }

        public void setNotifications(List<Notification> notifications) {
            this.notifications = notifications;
        }

    public class Notification {

        @SerializedName("notification_id")
        @Expose
        private String notificationId;
        @SerializedName("notification_title")
        @Expose
        private String notificationTitle;
        @SerializedName("notification_desc")
        @Expose
        private String notificationDesc;
        @SerializedName("notification_userserial")
        @Expose
        private String notificationUserserial;
        @SerializedName("notification_imageurl")
        @Expose
        private String notificationImageurl;
        @SerializedName("notification_isread")
        @Expose
        private String notificationIsread;

        public String getNotificationId() {
            return notificationId;
        }

        public void setNotificationId(String notificationId) {
            this.notificationId = notificationId;
        }

        public String getNotificationTitle() {
            return notificationTitle;
        }

        public void setNotificationTitle(String notificationTitle) {
            this.notificationTitle = notificationTitle;
        }

        public String getNotificationDesc() {
            return notificationDesc;
        }

        public void setNotificationDesc(String notificationDesc) {
            this.notificationDesc = notificationDesc;
        }

        public String getNotificationUserserial() {
            return notificationUserserial;
        }

        public void setNotificationUserserial(String notificationUserserial) {
            this.notificationUserserial = notificationUserserial;
        }

        public String getNotificationImageurl() {
            return notificationImageurl;
        }

        public void setNotificationImageurl(String notificationImageurl) {
            this.notificationImageurl = notificationImageurl;
        }

        public String getNotificationIsread() {
            return notificationIsread;
        }

        public void setNotificationIsread(String notificationIsread) {
            this.notificationIsread = notificationIsread;
        }

    }
}
