/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgacard.conference.event;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author u.sharma
 */
@Entity
@Table(name = "ROOM_SEATING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomSeating.findAll", query = "SELECT r FROM RoomSeating r"),
    @NamedQuery(name = "RoomSeating.findByRoomSeatingId", query = "SELECT r FROM RoomSeating r WHERE r.roomSeatingId = :roomSeatingId")})
public class RoomSeating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOM_SEATING_ID")
    private Long roomSeatingId;
    @JoinColumn(name = "SEATING_ID", referencedColumnName = "SEATING_ID")
    @ManyToOne(optional = false)
    private Seating seatingId;
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    @ManyToOne(optional = false)
    private Room roomId;

    public RoomSeating() {
    }

    public RoomSeating(Long roomSeatingId) {
        this.roomSeatingId = roomSeatingId;
    }

    public Long getRoomSeatingId() {
        return roomSeatingId;
    }

    public void setRoomSeatingId(Long roomSeatingId) {
        this.roomSeatingId = roomSeatingId;
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
        hash += (roomSeatingId != null ? roomSeatingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomSeating)) {
            return false;
        }
        RoomSeating other = (RoomSeating) object;
        if ((this.roomSeatingId == null && other.roomSeatingId != null) || (this.roomSeatingId != null && !this.roomSeatingId.equals(other.roomSeatingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.conference.event.RoomSeating[ roomSeatingId=" + roomSeatingId + " ]";
    }
    
}
