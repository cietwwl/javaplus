// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_base.p

package cn.mxz.protocols.user;

public final class UserBaseP {
  private UserBaseP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserBaseProOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 type = 1;
    boolean hasType();
    int getType();
    
    // required int32 clothes = 2;
    boolean hasClothes();
    int getClothes();
    
    // required string nick = 3;
    boolean hasNick();
    String getNick();
    
    // required int32 level = 4;
    boolean hasLevel();
    int getLevel();
    
    // required bool isMan = 5;
    boolean hasIsMan();
    boolean getIsMan();
    
    // required string userId = 6;
    boolean hasUserId();
    String getUserId();
    
    // required int32 fightingCapacity = 7;
    boolean hasFightingCapacity();
    int getFightingCapacity();
    
    // required int32 rank = 8;
    boolean hasRank();
    int getRank();
    
    // required int32 charm = 9;
    boolean hasCharm();
    int getCharm();
    
    // required int32 charmStartCount = 10;
    boolean hasCharmStartCount();
    int getCharmStartCount();
    
    // required int32 totalGold = 11;
    boolean hasTotalGold();
    int getTotalGold();
    
    // required int32 vipLevel = 124187;
    boolean hasVipLevel();
    int getVipLevel();
    
    // required int32 danId = 219777;
    boolean hasDanId();
    int getDanId();
  }
  public static final class UserBasePro extends
      com.google.protobuf.GeneratedMessage
      implements UserBaseProOrBuilder {
    // Use UserBasePro.newBuilder() to construct.
    private UserBasePro(Builder builder) {
      super(builder);
    }
    private UserBasePro(boolean noInit) {}
    
    private static final UserBasePro defaultInstance;
    public static UserBasePro getDefaultInstance() {
      return defaultInstance;
    }
    
    public UserBasePro getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.mxz.protocols.user.UserBaseP.internal_static_cn_mxz_protocols_user_UserBasePro_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.mxz.protocols.user.UserBaseP.internal_static_cn_mxz_protocols_user_UserBasePro_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getType() {
      return type_;
    }
    
    // required int32 clothes = 2;
    public static final int CLOTHES_FIELD_NUMBER = 2;
    private int clothes_;
    public boolean hasClothes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getClothes() {
      return clothes_;
    }
    
    // required string nick = 3;
    public static final int NICK_FIELD_NUMBER = 3;
    private java.lang.Object nick_;
    public boolean hasNick() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getNick() {
      java.lang.Object ref = nick_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          nick_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNickBytes() {
      java.lang.Object ref = nick_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        nick_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 level = 4;
    public static final int LEVEL_FIELD_NUMBER = 4;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getLevel() {
      return level_;
    }
    
    // required bool isMan = 5;
    public static final int ISMAN_FIELD_NUMBER = 5;
    private boolean isMan_;
    public boolean hasIsMan() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public boolean getIsMan() {
      return isMan_;
    }
    
    // required string userId = 6;
    public static final int USERID_FIELD_NUMBER = 6;
    private java.lang.Object userId_;
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 fightingCapacity = 7;
    public static final int FIGHTINGCAPACITY_FIELD_NUMBER = 7;
    private int fightingCapacity_;
    public boolean hasFightingCapacity() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getFightingCapacity() {
      return fightingCapacity_;
    }
    
    // required int32 rank = 8;
    public static final int RANK_FIELD_NUMBER = 8;
    private int rank_;
    public boolean hasRank() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getRank() {
      return rank_;
    }
    
    // required int32 charm = 9;
    public static final int CHARM_FIELD_NUMBER = 9;
    private int charm_;
    public boolean hasCharm() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getCharm() {
      return charm_;
    }
    
    // required int32 charmStartCount = 10;
    public static final int CHARMSTARTCOUNT_FIELD_NUMBER = 10;
    private int charmStartCount_;
    public boolean hasCharmStartCount() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public int getCharmStartCount() {
      return charmStartCount_;
    }
    
    // required int32 totalGold = 11;
    public static final int TOTALGOLD_FIELD_NUMBER = 11;
    private int totalGold_;
    public boolean hasTotalGold() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public int getTotalGold() {
      return totalGold_;
    }
    
    // required int32 vipLevel = 124187;
    public static final int VIPLEVEL_FIELD_NUMBER = 124187;
    private int vipLevel_;
    public boolean hasVipLevel() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    public int getVipLevel() {
      return vipLevel_;
    }
    
    // required int32 danId = 219777;
    public static final int DANID_FIELD_NUMBER = 219777;
    private int danId_;
    public boolean hasDanId() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    public int getDanId() {
      return danId_;
    }
    
    private void initFields() {
      type_ = 0;
      clothes_ = 0;
      nick_ = "";
      level_ = 0;
      isMan_ = false;
      userId_ = "";
      fightingCapacity_ = 0;
      rank_ = 0;
      charm_ = 0;
      charmStartCount_ = 0;
      totalGold_ = 0;
      vipLevel_ = 0;
      danId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClothes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNick()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsMan()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFightingCapacity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRank()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCharm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCharmStartCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTotalGold()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVipLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDanId()) {
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
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, clothes_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNickBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, isMan_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, fightingCapacity_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, rank_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, charm_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, charmStartCount_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(11, totalGold_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeInt32(124187, vipLevel_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeInt32(219777, danId_);
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, clothes_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNickBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isMan_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, fightingCapacity_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, rank_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, charm_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, charmStartCount_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, totalGold_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(124187, vipLevel_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(219777, danId_);
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
    
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseDelimitedFrom(
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
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.UserBaseP.UserBasePro parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.mxz.protocols.user.UserBaseP.UserBasePro prototype) {
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
       implements cn.mxz.protocols.user.UserBaseP.UserBaseProOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.mxz.protocols.user.UserBaseP.internal_static_cn_mxz_protocols_user_UserBasePro_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.mxz.protocols.user.UserBaseP.internal_static_cn_mxz_protocols_user_UserBasePro_fieldAccessorTable;
      }
      
      // Construct using cn.mxz.protocols.user.UserBaseP.UserBasePro.newBuilder()
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
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        clothes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        nick_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        isMan_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        userId_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        fightingCapacity_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        rank_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        charm_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        charmStartCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        totalGold_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        vipLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        danId_ = 0;
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.mxz.protocols.user.UserBaseP.UserBasePro.getDescriptor();
      }
      
      public cn.mxz.protocols.user.UserBaseP.UserBasePro getDefaultInstanceForType() {
        return cn.mxz.protocols.user.UserBaseP.UserBasePro.getDefaultInstance();
      }
      
      public cn.mxz.protocols.user.UserBaseP.UserBasePro build() {
        cn.mxz.protocols.user.UserBaseP.UserBasePro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cn.mxz.protocols.user.UserBaseP.UserBasePro buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cn.mxz.protocols.user.UserBaseP.UserBasePro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public cn.mxz.protocols.user.UserBaseP.UserBasePro buildPartial() {
        cn.mxz.protocols.user.UserBaseP.UserBasePro result = new cn.mxz.protocols.user.UserBaseP.UserBasePro(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.clothes_ = clothes_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.nick_ = nick_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.isMan_ = isMan_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.fightingCapacity_ = fightingCapacity_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.rank_ = rank_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.charm_ = charm_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.charmStartCount_ = charmStartCount_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.totalGold_ = totalGold_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.vipLevel_ = vipLevel_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.danId_ = danId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.mxz.protocols.user.UserBaseP.UserBasePro) {
          return mergeFrom((cn.mxz.protocols.user.UserBaseP.UserBasePro)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cn.mxz.protocols.user.UserBaseP.UserBasePro other) {
        if (other == cn.mxz.protocols.user.UserBaseP.UserBasePro.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasClothes()) {
          setClothes(other.getClothes());
        }
        if (other.hasNick()) {
          setNick(other.getNick());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasIsMan()) {
          setIsMan(other.getIsMan());
        }
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (other.hasFightingCapacity()) {
          setFightingCapacity(other.getFightingCapacity());
        }
        if (other.hasRank()) {
          setRank(other.getRank());
        }
        if (other.hasCharm()) {
          setCharm(other.getCharm());
        }
        if (other.hasCharmStartCount()) {
          setCharmStartCount(other.getCharmStartCount());
        }
        if (other.hasTotalGold()) {
          setTotalGold(other.getTotalGold());
        }
        if (other.hasVipLevel()) {
          setVipLevel(other.getVipLevel());
        }
        if (other.hasDanId()) {
          setDanId(other.getDanId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasClothes()) {
          
          return false;
        }
        if (!hasNick()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasIsMan()) {
          
          return false;
        }
        if (!hasUserId()) {
          
          return false;
        }
        if (!hasFightingCapacity()) {
          
          return false;
        }
        if (!hasRank()) {
          
          return false;
        }
        if (!hasCharm()) {
          
          return false;
        }
        if (!hasCharmStartCount()) {
          
          return false;
        }
        if (!hasTotalGold()) {
          
          return false;
        }
        if (!hasVipLevel()) {
          
          return false;
        }
        if (!hasDanId()) {
          
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
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              clothes_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              nick_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              level_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              isMan_ = input.readBool();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              userId_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              fightingCapacity_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              rank_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              charm_ = input.readInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              charmStartCount_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              totalGold_ = input.readInt32();
              break;
            }
            case 993496: {
              bitField0_ |= 0x00000800;
              vipLevel_ = input.readInt32();
              break;
            }
            case 1758216: {
              bitField0_ |= 0x00001000;
              danId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 type = 1;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 clothes = 2;
      private int clothes_ ;
      public boolean hasClothes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getClothes() {
        return clothes_;
      }
      public Builder setClothes(int value) {
        bitField0_ |= 0x00000002;
        clothes_ = value;
        onChanged();
        return this;
      }
      public Builder clearClothes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        clothes_ = 0;
        onChanged();
        return this;
      }
      
      // required string nick = 3;
      private java.lang.Object nick_ = "";
      public boolean hasNick() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getNick() {
        java.lang.Object ref = nick_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          nick_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setNick(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        nick_ = value;
        onChanged();
        return this;
      }
      public Builder clearNick() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nick_ = getDefaultInstance().getNick();
        onChanged();
        return this;
      }
      void setNick(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        nick_ = value;
        onChanged();
      }
      
      // required int32 level = 4;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000008;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // required bool isMan = 5;
      private boolean isMan_ ;
      public boolean hasIsMan() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public boolean getIsMan() {
        return isMan_;
      }
      public Builder setIsMan(boolean value) {
        bitField0_ |= 0x00000010;
        isMan_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsMan() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isMan_ = false;
        onChanged();
        return this;
      }
      
      // required string userId = 6;
      private java.lang.Object userId_ = "";
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        userId_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      void setUserId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        userId_ = value;
        onChanged();
      }
      
      // required int32 fightingCapacity = 7;
      private int fightingCapacity_ ;
      public boolean hasFightingCapacity() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getFightingCapacity() {
        return fightingCapacity_;
      }
      public Builder setFightingCapacity(int value) {
        bitField0_ |= 0x00000040;
        fightingCapacity_ = value;
        onChanged();
        return this;
      }
      public Builder clearFightingCapacity() {
        bitField0_ = (bitField0_ & ~0x00000040);
        fightingCapacity_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 rank = 8;
      private int rank_ ;
      public boolean hasRank() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getRank() {
        return rank_;
      }
      public Builder setRank(int value) {
        bitField0_ |= 0x00000080;
        rank_ = value;
        onChanged();
        return this;
      }
      public Builder clearRank() {
        bitField0_ = (bitField0_ & ~0x00000080);
        rank_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 charm = 9;
      private int charm_ ;
      public boolean hasCharm() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getCharm() {
        return charm_;
      }
      public Builder setCharm(int value) {
        bitField0_ |= 0x00000100;
        charm_ = value;
        onChanged();
        return this;
      }
      public Builder clearCharm() {
        bitField0_ = (bitField0_ & ~0x00000100);
        charm_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 charmStartCount = 10;
      private int charmStartCount_ ;
      public boolean hasCharmStartCount() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public int getCharmStartCount() {
        return charmStartCount_;
      }
      public Builder setCharmStartCount(int value) {
        bitField0_ |= 0x00000200;
        charmStartCount_ = value;
        onChanged();
        return this;
      }
      public Builder clearCharmStartCount() {
        bitField0_ = (bitField0_ & ~0x00000200);
        charmStartCount_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 totalGold = 11;
      private int totalGold_ ;
      public boolean hasTotalGold() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public int getTotalGold() {
        return totalGold_;
      }
      public Builder setTotalGold(int value) {
        bitField0_ |= 0x00000400;
        totalGold_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalGold() {
        bitField0_ = (bitField0_ & ~0x00000400);
        totalGold_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 vipLevel = 124187;
      private int vipLevel_ ;
      public boolean hasVipLevel() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      public int getVipLevel() {
        return vipLevel_;
      }
      public Builder setVipLevel(int value) {
        bitField0_ |= 0x00000800;
        vipLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearVipLevel() {
        bitField0_ = (bitField0_ & ~0x00000800);
        vipLevel_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 danId = 219777;
      private int danId_ ;
      public boolean hasDanId() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      public int getDanId() {
        return danId_;
      }
      public Builder setDanId(int value) {
        bitField0_ |= 0x00001000;
        danId_ = value;
        onChanged();
        return this;
      }
      public Builder clearDanId() {
        bitField0_ = (bitField0_ & ~0x00001000);
        danId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:cn.mxz.protocols.user.UserBasePro)
    }
    
    static {
      defaultInstance = new UserBasePro(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:cn.mxz.protocols.user.UserBasePro)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_mxz_protocols_user_UserBasePro_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cn_mxz_protocols_user_UserBasePro_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013user_base.p\022\025cn.mxz.protocols.user\"\360\001\n" +
      "\013UserBasePro\022\014\n\004type\030\001 \002(\005\022\017\n\007clothes\030\002 " +
      "\002(\005\022\014\n\004nick\030\003 \002(\t\022\r\n\005level\030\004 \002(\005\022\r\n\005isMa" +
      "n\030\005 \002(\010\022\016\n\006userId\030\006 \002(\t\022\030\n\020fightingCapac" +
      "ity\030\007 \002(\005\022\014\n\004rank\030\010 \002(\005\022\r\n\005charm\030\t \002(\005\022\027" +
      "\n\017charmStartCount\030\n \002(\005\022\021\n\ttotalGold\030\013 \002" +
      "(\005\022\022\n\010vipLevel\030\233\312\007 \002(\005\022\017\n\005danId\030\201\265\r \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cn_mxz_protocols_user_UserBasePro_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cn_mxz_protocols_user_UserBasePro_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cn_mxz_protocols_user_UserBasePro_descriptor,
              new java.lang.String[] { "Type", "Clothes", "Nick", "Level", "IsMan", "UserId", "FightingCapacity", "Rank", "Charm", "CharmStartCount", "TotalGold", "VipLevel", "DanId", },
              cn.mxz.protocols.user.UserBaseP.UserBasePro.class,
              cn.mxz.protocols.user.UserBaseP.UserBasePro.Builder.class);
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
