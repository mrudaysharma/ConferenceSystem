package com.orgacard.conference.event;

import com.orgacard.conference.event.Conference;
import com.orgacard.conference.event.RoomProperty;
import com.orgacard.conference.event.RoomSeating;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-12-15T15:52:20")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile CollectionAttribute<Room, Conference> conferenceCollection;
    public static volatile CollectionAttribute<Room, RoomProperty> roomPropertyCollection;
    public static volatile CollectionAttribute<Room, RoomSeating> roomSeatingCollection;
    public static volatile SingularAttribute<Room, Long> roomId;
    public static volatile SingularAttribute<Room, String> roomName;

}