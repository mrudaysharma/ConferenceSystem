package com.orgacard.conference.event;

import com.orgacard.conference.event.Conference;
import com.orgacard.conference.event.RoomSeating;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-11-29T11:42:02")
@StaticMetamodel(Seating.class)
public class Seating_ { 

    public static volatile SingularAttribute<Seating, String> description;
    public static volatile CollectionAttribute<Seating, Conference> conferenceCollection;
    public static volatile CollectionAttribute<Seating, RoomSeating> roomSeatingCollection;
    public static volatile SingularAttribute<Seating, Long> seatingId;

}