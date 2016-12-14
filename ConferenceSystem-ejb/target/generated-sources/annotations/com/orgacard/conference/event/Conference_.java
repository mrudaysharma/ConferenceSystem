package com.orgacard.conference.event;

import com.orgacard.conference.event.Room;
import com.orgacard.conference.event.Seating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-11-29T11:42:02")
@StaticMetamodel(Conference.class)
public class Conference_ { 

    public static volatile SingularAttribute<Conference, String> conferenceName;
    public static volatile SingularAttribute<Conference, Date> dateTo;
    public static volatile SingularAttribute<Conference, Room> roomId;
    public static volatile SingularAttribute<Conference, Date> dateFrom;
    public static volatile SingularAttribute<Conference, Long> conferenceId;
    public static volatile SingularAttribute<Conference, Seating> seatingId;

}