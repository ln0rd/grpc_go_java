// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage_message.proto

package com.github.ln0rd.grpc_go_java.pb;

/**
 * Protobuf type {@code grpc_go_java.proto.Storage}
 */
public final class Storage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc_go_java.proto.Storage)
    StorageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Storage.newBuilder() to construct.
  private Storage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Storage() {
    driver_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Storage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Storage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            driver_ = rawValue;
            break;
          }
          case 18: {
            com.github.ln0rd.grpc_go_java.pb.Memory.Builder subBuilder = null;
            if (memory_ != null) {
              subBuilder = memory_.toBuilder();
            }
            memory_ = input.readMessage(com.github.ln0rd.grpc_go_java.pb.Memory.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(memory_);
              memory_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.ln0rd.grpc_go_java.pb.StorageMessage.internal_static_grpc_go_java_proto_Storage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.ln0rd.grpc_go_java.pb.StorageMessage.internal_static_grpc_go_java_proto_Storage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.ln0rd.grpc_go_java.pb.Storage.class, com.github.ln0rd.grpc_go_java.pb.Storage.Builder.class);
  }

  /**
   * Protobuf enum {@code grpc_go_java.proto.Storage.Driver}
   */
  public enum Driver
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>HDD = 1;</code>
     */
    HDD(1),
    /**
     * <code>SSD = 2;</code>
     */
    SSD(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>HDD = 1;</code>
     */
    public static final int HDD_VALUE = 1;
    /**
     * <code>SSD = 2;</code>
     */
    public static final int SSD_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Driver valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Driver forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return HDD;
        case 2: return SSD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Driver>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Driver> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Driver>() {
            public Driver findValueByNumber(int number) {
              return Driver.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.ln0rd.grpc_go_java.pb.Storage.getDescriptor().getEnumTypes().get(0);
    }

    private static final Driver[] VALUES = values();

    public static Driver valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Driver(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grpc_go_java.proto.Storage.Driver)
  }

  public static final int DRIVER_FIELD_NUMBER = 1;
  private int driver_;
  /**
   * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
   * @return The enum numeric value on the wire for driver.
   */
  @java.lang.Override public int getDriverValue() {
    return driver_;
  }
  /**
   * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
   * @return The driver.
   */
  @java.lang.Override public com.github.ln0rd.grpc_go_java.pb.Storage.Driver getDriver() {
    @SuppressWarnings("deprecation")
    com.github.ln0rd.grpc_go_java.pb.Storage.Driver result = com.github.ln0rd.grpc_go_java.pb.Storage.Driver.valueOf(driver_);
    return result == null ? com.github.ln0rd.grpc_go_java.pb.Storage.Driver.UNRECOGNIZED : result;
  }

  public static final int MEMORY_FIELD_NUMBER = 2;
  private com.github.ln0rd.grpc_go_java.pb.Memory memory_;
  /**
   * <code>.grpc_go_java.proto.Memory memory = 2;</code>
   * @return Whether the memory field is set.
   */
  @java.lang.Override
  public boolean hasMemory() {
    return memory_ != null;
  }
  /**
   * <code>.grpc_go_java.proto.Memory memory = 2;</code>
   * @return The memory.
   */
  @java.lang.Override
  public com.github.ln0rd.grpc_go_java.pb.Memory getMemory() {
    return memory_ == null ? com.github.ln0rd.grpc_go_java.pb.Memory.getDefaultInstance() : memory_;
  }
  /**
   * <code>.grpc_go_java.proto.Memory memory = 2;</code>
   */
  @java.lang.Override
  public com.github.ln0rd.grpc_go_java.pb.MemoryOrBuilder getMemoryOrBuilder() {
    return getMemory();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (driver_ != com.github.ln0rd.grpc_go_java.pb.Storage.Driver.UNKNOWN.getNumber()) {
      output.writeEnum(1, driver_);
    }
    if (memory_ != null) {
      output.writeMessage(2, getMemory());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (driver_ != com.github.ln0rd.grpc_go_java.pb.Storage.Driver.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, driver_);
    }
    if (memory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMemory());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.ln0rd.grpc_go_java.pb.Storage)) {
      return super.equals(obj);
    }
    com.github.ln0rd.grpc_go_java.pb.Storage other = (com.github.ln0rd.grpc_go_java.pb.Storage) obj;

    if (driver_ != other.driver_) return false;
    if (hasMemory() != other.hasMemory()) return false;
    if (hasMemory()) {
      if (!getMemory()
          .equals(other.getMemory())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DRIVER_FIELD_NUMBER;
    hash = (53 * hash) + driver_;
    if (hasMemory()) {
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + getMemory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.ln0rd.grpc_go_java.pb.Storage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.ln0rd.grpc_go_java.pb.Storage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc_go_java.proto.Storage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc_go_java.proto.Storage)
      com.github.ln0rd.grpc_go_java.pb.StorageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.ln0rd.grpc_go_java.pb.StorageMessage.internal_static_grpc_go_java_proto_Storage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.ln0rd.grpc_go_java.pb.StorageMessage.internal_static_grpc_go_java_proto_Storage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.ln0rd.grpc_go_java.pb.Storage.class, com.github.ln0rd.grpc_go_java.pb.Storage.Builder.class);
    }

    // Construct using com.github.ln0rd.grpc_go_java.pb.Storage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      driver_ = 0;

      if (memoryBuilder_ == null) {
        memory_ = null;
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.ln0rd.grpc_go_java.pb.StorageMessage.internal_static_grpc_go_java_proto_Storage_descriptor;
    }

    @java.lang.Override
    public com.github.ln0rd.grpc_go_java.pb.Storage getDefaultInstanceForType() {
      return com.github.ln0rd.grpc_go_java.pb.Storage.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.ln0rd.grpc_go_java.pb.Storage build() {
      com.github.ln0rd.grpc_go_java.pb.Storage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.ln0rd.grpc_go_java.pb.Storage buildPartial() {
      com.github.ln0rd.grpc_go_java.pb.Storage result = new com.github.ln0rd.grpc_go_java.pb.Storage(this);
      result.driver_ = driver_;
      if (memoryBuilder_ == null) {
        result.memory_ = memory_;
      } else {
        result.memory_ = memoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.ln0rd.grpc_go_java.pb.Storage) {
        return mergeFrom((com.github.ln0rd.grpc_go_java.pb.Storage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.ln0rd.grpc_go_java.pb.Storage other) {
      if (other == com.github.ln0rd.grpc_go_java.pb.Storage.getDefaultInstance()) return this;
      if (other.driver_ != 0) {
        setDriverValue(other.getDriverValue());
      }
      if (other.hasMemory()) {
        mergeMemory(other.getMemory());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.ln0rd.grpc_go_java.pb.Storage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.ln0rd.grpc_go_java.pb.Storage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int driver_ = 0;
    /**
     * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
     * @return The enum numeric value on the wire for driver.
     */
    @java.lang.Override public int getDriverValue() {
      return driver_;
    }
    /**
     * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
     * @param value The enum numeric value on the wire for driver to set.
     * @return This builder for chaining.
     */
    public Builder setDriverValue(int value) {
      
      driver_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
     * @return The driver.
     */
    @java.lang.Override
    public com.github.ln0rd.grpc_go_java.pb.Storage.Driver getDriver() {
      @SuppressWarnings("deprecation")
      com.github.ln0rd.grpc_go_java.pb.Storage.Driver result = com.github.ln0rd.grpc_go_java.pb.Storage.Driver.valueOf(driver_);
      return result == null ? com.github.ln0rd.grpc_go_java.pb.Storage.Driver.UNRECOGNIZED : result;
    }
    /**
     * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
     * @param value The driver to set.
     * @return This builder for chaining.
     */
    public Builder setDriver(com.github.ln0rd.grpc_go_java.pb.Storage.Driver value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      driver_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Storage.Driver driver = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDriver() {
      
      driver_ = 0;
      onChanged();
      return this;
    }

    private com.github.ln0rd.grpc_go_java.pb.Memory memory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.ln0rd.grpc_go_java.pb.Memory, com.github.ln0rd.grpc_go_java.pb.Memory.Builder, com.github.ln0rd.grpc_go_java.pb.MemoryOrBuilder> memoryBuilder_;
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     * @return Whether the memory field is set.
     */
    public boolean hasMemory() {
      return memoryBuilder_ != null || memory_ != null;
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     * @return The memory.
     */
    public com.github.ln0rd.grpc_go_java.pb.Memory getMemory() {
      if (memoryBuilder_ == null) {
        return memory_ == null ? com.github.ln0rd.grpc_go_java.pb.Memory.getDefaultInstance() : memory_;
      } else {
        return memoryBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public Builder setMemory(com.github.ln0rd.grpc_go_java.pb.Memory value) {
      if (memoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        memory_ = value;
        onChanged();
      } else {
        memoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public Builder setMemory(
        com.github.ln0rd.grpc_go_java.pb.Memory.Builder builderForValue) {
      if (memoryBuilder_ == null) {
        memory_ = builderForValue.build();
        onChanged();
      } else {
        memoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public Builder mergeMemory(com.github.ln0rd.grpc_go_java.pb.Memory value) {
      if (memoryBuilder_ == null) {
        if (memory_ != null) {
          memory_ =
            com.github.ln0rd.grpc_go_java.pb.Memory.newBuilder(memory_).mergeFrom(value).buildPartial();
        } else {
          memory_ = value;
        }
        onChanged();
      } else {
        memoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public Builder clearMemory() {
      if (memoryBuilder_ == null) {
        memory_ = null;
        onChanged();
      } else {
        memory_ = null;
        memoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public com.github.ln0rd.grpc_go_java.pb.Memory.Builder getMemoryBuilder() {
      
      onChanged();
      return getMemoryFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    public com.github.ln0rd.grpc_go_java.pb.MemoryOrBuilder getMemoryOrBuilder() {
      if (memoryBuilder_ != null) {
        return memoryBuilder_.getMessageOrBuilder();
      } else {
        return memory_ == null ?
            com.github.ln0rd.grpc_go_java.pb.Memory.getDefaultInstance() : memory_;
      }
    }
    /**
     * <code>.grpc_go_java.proto.Memory memory = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.ln0rd.grpc_go_java.pb.Memory, com.github.ln0rd.grpc_go_java.pb.Memory.Builder, com.github.ln0rd.grpc_go_java.pb.MemoryOrBuilder> 
        getMemoryFieldBuilder() {
      if (memoryBuilder_ == null) {
        memoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.ln0rd.grpc_go_java.pb.Memory, com.github.ln0rd.grpc_go_java.pb.Memory.Builder, com.github.ln0rd.grpc_go_java.pb.MemoryOrBuilder>(
                getMemory(),
                getParentForChildren(),
                isClean());
        memory_ = null;
      }
      return memoryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc_go_java.proto.Storage)
  }

  // @@protoc_insertion_point(class_scope:grpc_go_java.proto.Storage)
  private static final com.github.ln0rd.grpc_go_java.pb.Storage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.ln0rd.grpc_go_java.pb.Storage();
  }

  public static com.github.ln0rd.grpc_go_java.pb.Storage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Storage>
      PARSER = new com.google.protobuf.AbstractParser<Storage>() {
    @java.lang.Override
    public Storage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Storage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Storage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Storage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.ln0rd.grpc_go_java.pb.Storage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

