package com.orgacard.conference.event;

import com.orgacard.conference.event.Property;
import com.orgacard.conference.event.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-12-15T15:52:20")
@StaticMetamodel(RoomProperty.class)
public class RoomProperty_ { 

    public static volatile SingularAttribute<RoomProperty, Long> roomPropertyId;
    public static volatile SingularAttribute<RoomProperty, Property> propertyId;
    public static volatile SingularAttribute<RoomProperty, Room> roomId;

}