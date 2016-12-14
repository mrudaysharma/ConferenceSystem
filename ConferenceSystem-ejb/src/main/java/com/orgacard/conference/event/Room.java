/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgacard.conference.event;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author u.sharma
 */
@Entity
@Table(name = "ROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r"),
    @NamedQuery(name = "Room.findByRoomId", query = "SELECT r FROM Room r WHERE r.roomId = :roomId"),
    @NamedQuery(name = "Room.findByRoomName", query = "SELECT r FROM Room r WHERE r.roomName = :roomName")})
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOM_ID")
    private Long roomId;
    @Size(max = 50)
    @Column(name = "ROOM_NAME")
    private String roomName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<RoomProperty> roomPropertyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<Conference> conferenceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomId")
    private Collection<RoomSeating> roomSeatingCollection;

    public Room() {
    }

    public Room(Long roomId) {
        this.roomId = roomId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @XmlTransient
    public Collection<RoomProperty> getRoomPropertyCollection() {
        return roomPropertyCollection;
    }

    public void setRoomPropertyCollection(Collection<RoomProperty> roomPropertyCollection) {
        this.roomPropertyCollection = roomPropertyCollection;
    }

    @XmlTransient
    public Collection<Conference> getConferenceCollection() {
        return conferenceCollection;
    }

    public void setConferenceCollection(Collection<Conference> conferenceCollection) {
        this.conferenceCollection = conferenceCollection;
    }

    @XmlTransient
    public Collection<RoomSeating> getRoomSeatingCollection() {
        return roomSeatingCollection;
    }

    public void setRoomSeatingCollection(Collection<RoomSeating> roomSeatingCollection) {
        this.roomSeatingCollection = roomSeatingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomId != null ? roomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomId == null && other.roomId != null) || (this.roomId != null && !this.roomId.equals(other.roomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.conference.event.Room[ roomId=" + roomId + " ]";
    }
    
}
