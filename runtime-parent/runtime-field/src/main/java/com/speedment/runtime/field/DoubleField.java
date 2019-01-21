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
package com.speedment.runtime.field;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.compute.ToDouble;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.field.comparator.DoubleFieldComparator;
import com.speedment.runtime.field.internal.DoubleFieldImpl;
import com.speedment.runtime.field.method.DoubleGetter;
import com.speedment.runtime.field.method.DoubleSetter;
import com.speedment.runtime.field.trait.HasComparableOperators;
import com.speedment.runtime.field.trait.HasDoubleValue;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * A field that represents a primitive {@code double} value.
 * <p>
 * Generated by com.speedment.sources.pattern.FieldPattern.
 * 
 * @param <ENTITY> entity type
 * @param <D>      database type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@GeneratedCode(value = "Speedment")
public interface DoubleField<ENTITY, D> extends Field<ENTITY>, HasDoubleValue<ENTITY, D>, HasComparableOperators<ENTITY, Double>, ToDouble<ENTITY>, DoubleFieldComparator<ENTITY, D> {
    
    /**
     * Creates a new {@link DoubleField} using the default implementation.
     * 
     * @param <ENTITY>   entity type
     * @param <D>        database type
     * @param identifier column that this field represents
     * @param getter     method reference to getter in entity
     * @param setter     method reference to setter in entity
     * @param typeMapper type mapper that is applied
     * @param unique     if column only contains unique values
     * @return           the created field
     */
    static <ENTITY, D> DoubleField<ENTITY, D> create(
    ColumnIdentifier<ENTITY> identifier,
            DoubleGetter<ENTITY> getter,
            DoubleSetter<ENTITY> setter,
            TypeMapper<D, Double> typeMapper,
            boolean unique) {
        return new DoubleFieldImpl<>(
            identifier, getter, setter, typeMapper, unique
        );
    }
    
    @Override
    DoubleField<ENTITY, D> tableAlias(String tableAlias);
    
    @Override
    default double applyAsDouble(ENTITY entity) {
        return getAsDouble(entity);
    }
    
    @Override
    DoubleFieldComparator<ENTITY, D> comparator();
    
    @Override
    default DoubleFieldComparator<ENTITY, D> reversed() {
        return comparator().reversed();
    }
    
    @Override
    default DoubleField<ENTITY, D> getField() {
        return this;
    }
}