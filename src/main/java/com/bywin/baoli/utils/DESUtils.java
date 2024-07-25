
package com.bywin.baoli.utils;

import cn.hutool.core.codec.Base64;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * 加解密工具类
 */
public class DESUtils {
    public static final String KEY = "wang!@#$%";
    public static final String REGISTER_KEY = "jkdj!@#$%";
    private static final String DES = "DES";

    public DESUtils() {
    }

    public static String encrypt(String data, String key) throws Exception {
        Cipher cipher = null;

        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(1, generateKey(key));
        } catch (NoSuchAlgorithmException var6) {
            var6.printStackTrace();
        } catch (NoSuchPaddingException var7) {
            var7.printStackTrace();
        } catch (InvalidKeyException var8) {
            var8.printStackTrace();
        } catch (InvalidKeySpecException var9) {
            var9.printStackTrace();
        }

        try {
            byte[] buf = cipher.doFinal(data.getBytes("UTF-8"));
            return DESUtils.Base64Utils.encode(buf);
        } catch (IllegalBlockSizeException var4) {
            var4.printStackTrace();
            throw new Exception("IllegalBlockSizeException", var4);
        } catch (BadPaddingException var5) {
            var5.printStackTrace();
            throw new Exception("BadPaddingException", var5);
        }
    }

    public static String decrypt(String data, String key) throws Exception {
        Cipher cipher = null;

        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(2, generateKey(key));
        } catch (NoSuchAlgorithmException var6) {
            var6.printStackTrace();
            throw new Exception("NoSuchAlgorithmException", var6);
        } catch (NoSuchPaddingException var7) {
            var7.printStackTrace();
            throw new Exception("NoSuchPaddingException", var7);
        } catch (InvalidKeyException var8) {
            var8.printStackTrace();
            throw new Exception("InvalidKeyException", var8);
        }

        try {
            byte[] buf = cipher.doFinal(DESUtils.Base64Utils.decode(data.toCharArray()));
            return new String(buf);
        } catch (IllegalBlockSizeException var4) {
            var4.printStackTrace();
            throw new Exception("IllegalBlockSizeException", var4);
        } catch (BadPaddingException var5) {
            var5.printStackTrace();
            throw new Exception("BadPaddingException", var5);
        }
    }

    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        SecureRandom sr = new SecureRandom();
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(1, securekey, sr);
        return cipher.doFinal(data);
    }

    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        SecureRandom sr = new SecureRandom();
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, securekey, sr);
        return cipher.doFinal(data);
    }

    private static SecretKey generateKey(String secretKey) throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        DESKeySpec keySpec = new DESKeySpec(secretKey.getBytes());
        keyFactory.generateSecret(keySpec);
        return keyFactory.generateSecret(keySpec);
    }

    public static void main(String[] args) {
        String key = "jkdj!@#$%";

        try {
            System.out.println(encrypt(Base64.encode("435689012345677"), key));
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        String str = "uPmTMsRgWs02yC9/+98kkVy65UbqqTNg";

        try {
            System.out.println(Base64.decode(decrypt(str, key)));
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    static class Base64Utils {
        private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        private static byte[] codes = new byte[256];

        Base64Utils() {
        }

        public static String encode(byte[] data) {
            char[] out = new char[(data.length + 2) / 3 * 4];
            int i = 0;

            for (int index = 0; i < data.length; index += 4) {
                boolean quad = false;
                boolean trip = false;
                int val = 255 & data[i];
                val <<= 8;
                if (i + 1 < data.length) {
                    val |= 255 & data[i + 1];
                    trip = true;
                }

                val <<= 8;
                if (i + 2 < data.length) {
                    val |= 255 & data[i + 2];
                    quad = true;
                }

                out[index + 3] = alphabet[quad ? val & 63 : 64];
                val >>= 6;
                out[index + 2] = alphabet[trip ? val & 63 : 64];
                val >>= 6;
                out[index + 1] = alphabet[val & 63];
                val >>= 6;
                out[index + 0] = alphabet[val & 63];
                i += 3;
            }

            return new String(out);
        }

        public static byte[] decode(char[] data) {
            int len = (data.length + 3) / 4 * 3;
            if (data.length > 0 && data[data.length - 1] == '=') {
                --len;
            }

            if (data.length > 1 && data[data.length - 2] == '=') {
                --len;
            }

            byte[] out = new byte[len];
            int shift = 0;
            int accum = 0;
            int index = 0;

            for (int ix = 0; ix < data.length; ++ix) {
                int value = codes[data[ix] & 255];
                if (value >= 0) {
                    accum <<= 6;
                    shift += 6;
                    accum |= value;
                    if (shift >= 8) {
                        shift -= 8;
                        out[index++] = (byte) (accum >> shift & 255);
                    }
                }
            }

            if (index != out.length) {
                throw new Error("miscalculated data length!");
            } else {
                return out;
            }
        }

        static {
            int i;
            for (i = 0; i < 256; ++i) {
                codes[i] = -1;
            }

            for (i = 65; i <= 90; ++i) {
                codes[i] = (byte) (i - 65);
            }

            for (i = 97; i <= 122; ++i) {
                codes[i] = (byte) (26 + i - 97);
            }

            for (i = 48; i <= 57; ++i) {
                codes[i] = (byte) (52 + i - 48);
            }

            codes[43] = 62;
            codes[47] = 63;
        }
    }
}
