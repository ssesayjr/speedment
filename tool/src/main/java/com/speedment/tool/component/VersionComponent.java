/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.tool.component;

import com.speedment.internal.common.injector.annotation.InjectKey;
import com.speedment.runtime.annotation.Api;
import com.speedment.runtime.component.Component;
import java.util.concurrent.CompletableFuture;

/**
 *
 * A component that communicates with the Maven Central to establish if there are 
 * any new versions of the software.
 * 
 * @author  Emil Forslund
 * @since   3.0.0
 */
@Api(version = "3.0")
@InjectKey(VersionComponent.class)
public interface VersionComponent extends Component {

    /**
     * Attempts to determine the latest released version of this software by
     * contacting the source code repository. The operation might never finish
     * for an example if there is no internet connection or if the repository
     * is down.
     * 
     * @return  a future in which the latest version has been established
     */
    CompletableFuture<String> latestVersion();
    
    @Override
    default Class<VersionComponent> getComponentClass() {
        return VersionComponent.class;
    }
}