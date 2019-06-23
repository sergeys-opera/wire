// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.UnsupportedOperationException;
import okio.ByteString;

public final class RedactedRequired extends Message<RedactedRequired, RedactedRequired.Builder> {
  public static final ProtoAdapter<RedactedRequired> ADAPTER = new ProtoAdapter_RedactedRequired();

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .redacted(true)
      .build();

  public static final String DEFAULT_A = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      redacted = true
  )
  public final String a;

  public RedactedRequired(String a) {
    this(a, ByteString.EMPTY);
  }

  public RedactedRequired(String a, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.a = a;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = a;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRequired)) return false;
    RedactedRequired o = (RedactedRequired) other;
    return unknownFields().equals(o.unknownFields())
        && a.equals(o.a);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + a.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(", a=██");
    return builder.replace(0, 2, "RedactedRequired{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RedactedRequired, Builder> {
    public String a;

    public Builder() {
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedRequired build() {
      if (a == null) {
        throw Internal.missingRequiredFields(a, "a");
      }
      return new RedactedRequired(a, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RedactedRequired extends ProtoAdapter<RedactedRequired> {
    public ProtoAdapter_RedactedRequired() {
      super(FieldEncoding.LENGTH_DELIMITED, RedactedRequired.class);
    }

    @Override
    public int encodedSize(RedactedRequired value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.a)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RedactedRequired value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RedactedRequired decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.a(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public RedactedRequired redact(RedactedRequired value) {
      throw new UnsupportedOperationException("Field 'a' is required and cannot be redacted.");
    }
  }
}
