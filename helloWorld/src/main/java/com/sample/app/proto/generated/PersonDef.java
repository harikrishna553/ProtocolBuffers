package com.sample.app.proto.generated;

//Generated by the protocol buffer compiler.  DO NOT EDIT!
//source: PersonDef.proto

public final class PersonDef {
	private PersonDef() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface PersonOrBuilder extends
			// @@protoc_insertion_point(interface_extends:Person)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>int32 id = 1;</code>
		 */
		int getId();

		/**
		 * <code>string firstName = 2;</code>
		 */
		java.lang.String getFirstName();

		/**
		 * <code>string firstName = 2;</code>
		 */
		com.google.protobuf.ByteString getFirstNameBytes();

		/**
		 * <code>string lastName = 3;</code>
		 */
		java.lang.String getLastName();

		/**
		 * <code>string lastName = 3;</code>
		 */
		com.google.protobuf.ByteString getLastNameBytes();

		/**
		 * <code>string email = 4;</code>
		 */
		java.lang.String getEmail();

		/**
		 * <code>string email = 4;</code>
		 */
		com.google.protobuf.ByteString getEmailBytes();
	}

	/**
	 * Protobuf type {@code Person}
	 */
	public static final class Person extends com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:Person)
			PersonOrBuilder {
		private static final long serialVersionUID = 0L;

		// Use Person.newBuilder() to construct.
		private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private Person() {
			firstName_ = "";
			lastName_ = "";
			email_ = "";
		}

		@java.lang.Override
		@SuppressWarnings({ "unused" })
		protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
			return new Person();
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Person(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			if (extensionRegistry == null) {
				throw new java.lang.NullPointerException();
			}
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					case 8: {

						id_ = input.readInt32();
						break;
					}
					case 18: {
						java.lang.String s = input.readStringRequireUtf8();

						firstName_ = s;
						break;
					}
					case 26: {
						java.lang.String s = input.readStringRequireUtf8();

						lastName_ = s;
						break;
					}
					case 34: {
						java.lang.String s = input.readStringRequireUtf8();

						email_ = s;
						break;
					}
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return PersonDef.internal_static_Person_descriptor;
		}

		@java.lang.Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return PersonDef.internal_static_Person_fieldAccessorTable
					.ensureFieldAccessorsInitialized(PersonDef.Person.class, PersonDef.Person.Builder.class);
		}

		public static final int ID_FIELD_NUMBER = 1;
		private int id_;

		/**
		 * <code>int32 id = 1;</code>
		 */
		public int getId() {
			return id_;
		}

		public static final int FIRSTNAME_FIELD_NUMBER = 2;
		private volatile java.lang.Object firstName_;

		/**
		 * <code>string firstName = 2;</code>
		 */
		public java.lang.String getFirstName() {
			java.lang.Object ref = firstName_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				firstName_ = s;
				return s;
			}
		}

		/**
		 * <code>string firstName = 2;</code>
		 */
		public com.google.protobuf.ByteString getFirstNameBytes() {
			java.lang.Object ref = firstName_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				firstName_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int LASTNAME_FIELD_NUMBER = 3;
		private volatile java.lang.Object lastName_;

		/**
		 * <code>string lastName = 3;</code>
		 */
		public java.lang.String getLastName() {
			java.lang.Object ref = lastName_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				lastName_ = s;
				return s;
			}
		}

		/**
		 * <code>string lastName = 3;</code>
		 */
		public com.google.protobuf.ByteString getLastNameBytes() {
			java.lang.Object ref = lastName_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				lastName_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int EMAIL_FIELD_NUMBER = 4;
		private volatile java.lang.Object email_;

		/**
		 * <code>string email = 4;</code>
		 */
		public java.lang.String getEmail() {
			java.lang.Object ref = email_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				email_ = s;
				return s;
			}
		}

		/**
		 * <code>string email = 4;</code>
		 */
		public com.google.protobuf.ByteString getEmailBytes() {
			java.lang.Object ref = email_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				email_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private byte memoizedIsInitialized = -1;

		@java.lang.Override
		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		@java.lang.Override
		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			if (id_ != 0) {
				output.writeInt32(1, id_);
			}
			if (!getFirstNameBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
			}
			if (!getLastNameBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
			}
			if (!getEmailBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
			}
			unknownFields.writeTo(output);
		}

		@java.lang.Override
		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			if (id_ != 0) {
				size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
			}
			if (!getFirstNameBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
			}
			if (!getLastNameBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
			}
			if (!getEmailBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
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
			if (!(obj instanceof PersonDef.Person)) {
				return super.equals(obj);
			}
			PersonDef.Person other = (PersonDef.Person) obj;

			if (getId() != other.getId())
				return false;
			if (!getFirstName().equals(other.getFirstName()))
				return false;
			if (!getLastName().equals(other.getLastName()))
				return false;
			if (!getEmail().equals(other.getEmail()))
				return false;
			if (!unknownFields.equals(other.unknownFields))
				return false;
			return true;
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			hash = (37 * hash) + ID_FIELD_NUMBER;
			hash = (53 * hash) + getId();
			hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
			hash = (53 * hash) + getFirstName().hashCode();
			hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
			hash = (53 * hash) + getLastName().hashCode();
			hash = (37 * hash) + EMAIL_FIELD_NUMBER;
			hash = (53 * hash) + getEmail().hashCode();
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static PersonDef.Person parseFrom(java.nio.ByteBuffer data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static PersonDef.Person parseFrom(java.nio.ByteBuffer data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static PersonDef.Person parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static PersonDef.Person parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static PersonDef.Person parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static PersonDef.Person parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static PersonDef.Person parseFrom(java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static PersonDef.Person parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static PersonDef.Person parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static PersonDef.Person parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static PersonDef.Person parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static PersonDef.Person parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		@java.lang.Override
		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(PersonDef.Person prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		@java.lang.Override
		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code Person}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:Person)
				PersonDef.PersonOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return PersonDef.internal_static_Person_descriptor;
			}

			@java.lang.Override
			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return PersonDef.internal_static_Person_fieldAccessorTable
						.ensureFieldAccessorsInitialized(PersonDef.Person.class, PersonDef.Person.Builder.class);
			}

			// Construct using PersonDef.Person.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				}
			}

			@java.lang.Override
			public Builder clear() {
				super.clear();
				id_ = 0;

				firstName_ = "";

				lastName_ = "";

				email_ = "";

				return this;
			}

			@java.lang.Override
			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return PersonDef.internal_static_Person_descriptor;
			}

			@java.lang.Override
			public PersonDef.Person getDefaultInstanceForType() {
				return PersonDef.Person.getDefaultInstance();
			}

			@java.lang.Override
			public PersonDef.Person build() {
				PersonDef.Person result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			@java.lang.Override
			public PersonDef.Person buildPartial() {
				PersonDef.Person result = new PersonDef.Person(this);
				result.id_ = id_;
				result.firstName_ = firstName_;
				result.lastName_ = lastName_;
				result.email_ = email_;
				onBuilt();
				return result;
			}

			@java.lang.Override
			public Builder clone() {
				return super.clone();
			}

			@java.lang.Override
			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
				return super.setField(field, value);
			}

			@java.lang.Override
			public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
				return super.clearField(field);
			}

			@java.lang.Override
			public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return super.clearOneof(oneof);
			}

			@java.lang.Override
			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					java.lang.Object value) {
				return super.setRepeatedField(field, index, value);
			}

			@java.lang.Override
			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
					java.lang.Object value) {
				return super.addRepeatedField(field, value);
			}

			@java.lang.Override
			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof PersonDef.Person) {
					return mergeFrom((PersonDef.Person) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(PersonDef.Person other) {
				if (other == PersonDef.Person.getDefaultInstance())
					return this;
				if (other.getId() != 0) {
					setId(other.getId());
				}
				if (!other.getFirstName().isEmpty()) {
					firstName_ = other.firstName_;
					onChanged();
				}
				if (!other.getLastName().isEmpty()) {
					lastName_ = other.lastName_;
					onChanged();
				}
				if (!other.getEmail().isEmpty()) {
					email_ = other.email_;
					onChanged();
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
			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				PersonDef.Person parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (PersonDef.Person) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int id_;

			/**
			 * <code>int32 id = 1;</code>
			 */
			public int getId() {
				return id_;
			}

			/**
			 * <code>int32 id = 1;</code>
			 */
			public Builder setId(int value) {

				id_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>int32 id = 1;</code>
			 */
			public Builder clearId() {

				id_ = 0;
				onChanged();
				return this;
			}

			private java.lang.Object firstName_ = "";

			/**
			 * <code>string firstName = 2;</code>
			 */
			public java.lang.String getFirstName() {
				java.lang.Object ref = firstName_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					firstName_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string firstName = 2;</code>
			 */
			public com.google.protobuf.ByteString getFirstNameBytes() {
				java.lang.Object ref = firstName_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					firstName_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string firstName = 2;</code>
			 */
			public Builder setFirstName(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				firstName_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string firstName = 2;</code>
			 */
			public Builder clearFirstName() {

				firstName_ = getDefaultInstance().getFirstName();
				onChanged();
				return this;
			}

			/**
			 * <code>string firstName = 2;</code>
			 */
			public Builder setFirstNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				firstName_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object lastName_ = "";

			/**
			 * <code>string lastName = 3;</code>
			 */
			public java.lang.String getLastName() {
				java.lang.Object ref = lastName_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					lastName_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string lastName = 3;</code>
			 */
			public com.google.protobuf.ByteString getLastNameBytes() {
				java.lang.Object ref = lastName_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					lastName_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string lastName = 3;</code>
			 */
			public Builder setLastName(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				lastName_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string lastName = 3;</code>
			 */
			public Builder clearLastName() {

				lastName_ = getDefaultInstance().getLastName();
				onChanged();
				return this;
			}

			/**
			 * <code>string lastName = 3;</code>
			 */
			public Builder setLastNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				lastName_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object email_ = "";

			/**
			 * <code>string email = 4;</code>
			 */
			public java.lang.String getEmail() {
				java.lang.Object ref = email_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					email_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>string email = 4;</code>
			 */
			public com.google.protobuf.ByteString getEmailBytes() {
				java.lang.Object ref = email_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					email_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>string email = 4;</code>
			 */
			public Builder setEmail(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				email_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>string email = 4;</code>
			 */
			public Builder clearEmail() {

				email_ = getDefaultInstance().getEmail();
				onChanged();
				return this;
			}

			/**
			 * <code>string email = 4;</code>
			 */
			public Builder setEmailBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				email_ = value;
				onChanged();
				return this;
			}

			@java.lang.Override
			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			@java.lang.Override
			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:Person)
		}

		// @@protoc_insertion_point(class_scope:Person)
		private static final PersonDef.Person DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new PersonDef.Person();
		}

		public static PersonDef.Person getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser<Person> PARSER = new com.google.protobuf.AbstractParser<Person>() {
			@java.lang.Override
			public Person parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Person(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser<Person> parser() {
			return PARSER;
		}

		@java.lang.Override
		public com.google.protobuf.Parser<Person> getParserForType() {
			return PARSER;
		}

		@java.lang.Override
		public PersonDef.Person getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_Person_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_Person_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\017PersonDef.proto\"H\n\006Person\022\n\n\002id\030\001 \001(\005\022"
				+ "\021\n\tfirstName\030\002 \001(\t\022\020\n\010lastName\030\003 \001(\t\022\r\n\005"
				+ "email\030\004 \001(\tb\006proto3" };
		descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {});
		internal_static_Person_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_Person_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_Person_descriptor, new java.lang.String[] { "Id", "FirstName", "LastName", "Email", });
	}

// @@protoc_insertion_point(outer_class_scope)
}
