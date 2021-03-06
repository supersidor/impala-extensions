/*
 * Copyright 2009-2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.impalaframework.extension.mvc.annotation.collector;

import org.springframework.beans.TypeConverter;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * {@link ArgumentCollector} based on {@link ModelAttribute} annotation.
 * @author Phil Zoio
 */
public class ModelAttributeArgumentCollector implements ArgumentCollector {
    
    private String attributeName;

    public ModelAttributeArgumentCollector(ModelAttribute annotation) {
        super();
        attributeName = annotation.value();
    }

    public Object getArgument(NativeWebRequest request, ExtendedModelMap implicitModel, TypeConverter typeConverter) {
        return implicitModel.get(attributeName);
    }
}
