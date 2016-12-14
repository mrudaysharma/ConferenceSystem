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
@Table(name = "ROOM_PROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomProperty.findAll", query = "SELECT r FROM RoomProperty r"),
    @NamedQuery(name = "RoomProperty.findByRoomPropertyId", query = "SELECT r FROM RoomProperty r WHERE r.roomPropertyId = :roomPropertyId")})
public class RoomProperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOM_PROPERTY_ID")
    private Long roomPropertyId;
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    @ManyToOne(optional = false)
    private Room roomId;
    @JoinColumn(name = "PROPERTY_ID", referencedColumnName = "PROPERTY_ID")
    @ManyToOne(optional = false)
    private Property propertyId;

    public RoomProperty() {
    }

    public RoomProperty(Long roomPropertyId) {
        this.roomPropertyId = roomPropertyId;
    }

    public Long getRoomPropertyId() {
        return roomPropertyId;
    }

    public void setRoomPropertyId(Long roomPropertyId) {
        this.roomPropertyId = roomPropertyId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    public Property getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Property propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomPropertyId != null ? roomPropertyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomProperty)) {
            return false;
        }
        RoomProperty other = (RoomProperty) object;
        if ((this.roomPropertyId == null && other.roomPropertyId != null) || (this.roomPropertyId != null && !this.roomPropertyId.equals(other.roomPropertyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.conference.event.RoomProperty[ roomPropertyId=" + roomPropertyId + " ]";
    }
    
}
