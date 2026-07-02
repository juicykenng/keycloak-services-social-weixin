package org.keycloak.social.weixin.egress.wechat.mp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessTokenResponse {
    public String access_token;
    public String expires_in;
    public Integer errcode;
    public String errmsg;

    public boolean hasError() {
        return errcode != null && errcode != 0;
    }
}
