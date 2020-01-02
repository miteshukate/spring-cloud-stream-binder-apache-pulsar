/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.binder.pulsar.streams;

import org.apache.pulsar.client.api.*;
import org.springframework.cloud.stream.binder.*;

class PulsarStreamBinder extends AbstractBinder<Message, ExtendedConsumerProperties<String>, ExtendedProducerProperties<String>>
       {

           @Override
           protected Binding<Message> doBindConsumer(String name, String group, Message inputTarget, ExtendedConsumerProperties<String> properties) {
               return null;
           }

           @Override
           protected Binding<Message> doBindProducer(String name, Message outboundBindTarget, ExtendedProducerProperties<String> properties) {
               return null;
           }
       }
