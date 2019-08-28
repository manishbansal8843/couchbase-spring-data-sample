package com.cb.springdata.sample.entities;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Document

public class Building {

    @NotNull
    @Id
    private String id;

    @NotNull
    @Field
    private String name;

    @NotNull
    @Field
    private String companyId;

    @Field
    private List<Area> areas = new ArrayList<>();

    @Field
    private List<String> phoneNumbers = new ArrayList<>();

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCompanyId() {
      return companyId;
    }

    public void setCompanyId(String companyId) {
      this.companyId = companyId;
    }

    public List<Area> getAreas() {
      return areas;
    }

    public void setAreas(List<Area> areas) {
      this.areas = areas;
    }

    public List<String> getPhoneNumbers() {
      return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
      this.phoneNumbers = phoneNumbers;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((areas == null) ? 0 : areas.hashCode());
      result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Building other = (Building) obj;
      if (areas == null) {
        if (other.areas != null)
          return false;
      } else if (!areas.equals(other.areas))
        return false;
      if (companyId == null) {
        if (other.companyId != null)
          return false;
      } else if (!companyId.equals(other.companyId))
        return false;
      if (id == null) {
        if (other.id != null)
          return false;
      } else if (!id.equals(other.id))
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (phoneNumbers == null) {
        if (other.phoneNumbers != null)
          return false;
      } else if (!phoneNumbers.equals(other.phoneNumbers))
        return false;
      return true;
    }

    @Override
    public String toString() {
      return "Building [id=" + id + ", name=" + name + ", companyId=" + companyId + ", areas="
          + areas + ", phoneNumbers=" + phoneNumbers + "]";
    }

    public Building(String id, String name, String companyId, List<Area> areas,
        List<String> phoneNumbers) {
      super();
      this.id = id;
      this.name = name;
      this.companyId = companyId;
      this.areas = areas;
      this.phoneNumbers = phoneNumbers;
    }

    public Building() {
      super();
    }
    
    

}
