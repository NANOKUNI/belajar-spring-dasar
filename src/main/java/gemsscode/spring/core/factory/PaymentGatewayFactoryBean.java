package gemsscode.spring.core.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import gemsscode.spring.core.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        // TODO Auto-generated method stub
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndPoint("https://example.com");
        client.setPrivateKey("private");
        client.setPublicKey("public");

        return client;
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return PaymentGatewayClient.class;
    }

}