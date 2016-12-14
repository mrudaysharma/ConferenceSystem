/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgacard.conference.event;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author u.sharma
 */
@Entity
@Table(name = "CONFERENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conference.findAll", query = "SELECT c FROM Conference c"),
    @NamedQuery(name = "Conference.findByConferenceId", query = "SELECT c FROM Conference c WHERE c.conferenceId = :conferenceId"),
    @NamedQuery(name = "Conference.findByDateFrom", query = "SELECT c FROM Conference c WHERE c.dateFrom = :dateFrom"),
    @NamedQuery(name = "Conference.findByDateTo", query = "SELECT c FROM Conference c WHERE c.dateTo = :dateTo"),
    @NamedQuery(name = "Conference.findByConferenceName", query = "SELECT c FROM Conference c WHERE c.conferenceName = :conferenceName")})
public class Conference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONFERENCE_ID")
    private Long conferenceId;
    @Column(name = "DATE_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "DATE_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Size(max = 50)
    @Column(name = "CONFERENCE_NAME")
    private String conferenceName;
    @JoinColumn(name = "SEATING_ID", referencedColumnName = "SEATING_ID")
    @ManyToOne(optional = false)
    private Seating seatingId;
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    @ManyToOne(optional = false)
    private Room roomId;

    public Conference() {
    }

    public Conference(Long conferenceId) {
        this.conferenceId = conferenceId;
    }

    public Long getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(Long conferenceId) {
        this.conferenceId = conferenceId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public Seating getSeatingId() {
        return seatingId;
    }

    public void setSeatingId(Seating seatingId) {
        this.seatingId = seatingId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conferenceId != null ? conferenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conference)) {
            return false;
        }
        Conference other = (Conference) object;
        if ((this.conferenceId == null && other.conferenceId != null) || (this.conferenceId != null && !this.conferenceId.equals(other.conferenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.conference.event.Conference[ conferenceId=" + conferenceId + " ]";
    }
    
}
