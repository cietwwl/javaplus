// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zan.p

package cn.mxz.protocols.zan;

public final class ZanP {
  private ZanP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ZanProOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 totalCount = 1;
    boolean hasTotalCount();
    int getTotalCount();
    
    // required int32 count = 2;
    boolean hasCount();
    int getCount();
    
    // required bool todayIsClick = 3;
    boolean hasTodayIsClick();
    boolean getTodayIsClick();
    
    // required int32 nextGold = 5;
    boolean hasNextGold();
    int getNextGold();
    
    // required int32 level = 6;
    boolean hasLevel();
    int getLevel();
  }
  public static final class ZanPro extends
      com.google.protobuf.GeneratedMessage
      implements ZanProOrBuilder {
    // Use ZanPro.newBuilder() to construct.
    private ZanPro(Builder builder) {
      super(builder);
    }
    private ZanPro(boolean noInit) {}
    
    private static final ZanPro defaultInstance;
    public static ZanPro getDefaultInstance() {
      return defaultInstance;
    }
    
    public ZanPro getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.mxz.protocols.zan.ZanP.internal_static_cn_mxz_protocols_zan_ZanPro_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.mxz.protocols.zan.ZanP.internal_static_cn_mxz_protocols_zan_ZanPro_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 totalCount = 1;
    public static final int TOTALCOUNT_FIELD_NUMBER = 1;
    private int totalCount_;
    public boolean hasTotalCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getTotalCount() {
      return totalCount_;
    }
    
    // required int32 count = 2;
    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getCount() {
      return count_;
    }
    
    // required bool todayIsClick = 3;
    public static final int TODAYISCLICK_FIELD_NUMBER = 3;
    private boolean todayIsClick_;
    public boolean hasTodayIsClick() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getTodayIsClick() {
      return todayIsClick_;
    }
    
    // required int32 nextGold = 5;
    public static final int NEXTGOLD_FIELD_NUMBER = 5;
    private int nextGold_;
    public boolean hasNextGold() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getNextGold() {
      return nextGold_;
    }
    
    // required int32 level = 6;
    public static final int LEVEL_FIELD_NUMBER = 6;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getLevel() {
      return level_;
    }
    
    private void initFields() {
      totalCount_ = 0;
      count_ = 0;
      todayIsClick_ = false;
      nextGold_ = 0;
      level_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTotalCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTodayIsClick()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNextGold()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, totalCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, count_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, todayIsClick_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(5, nextGold_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, level_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, totalCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, count_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, todayIsClick_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, nextGold_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, level_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.zan.ZanP.ZanPro parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.mxz.protocols.zan.ZanP.ZanPro prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cn.mxz.protocols.zan.ZanP.ZanProOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.mxz.protocols.zan.ZanP.internal_static_cn_mxz_protocols_zan_ZanPro_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.mxz.protocols.zan.ZanP.internal_static_cn_mxz_protocols_zan_ZanPro_fieldAccessorTable;
      }
      
      // Construct using cn.mxz.protocols.zan.ZanP.ZanPro.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        totalCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        todayIsClick_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        nextGold_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.mxz.protocols.zan.ZanP.ZanPro.getDescriptor();
      }
      
      public cn.mxz.protocols.zan.ZanP.ZanPro getDefaultInstanceForType() {
        return cn.mxz.protocols.zan.ZanP.ZanPro.getDefaultInstance();
      }
      
      public cn.mxz.protocols.zan.ZanP.ZanPro build() {
        cn.mxz.protocols.zan.ZanP.ZanPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cn.mxz.protocols.zan.ZanP.ZanPro buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cn.mxz.protocols.zan.ZanP.ZanPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public cn.mxz.protocols.zan.ZanP.ZanPro buildPartial() {
        cn.mxz.protocols.zan.ZanP.ZanPro result = new cn.mxz.protocols.zan.ZanP.ZanPro(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.totalCount_ = totalCount_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.count_ = count_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.todayIsClick_ = todayIsClick_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.nextGold_ = nextGold_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.level_ = level_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.mxz.protocols.zan.ZanP.ZanPro) {
          return mergeFrom((cn.mxz.protocols.zan.ZanP.ZanPro)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cn.mxz.protocols.zan.ZanP.ZanPro other) {
        if (other == cn.mxz.protocols.zan.ZanP.ZanPro.getDefaultInstance()) return this;
        if (other.hasTotalCount()) {
          setTotalCount(other.getTotalCount());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (other.hasTodayIsClick()) {
          setTodayIsClick(other.getTodayIsClick());
        }
        if (other.hasNextGold()) {
          setNextGold(other.getNextGold());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTotalCount()) {
          
          return false;
        }
        if (!hasCount()) {
          
          return false;
        }
        if (!hasTodayIsClick()) {
          
          return false;
        }
        if (!hasNextGold()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              totalCount_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              count_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              todayIsClick_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              nextGold_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              level_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 totalCount = 1;
      private int totalCount_ ;
      public boolean hasTotalCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getTotalCount() {
        return totalCount_;
      }
      public Builder setTotalCount(int value) {
        bitField0_ |= 0x00000001;
        totalCount_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        totalCount_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 count = 2;
      private int count_ ;
      public boolean hasCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getCount() {
        return count_;
      }
      public Builder setCount(int value) {
        bitField0_ |= 0x00000002;
        count_ = value;
        onChanged();
        return this;
      }
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        onChanged();
        return this;
      }
      
      // required bool todayIsClick = 3;
      private boolean todayIsClick_ ;
      public boolean hasTodayIsClick() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getTodayIsClick() {
        return todayIsClick_;
      }
      public Builder setTodayIsClick(boolean value) {
        bitField0_ |= 0x00000004;
        todayIsClick_ = value;
        onChanged();
        return this;
      }
      public Builder clearTodayIsClick() {
        bitField0_ = (bitField0_ & ~0x00000004);
        todayIsClick_ = false;
        onChanged();
        return this;
      }
      
      // required int32 nextGold = 5;
      private int nextGold_ ;
      public boolean hasNextGold() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getNextGold() {
        return nextGold_;
      }
      public Builder setNextGold(int value) {
        bitField0_ |= 0x00000008;
        nextGold_ = value;
        onChanged();
        return this;
      }
      public Builder clearNextGold() {
        bitField0_ = (bitField0_ & ~0x00000008);
        nextGold_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 level = 6;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000010;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000010);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:cn.mxz.protocols.zan.ZanPro)
    }
    
    static {
      defaultInstance = new ZanPro(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:cn.mxz.protocols.zan.ZanPro)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_mxz_protocols_zan_ZanPro_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cn_mxz_protocols_zan_ZanPro_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\005zan.p\022\024cn.mxz.protocols.zan\"b\n\006ZanPro\022" +
      "\022\n\ntotalCount\030\001 \002(\005\022\r\n\005count\030\002 \002(\005\022\024\n\014to" +
      "dayIsClick\030\003 \002(\010\022\020\n\010nextGold\030\005 \002(\005\022\r\n\005le" +
      "vel\030\006 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cn_mxz_protocols_zan_ZanPro_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cn_mxz_protocols_zan_ZanPro_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cn_mxz_protocols_zan_ZanPro_descriptor,
              new java.lang.String[] { "TotalCount", "Count", "TodayIsClick", "NextGold", "Level", },
              cn.mxz.protocols.zan.ZanP.ZanPro.class,
              cn.mxz.protocols.zan.ZanP.ZanPro.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
