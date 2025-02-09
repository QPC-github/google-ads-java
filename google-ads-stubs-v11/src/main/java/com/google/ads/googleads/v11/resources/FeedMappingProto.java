// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/feed_mapping.proto

package com.google.ads.googleads.v11.resources;

public final class FeedMappingProto {
  private FeedMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_FeedMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_FeedMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_AttributeFieldMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_AttributeFieldMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v11/resources/fee" +
      "d_mapping.proto\022\"google.ads.googleads.v1" +
      "1.resources\032Dgoogle/ads/googleads/v11/en" +
      "ums/ad_customizer_placeholder_field.prot" +
      "o\032Igoogle/ads/googleads/v11/enums/affili" +
      "ate_location_placeholder_field.proto\032:go" +
      "ogle/ads/googleads/v11/enums/app_placeho" +
      "lder_field.proto\032;google/ads/googleads/v" +
      "11/enums/call_placeholder_field.proto\032>g" +
      "oogle/ads/googleads/v11/enums/callout_pl" +
      "aceholder_field.proto\032=google/ads/google" +
      "ads/v11/enums/custom_placeholder_field.p" +
      "roto\032Bgoogle/ads/googleads/v11/enums/dsa" +
      "_page_feed_criterion_field.proto\032@google" +
      "/ads/googleads/v11/enums/education_place" +
      "holder_field.proto\032@google/ads/googleads" +
      "/v11/enums/feed_mapping_criterion_type.p" +
      "roto\0328google/ads/googleads/v11/enums/fee" +
      "d_mapping_status.proto\032=google/ads/googl" +
      "eads/v11/enums/flight_placeholder_field." +
      "proto\032<google/ads/googleads/v11/enums/ho" +
      "tel_placeholder_field.proto\032<google/ads/" +
      "googleads/v11/enums/image_placeholder_fi" +
      "eld.proto\032:google/ads/googleads/v11/enum" +
      "s/job_placeholder_field.proto\032<google/ad" +
      "s/googleads/v11/enums/local_placeholder_" +
      "field.proto\032Qgoogle/ads/googleads/v11/en" +
      "ums/location_extension_targeting_criteri" +
      "on_field.proto\032?google/ads/googleads/v11" +
      "/enums/location_placeholder_field.proto\032" +
      ">google/ads/googleads/v11/enums/message_" +
      "placeholder_field.proto\0325google/ads/goog" +
      "leads/v11/enums/placeholder_type.proto\032<" +
      "google/ads/googleads/v11/enums/price_pla" +
      "ceholder_field.proto\032@google/ads/googlea" +
      "ds/v11/enums/promotion_placeholder_field" +
      ".proto\032Bgoogle/ads/googleads/v11/enums/r" +
      "eal_estate_placeholder_field.proto\032?goog" +
      "le/ads/googleads/v11/enums/sitelink_plac" +
      "eholder_field.proto\032Igoogle/ads/googlead" +
      "s/v11/enums/structured_snippet_placehold" +
      "er_field.proto\032=google/ads/googleads/v11" +
      "/enums/travel_placeholder_field.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\250\005\n\013FeedMapping\022C\n\rres" +
      "ource_name\030\001 \001(\tB,\340A\005\372A&\n$googleads.goog" +
      "leapis.com/FeedMapping\0228\n\004feed\030\007 \001(\tB%\340A" +
      "\005\372A\037\n\035googleads.googleapis.com/FeedH\001\210\001\001" +
      "\022`\n\030attribute_field_mappings\030\005 \003(\01329.goo" +
      "gle.ads.googleads.v11.resources.Attribut" +
      "eFieldMappingB\003\340A\005\022\\\n\006status\030\006 \001(\0162G.goo" +
      "gle.ads.googleads.v11.enums.FeedMappingS" +
      "tatusEnum.FeedMappingStatusB\003\340A\003\022d\n\020plac" +
      "eholder_type\030\003 \001(\0162C.google.ads.googlead" +
      "s.v11.enums.PlaceholderTypeEnum.Placehol" +
      "derTypeB\003\340A\005H\000\022t\n\016criterion_type\030\004 \001(\0162U" +
      ".google.ads.googleads.v11.enums.FeedMapp" +
      "ingCriterionTypeEnum.FeedMappingCriterio" +
      "nTypeB\003\340A\005H\000:k\352Ah\n$googleads.googleapis." +
      "com/FeedMapping\022@customers/{customer_id}" +
      "/feedMappings/{feed_id}~{feed_mapping_id" +
      "}B\010\n\006targetB\007\n\005_feed\"\323\025\n\025AttributeFieldM" +
      "apping\022#\n\021feed_attribute_id\030\030 \001(\003B\003\340A\005H\001" +
      "\210\001\001\022\032\n\010field_id\030\031 \001(\003B\003\340A\003H\002\210\001\001\022t\n\016sitel" +
      "ink_field\030\003 \001(\0162U.google.ads.googleads.v" +
      "11.enums.SitelinkPlaceholderFieldEnum.Si" +
      "telinkPlaceholderFieldB\003\340A\005H\000\022h\n\ncall_fi" +
      "eld\030\004 \001(\0162M.google.ads.googleads.v11.enu" +
      "ms.CallPlaceholderFieldEnum.CallPlacehol" +
      "derFieldB\003\340A\005H\000\022e\n\tapp_field\030\005 \001(\0162K.goo" +
      "gle.ads.googleads.v11.enums.AppPlacehold" +
      "erFieldEnum.AppPlaceholderFieldB\003\340A\005H\000\022t" +
      "\n\016location_field\030\006 \001(\0162U.google.ads.goog" +
      "leads.v11.enums.LocationPlaceholderField" +
      "Enum.LocationPlaceholderFieldB\003\340A\003H\000\022\220\001\n" +
      "\030affiliate_location_field\030\007 \001(\0162g.google" +
      ".ads.googleads.v11.enums.AffiliateLocati" +
      "onPlaceholderFieldEnum.AffiliateLocation" +
      "PlaceholderFieldB\003\340A\003H\000\022q\n\rcallout_field" +
      "\030\010 \001(\0162S.google.ads.googleads.v11.enums." +
      "CalloutPlaceholderFieldEnum.CalloutPlace" +
      "holderFieldB\003\340A\005H\000\022\220\001\n\030structured_snippe" +
      "t_field\030\t \001(\0162g.google.ads.googleads.v11" +
      ".enums.StructuredSnippetPlaceholderField" +
      "Enum.StructuredSnippetPlaceholderFieldB\003" +
      "\340A\005H\000\022q\n\rmessage_field\030\n \001(\0162S.google.ad" +
      "s.googleads.v11.enums.MessagePlaceholder" +
      "FieldEnum.MessagePlaceholderFieldB\003\340A\005H\000" +
      "\022k\n\013price_field\030\013 \001(\0162O.google.ads.googl" +
      "eads.v11.enums.PricePlaceholderFieldEnum" +
      ".PricePlaceholderFieldB\003\340A\005H\000\022w\n\017promoti" +
      "on_field\030\014 \001(\0162W.google.ads.googleads.v1" +
      "1.enums.PromotionPlaceholderFieldEnum.Pr" +
      "omotionPlaceholderFieldB\003\340A\005H\000\022\201\001\n\023ad_cu" +
      "stomizer_field\030\r \001(\0162].google.ads.google" +
      "ads.v11.enums.AdCustomizerPlaceholderFie" +
      "ldEnum.AdCustomizerPlaceholderFieldB\003\340A\005" +
      "H\000\022{\n\023dsa_page_feed_field\030\016 \001(\0162W.google" +
      ".ads.googleads.v11.enums.DsaPageFeedCrit" +
      "erionFieldEnum.DsaPageFeedCriterionField" +
      "B\003\340A\005H\000\022\250\001\n\"location_extension_targeting" +
      "_field\030\017 \001(\0162u.google.ads.googleads.v11." +
      "enums.LocationExtensionTargetingCriterio" +
      "nFieldEnum.LocationExtensionTargetingCri" +
      "terionFieldB\003\340A\005H\000\022w\n\017education_field\030\020 " +
      "\001(\0162W.google.ads.googleads.v11.enums.Edu" +
      "cationPlaceholderFieldEnum.EducationPlac" +
      "eholderFieldB\003\340A\005H\000\022n\n\014flight_field\030\021 \001(" +
      "\0162Q.google.ads.googleads.v11.enums.Fligh" +
      "tPlaceholderFieldEnum.FlightPlaceholderF" +
      "ieldB\003\340A\005H\000\022n\n\014custom_field\030\022 \001(\0162Q.goog" +
      "le.ads.googleads.v11.enums.CustomPlaceho" +
      "lderFieldEnum.CustomPlaceholderFieldB\003\340A" +
      "\005H\000\022k\n\013hotel_field\030\023 \001(\0162O.google.ads.go" +
      "ogleads.v11.enums.HotelPlaceholderFieldE" +
      "num.HotelPlaceholderFieldB\003\340A\005H\000\022{\n\021real" +
      "_estate_field\030\024 \001(\0162Y.google.ads.googlea" +
      "ds.v11.enums.RealEstatePlaceholderFieldE" +
      "num.RealEstatePlaceholderFieldB\003\340A\005H\000\022n\n" +
      "\014travel_field\030\025 \001(\0162Q.google.ads.googlea" +
      "ds.v11.enums.TravelPlaceholderFieldEnum." +
      "TravelPlaceholderFieldB\003\340A\005H\000\022k\n\013local_f" +
      "ield\030\026 \001(\0162O.google.ads.googleads.v11.en" +
      "ums.LocalPlaceholderFieldEnum.LocalPlace" +
      "holderFieldB\003\340A\005H\000\022e\n\tjob_field\030\027 \001(\0162K." +
      "google.ads.googleads.v11.enums.JobPlaceh" +
      "olderFieldEnum.JobPlaceholderFieldB\003\340A\005H" +
      "\000\022k\n\013image_field\030\032 \001(\0162O.google.ads.goog" +
      "leads.v11.enums.ImagePlaceholderFieldEnu" +
      "m.ImagePlaceholderFieldB\003\340A\005H\000B\007\n\005fieldB" +
      "\024\n\022_feed_attribute_idB\013\n\t_field_idB\202\002\n&c" +
      "om.google.ads.googleads.v11.resourcesB\020F" +
      "eedMappingProtoP\001ZKgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v11/resou" +
      "rces;resources\242\002\003GAA\252\002\"Google.Ads.Google" +
      "Ads.V11.Resources\312\002\"Google\\Ads\\GoogleAds" +
      "\\V11\\Resources\352\002&Google::Ads::GoogleAds:" +
      ":V11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.AdCustomizerPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AppPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.CallPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.CalloutPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.CustomPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.DsaPageFeedCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.EducationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.FeedMappingCriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.FeedMappingStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.FlightsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.HotelsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ImagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.JobsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.LocalPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.LocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.MessagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PricePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PromotionPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.RealEstatePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SitelinkPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.TravelPlaceholderFieldProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_FeedMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_FeedMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_FeedMapping_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AttributeFieldMappings", "Status", "PlaceholderType", "CriterionType", "Target", "Feed", });
    internal_static_google_ads_googleads_v11_resources_AttributeFieldMapping_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_resources_AttributeFieldMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_AttributeFieldMapping_descriptor,
        new java.lang.String[] { "FeedAttributeId", "FieldId", "SitelinkField", "CallField", "AppField", "LocationField", "AffiliateLocationField", "CalloutField", "StructuredSnippetField", "MessageField", "PriceField", "PromotionField", "AdCustomizerField", "DsaPageFeedField", "LocationExtensionTargetingField", "EducationField", "FlightField", "CustomField", "HotelField", "RealEstateField", "TravelField", "LocalField", "JobField", "ImageField", "Field", "FeedAttributeId", "FieldId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.AdCustomizerPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AppPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.CallPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.CalloutPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.CustomPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.DsaPageFeedCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.EducationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.FeedMappingCriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.FeedMappingStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.FlightsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.HotelsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ImagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.JobsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.LocalPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.LocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.MessagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PricePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PromotionPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.RealEstatePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SitelinkPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v11.enums.TravelPlaceholderFieldProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
