package com.narendra.app.converter;

import java.io.Serializable;

public interface RepositoryConverter<T extends Serializable, P extends Serializable> {
    default T mapToEntity(final P persistenceObject){
        throw new UnsupportedOperationException();
    }
    default P mapToDto(final T tableObject){
        throw new UnsupportedOperationException();
    }
}
