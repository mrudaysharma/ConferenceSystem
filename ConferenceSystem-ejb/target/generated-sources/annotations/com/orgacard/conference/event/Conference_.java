package com.orgacard.conference.event;

import com.orgacard.conference.event.Room;
import com.orgacard.conference.event.Seating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-12-15T15:52:20")
@StaticMetamodel(Conference.class)
public class Conference_ { 

    public static volatile SingularAttribute<Conference, String> conferenceName;
    public static volatile SingularAttribute<Conference, Long> conferenceId;
    public static volatile SingularAttribute<Conference, Seating> seatingId;
    public static volatile SingularAttribute<Conference, Date> dateTo;
    public static volatile SingularAttribute<Conference, Date> dateFrom;
    public static volatile SingularAttribute<Conference, Room> roomId;

}