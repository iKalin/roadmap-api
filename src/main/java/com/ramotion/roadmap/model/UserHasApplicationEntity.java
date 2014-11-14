package com.ramotion.roadmap.model;

import com.ramotion.roadmap.model.utils.AuditTimestamps;
import com.ramotion.roadmap.model.utils.AuditableEntityListener;
import com.ramotion.roadmap.model.utils.EntityWithAuditTimestamps;

import javax.persistence.*;

/**
 * Created by Oleg Vasiliev on 11.11.2014.
 */
@Entity
@Table(name = "user_has_application", schema = "", catalog = "roadmap")
@EntityListeners(value = AuditableEntityListener.class)
public class UserHasApplicationEntity implements EntityWithAuditTimestamps {

    private Long id;

    private Long userId;

    private Long applicationId;

    private Byte accessLevel;

    @Embedded
    private AuditTimestamps auditTimestamps;

    private ApplicationEntity applicationByApplicationId;

    private UserEntity userByUserId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "application_id", nullable = false, insertable = false, updatable = false)
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    @Column(name = "access_level", nullable = false, insertable = true, updatable = true)
    public Byte getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Byte accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public AuditTimestamps getAuditTimestamps() {
        return auditTimestamps;
    }

    @Override
    public void setAuditTimestamps(AuditTimestamps auditTimestamps) {
        this.auditTimestamps = auditTimestamps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasApplicationEntity that = (UserHasApplicationEntity) o;

        if (accessLevel != null ? !accessLevel.equals(that.accessLevel) : that.accessLevel != null) return false;
        if (applicationByApplicationId != null ? !applicationByApplicationId.equals(that.applicationByApplicationId) : that.applicationByApplicationId != null)
            return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (auditTimestamps != null ? !auditTimestamps.equals(that.auditTimestamps) : that.auditTimestamps != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userByUserId != null ? !userByUserId.equals(that.userByUserId) : that.userByUserId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (accessLevel != null ? accessLevel.hashCode() : 0);
        result = 31 * result + (auditTimestamps != null ? auditTimestamps.hashCode() : 0);
        result = 31 * result + (applicationByApplicationId != null ? applicationByApplicationId.hashCode() : 0);
        result = 31 * result + (userByUserId != null ? userByUserId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "application_id", referencedColumnName = "id", nullable = false)
    public ApplicationEntity getApplicationByApplicationId() {
        return applicationByApplicationId;
    }

    public void setApplicationByApplicationId(ApplicationEntity applicationByApplicationId) {
        this.applicationByApplicationId = applicationByApplicationId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }
}