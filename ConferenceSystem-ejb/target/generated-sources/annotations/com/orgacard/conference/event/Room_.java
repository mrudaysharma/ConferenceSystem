package com.orgacard.conference.event;

import com.orgacard.conference.event.Conference;
import com.orgacard.conference.event.RoomProperty;
import com.orgacard.conference.event.RoomSeating;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-11-29T11:42:02")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, String> roomName;
    public static volatile CollectionAttribute<Room, RoomProperty> roomPropertyCollection;
    public static volatile SingularAttribute<Room, Long> roomId;
    public static volatile CollectionAttribute<Room, Conference> conferenceCollection;
    public static volatile CollectionAttribute<Room, RoomSeating> roomSeatingCollection;

}