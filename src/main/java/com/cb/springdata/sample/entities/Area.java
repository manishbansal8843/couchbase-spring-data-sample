package com.cb.springdata.sample.entities;



import java.util.ArrayList;
import java.util.List;


public class Area {

    private String id;

    private String name;

    private List<Area> areas = new ArrayList<>();

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

    public List<Area> getAreas() {
      return areas;
    }

    public void setAreas(List<Area> areas) {
      this.areas = areas;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((areas == null) ? 0 : areas.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
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
      Area other = (Area) obj;
      if (areas == null) {
        if (other.areas != null)
          return false;
      } else if (!areas.equals(other.areas))
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
      return true;
    }

    @Override
    public String toString() {
      return "Area [id=" + id + ", name=" + name + ", areas=" + areas + "]";
    }

    public Area(String id, String name, List<Area> areas) {
      super();
      this.id = id;
      this.name = name;
      this.areas = areas;
    }

    public Area() {
      super();
    }
    
    
}
