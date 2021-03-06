/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-25")
public class ArtifactMetadata implements org.apache.thrift.TBase<ArtifactMetadata, ArtifactMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<ArtifactMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ArtifactMetadata");

  private static final org.apache.thrift.protocol.TField RULE_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleKeys", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("buildTarget", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField REPOSITORY_FIELD_DESC = new org.apache.thrift.protocol.TField("repository", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ARTIFACT_PAYLOAD_CRC32_FIELD_DESC = new org.apache.thrift.protocol.TField("artifactPayloadCrc32", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ArtifactMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ArtifactMetadataTupleSchemeFactory());
  }

  public List<RuleKey> ruleKeys; // optional
  public Map<String,String> metadata; // optional
  public String buildTarget; // optional
  public String repository; // optional
  public String artifactPayloadCrc32; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RULE_KEYS((short)1, "ruleKeys"),
    METADATA((short)2, "metadata"),
    BUILD_TARGET((short)3, "buildTarget"),
    REPOSITORY((short)4, "repository"),
    ARTIFACT_PAYLOAD_CRC32((short)5, "artifactPayloadCrc32");

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
        case 1: // RULE_KEYS
          return RULE_KEYS;
        case 2: // METADATA
          return METADATA;
        case 3: // BUILD_TARGET
          return BUILD_TARGET;
        case 4: // REPOSITORY
          return REPOSITORY;
        case 5: // ARTIFACT_PAYLOAD_CRC32
          return ARTIFACT_PAYLOAD_CRC32;
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
  private static final _Fields optionals[] = {_Fields.RULE_KEYS,_Fields.METADATA,_Fields.BUILD_TARGET,_Fields.REPOSITORY,_Fields.ARTIFACT_PAYLOAD_CRC32};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RULE_KEYS, new org.apache.thrift.meta_data.FieldMetaData("ruleKeys", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RuleKey.class))));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BUILD_TARGET, new org.apache.thrift.meta_data.FieldMetaData("buildTarget", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPOSITORY, new org.apache.thrift.meta_data.FieldMetaData("repository", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARTIFACT_PAYLOAD_CRC32, new org.apache.thrift.meta_data.FieldMetaData("artifactPayloadCrc32", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArtifactMetadata.class, metaDataMap);
  }

  public ArtifactMetadata() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ArtifactMetadata(ArtifactMetadata other) {
    if (other.isSetRuleKeys()) {
      List<RuleKey> __this__ruleKeys = new ArrayList<RuleKey>(other.ruleKeys.size());
      for (RuleKey other_element : other.ruleKeys) {
        __this__ruleKeys.add(new RuleKey(other_element));
      }
      this.ruleKeys = __this__ruleKeys;
    }
    if (other.isSetMetadata()) {
      Map<String,String> __this__metadata = new HashMap<String,String>(other.metadata);
      this.metadata = __this__metadata;
    }
    if (other.isSetBuildTarget()) {
      this.buildTarget = other.buildTarget;
    }
    if (other.isSetRepository()) {
      this.repository = other.repository;
    }
    if (other.isSetArtifactPayloadCrc32()) {
      this.artifactPayloadCrc32 = other.artifactPayloadCrc32;
    }
  }

  public ArtifactMetadata deepCopy() {
    return new ArtifactMetadata(this);
  }

  @Override
  public void clear() {
    this.ruleKeys = null;
    this.metadata = null;
    this.buildTarget = null;
    this.repository = null;
    this.artifactPayloadCrc32 = null;
  }

  public int getRuleKeysSize() {
    return (this.ruleKeys == null) ? 0 : this.ruleKeys.size();
  }

  public java.util.Iterator<RuleKey> getRuleKeysIterator() {
    return (this.ruleKeys == null) ? null : this.ruleKeys.iterator();
  }

  public void addToRuleKeys(RuleKey elem) {
    if (this.ruleKeys == null) {
      this.ruleKeys = new ArrayList<RuleKey>();
    }
    this.ruleKeys.add(elem);
  }

  public List<RuleKey> getRuleKeys() {
    return this.ruleKeys;
  }

  public ArtifactMetadata setRuleKeys(List<RuleKey> ruleKeys) {
    this.ruleKeys = ruleKeys;
    return this;
  }

  public void unsetRuleKeys() {
    this.ruleKeys = null;
  }

  /** Returns true if field ruleKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleKeys() {
    return this.ruleKeys != null;
  }

  public void setRuleKeysIsSet(boolean value) {
    if (!value) {
      this.ruleKeys = null;
    }
  }

  public int getMetadataSize() {
    return (this.metadata == null) ? 0 : this.metadata.size();
  }

  public void putToMetadata(String key, String val) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String,String>();
    }
    this.metadata.put(key, val);
  }

  public Map<String,String> getMetadata() {
    return this.metadata;
  }

  public ArtifactMetadata setMetadata(Map<String,String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public String getBuildTarget() {
    return this.buildTarget;
  }

  public ArtifactMetadata setBuildTarget(String buildTarget) {
    this.buildTarget = buildTarget;
    return this;
  }

  public void unsetBuildTarget() {
    this.buildTarget = null;
  }

  /** Returns true if field buildTarget is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildTarget() {
    return this.buildTarget != null;
  }

  public void setBuildTargetIsSet(boolean value) {
    if (!value) {
      this.buildTarget = null;
    }
  }

  public String getRepository() {
    return this.repository;
  }

  public ArtifactMetadata setRepository(String repository) {
    this.repository = repository;
    return this;
  }

  public void unsetRepository() {
    this.repository = null;
  }

  /** Returns true if field repository is set (has been assigned a value) and false otherwise */
  public boolean isSetRepository() {
    return this.repository != null;
  }

  public void setRepositoryIsSet(boolean value) {
    if (!value) {
      this.repository = null;
    }
  }

  public String getArtifactPayloadCrc32() {
    return this.artifactPayloadCrc32;
  }

  public ArtifactMetadata setArtifactPayloadCrc32(String artifactPayloadCrc32) {
    this.artifactPayloadCrc32 = artifactPayloadCrc32;
    return this;
  }

  public void unsetArtifactPayloadCrc32() {
    this.artifactPayloadCrc32 = null;
  }

  /** Returns true if field artifactPayloadCrc32 is set (has been assigned a value) and false otherwise */
  public boolean isSetArtifactPayloadCrc32() {
    return this.artifactPayloadCrc32 != null;
  }

  public void setArtifactPayloadCrc32IsSet(boolean value) {
    if (!value) {
      this.artifactPayloadCrc32 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RULE_KEYS:
      if (value == null) {
        unsetRuleKeys();
      } else {
        setRuleKeys((List<RuleKey>)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((Map<String,String>)value);
      }
      break;

    case BUILD_TARGET:
      if (value == null) {
        unsetBuildTarget();
      } else {
        setBuildTarget((String)value);
      }
      break;

    case REPOSITORY:
      if (value == null) {
        unsetRepository();
      } else {
        setRepository((String)value);
      }
      break;

    case ARTIFACT_PAYLOAD_CRC32:
      if (value == null) {
        unsetArtifactPayloadCrc32();
      } else {
        setArtifactPayloadCrc32((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RULE_KEYS:
      return getRuleKeys();

    case METADATA:
      return getMetadata();

    case BUILD_TARGET:
      return getBuildTarget();

    case REPOSITORY:
      return getRepository();

    case ARTIFACT_PAYLOAD_CRC32:
      return getArtifactPayloadCrc32();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RULE_KEYS:
      return isSetRuleKeys();
    case METADATA:
      return isSetMetadata();
    case BUILD_TARGET:
      return isSetBuildTarget();
    case REPOSITORY:
      return isSetRepository();
    case ARTIFACT_PAYLOAD_CRC32:
      return isSetArtifactPayloadCrc32();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ArtifactMetadata)
      return this.equals((ArtifactMetadata)that);
    return false;
  }

  public boolean equals(ArtifactMetadata that) {
    if (that == null)
      return false;

    boolean this_present_ruleKeys = true && this.isSetRuleKeys();
    boolean that_present_ruleKeys = true && that.isSetRuleKeys();
    if (this_present_ruleKeys || that_present_ruleKeys) {
      if (!(this_present_ruleKeys && that_present_ruleKeys))
        return false;
      if (!this.ruleKeys.equals(that.ruleKeys))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_buildTarget = true && this.isSetBuildTarget();
    boolean that_present_buildTarget = true && that.isSetBuildTarget();
    if (this_present_buildTarget || that_present_buildTarget) {
      if (!(this_present_buildTarget && that_present_buildTarget))
        return false;
      if (!this.buildTarget.equals(that.buildTarget))
        return false;
    }

    boolean this_present_repository = true && this.isSetRepository();
    boolean that_present_repository = true && that.isSetRepository();
    if (this_present_repository || that_present_repository) {
      if (!(this_present_repository && that_present_repository))
        return false;
      if (!this.repository.equals(that.repository))
        return false;
    }

    boolean this_present_artifactPayloadCrc32 = true && this.isSetArtifactPayloadCrc32();
    boolean that_present_artifactPayloadCrc32 = true && that.isSetArtifactPayloadCrc32();
    if (this_present_artifactPayloadCrc32 || that_present_artifactPayloadCrc32) {
      if (!(this_present_artifactPayloadCrc32 && that_present_artifactPayloadCrc32))
        return false;
      if (!this.artifactPayloadCrc32.equals(that.artifactPayloadCrc32))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ruleKeys = true && (isSetRuleKeys());
    list.add(present_ruleKeys);
    if (present_ruleKeys)
      list.add(ruleKeys);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_buildTarget = true && (isSetBuildTarget());
    list.add(present_buildTarget);
    if (present_buildTarget)
      list.add(buildTarget);

    boolean present_repository = true && (isSetRepository());
    list.add(present_repository);
    if (present_repository)
      list.add(repository);

    boolean present_artifactPayloadCrc32 = true && (isSetArtifactPayloadCrc32());
    list.add(present_artifactPayloadCrc32);
    if (present_artifactPayloadCrc32)
      list.add(artifactPayloadCrc32);

    return list.hashCode();
  }

  @Override
  public int compareTo(ArtifactMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRuleKeys()).compareTo(other.isSetRuleKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleKeys, other.ruleKeys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildTarget()).compareTo(other.isSetBuildTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildTarget, other.buildTarget);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRepository()).compareTo(other.isSetRepository());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepository()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repository, other.repository);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArtifactPayloadCrc32()).compareTo(other.isSetArtifactPayloadCrc32());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArtifactPayloadCrc32()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.artifactPayloadCrc32, other.artifactPayloadCrc32);
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
    StringBuilder sb = new StringBuilder("ArtifactMetadata(");
    boolean first = true;

    if (isSetRuleKeys()) {
      sb.append("ruleKeys:");
      if (this.ruleKeys == null) {
        sb.append("null");
      } else {
        sb.append(this.ruleKeys);
      }
      first = false;
    }
    if (isSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata);
      }
      first = false;
    }
    if (isSetBuildTarget()) {
      if (!first) sb.append(", ");
      sb.append("buildTarget:");
      if (this.buildTarget == null) {
        sb.append("null");
      } else {
        sb.append(this.buildTarget);
      }
      first = false;
    }
    if (isSetRepository()) {
      if (!first) sb.append(", ");
      sb.append("repository:");
      if (this.repository == null) {
        sb.append("null");
      } else {
        sb.append(this.repository);
      }
      first = false;
    }
    if (isSetArtifactPayloadCrc32()) {
      if (!first) sb.append(", ");
      sb.append("artifactPayloadCrc32:");
      if (this.artifactPayloadCrc32 == null) {
        sb.append("null");
      } else {
        sb.append(this.artifactPayloadCrc32);
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

  private static class ArtifactMetadataStandardSchemeFactory implements SchemeFactory {
    public ArtifactMetadataStandardScheme getScheme() {
      return new ArtifactMetadataStandardScheme();
    }
  }

  private static class ArtifactMetadataStandardScheme extends StandardScheme<ArtifactMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ArtifactMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RULE_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.ruleKeys = new ArrayList<RuleKey>(_list0.size);
                RuleKey _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new RuleKey();
                  _elem1.read(iprot);
                  struct.ruleKeys.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRuleKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.metadata = new HashMap<String,String>(2*_map3.size);
                String _key4;
                String _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readString();
                  _val5 = iprot.readString();
                  struct.metadata.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buildTarget = iprot.readString();
              struct.setBuildTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REPOSITORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.repository = iprot.readString();
              struct.setRepositoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ARTIFACT_PAYLOAD_CRC32
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.artifactPayloadCrc32 = iprot.readString();
              struct.setArtifactPayloadCrc32IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ArtifactMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ruleKeys != null) {
        if (struct.isSetRuleKeys()) {
          oprot.writeFieldBegin(RULE_KEYS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ruleKeys.size()));
            for (RuleKey _iter7 : struct.ruleKeys)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.metadata.size()));
            for (Map.Entry<String, String> _iter8 : struct.metadata.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeString(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildTarget != null) {
        if (struct.isSetBuildTarget()) {
          oprot.writeFieldBegin(BUILD_TARGET_FIELD_DESC);
          oprot.writeString(struct.buildTarget);
          oprot.writeFieldEnd();
        }
      }
      if (struct.repository != null) {
        if (struct.isSetRepository()) {
          oprot.writeFieldBegin(REPOSITORY_FIELD_DESC);
          oprot.writeString(struct.repository);
          oprot.writeFieldEnd();
        }
      }
      if (struct.artifactPayloadCrc32 != null) {
        if (struct.isSetArtifactPayloadCrc32()) {
          oprot.writeFieldBegin(ARTIFACT_PAYLOAD_CRC32_FIELD_DESC);
          oprot.writeString(struct.artifactPayloadCrc32);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArtifactMetadataTupleSchemeFactory implements SchemeFactory {
    public ArtifactMetadataTupleScheme getScheme() {
      return new ArtifactMetadataTupleScheme();
    }
  }

  private static class ArtifactMetadataTupleScheme extends TupleScheme<ArtifactMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ArtifactMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRuleKeys()) {
        optionals.set(0);
      }
      if (struct.isSetMetadata()) {
        optionals.set(1);
      }
      if (struct.isSetBuildTarget()) {
        optionals.set(2);
      }
      if (struct.isSetRepository()) {
        optionals.set(3);
      }
      if (struct.isSetArtifactPayloadCrc32()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetRuleKeys()) {
        {
          oprot.writeI32(struct.ruleKeys.size());
          for (RuleKey _iter9 : struct.ruleKeys)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.isSetMetadata()) {
        {
          oprot.writeI32(struct.metadata.size());
          for (Map.Entry<String, String> _iter10 : struct.metadata.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
      if (struct.isSetBuildTarget()) {
        oprot.writeString(struct.buildTarget);
      }
      if (struct.isSetRepository()) {
        oprot.writeString(struct.repository);
      }
      if (struct.isSetArtifactPayloadCrc32()) {
        oprot.writeString(struct.artifactPayloadCrc32);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ArtifactMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ruleKeys = new ArrayList<RuleKey>(_list11.size);
          RuleKey _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = new RuleKey();
            _elem12.read(iprot);
            struct.ruleKeys.add(_elem12);
          }
        }
        struct.setRuleKeysIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.metadata = new HashMap<String,String>(2*_map14.size);
          String _key15;
          String _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readString();
            _val16 = iprot.readString();
            struct.metadata.put(_key15, _val16);
          }
        }
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildTarget = iprot.readString();
        struct.setBuildTargetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.repository = iprot.readString();
        struct.setRepositoryIsSet(true);
      }
      if (incoming.get(4)) {
        struct.artifactPayloadCrc32 = iprot.readString();
        struct.setArtifactPayloadCrc32IsSet(true);
      }
    }
  }

}

