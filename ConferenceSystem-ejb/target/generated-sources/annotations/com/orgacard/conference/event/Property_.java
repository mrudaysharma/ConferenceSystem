package com.orgacard.conference.event;

import com.orgacard.conference.event.RoomProperty;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-12-15T15:52:20")
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile CollectionAttribute<Property, RoomProperty> roomPropertyCollection;
    public static volatile SingularAttribute<Property, String> description;
    public static volatile SingularAttribute<Property, Long> propertyId;

}