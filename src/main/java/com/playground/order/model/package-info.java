@TypeDefs({
        @TypeDef(name = "pgsql-enum", typeClass = PostgreSQLEnumType.class),
})
package com.playground.order.model;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
