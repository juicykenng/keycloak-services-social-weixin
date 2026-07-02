package org.keycloak.social.weixin;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.List;

public class WeiXinIdentityProviderFactory extends
        AbstractIdentityProviderFactory<WeiXinIdentityProvider> implements
        SocialIdentityProviderFactory<WeiXinIdentityProvider> {

    public static final String PROVIDER_ID = "weixin";

    @Override
    public String getName() {
        return "微信登录";
    }

    @Override
    public WeiXinIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new WeiXinIdentityProvider(session, new WeixinIdentityProviderConfig(model));
    }

    @Override
    public WeixinIdentityProviderConfig createConfig() {
        return new WeixinIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return WeiXinIdentityProviderConfigProperties.build();
    }
}
