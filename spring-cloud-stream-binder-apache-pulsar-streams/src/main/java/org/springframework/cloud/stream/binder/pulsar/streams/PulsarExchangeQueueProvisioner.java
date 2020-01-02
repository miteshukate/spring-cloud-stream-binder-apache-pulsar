package org.springframework.cloud.stream.binder.pulsar.streams;

import org.springframework.cloud.stream.binder.ExtendedConsumerProperties;
import org.springframework.cloud.stream.binder.ExtendedProducerProperties;
import org.springframework.cloud.stream.provisioning.ConsumerDestination;
import org.springframework.cloud.stream.provisioning.ProducerDestination;
import org.springframework.cloud.stream.provisioning.ProvisioningException;
import org.springframework.cloud.stream.provisioning.ProvisioningProvider;

public class PulsarExchangeQueueProvisioner implements ProvisioningProvider<ExtendedConsumerProperties<PulsarConsumerProperties>, ExtendedProducerProperties<PulsarProducerProperties>> {
    @Override
    public ProducerDestination provisionProducerDestination(String name, ExtendedProducerProperties<PulsarProducerProperties> properties) throws ProvisioningException {
        return null;
    }

    @Override
    public ConsumerDestination provisionConsumerDestination(String name, String group, ExtendedConsumerProperties<PulsarConsumerProperties> properties) throws ProvisioningException {
        return null;
    }
}
