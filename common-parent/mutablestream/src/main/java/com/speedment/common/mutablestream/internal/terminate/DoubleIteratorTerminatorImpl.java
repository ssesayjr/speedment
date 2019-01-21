/**
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
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
package com.speedment.common.mutablestream.internal.terminate;

import com.speedment.common.mutablestream.HasNext;
import com.speedment.common.mutablestream.terminate.DoubleIteratorTerminator;
import java.util.PrimitiveIterator;
import java.util.stream.DoubleStream;

/**
 * 
 * @author  Emil Forslund
 * @since   1.0.0
 */
public final class DoubleIteratorTerminatorImpl
extends AbstractTerminator<Double, DoubleStream, PrimitiveIterator.OfDouble> 
implements DoubleIteratorTerminator {

    public DoubleIteratorTerminatorImpl(HasNext<Double, DoubleStream> previous, boolean parallel) {
        super(previous, parallel);
    }

    @Override
    public PrimitiveIterator.OfDouble execute() {
        try (final DoubleStream stream = buildPrevious()) {
            return stream.iterator();
        }
    }
}