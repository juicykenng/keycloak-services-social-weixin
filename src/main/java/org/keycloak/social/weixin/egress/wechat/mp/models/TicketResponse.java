package org.keycloak.social.weixin.egress.wechat.mp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketResponse {
    public String ticket;
    public Number expire_seconds;
    public String url;
    public Integer errcode;
    public String errmsg;

    public boolean hasError() {
        return errcode != null && errcode != 0;
    }
}
