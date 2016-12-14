package com.orgacard.conference.event;

import com.orgacard.conference.event.Room;
import com.orgacard.conference.event.Seating;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-11-29T11:42:02")
@StaticMetamodel(RoomSeating.class)
public class RoomSeating_ { 

    public static volatile SingularAttribute<RoomSeating, Room> roomId;
    public static volatile SingularAttribute<RoomSeating, Long> roomSeatingId;
    public static volatile SingularAttribute<RoomSeating, Seating> seatingId;

}