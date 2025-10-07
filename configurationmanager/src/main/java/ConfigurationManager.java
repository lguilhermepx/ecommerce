public class ConfigurationManager {
}
package java;

public class ConfigurationManager {

    private static  ConfigurationManager instance;
    private String appName = "Meu App Padrão";
    private String themeColor = "Claro";

    private ConfigurationManager() {
        // Construtor privado para evitar instanciação direta.
    }

    // método público e estático que fornece acesso à instância.
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }

        return instance;
    }

    // Getters e Setters
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }
}