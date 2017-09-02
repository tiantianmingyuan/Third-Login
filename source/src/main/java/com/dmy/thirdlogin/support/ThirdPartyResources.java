package com.dmy.thirdlogin.support;


/**
 * 加载配置
 */
public final class ThirdPartyResources {
   
    private static PropertiesLoader setting = new PropertiesLoader("/thirdParty.properties");
    //QQ配置信息
    public static final String AppIdQQ = setting.getValue("app_id_qq");
    public static final String AppKeyQQ = setting.getValue("app_key_qq");
    public static final String RedirectUrlQQ = setting.getValue("redirect_url_qq");
    public static final String ScopeQQ = setting.getValue("scope_qq");
    public static final String GETUserInfoURLQQ = setting.getValue("getUserInfoURL_qq");
    public static final String AccessTokenURLQQ = setting.getValue("accessTokenURL_qq");
    public static final String GetOpenIDURLQQ = setting.getValue("getOpenIDURL_qq");
    public static final String AuthorizeURLQQ = setting.getValue("authorizeURL_qq");
    
    //sina配置信息
    public static final String AppIdSina = setting.getValue("app_id_sina");
    public static final String AppKeySina = setting.getValue("app_key_sina");
    public static final String RedirectURLSina = setting.getValue("redirect_url_sina");
    public static final String ScopeSina = setting.getValue("scope_sina");
    public static final String GetUserInfoURLSina = setting.getValue("getUserInfoURL_sina");
    public static final String AccessTokenURLSina = setting.getValue("accessTokenURL_sina");
    public static final String AuthorizeURLSina = setting.getValue("authorizeURL_sina");
    
    
    //wx配置信息
    public static final String AppIdWX = setting.getValue("app_id_wx");
    public static final String AppKeyWX = setting.getValue("app_key_wx");
    public static final String RedirectUrlWX = setting.getValue("redirect_url_wx");
    public static final String ScopeWX = setting.getValue("scope_wx");
    public static final String GETUserInfoURLWX = setting.getValue("getUserInfoURL_wx");
    public static final String AccessTokenURLWX = setting.getValue("accessTokenURL_wx");
    public static final String AuthorizeURLWX = setting.getValue("authorizeURL_wx");
    
    
    //跳转页面
    public static final String ThirdLoginSuccess = setting.getValue("third_login_success");
    public static final String ThirdLoginFailure = setting.getValue("third_login_failure");
    public static final String ToBindUrl = setting.getValue("to_bind_url");
    
    
}
