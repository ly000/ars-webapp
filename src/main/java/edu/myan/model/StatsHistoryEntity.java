package edu.myan.model;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
public class StatsHistoryEntity extends BaseEntity{
    @OneToOne
    private UserEntity userEntity;
    @OneToOne
    private ARSRoomEntity arsRoomEntity;

    public StatsHistoryEntity(UserEntity userEntity, ARSRoomEntity arsRoomEntity) {
        this.userEntity = userEntity;
        this.arsRoomEntity = arsRoomEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public ARSRoomEntity getArsRoomEntity() {
        return arsRoomEntity;
    }

    public void setArsRoomEntity(ARSRoomEntity arsRoomEntity) {
        this.arsRoomEntity = arsRoomEntity;
    }
}
