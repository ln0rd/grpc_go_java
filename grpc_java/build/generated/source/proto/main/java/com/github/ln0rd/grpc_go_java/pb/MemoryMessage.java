// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.github.ln0rd.grpc_go_java.pb;

public final class MemoryMessage {
  private MemoryMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_go_java_proto_Memory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_go_java_proto_Memory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024memory_message.proto\022\022grpc_go_java.pro" +
      "to\"\246\001\n\006Memory\022\r\n\005value\030\001 \001(\004\022-\n\004unit\030\002 \001" +
      "(\0162\037.grpc_go_java.proto.Memory.Unit\"^\n\004U" +
      "nit\022\013\n\007UNKNOWN\020\000\022\007\n\003BIT\020\001\022\010\n\004BYTE\020\002\022\014\n\010K" +
      "ILOBYTE\020\003\022\014\n\010MEGABYTE\020\004\022\014\n\010GIGABYTE\020\005\022\014\n" +
      "\010TERABYTE\020\006B(\n com.github.ln0rd.grpc_go_" +
      "java.pbP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpc_go_java_proto_Memory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_go_java_proto_Memory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_go_java_proto_Memory_descriptor,
        new java.lang.String[] { "Value", "Unit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
