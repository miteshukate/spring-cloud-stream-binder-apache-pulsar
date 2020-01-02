package org.springframework.cloud.stream.binder.pulsar.streams;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.cloud.stream.binder.AbstractMessageChannelBinder;
import org.springframework.cloud.stream.binder.BinderSpecificPropertiesProvider;
import org.springframework.cloud.stream.binder.ConsumerProperties;
import org.springframework.cloud.stream.binder.ExtendedConsumerProperties;
import org.springframework.cloud.stream.binder.ExtendedProducerProperties;
import org.springframework.cloud.stream.binder.ExtendedPropertiesBinder;
import org.springframework.cloud.stream.binder.ProducerProperties;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.cloud.stream.config.MessageSourceCustomizer;
import org.springframework.cloud.stream.provisioning.ConsumerDestination;
import org.springframework.cloud.stream.provisioning.ProducerDestination;
import org.springframework.integration.core.MessageProducer;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

public class PulsarMessageChannelBinder  extends
        AbstractMessageChannelBinder<ExtendedConsumerProperties<PulsarConsumerProperties>, ExtendedProducerProperties<PulsarProducerProperties>, PulsarExchangeQueueProvisioner>
        implements
        ExtendedPropertiesBinder<MessageChannel, PulsarConsumerProperties, PulsarProducerProperties>, DisposableBean {

    public PulsarMessageChannelBinder(String[] headersToEmbed, PulsarExchangeQueueProvisioner provisioningProvider) {
        super(headersToEmbed, provisioningProvider);
    }

    public PulsarMessageChannelBinder(String[] headersToEmbed, PulsarExchangeQueueProvisioner provisioningProvider, ListenerContainerCustomizer<?> containerCustomizer, MessageSourceCustomizer<?> sourceCustomizer) {
        super(headersToEmbed, provisioningProvider, containerCustomizer, sourceCustomizer);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    protected MessageHandler createProducerMessageHandler(ProducerDestination destination, ExtendedProducerProperties<PulsarProducerProperties> producerProperties, MessageChannel errorChannel) throws Exception {
        return null;
    }

    @Override
    protected MessageProducer createConsumerEndpoint(ConsumerDestination destination, String group, ExtendedConsumerProperties<PulsarConsumerProperties> properties) throws Exception {
        return null;
    }

    @Override
    public PulsarConsumerProperties getExtendedConsumerProperties(String channelName) {
        return null;
    }

    @Override
    public PulsarProducerProperties getExtendedProducerProperties(String channelName) {
        return null;
    }

    @Override
    public String getDefaultsPrefix() {
        return null;
    }

    @Override
    public Class<? extends BinderSpecificPropertiesProvider> getExtendedPropertiesEntryClass() {
        return null;
    }
}
