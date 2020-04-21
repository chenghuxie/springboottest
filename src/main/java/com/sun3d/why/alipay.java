package com.sun3d.why;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeCreateRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;

/**
 * Created by xiech on 2019/7/23 0023.
 */
public class alipay {
    private static  String APP_ID="2016101000652218";
    private static  String APP_PRIVATE_KEY="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCQhbgVq61dWO4xd1VbSEZy3oQwSDNlW92g9/Llcb9nVlQXeXaTnzVoX8qlpJsecQIlRfpQU0mPBrSu75B++oT5ZhkZF2Z0LT9xgNO1SKPnrrsNFweRqKibMKxqqTmtoGFDz+VLibMSetbi+r7uez5I/DwA4G92l9WwDUBwY8m8MIxJ82pdM7mzsv8rs2BjyxcGVDoW0wjSpZ56H+WUOHInViqDrejdkIOtPcP7+/ZyAxsnieEutcTd/Z0jtjfRtyZCveKzYzQAlL5WbLW3lCefi3xuJfAvadHFd7kfmBJo/DrdxNuLXzYTpdiqi2I54BSCAG9qK3hBEYBfK8ZHt1dPAgMBAAECggEBAIScHlDMKZSY8F81V34d8H6gjPzck0RzKgb03M0KNY31mc28Z0CHevMdyo15X9hr64MWFdw0wC9cANjv+094QiGyPF9YqGr7xdY5VolmcPc6zmnxcsGF18gmvl5UjxcxLW6SyZwpasYPLzQwzpd3QKypvck0JzLTmYEkd7do6QgiwM9AWUi5WMsxSO008/YsFClv6ePsfzgiGP1VIj4ZrLcsnETwBAYq023c9D6YTFeJ0QjojTyyAugmFJ0Y8cPK+USxsuPiHJfQNeW60u8tQiGLFHQZedS57TBLA4U0G8kwij77l5mY7hdyEpV7HJI2BrYSZQkrvFsI/W575g+OS8ECgYEA55f2lC3JwQQDB/7PbvqRu1RsRW+LyaNy1v/colTgtwPt4XD2JPOr82DFMMbIF8mP0IueYvuOuu0lBqLR9kNo6fSqCxAGrY/ZQ6pltvbVKDQckJMVyzgDC9S0OBQMfBcAr1bR46NRyDwzpNaILud2s6V3WHsSM9PYL/hhVDEyTeECgYEAn8C1PjCYQJYRYC7PlKTwJLMeeHZLawv2Cd6KzPRo56asXOeRGBRq4pF6DUGWo4PVn5yMJXbJvf94HWJiCV4hFsEvX+wNG24lFgSEL0vmpZ4Cx0yhNHlgKqQWog7SDx9TfHEqkD/zV8v6ECN+Xt7c+tx4oIDuNGDfYqZPNYquay8CgYEAp5xkuhN1a/sCUpwI9rHkHObZwVscmV9w8seUn+u8AtiWJk4B5vZv4SGNNWL4V7bqHa2egNa9Eu4kmOvn90oMOR54nq8Hlj+Ap6dAHC4CUSl97uh0onI0SjC0Cc4AxyJCvaOhHhYKT1e6rLcTMpcUYqoDeQcBQn80fGtPzYYZeSECgYBNiZouiiWLy4q5dV75VajdFzcl3ryyQ0by+VnDKqm0Ldig6yAoYNiUCWoE/x2fVcCczL3U/TfkCRgCoxrUUySaR7+3vfmKo8ZKTnzd++gB4JSWqSHhNzwu1h/KHolkH59E2iR/iRqSNYW0yZVvdJorBFFkDdAQCijCV9hAM4R+rwKBgQCfUHciGzOk38NCEnhAhauUUAAx+fQ8/S/CnzH/PXkVCFd+32dUqLHGlaY51OAHHvCn7w5B7UBKmPI+Mleqi4PFnvFGb8U6h8HTwzewbqptBh4PmiG+2TthTuYXRte72xDKx0z8t49tP1RKOmZdcZzt5cYRMocGM5/E7kGb/lhBmA==";
    private static  String APP_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkIW4FautXVjuMXdVW0hGct6EMEgzZVvdoPfy5XG/Z1ZUF3l2k581aF/KpaSbHnECJUX6UFNJjwa0ru+QfvqE+WYZGRdmdC0/cYDTtUij5667DRcHkaiomzCsaqk5raBhQ8/lS4mzEnrW4vq+7ns+SPw8AOBvdpfVsA1AcGPJvDCMSfNqXTO5s7L/K7NgY8sXBlQ6FtMI0qWeeh/llDhyJ1Yqg63o3ZCDrT3D+/v2cgMbJ4nhLrXE3f2dI7Y30bcmQr3is2M0AJS+Vmy1t5Qnn4t8biXwL2nRxXe5H5gSaPw63cTbi182E6XYqotiOeAUggBvait4QRGAXyvGR7dXTwIDAQAB";
    public static void main(String[] args) throws AlipayApiException {
        //
        AlipayClient alipayClient=new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",APP_ID,APP_PRIVATE_KEY,"json","utf-8",APP_PUBLIC_KEY,"RSA2");
        //创建api对应的request类
        AlipayTradePrecreateRequest request=new AlipayTradePrecreateRequest();
        request.setBizContent("{" +
                "    \"out_trade_no\":\"20150320010101001\"," +
                "    \"total_amount\":\"88.88\"," +
                "    \"subject\":\"Iphone6 16G\"," +
                "    }");
        //通过alipayClient调用API ,获取对应的response类
        AlipayTradePrecreateResponse response=alipayClient.execute(request);
        System.out.println(response.getBody());
    }
}
