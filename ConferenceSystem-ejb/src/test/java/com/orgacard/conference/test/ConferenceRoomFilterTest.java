/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgacard.conference.test;

import com.orgacard.conference.bean.ConferenceBookingBean;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author u.sharma
 */
public class ConferenceRoomFilterTest {

    private static EJBContainer ec;

    private static ConferenceBookingBean service = null;
    private static Context ctx;

    public ConferenceRoomFilterTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put(EJBContainer.MODULES, new File("target/embedded-classes"));
        props.put("org.glassfish.ejb.embedded.glassfish.instance.root", "./src/test/testing-domain");
        ec = EJBContainer.createEJBContainer(props);
        ctx = ec.getContext();

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        //ctx.close();
        System.out.println("Closing the container");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        try {
            ctx.close();
        } catch (NamingException ex) {
            Logger.getLogger(ConferenceRoomFilterTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of addNumbers method, of class MyBean.
     */
    @Test
    public void filterConferenceRoomByEquipmentsTest() throws Exception {
        service = (ConferenceBookingBean) ctx.lookup("java:global/embedded-classes/ConferenceBookingBean!com.orgacard.conference.bean.ConferenceBookingBean");
        System.out.println("Filter conference room by equipments");
        List<Object[]> objects = service.filterConferenceRoomByEquipment("1,2,3");
        assertNotNull(objects);
        for (Object[] obj : objects) {
            System.out.println("ROOM_ID = " + (Long) obj[0]);
            System.out.println("EQUIPMENTS = " + (String) obj[1]);
        }

    }

}
