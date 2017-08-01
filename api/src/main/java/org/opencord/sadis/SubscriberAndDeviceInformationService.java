/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opencord.sadis;

/**
 * Subscriber And Device Information Service.
 */
public interface SubscriberAndDeviceInformationService {

    /**
     * Removes all cached entries.
     */
    public void invalidateAll();

    /**
     * Return the information associated with the given ID.
     *
     * @param id
     *            key to information
     * @return information associated with ID, if available, else null
     */
    public SubscriberAndDeviceInformation get(String id);
}