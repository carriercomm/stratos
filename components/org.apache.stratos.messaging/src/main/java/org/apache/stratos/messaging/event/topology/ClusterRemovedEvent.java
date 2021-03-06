/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.stratos.messaging.event.topology;

import java.io.Serializable;

/**
 * This event is fired by Cloud Controller when a cluster is removed from the topology.
 */
public class ClusterRemovedEvent extends TopologyEvent implements Serializable {
    private static final long serialVersionUID = -1053510100805886845L;

    private final String serviceName;
    private final String clusterId;
    private final String deploymentPolicy;
    private final boolean isLbCluster;

    public ClusterRemovedEvent(String serviceName, String clusterId, String deploymentPolicy, boolean isLbCluster) {
        this.serviceName = serviceName;
        this.clusterId = clusterId;
        this.isLbCluster = isLbCluster;
        this.deploymentPolicy = deploymentPolicy;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getClusterId() {
        return clusterId;
    }

    public boolean isLbCluster() {
        return isLbCluster;
    }

	public String getDeploymentPolicy() {
		return deploymentPolicy;
	}
	
}
