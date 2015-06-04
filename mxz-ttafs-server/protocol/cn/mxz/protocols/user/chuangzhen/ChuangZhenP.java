// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chuang_zhen.p

package cn.mxz.protocols.user.chuangzhen;

public final class ChuangZhenP {
  private ChuangZhenP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChuangZhenWarSituationProOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 star1 = 9123;
    boolean hasStar1();
    int getStar1();
    
    // required int32 X = 993;
    boolean hasX();
    int getX();
    
    // required int32 star2 = 123;
    boolean hasStar2();
    int getStar2();
    
    // required int32 floor1 = 1233;
    boolean hasFloor1();
    int getFloor1();
    
    // required int32 floor2 = 8943;
    boolean hasFloor2();
    int getFloor2();
    
    // required int32 timesRemain = 1239;
    boolean hasTimesRemain();
    int getTimesRemain();
    
    // required int32 rank = 1235;
    boolean hasRank();
    int getRank();
    
    // required int32 fighterCount = 2153;
    boolean hasFighterCount();
    int getFighterCount();
    
    // required int32 cash = 213;
    boolean hasCash();
    int getCash();
    
    // required .cn.mxz.protocols.user.battle.WarSituationPro warSituation = 10;
    boolean hasWarSituation();
    cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro getWarSituation();
    cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder getWarSituationOrBuilder();
  }
  public static final class ChuangZhenWarSituationPro extends
      com.google.protobuf.GeneratedMessage
      implements ChuangZhenWarSituationProOrBuilder {
    // Use ChuangZhenWarSituationPro.newBuilder() to construct.
    private ChuangZhenWarSituationPro(Builder builder) {
      super(builder);
    }
    private ChuangZhenWarSituationPro(boolean noInit) {}
    
    private static final ChuangZhenWarSituationPro defaultInstance;
    public static ChuangZhenWarSituationPro getDefaultInstance() {
      return defaultInstance;
    }
    
    public ChuangZhenWarSituationPro getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 star1 = 9123;
    public static final int STAR1_FIELD_NUMBER = 9123;
    private int star1_;
    public boolean hasStar1() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStar1() {
      return star1_;
    }
    
    // required int32 X = 993;
    public static final int X_FIELD_NUMBER = 993;
    private int x_;
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getX() {
      return x_;
    }
    
    // required int32 star2 = 123;
    public static final int STAR2_FIELD_NUMBER = 123;
    private int star2_;
    public boolean hasStar2() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getStar2() {
      return star2_;
    }
    
    // required int32 floor1 = 1233;
    public static final int FLOOR1_FIELD_NUMBER = 1233;
    private int floor1_;
    public boolean hasFloor1() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getFloor1() {
      return floor1_;
    }
    
    // required int32 floor2 = 8943;
    public static final int FLOOR2_FIELD_NUMBER = 8943;
    private int floor2_;
    public boolean hasFloor2() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getFloor2() {
      return floor2_;
    }
    
    // required int32 timesRemain = 1239;
    public static final int TIMESREMAIN_FIELD_NUMBER = 1239;
    private int timesRemain_;
    public boolean hasTimesRemain() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getTimesRemain() {
      return timesRemain_;
    }
    
    // required int32 rank = 1235;
    public static final int RANK_FIELD_NUMBER = 1235;
    private int rank_;
    public boolean hasRank() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getRank() {
      return rank_;
    }
    
    // required int32 fighterCount = 2153;
    public static final int FIGHTERCOUNT_FIELD_NUMBER = 2153;
    private int fighterCount_;
    public boolean hasFighterCount() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getFighterCount() {
      return fighterCount_;
    }
    
    // required int32 cash = 213;
    public static final int CASH_FIELD_NUMBER = 213;
    private int cash_;
    public boolean hasCash() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getCash() {
      return cash_;
    }
    
    // required .cn.mxz.protocols.user.battle.WarSituationPro warSituation = 10;
    public static final int WARSITUATION_FIELD_NUMBER = 10;
    private cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro warSituation_;
    public boolean hasWarSituation() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro getWarSituation() {
      return warSituation_;
    }
    public cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder getWarSituationOrBuilder() {
      return warSituation_;
    }
    
    private void initFields() {
      star1_ = 0;
      x_ = 0;
      star2_ = 0;
      floor1_ = 0;
      floor2_ = 0;
      timesRemain_ = 0;
      rank_ = 0;
      fighterCount_ = 0;
      cash_ = 0;
      warSituation_ = cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStar1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStar2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFloor1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFloor2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimesRemain()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRank()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFighterCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCash()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWarSituation()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getWarSituation().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeMessage(10, warSituation_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(123, star2_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(213, cash_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(993, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(1233, floor1_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(1235, rank_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(1239, timesRemain_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(2153, fighterCount_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(8943, floor2_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(9123, star1_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, warSituation_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(123, star2_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(213, cash_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(993, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1233, floor1_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1235, rank_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1239, timesRemain_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2153, fighterCount_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8943, floor2_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9123, star1_);
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
    
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseDelimitedFrom(
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
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro prototype) {
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
       implements cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationProOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_fieldAccessorTable;
      }
      
      // Construct using cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getWarSituationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        star1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        star2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        floor1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        floor2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        timesRemain_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        rank_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        fighterCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        cash_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        if (warSituationBuilder_ == null) {
          warSituation_ = cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.getDefaultInstance();
        } else {
          warSituationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.getDescriptor();
      }
      
      public cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro getDefaultInstanceForType() {
        return cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.getDefaultInstance();
      }
      
      public cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro build() {
        cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro buildPartial() {
        cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro result = new cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.star1_ = star1_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.star2_ = star2_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.floor1_ = floor1_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.floor2_ = floor2_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.timesRemain_ = timesRemain_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.rank_ = rank_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.fighterCount_ = fighterCount_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.cash_ = cash_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        if (warSituationBuilder_ == null) {
          result.warSituation_ = warSituation_;
        } else {
          result.warSituation_ = warSituationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro) {
          return mergeFrom((cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro other) {
        if (other == cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.getDefaultInstance()) return this;
        if (other.hasStar1()) {
          setStar1(other.getStar1());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasStar2()) {
          setStar2(other.getStar2());
        }
        if (other.hasFloor1()) {
          setFloor1(other.getFloor1());
        }
        if (other.hasFloor2()) {
          setFloor2(other.getFloor2());
        }
        if (other.hasTimesRemain()) {
          setTimesRemain(other.getTimesRemain());
        }
        if (other.hasRank()) {
          setRank(other.getRank());
        }
        if (other.hasFighterCount()) {
          setFighterCount(other.getFighterCount());
        }
        if (other.hasCash()) {
          setCash(other.getCash());
        }
        if (other.hasWarSituation()) {
          mergeWarSituation(other.getWarSituation());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStar1()) {
          
          return false;
        }
        if (!hasX()) {
          
          return false;
        }
        if (!hasStar2()) {
          
          return false;
        }
        if (!hasFloor1()) {
          
          return false;
        }
        if (!hasFloor2()) {
          
          return false;
        }
        if (!hasTimesRemain()) {
          
          return false;
        }
        if (!hasRank()) {
          
          return false;
        }
        if (!hasFighterCount()) {
          
          return false;
        }
        if (!hasCash()) {
          
          return false;
        }
        if (!hasWarSituation()) {
          
          return false;
        }
        if (!getWarSituation().isInitialized()) {
          
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
            case 82: {
              cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder subBuilder = cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.newBuilder();
              if (hasWarSituation()) {
                subBuilder.mergeFrom(getWarSituation());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setWarSituation(subBuilder.buildPartial());
              break;
            }
            case 984: {
              bitField0_ |= 0x00000004;
              star2_ = input.readInt32();
              break;
            }
            case 1704: {
              bitField0_ |= 0x00000100;
              cash_ = input.readInt32();
              break;
            }
            case 7944: {
              bitField0_ |= 0x00000002;
              x_ = input.readInt32();
              break;
            }
            case 9864: {
              bitField0_ |= 0x00000008;
              floor1_ = input.readInt32();
              break;
            }
            case 9880: {
              bitField0_ |= 0x00000040;
              rank_ = input.readInt32();
              break;
            }
            case 9912: {
              bitField0_ |= 0x00000020;
              timesRemain_ = input.readInt32();
              break;
            }
            case 17224: {
              bitField0_ |= 0x00000080;
              fighterCount_ = input.readInt32();
              break;
            }
            case 71544: {
              bitField0_ |= 0x00000010;
              floor2_ = input.readInt32();
              break;
            }
            case 72984: {
              bitField0_ |= 0x00000001;
              star1_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 star1 = 9123;
      private int star1_ ;
      public boolean hasStar1() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStar1() {
        return star1_;
      }
      public Builder setStar1(int value) {
        bitField0_ |= 0x00000001;
        star1_ = value;
        onChanged();
        return this;
      }
      public Builder clearStar1() {
        bitField0_ = (bitField0_ & ~0x00000001);
        star1_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 X = 993;
      private int x_ ;
      public boolean hasX() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getX() {
        return x_;
      }
      public Builder setX(int value) {
        bitField0_ |= 0x00000002;
        x_ = value;
        onChanged();
        return this;
      }
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 star2 = 123;
      private int star2_ ;
      public boolean hasStar2() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getStar2() {
        return star2_;
      }
      public Builder setStar2(int value) {
        bitField0_ |= 0x00000004;
        star2_ = value;
        onChanged();
        return this;
      }
      public Builder clearStar2() {
        bitField0_ = (bitField0_ & ~0x00000004);
        star2_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 floor1 = 1233;
      private int floor1_ ;
      public boolean hasFloor1() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getFloor1() {
        return floor1_;
      }
      public Builder setFloor1(int value) {
        bitField0_ |= 0x00000008;
        floor1_ = value;
        onChanged();
        return this;
      }
      public Builder clearFloor1() {
        bitField0_ = (bitField0_ & ~0x00000008);
        floor1_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 floor2 = 8943;
      private int floor2_ ;
      public boolean hasFloor2() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getFloor2() {
        return floor2_;
      }
      public Builder setFloor2(int value) {
        bitField0_ |= 0x00000010;
        floor2_ = value;
        onChanged();
        return this;
      }
      public Builder clearFloor2() {
        bitField0_ = (bitField0_ & ~0x00000010);
        floor2_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 timesRemain = 1239;
      private int timesRemain_ ;
      public boolean hasTimesRemain() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getTimesRemain() {
        return timesRemain_;
      }
      public Builder setTimesRemain(int value) {
        bitField0_ |= 0x00000020;
        timesRemain_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimesRemain() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timesRemain_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 rank = 1235;
      private int rank_ ;
      public boolean hasRank() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getRank() {
        return rank_;
      }
      public Builder setRank(int value) {
        bitField0_ |= 0x00000040;
        rank_ = value;
        onChanged();
        return this;
      }
      public Builder clearRank() {
        bitField0_ = (bitField0_ & ~0x00000040);
        rank_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 fighterCount = 2153;
      private int fighterCount_ ;
      public boolean hasFighterCount() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getFighterCount() {
        return fighterCount_;
      }
      public Builder setFighterCount(int value) {
        bitField0_ |= 0x00000080;
        fighterCount_ = value;
        onChanged();
        return this;
      }
      public Builder clearFighterCount() {
        bitField0_ = (bitField0_ & ~0x00000080);
        fighterCount_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 cash = 213;
      private int cash_ ;
      public boolean hasCash() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getCash() {
        return cash_;
      }
      public Builder setCash(int value) {
        bitField0_ |= 0x00000100;
        cash_ = value;
        onChanged();
        return this;
      }
      public Builder clearCash() {
        bitField0_ = (bitField0_ & ~0x00000100);
        cash_ = 0;
        onChanged();
        return this;
      }
      
      // required .cn.mxz.protocols.user.battle.WarSituationPro warSituation = 10;
      private cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro warSituation_ = cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro, cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder, cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder> warSituationBuilder_;
      public boolean hasWarSituation() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro getWarSituation() {
        if (warSituationBuilder_ == null) {
          return warSituation_;
        } else {
          return warSituationBuilder_.getMessage();
        }
      }
      public Builder setWarSituation(cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro value) {
        if (warSituationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          warSituation_ = value;
          onChanged();
        } else {
          warSituationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      public Builder setWarSituation(
          cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder builderForValue) {
        if (warSituationBuilder_ == null) {
          warSituation_ = builderForValue.build();
          onChanged();
        } else {
          warSituationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      public Builder mergeWarSituation(cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro value) {
        if (warSituationBuilder_ == null) {
          if (((bitField0_ & 0x00000200) == 0x00000200) &&
              warSituation_ != cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.getDefaultInstance()) {
            warSituation_ =
              cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.newBuilder(warSituation_).mergeFrom(value).buildPartial();
          } else {
            warSituation_ = value;
          }
          onChanged();
        } else {
          warSituationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      public Builder clearWarSituation() {
        if (warSituationBuilder_ == null) {
          warSituation_ = cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.getDefaultInstance();
          onChanged();
        } else {
          warSituationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      public cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder getWarSituationBuilder() {
        bitField0_ |= 0x00000200;
        onChanged();
        return getWarSituationFieldBuilder().getBuilder();
      }
      public cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder getWarSituationOrBuilder() {
        if (warSituationBuilder_ != null) {
          return warSituationBuilder_.getMessageOrBuilder();
        } else {
          return warSituation_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro, cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder, cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder> 
          getWarSituationFieldBuilder() {
        if (warSituationBuilder_ == null) {
          warSituationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro, cn.mxz.protocols.user.battle.WarSituationP.WarSituationPro.Builder, cn.mxz.protocols.user.battle.WarSituationP.WarSituationProOrBuilder>(
                  warSituation_,
                  getParentForChildren(),
                  isClean());
          warSituation_ = null;
        }
        return warSituationBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:cn.mxz.protocols.user.chuangzhen.ChuangZhenWarSituationPro)
    }
    
    static {
      defaultInstance = new ChuangZhenWarSituationPro(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:cn.mxz.protocols.user.chuangzhen.ChuangZhenWarSituationPro)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rchuang_zhen.p\022 cn.mxz.protocols.user.c" +
      "huangzhen\032\017war_situation.p\"\370\001\n\031ChuangZhe" +
      "nWarSituationPro\022\016\n\005star1\030\243G \002(\005\022\n\n\001X\030\341\007" +
      " \002(\005\022\r\n\005star2\030{ \002(\005\022\017\n\006floor1\030\321\t \002(\005\022\017\n\006" +
      "floor2\030\357E \002(\005\022\024\n\013timesRemain\030\327\t \002(\005\022\r\n\004r" +
      "ank\030\323\t \002(\005\022\025\n\014fighterCount\030\351\020 \002(\005\022\r\n\004cas" +
      "h\030\325\001 \002(\005\022C\n\014warSituation\030\n \002(\0132-.cn.mxz." +
      "protocols.user.battle.WarSituationPro"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cn_mxz_protocols_user_chuangzhen_ChuangZhenWarSituationPro_descriptor,
              new java.lang.String[] { "Star1", "X", "Star2", "Floor1", "Floor2", "TimesRemain", "Rank", "FighterCount", "Cash", "WarSituation", },
              cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.class,
              cn.mxz.protocols.user.chuangzhen.ChuangZhenP.ChuangZhenWarSituationPro.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.mxz.protocols.user.battle.WarSituationP.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
