// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cornucopia.p

package cn.mxz.protocols.cornucopia;

public final class CornucopiaP {
  private CornucopiaP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CornucopiaProOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 times = 5;
    boolean hasTimes();
    int getTimes();
    
    // required int32 maxTimes = 31;
    boolean hasMaxTimes();
    int getMaxTimes();
    
    // required int32 all = 12398;
    boolean hasAll();
    int getAll();
    
    // required int32 yunShi = 291;
    boolean hasYunShi();
    int getYunShi();
    
    // required int32 type = 2130;
    boolean hasType();
    int getType();
    
    // required string cash = 1874;
    boolean hasCash();
    String getCash();
    
    // required int32 couponsNeed = 993;
    boolean hasCouponsNeed();
    int getCouponsNeed();
  }
  public static final class CornucopiaPro extends
      com.google.protobuf.GeneratedMessage
      implements CornucopiaProOrBuilder {
    // Use CornucopiaPro.newBuilder() to construct.
    private CornucopiaPro(Builder builder) {
      super(builder);
    }
    private CornucopiaPro(boolean noInit) {}
    
    private static final CornucopiaPro defaultInstance;
    public static CornucopiaPro getDefaultInstance() {
      return defaultInstance;
    }
    
    public CornucopiaPro getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.mxz.protocols.cornucopia.CornucopiaP.internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.mxz.protocols.cornucopia.CornucopiaP.internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 times = 5;
    public static final int TIMES_FIELD_NUMBER = 5;
    private int times_;
    public boolean hasTimes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getTimes() {
      return times_;
    }
    
    // required int32 maxTimes = 31;
    public static final int MAXTIMES_FIELD_NUMBER = 31;
    private int maxTimes_;
    public boolean hasMaxTimes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getMaxTimes() {
      return maxTimes_;
    }
    
    // required int32 all = 12398;
    public static final int ALL_FIELD_NUMBER = 12398;
    private int all_;
    public boolean hasAll() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getAll() {
      return all_;
    }
    
    // required int32 yunShi = 291;
    public static final int YUNSHI_FIELD_NUMBER = 291;
    private int yunShi_;
    public boolean hasYunShi() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getYunShi() {
      return yunShi_;
    }
    
    // required int32 type = 2130;
    public static final int TYPE_FIELD_NUMBER = 2130;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getType() {
      return type_;
    }
    
    // required string cash = 1874;
    public static final int CASH_FIELD_NUMBER = 1874;
    private java.lang.Object cash_;
    public boolean hasCash() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getCash() {
      java.lang.Object ref = cash_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          cash_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCashBytes() {
      java.lang.Object ref = cash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        cash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 couponsNeed = 993;
    public static final int COUPONSNEED_FIELD_NUMBER = 993;
    private int couponsNeed_;
    public boolean hasCouponsNeed() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getCouponsNeed() {
      return couponsNeed_;
    }
    
    private void initFields() {
      times_ = 0;
      maxTimes_ = 0;
      all_ = 0;
      yunShi_ = 0;
      type_ = 0;
      cash_ = "";
      couponsNeed_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTimes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMaxTimes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAll()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasYunShi()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCash()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCouponsNeed()) {
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
        output.writeInt32(5, times_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(31, maxTimes_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(291, yunShi_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(993, couponsNeed_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(1874, getCashBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(2130, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(12398, all_);
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
          .computeInt32Size(5, times_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(31, maxTimes_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(291, yunShi_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(993, couponsNeed_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1874, getCashBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2130, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12398, all_);
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
    
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseDelimitedFrom(
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
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro prototype) {
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
       implements cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaProOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.mxz.protocols.cornucopia.CornucopiaP.internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.mxz.protocols.cornucopia.CornucopiaP.internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_fieldAccessorTable;
      }
      
      // Construct using cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.newBuilder()
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
        times_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        maxTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        all_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        yunShi_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        cash_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        couponsNeed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.getDescriptor();
      }
      
      public cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro getDefaultInstanceForType() {
        return cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.getDefaultInstance();
      }
      
      public cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro build() {
        cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro buildPartial() {
        cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro result = new cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.times_ = times_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maxTimes_ = maxTimes_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.all_ = all_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.yunShi_ = yunShi_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.cash_ = cash_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.couponsNeed_ = couponsNeed_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro) {
          return mergeFrom((cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro other) {
        if (other == cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.getDefaultInstance()) return this;
        if (other.hasTimes()) {
          setTimes(other.getTimes());
        }
        if (other.hasMaxTimes()) {
          setMaxTimes(other.getMaxTimes());
        }
        if (other.hasAll()) {
          setAll(other.getAll());
        }
        if (other.hasYunShi()) {
          setYunShi(other.getYunShi());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasCash()) {
          setCash(other.getCash());
        }
        if (other.hasCouponsNeed()) {
          setCouponsNeed(other.getCouponsNeed());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTimes()) {
          
          return false;
        }
        if (!hasMaxTimes()) {
          
          return false;
        }
        if (!hasAll()) {
          
          return false;
        }
        if (!hasYunShi()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasCash()) {
          
          return false;
        }
        if (!hasCouponsNeed()) {
          
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
            case 40: {
              bitField0_ |= 0x00000001;
              times_ = input.readInt32();
              break;
            }
            case 248: {
              bitField0_ |= 0x00000002;
              maxTimes_ = input.readInt32();
              break;
            }
            case 2328: {
              bitField0_ |= 0x00000008;
              yunShi_ = input.readInt32();
              break;
            }
            case 7944: {
              bitField0_ |= 0x00000040;
              couponsNeed_ = input.readInt32();
              break;
            }
            case 14994: {
              bitField0_ |= 0x00000020;
              cash_ = input.readBytes();
              break;
            }
            case 17040: {
              bitField0_ |= 0x00000010;
              type_ = input.readInt32();
              break;
            }
            case 99184: {
              bitField0_ |= 0x00000004;
              all_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 times = 5;
      private int times_ ;
      public boolean hasTimes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getTimes() {
        return times_;
      }
      public Builder setTimes(int value) {
        bitField0_ |= 0x00000001;
        times_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        times_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 maxTimes = 31;
      private int maxTimes_ ;
      public boolean hasMaxTimes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getMaxTimes() {
        return maxTimes_;
      }
      public Builder setMaxTimes(int value) {
        bitField0_ |= 0x00000002;
        maxTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearMaxTimes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maxTimes_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 all = 12398;
      private int all_ ;
      public boolean hasAll() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getAll() {
        return all_;
      }
      public Builder setAll(int value) {
        bitField0_ |= 0x00000004;
        all_ = value;
        onChanged();
        return this;
      }
      public Builder clearAll() {
        bitField0_ = (bitField0_ & ~0x00000004);
        all_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 yunShi = 291;
      private int yunShi_ ;
      public boolean hasYunShi() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getYunShi() {
        return yunShi_;
      }
      public Builder setYunShi(int value) {
        bitField0_ |= 0x00000008;
        yunShi_ = value;
        onChanged();
        return this;
      }
      public Builder clearYunShi() {
        bitField0_ = (bitField0_ & ~0x00000008);
        yunShi_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 type = 2130;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // required string cash = 1874;
      private java.lang.Object cash_ = "";
      public boolean hasCash() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getCash() {
        java.lang.Object ref = cash_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          cash_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCash(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        cash_ = value;
        onChanged();
        return this;
      }
      public Builder clearCash() {
        bitField0_ = (bitField0_ & ~0x00000020);
        cash_ = getDefaultInstance().getCash();
        onChanged();
        return this;
      }
      void setCash(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        cash_ = value;
        onChanged();
      }
      
      // required int32 couponsNeed = 993;
      private int couponsNeed_ ;
      public boolean hasCouponsNeed() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getCouponsNeed() {
        return couponsNeed_;
      }
      public Builder setCouponsNeed(int value) {
        bitField0_ |= 0x00000040;
        couponsNeed_ = value;
        onChanged();
        return this;
      }
      public Builder clearCouponsNeed() {
        bitField0_ = (bitField0_ & ~0x00000040);
        couponsNeed_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:cn.mxz.protocols.cornucopia.CornucopiaPro)
    }
    
    static {
      defaultInstance = new CornucopiaPro(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:cn.mxz.protocols.cornucopia.CornucopiaPro)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014cornucopia.p\022\033cn.mxz.protocols.cornuco" +
      "pia\"\203\001\n\rCornucopiaPro\022\r\n\005times\030\005 \002(\005\022\020\n\010" +
      "maxTimes\030\037 \002(\005\022\014\n\003all\030\356` \002(\005\022\017\n\006yunShi\030\243" +
      "\002 \002(\005\022\r\n\004type\030\322\020 \002(\005\022\r\n\004cash\030\322\016 \002(\t\022\024\n\013c" +
      "ouponsNeed\030\341\007 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cn_mxz_protocols_cornucopia_CornucopiaPro_descriptor,
              new java.lang.String[] { "Times", "MaxTimes", "All", "YunShi", "Type", "Cash", "CouponsNeed", },
              cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.class,
              cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro.Builder.class);
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
