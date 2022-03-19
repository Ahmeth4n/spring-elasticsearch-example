package com.magnakod.kratos.document;

import com.magnakod.kratos.helper.Indices;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;
import javax.persistence.Id;

@Document(indexName = Indices.USERS_INDEX)
@Setting(settingPath = "static/es-settings.json ")
public class Users {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String username;

    public Users(String id, String username, String password, String created_date, String userType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.created_date = created_date;
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Field(type = FieldType.Text)
    private String password;

    @Field(type = FieldType.Date)
    private String created_date;

    @Field(type = FieldType.Text)
    private String userType;
}
