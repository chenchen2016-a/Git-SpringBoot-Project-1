package chen.springboot.helloworld.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static String encrypt(String encryptPassword, String message) {
        //创建加密实体
        BasicTextEncryptor encrypt = new BasicTextEncryptor();
        //设置加密用的”盐“
        encrypt.setPassword(encryptPassword);
        //获取加密字段
        String str = encrypt.encrypt(message);
        System.out.println("加密字段信息："+str);
        return str;
    }

    public static void main(String[] args) {
        JasyptUtil.encrypt("1234567!#@","chenchen");
        JasyptUtil.encrypt("1234567!#@","089465438");
    }
}
