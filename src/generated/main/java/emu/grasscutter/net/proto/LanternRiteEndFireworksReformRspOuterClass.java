// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteEndFireworksReformRsp.proto

package emu.grasscutter.net.proto;

public final class LanternRiteEndFireworksReformRspOuterClass {
  private LanternRiteEndFireworksReformRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteEndFireworksReformRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteEndFireworksReformRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 final_score = 1;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>bool HPLLPLKOHLL = 6;</code>
     * @return The hPLLPLKOHLL.
     */
    boolean getHPLLPLKOHLL();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool FBGNCOBOMAA = 9;</code>
     * @return The fBGNCOBOMAA.
     */
    boolean getFBGNCOBOMAA();

    /**
     * <code>bool is_full_score = 10;</code>
     * @return The isFullScore.
     */
    boolean getIsFullScore();

    /**
     * <code>bool HKBEDNIDDEI = 13;</code>
     * @return The hKBEDNIDDEI.
     */
    boolean getHKBEDNIDDEI();

    /**
     * <code>uint32 challenge_id = 4;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 709
   * Obf: JBBOLPPBMHC
   * </pre>
   *
   * Protobuf type {@code LanternRiteEndFireworksReformRsp}
   */
  public static final class LanternRiteEndFireworksReformRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteEndFireworksReformRsp)
      LanternRiteEndFireworksReformRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteEndFireworksReformRsp.newBuilder() to construct.
    private LanternRiteEndFireworksReformRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteEndFireworksReformRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteEndFireworksReformRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanternRiteEndFireworksReformRsp(
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

              finalScore_ = input.readUInt32();
              break;
            }
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 32: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 48: {

              hPLLPLKOHLL_ = input.readBool();
              break;
            }
            case 72: {

              fBGNCOBOMAA_ = input.readBool();
              break;
            }
            case 80: {

              isFullScore_ = input.readBool();
              break;
            }
            case 88: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 104: {

              hKBEDNIDDEI_ = input.readBool();
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
      return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.class, emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.Builder.class);
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 1;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 1;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int HPLLPLKOHLL_FIELD_NUMBER = 6;
    private boolean hPLLPLKOHLL_;
    /**
     * <code>bool HPLLPLKOHLL = 6;</code>
     * @return The hPLLPLKOHLL.
     */
    @java.lang.Override
    public boolean getHPLLPLKOHLL() {
      return hPLLPLKOHLL_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int FBGNCOBOMAA_FIELD_NUMBER = 9;
    private boolean fBGNCOBOMAA_;
    /**
     * <code>bool FBGNCOBOMAA = 9;</code>
     * @return The fBGNCOBOMAA.
     */
    @java.lang.Override
    public boolean getFBGNCOBOMAA() {
      return fBGNCOBOMAA_;
    }

    public static final int IS_FULL_SCORE_FIELD_NUMBER = 10;
    private boolean isFullScore_;
    /**
     * <code>bool is_full_score = 10;</code>
     * @return The isFullScore.
     */
    @java.lang.Override
    public boolean getIsFullScore() {
      return isFullScore_;
    }

    public static final int HKBEDNIDDEI_FIELD_NUMBER = 13;
    private boolean hKBEDNIDDEI_;
    /**
     * <code>bool HKBEDNIDDEI = 13;</code>
     * @return The hKBEDNIDDEI.
     */
    @java.lang.Override
    public boolean getHKBEDNIDDEI() {
      return hKBEDNIDDEI_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 4;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 4;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 11;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (finalScore_ != 0) {
        output.writeUInt32(1, finalScore_);
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(4, challengeId_);
      }
      if (hPLLPLKOHLL_ != false) {
        output.writeBool(6, hPLLPLKOHLL_);
      }
      if (fBGNCOBOMAA_ != false) {
        output.writeBool(9, fBGNCOBOMAA_);
      }
      if (isFullScore_ != false) {
        output.writeBool(10, isFullScore_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(11, isNewRecord_);
      }
      if (hKBEDNIDDEI_ != false) {
        output.writeBool(13, hKBEDNIDDEI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, finalScore_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challengeId_);
      }
      if (hPLLPLKOHLL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, hPLLPLKOHLL_);
      }
      if (fBGNCOBOMAA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, fBGNCOBOMAA_);
      }
      if (isFullScore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFullScore_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isNewRecord_);
      }
      if (hKBEDNIDDEI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, hKBEDNIDDEI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp other = (emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp) obj;

      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getHPLLPLKOHLL()
          != other.getHPLLPLKOHLL()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getFBGNCOBOMAA()
          != other.getFBGNCOBOMAA()) return false;
      if (getIsFullScore()
          != other.getIsFullScore()) return false;
      if (getHKBEDNIDDEI()
          != other.getHKBEDNIDDEI()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + HPLLPLKOHLL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHPLLPLKOHLL());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + FBGNCOBOMAA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFBGNCOBOMAA());
      hash = (37 * hash) + IS_FULL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFullScore());
      hash = (37 * hash) + HKBEDNIDDEI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHKBEDNIDDEI());
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp prototype) {
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
     * <pre>
     * CmdId: 709
     * Obf: JBBOLPPBMHC
     * </pre>
     *
     * Protobuf type {@code LanternRiteEndFireworksReformRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteEndFireworksReformRsp)
        emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.class, emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.newBuilder()
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
        finalScore_ = 0;

        hPLLPLKOHLL_ = false;

        retcode_ = 0;

        stageId_ = 0;

        fBGNCOBOMAA_ = false;

        isFullScore_ = false;

        hKBEDNIDDEI_ = false;

        challengeId_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp build() {
        emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp buildPartial() {
        emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp result = new emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp(this);
        result.finalScore_ = finalScore_;
        result.hPLLPLKOHLL_ = hPLLPLKOHLL_;
        result.retcode_ = retcode_;
        result.stageId_ = stageId_;
        result.fBGNCOBOMAA_ = fBGNCOBOMAA_;
        result.isFullScore_ = isFullScore_;
        result.hKBEDNIDDEI_ = hKBEDNIDDEI_;
        result.challengeId_ = challengeId_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp) {
          return mergeFrom((emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp other) {
        if (other == emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.getDefaultInstance()) return this;
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getHPLLPLKOHLL() != false) {
          setHPLLPLKOHLL(other.getHPLLPLKOHLL());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getFBGNCOBOMAA() != false) {
          setFBGNCOBOMAA(other.getFBGNCOBOMAA());
        }
        if (other.getIsFullScore() != false) {
          setIsFullScore(other.getIsFullScore());
        }
        if (other.getHKBEDNIDDEI() != false) {
          setHKBEDNIDDEI(other.getHKBEDNIDDEI());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 1;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 1;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private boolean hPLLPLKOHLL_ ;
      /**
       * <code>bool HPLLPLKOHLL = 6;</code>
       * @return The hPLLPLKOHLL.
       */
      @java.lang.Override
      public boolean getHPLLPLKOHLL() {
        return hPLLPLKOHLL_;
      }
      /**
       * <code>bool HPLLPLKOHLL = 6;</code>
       * @param value The hPLLPLKOHLL to set.
       * @return This builder for chaining.
       */
      public Builder setHPLLPLKOHLL(boolean value) {
        
        hPLLPLKOHLL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HPLLPLKOHLL = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHPLLPLKOHLL() {
        
        hPLLPLKOHLL_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean fBGNCOBOMAA_ ;
      /**
       * <code>bool FBGNCOBOMAA = 9;</code>
       * @return The fBGNCOBOMAA.
       */
      @java.lang.Override
      public boolean getFBGNCOBOMAA() {
        return fBGNCOBOMAA_;
      }
      /**
       * <code>bool FBGNCOBOMAA = 9;</code>
       * @param value The fBGNCOBOMAA to set.
       * @return This builder for chaining.
       */
      public Builder setFBGNCOBOMAA(boolean value) {
        
        fBGNCOBOMAA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FBGNCOBOMAA = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFBGNCOBOMAA() {
        
        fBGNCOBOMAA_ = false;
        onChanged();
        return this;
      }

      private boolean isFullScore_ ;
      /**
       * <code>bool is_full_score = 10;</code>
       * @return The isFullScore.
       */
      @java.lang.Override
      public boolean getIsFullScore() {
        return isFullScore_;
      }
      /**
       * <code>bool is_full_score = 10;</code>
       * @param value The isFullScore to set.
       * @return This builder for chaining.
       */
      public Builder setIsFullScore(boolean value) {
        
        isFullScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_full_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFullScore() {
        
        isFullScore_ = false;
        onChanged();
        return this;
      }

      private boolean hKBEDNIDDEI_ ;
      /**
       * <code>bool HKBEDNIDDEI = 13;</code>
       * @return The hKBEDNIDDEI.
       */
      @java.lang.Override
      public boolean getHKBEDNIDDEI() {
        return hKBEDNIDDEI_;
      }
      /**
       * <code>bool HKBEDNIDDEI = 13;</code>
       * @param value The hKBEDNIDDEI to set.
       * @return This builder for chaining.
       */
      public Builder setHKBEDNIDDEI(boolean value) {
        
        hKBEDNIDDEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HKBEDNIDDEI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHKBEDNIDDEI() {
        
        hKBEDNIDDEI_ = false;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 4;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 4;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 11;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteEndFireworksReformRsp)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteEndFireworksReformRsp)
    private static final emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp();
    }

    public static emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteEndFireworksReformRsp>() {
      @java.lang.Override
      public LanternRiteEndFireworksReformRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanternRiteEndFireworksReformRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteEndFireworksReformRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&LanternRiteEndFireworksReformRsp.proto" +
      "\"\335\001\n LanternRiteEndFireworksReformRsp\022\023\n" +
      "\013final_score\030\001 \001(\r\022\023\n\013HPLLPLKOHLL\030\006 \001(\010\022" +
      "\017\n\007retcode\030\002 \001(\005\022\020\n\010stage_id\030\003 \001(\r\022\023\n\013FB" +
      "GNCOBOMAA\030\t \001(\010\022\025\n\ris_full_score\030\n \001(\010\022\023" +
      "\n\013HKBEDNIDDEI\030\r \001(\010\022\024\n\014challenge_id\030\004 \001(" +
      "\r\022\025\n\ris_new_record\030\013 \001(\010B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteEndFireworksReformRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteEndFireworksReformRsp_descriptor,
        new java.lang.String[] { "FinalScore", "HPLLPLKOHLL", "Retcode", "StageId", "FBGNCOBOMAA", "IsFullScore", "HKBEDNIDDEI", "ChallengeId", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}