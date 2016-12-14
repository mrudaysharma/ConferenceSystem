/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgacard.conference.bean;

import de.orgacard.common.logging.Logging;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class ConferenceBookingBean {

    @PersistenceContext(unitName = "confRoom")
    private EntityManager entityMgr;

    private final static Logging myLogging = Logging.getInstance(ConferenceBookingBean.class); //For logging.

    /**
     * @see
     * de.orgacard.ejb.bean.IApplicationBusiness#getByName(java.lang.String)
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Object[]> filterConferenceRoomByEquipment(String equipments) {

        List<Object[]> conferenceRoomList = null;
        String query = null;
        /*
         select rp.ROOM_ID,
         stuff((select ';' + cast(rpp.PROPERTY_ID as varchar(3)) from ROOM_PROPERTY rpp left join ROOM rr on (rpp.PROPERTY_ID IN (3,1,5)) where rpp.ROOM_ID = rp.ROOM_ID and rpp.ROOM_ID = rr.ROOM_ID FOR XML PATH('')),1,1,'') as properties,
         count(*) as ItemCount
         from dbo.ROOM_PROPERTY rp 
         group by rp.ROOM_ID

         */
        try {
            query = " select rp.ROOM_ID,"
                    + "  stuff((select ';' + cast(rpp.PROPERTY_ID as varchar(3)) from ROOM_PROPERTY rpp left join ROOM rr on (rpp.PROPERTY_ID IN ("+equipments+")) where rpp.ROOM_ID = rp.ROOM_ID and rpp.ROOM_ID = rr.ROOM_ID FOR XML PATH('')),1,1,'') as properties,"
                    + "  count(*) as ItemCount"
                    + "  from dbo.ROOM_PROPERTY rp"
                    + "  group by rp.ROOM_ID";

            Query ejbq = entityMgr.createNativeQuery(query)
                    .setHint("eclipselink.jdbc.parameter-delimiter", ":");

            conferenceRoomList = ejbq.getResultList();
            if (conferenceRoomList == null && conferenceRoomList.isEmpty()) {
                return conferenceRoomList;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conferenceRoomList;

    }
    

}
