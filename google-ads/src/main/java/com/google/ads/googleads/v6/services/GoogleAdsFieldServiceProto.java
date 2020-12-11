// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/google_ads_field_service.proto

package com.google.ads.googleads.v6.services;

public final class GoogleAdsFieldServiceProto {
  private GoogleAdsFieldServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_GetGoogleAdsFieldRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetGoogleAdsFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v6/services/googl"
          + "e_ads_field_service.proto\022 google.ads.go"
          + "ogleads.v6.services\0328google/ads/googlead"
          + "s/v6/resources/google_ads_field.proto\032\034g"
          + "oogle/api/annotations.proto\032\027google/api/"
          + "client.proto\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\"b\n\030GetG"
          + "oogleAdsFieldRequest\022F\n\rresource_name\030\001 "
          + "\001(\tB/\340A\002\372A)\n\'googleads.googleapis.com/Go"
          + "ogleAdsField\"Y\n\034SearchGoogleAdsFieldsReq"
          + "uest\022\022\n\005query\030\001 \001(\tB\003\340A\002\022\022\n\npage_token\030\002"
          + " \001(\t\022\021\n\tpage_size\030\003 \001(\005\"\231\001\n\035SearchGoogle"
          + "AdsFieldsResponse\022B\n\007results\030\001 \003(\01321.goo"
          + "gle.ads.googleads.v6.resources.GoogleAds"
          + "Field\022\027\n\017next_page_token\030\002 \001(\t\022\033\n\023total_"
          + "results_count\030\003 \001(\0032\354\003\n\025GoogleAdsFieldSe"
          + "rvice\022\301\001\n\021GetGoogleAdsField\022:.google.ads"
          + ".googleads.v6.services.GetGoogleAdsField"
          + "Request\0321.google.ads.googleads.v6.resour"
          + "ces.GoogleAdsField\"=\202\323\344\223\002\'\022%/v6/{resourc"
          + "e_name=googleAdsFields/*}\332A\rresource_nam"
          + "e\022\307\001\n\025SearchGoogleAdsFields\022>.google.ads"
          + ".googleads.v6.services.SearchGoogleAdsFi"
          + "eldsRequest\032?.google.ads.googleads.v6.se"
          + "rvices.SearchGoogleAdsFieldsResponse\"-\202\323"
          + "\344\223\002\037\"\032/v6/googleAdsFields:search:\001*\332A\005qu"
          + "ery\032E\312A\030googleads.googleapis.com\322A\'https"
          + "://www.googleapis.com/auth/adwordsB\201\002\n$c"
          + "om.google.ads.googleads.v6.servicesB\032Goo"
          + "gleAdsFieldServiceProtoP\001ZHgoogle.golang"
          + ".org/genproto/googleapis/ads/googleads/v"
          + "6/services;services\242\002\003GAA\252\002 Google.Ads.G"
          + "oogleAds.V6.Services\312\002 Google\\Ads\\Google"
          + "Ads\\V6\\Services\352\002$Google::Ads::GoogleAds"
          + "::V6::Servicesb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.googleads.v6.resources.GoogleAdsFieldProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_GetGoogleAdsFieldRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetGoogleAdsFieldRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_GetGoogleAdsFieldRequest_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsRequest_descriptor,
            new java.lang.String[] {
              "Query", "PageToken", "PageSize",
            });
    internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_SearchGoogleAdsFieldsResponse_descriptor,
            new java.lang.String[] {
              "Results", "NextPageToken", "TotalResultsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.googleads.v6.resources.GoogleAdsFieldProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
