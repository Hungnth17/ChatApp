package com.example.chatapp.ulities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "user";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGN_IN = "isSignIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN = "fcmtoken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVED_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COVERSATIONS = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME ="receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";
    public static final String KEY_AVAILABILITY = "avaialbility";
    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";
    public static HashMap<String,String> remoteMsgHeaders = null;
    public static HashMap<String,String> getRemoteMsgHeaders() {
     if (remoteMsgHeaders ==null) {
         remoteMsgHeaders = new HashMap<>();
         remoteMsgHeaders.put(
                 REMOTE_MSG_AUTHORIZATION,
                 "key=AAAA2W-qJRc:APA91bE2erw7euaXRXP2EGT7WIU4dDTJZFYE3sxqqnQvu3X58FInXztLVNHoAH3yRaxb4lpp0DYAHzKObYy519UE6ERj5TLJ9n53T9vOSqsyHAKX949fSu-uMPxqjWXc8hnp5fb1n6FT"
         );
         remoteMsgHeaders.put(
                 REMOTE_MSG_CONTENT_TYPE,
                 "application/json"
         );
     }
     return  remoteMsgHeaders;
    }

}
