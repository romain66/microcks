/*
 * Licensed to Laurent Broudoux (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.github.microcks.web.dto;

import io.github.microcks.domain.ParameterConstraint;

import java.util.List;

/**
 * Data Transfer object for grouping the mutable properties of an Operation.
 * @author laurent
 */
public class OperationOverrideDTO {

   private String dispatcher;
   private String dispatcherRules;
   private Long defaultDelay;
   private List<ParameterConstraint> parameterConstraints;

   public String getDispatcher() {
      return dispatcher;
   }

   public void setDispatcher(String dispatcher) {
      this.dispatcher = dispatcher;
   }

   public String getDispatcherRules() {
      return dispatcherRules;
   }

   public void setDispatcherRules(String dispatcherRules) {
      this.dispatcherRules = dispatcherRules;
   }

   public Long getDefaultDelay() {
      return defaultDelay;
   }

   public void setDefaultDelay(Long defaultDelay) {
      this.defaultDelay = defaultDelay;
   }

   public List<ParameterConstraint> getParameterConstraints() {
      return parameterConstraints;
   }

   public void setParameterConstraints(List<ParameterConstraint> parameterConstraints) {
      this.parameterConstraints = parameterConstraints;
   }
}
