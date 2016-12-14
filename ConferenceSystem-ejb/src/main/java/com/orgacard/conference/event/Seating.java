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
@Table(name = "SEATING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seating.findAll", query = "SELECT s FROM Seating s"),
    @NamedQuery(name = "Seating.findBySeatingId", query = "SELECT s FROM Seating s WHERE s.seatingId = :seatingId"),
    @NamedQuery(name = "Seating.findByDescription", query = "SELECT s FROM Seating s WHERE s.description = :description")})
public class Seating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEATING_ID")
    private Long seatingId;
    @Size(max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seatingId")
    private Collection<Conference> conferenceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seatingId")
    private Collection<RoomSeating> roomSeatingCollection;

    public Seating() {
    }

    public Seating(Long seatingId) {
        this.seatingId = seatingId;
    }

    public Long getSeatingId() {
        return seatingId;
    }

    public void setSeatingId(Long seatingId) {
        this.seatingId = seatingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (seatingId != null ? seatingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seating)) {
            return false;
        }
        Seating other = (Seating) object;
        if ((this.seatingId == null && other.seatingId != null) || (this.seatingId != null && !this.seatingId.equals(other.seatingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orgacard.conference.event.Seating[ seatingId=" + seatingId + " ]";
    }
    
}
