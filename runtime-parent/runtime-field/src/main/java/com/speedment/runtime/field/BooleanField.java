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
import com.speedment.runtime.compute.ToBoolean;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.field.comparator.BooleanFieldComparator;
import com.speedment.runtime.field.internal.BooleanFieldImpl;
import com.speedment.runtime.field.method.BooleanGetter;
import com.speedment.runtime.field.method.BooleanSetter;
import com.speedment.runtime.field.trait.HasBooleanOperators;
import com.speedment.runtime.field.trait.HasBooleanValue;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * A field that represents a primitive {@code boolean} value.
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
public interface BooleanField<ENTITY, D> extends Field<ENTITY>, HasBooleanValue<ENTITY, D>, ToBoolean<ENTITY>, BooleanFieldComparator<ENTITY, D>, HasBooleanOperators<ENTITY> {
    
    /**
     * Creates a new {@link BooleanField} using the default implementation.
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
    static <ENTITY, D> BooleanField<ENTITY, D> create(
    ColumnIdentifier<ENTITY> identifier,
            BooleanGetter<ENTITY> getter,
            BooleanSetter<ENTITY> setter,
            TypeMapper<D, Boolean> typeMapper,
            boolean unique) {
        return new BooleanFieldImpl<>(
            identifier, getter, setter, typeMapper, unique
        );
    }
    
    @Override
    BooleanField<ENTITY, D> tableAlias(String tableAlias);
    
    @Override
    default boolean applyAsBoolean(ENTITY entity) {
        return getAsBoolean(entity);
    }
    
    @Override
    default BooleanField<ENTITY, D> getField() {
        return this;
    }
}