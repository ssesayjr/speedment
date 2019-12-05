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
package com.speedment.common.tuple.nullable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter10;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter2;
import com.speedment.common.tuple.getter.TupleGetter3;
import com.speedment.common.tuple.getter.TupleGetter4;
import com.speedment.common.tuple.getter.TupleGetter5;
import com.speedment.common.tuple.getter.TupleGetter6;
import com.speedment.common.tuple.getter.TupleGetter7;
import com.speedment.common.tuple.getter.TupleGetter8;
import com.speedment.common.tuple.getter.TupleGetter9;
import com.speedment.common.tuple.getter.TupleGetter;

import java.util.Optional;

/**
 * This interface defines a generic {@link TupleOfNullables} of degree11 that
 * can hold null values. A TupleOfNullable is type safe, immutable and thread
 * safe. For pure non-null value elements see {@link Tuple}. For mutable tuples
 * see {@link MutableTuple}
 * This {@link TupleOfNullables} has a degree of 11
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TuplePattern
 * 
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * 
 * @author Per Minborg
 * 
 * @see Tuple
 * @see TupleOfNullables
 * @see MutableTuple
 */
public interface Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends TupleOfNullables {
    
    /**
     * Returns the 0th element from this tuple.
     * 
     * @return the 0th element from this tuple.
     */
    Optional<T0> get0();
    
    /**
     * Returns the 1st element from this tuple.
     * 
     * @return the 1st element from this tuple.
     */
    Optional<T1> get1();
    
    /**
     * Returns the 2nd element from this tuple.
     * 
     * @return the 2nd element from this tuple.
     */
    Optional<T2> get2();
    
    /**
     * Returns the 3rd element from this tuple.
     * 
     * @return the 3rd element from this tuple.
     */
    Optional<T3> get3();
    
    /**
     * Returns the 4th element from this tuple.
     * 
     * @return the 4th element from this tuple.
     */
    Optional<T4> get4();
    
    /**
     * Returns the 5th element from this tuple.
     * 
     * @return the 5th element from this tuple.
     */
    Optional<T5> get5();
    
    /**
     * Returns the 6th element from this tuple.
     * 
     * @return the 6th element from this tuple.
     */
    Optional<T6> get6();
    
    /**
     * Returns the 7th element from this tuple.
     * 
     * @return the 7th element from this tuple.
     */
    Optional<T7> get7();
    
    /**
     * Returns the 8th element from this tuple.
     * 
     * @return the 8th element from this tuple.
     */
    Optional<T8> get8();
    
    /**
     * Returns the 9th element from this tuple.
     * 
     * @return the 9th element from this tuple.
     */
    Optional<T9> get9();
    
    /**
     * Returns the 10th element from this tuple.
     * 
     * @return the 10th element from this tuple.
     */
    Optional<T10> get10();
    
    @Override
    default int degree() {
        return 11;
    }
    
    @SuppressWarnings("unchecked")
    default Optional<Object> get(int index) {
        switch (index) {
            case 0 : return (Optional<Object>)get0();
            case 1 : return (Optional<Object>)get1();
            case 2 : return (Optional<Object>)get2();
            case 3 : return (Optional<Object>)get3();
            case 4 : return (Optional<Object>)get4();
            case 5 : return (Optional<Object>)get5();
            case 6 : return (Optional<Object>)get6();
            case 7 : return (Optional<Object>)get7();
            case 8 : return (Optional<Object>)get8();
            case 9 : return (Optional<Object>)get9();
            case 10 : return (Optional<Object>)get10();
            default : throw new IllegalArgumentException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter0<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T0>> getter0() {
        return Tuple11OfNullables::get0;
    }
    
    /**
     * Returns the 0th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 0th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T0 getOrNull0() {
        return get0().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter0<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T0> getterOrNull0() {
        return Tuple11OfNullables::getOrNull0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter1<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T1>> getter1() {
        return Tuple11OfNullables::get1;
    }
    
    /**
     * Returns the 1st element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 1st element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T1 getOrNull1() {
        return get1().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter1<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T1> getterOrNull1() {
        return Tuple11OfNullables::getOrNull1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter2<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T2>> getter2() {
        return Tuple11OfNullables::get2;
    }
    
    /**
     * Returns the 2nd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 2nd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T2 getOrNull2() {
        return get2().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter2<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T2> getterOrNull2() {
        return Tuple11OfNullables::getOrNull2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter3<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T3>> getter3() {
        return Tuple11OfNullables::get3;
    }
    
    /**
     * Returns the 3rd element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 3rd element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T3 getOrNull3() {
        return get3().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter3<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T3> getterOrNull3() {
        return Tuple11OfNullables::getOrNull3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter4<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T4>> getter4() {
        return Tuple11OfNullables::get4;
    }
    
    /**
     * Returns the 4th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 4th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T4 getOrNull4() {
        return get4().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter4<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T4> getterOrNull4() {
        return Tuple11OfNullables::getOrNull4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter5<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T5>> getter5() {
        return Tuple11OfNullables::get5;
    }
    
    /**
     * Returns the 5th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 5th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T5 getOrNull5() {
        return get5().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter5<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T5> getterOrNull5() {
        return Tuple11OfNullables::getOrNull5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter6<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T6>> getter6() {
        return Tuple11OfNullables::get6;
    }
    
    /**
     * Returns the 6th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 6th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T6 getOrNull6() {
        return get6().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter6<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T6> getterOrNull6() {
        return Tuple11OfNullables::getOrNull6;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter7<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T7>> getter7() {
        return Tuple11OfNullables::get7;
    }
    
    /**
     * Returns the 7th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 7th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T7 getOrNull7() {
        return get7().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter7<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T7> getterOrNull7() {
        return Tuple11OfNullables::getOrNull7;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter8<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T8>> getter8() {
        return Tuple11OfNullables::get8;
    }
    
    /**
     * Returns the 8th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 8th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T8 getOrNull8() {
        return get8().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter8<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T8> getterOrNull8() {
        return Tuple11OfNullables::getOrNull8;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter9<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T9>> getter9() {
        return Tuple11OfNullables::get9;
    }
    
    /**
     * Returns the 9th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 9th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T9 getOrNull9() {
        return get9().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter9<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T9> getterOrNull9() {
        return Tuple11OfNullables::getOrNull9;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter10<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, Optional<T10>> getter10() {
        return Tuple11OfNullables::get10;
    }
    
    /**
     * Returns the 10th element from this tuple or {@code null} if no such
     * element is present.
     * 
     * @return the 10th element from this tuple or {@code null} if no such
     *         element is present.
     */
    default T10 getOrNull10() {
        return get10().orElse(null);
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> TupleGetter10<Tuple11OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T10> getterOrNull10() {
        return Tuple11OfNullables::getOrNull10;
    }
}