package encrypt.springboot.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author mark
 * @description:
 * @menu
 * @date 2022/6/20 18:06
 */
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {

    private String key ;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
