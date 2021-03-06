package org.fossasia.susi.ai.rest.responses.susi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by saurabh on 12/10/16.
 */

public class SignUpResponse {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("session")
    @Expose
    private Session session;

    public String getMessage() {
        return message;
    }

    public Session getSession() {
        return session;
    }
}
