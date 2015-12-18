/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package sebastians.sportan.networking;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Area implements org.apache.thrift.TBase<Area, Area._Fields>, java.io.Serializable, Cloneable, Comparable<Area> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Area");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPORTS_FIELD_DESC = new org.apache.thrift.protocol.TField("sports", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField CENTER_FIELD_DESC = new org.apache.thrift.protocol.TField("center", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField COORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("coords", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CITYID_FIELD_DESC = new org.apache.thrift.protocol.TField("cityid", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField IMAGEID_FIELD_DESC = new org.apache.thrift.protocol.TField("imageid", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AreaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AreaTupleSchemeFactory());
  }

  public String id; // optional
  public String title; // optional
  public List<String> sports; // optional
  public List<Double> center; // optional
  public List<Coordinate> coords; // optional
  public String description; // optional
  public String cityid; // optional
  public String imageid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TITLE((short)2, "title"),
    SPORTS((short)3, "sports"),
    CENTER((short)4, "center"),
    COORDS((short)5, "coords"),
    DESCRIPTION((short)6, "description"),
    CITYID((short)7, "cityid"),
    IMAGEID((short)8, "imageid");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // TITLE
          return TITLE;
        case 3: // SPORTS
          return SPORTS;
        case 4: // CENTER
          return CENTER;
        case 5: // COORDS
          return COORDS;
        case 6: // DESCRIPTION
          return DESCRIPTION;
        case 7: // CITYID
          return CITYID;
        case 8: // IMAGEID
          return IMAGEID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TITLE,_Fields.SPORTS,_Fields.CENTER,_Fields.COORDS,_Fields.DESCRIPTION,_Fields.CITYID,_Fields.IMAGEID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPORTS, new org.apache.thrift.meta_data.FieldMetaData("sports", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CENTER, new org.apache.thrift.meta_data.FieldMetaData("center", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.COORDS, new org.apache.thrift.meta_data.FieldMetaData("coords", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Coordinate.class))));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CITYID, new org.apache.thrift.meta_data.FieldMetaData("cityid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMAGEID, new org.apache.thrift.meta_data.FieldMetaData("imageid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Area.class, metaDataMap);
  }

  public Area() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Area(Area other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetSports()) {
      List<String> __this__sports = new ArrayList<String>(other.sports);
      this.sports = __this__sports;
    }
    if (other.isSetCenter()) {
      List<Double> __this__center = new ArrayList<Double>(other.center);
      this.center = __this__center;
    }
    if (other.isSetCoords()) {
      List<Coordinate> __this__coords = new ArrayList<Coordinate>(other.coords.size());
      for (Coordinate other_element : other.coords) {
        __this__coords.add(new Coordinate(other_element));
      }
      this.coords = __this__coords;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetCityid()) {
      this.cityid = other.cityid;
    }
    if (other.isSetImageid()) {
      this.imageid = other.imageid;
    }
  }

  public Area deepCopy() {
    return new Area(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.title = null;
    this.sports = null;
    this.center = null;
    this.coords = null;
    this.description = null;
    this.cityid = null;
    this.imageid = null;
  }

  public String getId() {
    return this.id;
  }

  public Area setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public Area setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public int getSportsSize() {
    return (this.sports == null) ? 0 : this.sports.size();
  }

  public java.util.Iterator<String> getSportsIterator() {
    return (this.sports == null) ? null : this.sports.iterator();
  }

  public void addToSports(String elem) {
    if (this.sports == null) {
      this.sports = new ArrayList<String>();
    }
    this.sports.add(elem);
  }

  public List<String> getSports() {
    return this.sports;
  }

  public Area setSports(List<String> sports) {
    this.sports = sports;
    return this;
  }

  public void unsetSports() {
    this.sports = null;
  }

  /** Returns true if field sports is set (has been assigned a value) and false otherwise */
  public boolean isSetSports() {
    return this.sports != null;
  }

  public void setSportsIsSet(boolean value) {
    if (!value) {
      this.sports = null;
    }
  }

  public int getCenterSize() {
    return (this.center == null) ? 0 : this.center.size();
  }

  public java.util.Iterator<Double> getCenterIterator() {
    return (this.center == null) ? null : this.center.iterator();
  }

  public void addToCenter(double elem) {
    if (this.center == null) {
      this.center = new ArrayList<Double>();
    }
    this.center.add(elem);
  }

  public List<Double> getCenter() {
    return this.center;
  }

  public Area setCenter(List<Double> center) {
    this.center = center;
    return this;
  }

  public void unsetCenter() {
    this.center = null;
  }

  /** Returns true if field center is set (has been assigned a value) and false otherwise */
  public boolean isSetCenter() {
    return this.center != null;
  }

  public void setCenterIsSet(boolean value) {
    if (!value) {
      this.center = null;
    }
  }

  public int getCoordsSize() {
    return (this.coords == null) ? 0 : this.coords.size();
  }

  public java.util.Iterator<Coordinate> getCoordsIterator() {
    return (this.coords == null) ? null : this.coords.iterator();
  }

  public void addToCoords(Coordinate elem) {
    if (this.coords == null) {
      this.coords = new ArrayList<Coordinate>();
    }
    this.coords.add(elem);
  }

  public List<Coordinate> getCoords() {
    return this.coords;
  }

  public Area setCoords(List<Coordinate> coords) {
    this.coords = coords;
    return this;
  }

  public void unsetCoords() {
    this.coords = null;
  }

  /** Returns true if field coords is set (has been assigned a value) and false otherwise */
  public boolean isSetCoords() {
    return this.coords != null;
  }

  public void setCoordsIsSet(boolean value) {
    if (!value) {
      this.coords = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public Area setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public String getCityid() {
    return this.cityid;
  }

  public Area setCityid(String cityid) {
    this.cityid = cityid;
    return this;
  }

  public void unsetCityid() {
    this.cityid = null;
  }

  /** Returns true if field cityid is set (has been assigned a value) and false otherwise */
  public boolean isSetCityid() {
    return this.cityid != null;
  }

  public void setCityidIsSet(boolean value) {
    if (!value) {
      this.cityid = null;
    }
  }

  public String getImageid() {
    return this.imageid;
  }

  public Area setImageid(String imageid) {
    this.imageid = imageid;
    return this;
  }

  public void unsetImageid() {
    this.imageid = null;
  }

  /** Returns true if field imageid is set (has been assigned a value) and false otherwise */
  public boolean isSetImageid() {
    return this.imageid != null;
  }

  public void setImageidIsSet(boolean value) {
    if (!value) {
      this.imageid = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case SPORTS:
      if (value == null) {
        unsetSports();
      } else {
        setSports((List<String>)value);
      }
      break;

    case CENTER:
      if (value == null) {
        unsetCenter();
      } else {
        setCenter((List<Double>)value);
      }
      break;

    case COORDS:
      if (value == null) {
        unsetCoords();
      } else {
        setCoords((List<Coordinate>)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case CITYID:
      if (value == null) {
        unsetCityid();
      } else {
        setCityid((String)value);
      }
      break;

    case IMAGEID:
      if (value == null) {
        unsetImageid();
      } else {
        setImageid((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TITLE:
      return getTitle();

    case SPORTS:
      return getSports();

    case CENTER:
      return getCenter();

    case COORDS:
      return getCoords();

    case DESCRIPTION:
      return getDescription();

    case CITYID:
      return getCityid();

    case IMAGEID:
      return getImageid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TITLE:
      return isSetTitle();
    case SPORTS:
      return isSetSports();
    case CENTER:
      return isSetCenter();
    case COORDS:
      return isSetCoords();
    case DESCRIPTION:
      return isSetDescription();
    case CITYID:
      return isSetCityid();
    case IMAGEID:
      return isSetImageid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Area)
      return this.equals((Area)that);
    return false;
  }

  public boolean equals(Area that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_sports = true && this.isSetSports();
    boolean that_present_sports = true && that.isSetSports();
    if (this_present_sports || that_present_sports) {
      if (!(this_present_sports && that_present_sports))
        return false;
      if (!this.sports.equals(that.sports))
        return false;
    }

    boolean this_present_center = true && this.isSetCenter();
    boolean that_present_center = true && that.isSetCenter();
    if (this_present_center || that_present_center) {
      if (!(this_present_center && that_present_center))
        return false;
      if (!this.center.equals(that.center))
        return false;
    }

    boolean this_present_coords = true && this.isSetCoords();
    boolean that_present_coords = true && that.isSetCoords();
    if (this_present_coords || that_present_coords) {
      if (!(this_present_coords && that_present_coords))
        return false;
      if (!this.coords.equals(that.coords))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_cityid = true && this.isSetCityid();
    boolean that_present_cityid = true && that.isSetCityid();
    if (this_present_cityid || that_present_cityid) {
      if (!(this_present_cityid && that_present_cityid))
        return false;
      if (!this.cityid.equals(that.cityid))
        return false;
    }

    boolean this_present_imageid = true && this.isSetImageid();
    boolean that_present_imageid = true && that.isSetImageid();
    if (this_present_imageid || that_present_imageid) {
      if (!(this_present_imageid && that_present_imageid))
        return false;
      if (!this.imageid.equals(that.imageid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_sports = true && (isSetSports());
    list.add(present_sports);
    if (present_sports)
      list.add(sports);

    boolean present_center = true && (isSetCenter());
    list.add(present_center);
    if (present_center)
      list.add(center);

    boolean present_coords = true && (isSetCoords());
    list.add(present_coords);
    if (present_coords)
      list.add(coords);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    boolean present_cityid = true && (isSetCityid());
    list.add(present_cityid);
    if (present_cityid)
      list.add(cityid);

    boolean present_imageid = true && (isSetImageid());
    list.add(present_imageid);
    if (present_imageid)
      list.add(imageid);

    return list.hashCode();
  }

  @Override
  public int compareTo(Area other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSports()).compareTo(other.isSetSports());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSports()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sports, other.sports);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCenter()).compareTo(other.isSetCenter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCenter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.center, other.center);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoords()).compareTo(other.isSetCoords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coords, other.coords);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCityid()).compareTo(other.isSetCityid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCityid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cityid, other.cityid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImageid()).compareTo(other.isSetImageid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImageid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imageid, other.imageid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Area(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetSports()) {
      if (!first) sb.append(", ");
      sb.append("sports:");
      if (this.sports == null) {
        sb.append("null");
      } else {
        sb.append(this.sports);
      }
      first = false;
    }
    if (isSetCenter()) {
      if (!first) sb.append(", ");
      sb.append("center:");
      if (this.center == null) {
        sb.append("null");
      } else {
        sb.append(this.center);
      }
      first = false;
    }
    if (isSetCoords()) {
      if (!first) sb.append(", ");
      sb.append("coords:");
      if (this.coords == null) {
        sb.append("null");
      } else {
        sb.append(this.coords);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetCityid()) {
      if (!first) sb.append(", ");
      sb.append("cityid:");
      if (this.cityid == null) {
        sb.append("null");
      } else {
        sb.append(this.cityid);
      }
      first = false;
    }
    if (isSetImageid()) {
      if (!first) sb.append(", ");
      sb.append("imageid:");
      if (this.imageid == null) {
        sb.append("null");
      } else {
        sb.append(this.imageid);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AreaStandardSchemeFactory implements SchemeFactory {
    public AreaStandardScheme getScheme() {
      return new AreaStandardScheme();
    }
  }

  private static class AreaStandardScheme extends StandardScheme<Area> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Area struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPORTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.sports = new ArrayList<String>(_list16.size);
                String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.sports.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setSportsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CENTER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.center = new ArrayList<Double>(_list19.size);
                double _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readDouble();
                  struct.center.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setCenterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list22 = iprot.readListBegin();
                struct.coords = new ArrayList<Coordinate>(_list22.size);
                Coordinate _elem23;
                for (int _i24 = 0; _i24 < _list22.size; ++_i24)
                {
                  _elem23 = new Coordinate();
                  _elem23.read(iprot);
                  struct.coords.add(_elem23);
                }
                iprot.readListEnd();
              }
              struct.setCoordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CITYID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cityid = iprot.readString();
              struct.setCityidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IMAGEID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imageid = iprot.readString();
              struct.setImageidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Area struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sports != null) {
        if (struct.isSetSports()) {
          oprot.writeFieldBegin(SPORTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.sports.size()));
            for (String _iter25 : struct.sports)
            {
              oprot.writeString(_iter25);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.center != null) {
        if (struct.isSetCenter()) {
          oprot.writeFieldBegin(CENTER_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.center.size()));
            for (double _iter26 : struct.center)
            {
              oprot.writeDouble(_iter26);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.coords != null) {
        if (struct.isSetCoords()) {
          oprot.writeFieldBegin(COORDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.coords.size()));
            for (Coordinate _iter27 : struct.coords)
            {
              _iter27.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cityid != null) {
        if (struct.isSetCityid()) {
          oprot.writeFieldBegin(CITYID_FIELD_DESC);
          oprot.writeString(struct.cityid);
          oprot.writeFieldEnd();
        }
      }
      if (struct.imageid != null) {
        if (struct.isSetImageid()) {
          oprot.writeFieldBegin(IMAGEID_FIELD_DESC);
          oprot.writeString(struct.imageid);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AreaTupleSchemeFactory implements SchemeFactory {
    public AreaTupleScheme getScheme() {
      return new AreaTupleScheme();
    }
  }

  private static class AreaTupleScheme extends TupleScheme<Area> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Area struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetSports()) {
        optionals.set(2);
      }
      if (struct.isSetCenter()) {
        optionals.set(3);
      }
      if (struct.isSetCoords()) {
        optionals.set(4);
      }
      if (struct.isSetDescription()) {
        optionals.set(5);
      }
      if (struct.isSetCityid()) {
        optionals.set(6);
      }
      if (struct.isSetImageid()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetSports()) {
        {
          oprot.writeI32(struct.sports.size());
          for (String _iter28 : struct.sports)
          {
            oprot.writeString(_iter28);
          }
        }
      }
      if (struct.isSetCenter()) {
        {
          oprot.writeI32(struct.center.size());
          for (double _iter29 : struct.center)
          {
            oprot.writeDouble(_iter29);
          }
        }
      }
      if (struct.isSetCoords()) {
        {
          oprot.writeI32(struct.coords.size());
          for (Coordinate _iter30 : struct.coords)
          {
            _iter30.write(oprot);
          }
        }
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetCityid()) {
        oprot.writeString(struct.cityid);
      }
      if (struct.isSetImageid()) {
        oprot.writeString(struct.imageid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Area struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list31 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.sports = new ArrayList<String>(_list31.size);
          String _elem32;
          for (int _i33 = 0; _i33 < _list31.size; ++_i33)
          {
            _elem32 = iprot.readString();
            struct.sports.add(_elem32);
          }
        }
        struct.setSportsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list34 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.center = new ArrayList<Double>(_list34.size);
          double _elem35;
          for (int _i36 = 0; _i36 < _list34.size; ++_i36)
          {
            _elem35 = iprot.readDouble();
            struct.center.add(_elem35);
          }
        }
        struct.setCenterIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.coords = new ArrayList<Coordinate>(_list37.size);
          Coordinate _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = new Coordinate();
            _elem38.read(iprot);
            struct.coords.add(_elem38);
          }
        }
        struct.setCoordsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.cityid = iprot.readString();
        struct.setCityidIsSet(true);
      }
      if (incoming.get(7)) {
        struct.imageid = iprot.readString();
        struct.setImageidIsSet(true);
      }
    }
  }

}

