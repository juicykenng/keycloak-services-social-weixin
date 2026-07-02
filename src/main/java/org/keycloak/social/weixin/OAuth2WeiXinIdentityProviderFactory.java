package org.keycloak.social.weixin;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.List;

public class OAuth2WeiXinIdentityProviderFactory extends AbstractIdentityProviderFactory<OAuth2WeiXinIdentityProvider> implements
    SocialIdentityProviderFactory<OAuth2WeiXinIdentityProvider> {

    public static final String PROVIDER_ID = "weixin-oauth2";

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getName() {
        return "WeiXin OAuth2";
    }

    @Override
    public OAuth2WeiXinIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new OAuth2WeiXinIdentityProvider(session, new WeixinIdentityProviderConfig(model));
    }

    @Override
    public WeixinIdentityProviderConfig createConfig() {
        return new WeixinIdentityProviderConfig();
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return WeiXinIdentityProviderConfigProperties.build();
    }

}