/*
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
package com.speedment.common.tuple.internal.nullable.mapper;

import com.speedment.common.tuple.TuplesOfNullables;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

final class Tuple3OfNullablesMapperImplTest {
    
    private final Function<Integer, Integer> m0 = i -> i + 0;
    private final Function<Integer, Integer> m1 = i -> i + 1;
    private final Function<Integer, Integer> m2 = i -> i + 2;
    private final Tuple3OfNullablesMapperImpl<Integer, Integer, Integer, Integer> instance = new Tuple3OfNullablesMapperImpl<>(m0, m1, m2);
    
    @Test
    void degree() {
        assertEquals(3, instance.degree());
    }
    
    @Test
    void apply() {
        assertEquals(TuplesOfNullables.ofNullables(0, 1, 2), instance.apply(0));
    }
    
    @Test
    void get0() {
        assertEquals(m0, instance.get0());
    }
    
    @Test
    void get1() {
        assertEquals(m1, instance.get1());
    }
    
    @Test
    void get2() {
        assertEquals(m2, instance.get2());
    }
}