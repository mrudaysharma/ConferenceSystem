package com.orgacard.conference.event;

import com.orgacard.conference.event.Room;
import com.orgacard.conference.event.Seating;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-12-15T15:52:20")
@StaticMetamodel(RoomSeating.class)
public class RoomSeating_ { 

    public static volatile SingularAttribute<RoomSeating, Long> roomSeatingId;
    public static volatile SingularAttribute<RoomSeating, Seating> seatingId;
    public static volatile SingularAttribute<RoomSeating, Room> roomId;

}