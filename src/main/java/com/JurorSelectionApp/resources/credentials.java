package com.JurorSelectionApp.resources;

public class credentials {
  //public static String DatabaseURL = "jdbc:mysql://localhost:3306/jurorselectionapplication?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
  public static String DatabaseURL = "jdbc:mysql://us-cdbr-east-03.cleardb.com/heroku_08425c492f42421?reconnect=true";
  //public static String DatabasePassword = "";
  public static String DatabasePassword = "4df9e068";
  //public static String DatabaseUsername = "root";
  public static String DatabaseUsername = "bd7e3051eefc04";

  //mysql://bd7e3051eefc04:4df9e068@us-cdbr-east-03.cleardb.com/heroku_08425c492f42421?reconnect=true
  //jdbc:mysql://us-cdbr-east-03.cleardb.com/heroku_08425c492f42421?reconnect=true
  
  //Twitter access tokens
  public static String AccessToken = "1239719404088299525-jiEv8stzv85qToF6FYKJtbwZIAl0gJ";
  public static String AccessTokenSecret = "r5tzVEfewhx4Ed0ZXa1LyArMF8WqSusf66Zewi8nde6Gd";

  //Twitter consumer Keys
  public static String APIKey = "jf17zQrbUvhFZBR4lNLWagB2n";
  public static String APIKeySecret = "e6UctqDOsbuwv19FqUbNeCvIOWRqz97oOQGBKjUb6yuWhpL3Es";

  public static String getDatabaseURL() {
		return DatabaseURL;
	}
  public static String getDatabasePassword() {
		return DatabasePassword;
	}
  public static String getDatabaseUsername() {
		return DatabaseUsername;
	}
  public static String getTwitterAccessToken() {
		return AccessToken;
	}
  public static String getTwitterAccessTokenSecret() {
		return AccessTokenSecret;
	}
  public static String getTwitterAPIKey() {
		return APIKey;
	}
  public static String getTwitterAPIKeySecret() {
		return APIKeySecret;
	}

}
