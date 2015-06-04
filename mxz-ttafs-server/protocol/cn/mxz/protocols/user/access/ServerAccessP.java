// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server_access.p

package cn.mxz.protocols.user.access;

public final class ServerAccessP {
  private ServerAccessP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ServerAccessProOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isNewUser = 1;
    boolean hasIsNewUser();
    boolean getIsNewUser();
  }
  public static final class ServerAccessPro extends
      com.google.protobuf.GeneratedMessage
      implements ServerAccessProOrBuilder {
    // Use ServerAccessPro.newBuilder() to construct.
    private ServerAccessPro(Builder builder) {
      super(builder);
    }
    private ServerAccessPro(boolean noInit) {}
    
    private static final ServerAccessPro defaultInstance;
    public static ServerAccessPro getDefaultInstance() {
      return defaultInstance;
    }
    
    @Override
	public ServerAccessPro getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.mxz.protocols.user.access.ServerAccessP.internal_static_cn_mxz_protocols_user_access_ServerAccessPro_descriptor;
    }
    
    @Override
	protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.mxz.protocols.user.access.ServerAccessP.internal_static_cn_mxz_protocols_user_access_ServerAccessPro_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isNewUser = 1;
    public static final int ISNEWUSER_FIELD_NUMBER = 1;
    private boolean isNewUser_;
    @Override
	public boolean hasIsNewUser() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    @Override
	public boolean getIsNewUser() {
      return isNewUser_;
    }
    
    private void initFields() {
      isNewUser_ = false;
    }
    private byte memoizedIsInitialized = -1;
    @Override
	public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsNewUser()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    @Override
	public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isNewUser_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    @Override
	public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isNewUser_);
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
    
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseDelimitedFrom(
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
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    @Override
	public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    @Override
	public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cn.mxz.protocols.user.access.ServerAccessP.ServerAccessProOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.mxz.protocols.user.access.ServerAccessP.internal_static_cn_mxz_protocols_user_access_ServerAccessPro_descriptor;
      }
      
      @Override
	protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.mxz.protocols.user.access.ServerAccessP.internal_static_cn_mxz_protocols_user_access_ServerAccessPro_fieldAccessorTable;
      }
      
      // Construct using cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.newBuilder()
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
      
      @Override
	public Builder clear() {
        super.clear();
        isNewUser_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      @Override
	public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      @Override
	public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.getDescriptor();
      }
      
      @Override
	public cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro getDefaultInstanceForType() {
        return cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.getDefaultInstance();
      }
      
      @Override
	public cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro build() {
        cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      @Override
	public cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro buildPartial() {
        cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro result = new cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isNewUser_ = isNewUser_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      @Override
	public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro) {
          return mergeFrom((cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro other) {
        if (other == cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.getDefaultInstance()) return this;
        if (other.hasIsNewUser()) {
          setIsNewUser(other.getIsNewUser());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      @Override
	public final boolean isInitialized() {
        if (!hasIsNewUser()) {
          
          return false;
        }
        return true;
      }
      
      @Override
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
              isNewUser_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isNewUser = 1;
      private boolean isNewUser_ ;
      @Override
	public boolean hasIsNewUser() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      @Override
	public boolean getIsNewUser() {
        return isNewUser_;
      }
      public Builder setIsNewUser(boolean value) {
        bitField0_ |= 0x00000001;
        isNewUser_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsNewUser() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isNewUser_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:cn.mxz.protocols.user.access.ServerAccessPro)
    }
    
    static {
      defaultInstance = new ServerAccessPro(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:cn.mxz.protocols.user.access.ServerAccessPro)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_mxz_protocols_user_access_ServerAccessPro_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cn_mxz_protocols_user_access_ServerAccessPro_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017server_access.p\022\034cn.mxz.protocols.user" +
      ".access\"$\n\017ServerAccessPro\022\021\n\tisNewUser\030" +
      "\001 \002(\010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        @Override
		public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cn_mxz_protocols_user_access_ServerAccessPro_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cn_mxz_protocols_user_access_ServerAccessPro_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cn_mxz_protocols_user_access_ServerAccessPro_descriptor,
              new java.lang.String[] { "IsNewUser", },
              cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.class,
              cn.mxz.protocols.user.access.ServerAccessP.ServerAccessPro.Builder.class);
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
