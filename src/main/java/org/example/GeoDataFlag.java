package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Data
@Getter
@AllArgsConstructor
public class GeoDataFlag {
    private int id;

    private int userId;

    private String timestamp;

    private float longitude;

    private float latitude;


    private boolean isNew;

    private String flag;


    @Override
    public String toString() {
        return "GeoDataFlag{" +
                "id=" + id +
                ", userId=" + userId +
                ", timestamp='" + timestamp + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", isNew=" + isNew +
                ", flag='" + flag + '\'' +
                '}';
    }

    public boolean getIsNew() {
        return this.isNew;
    }
}
