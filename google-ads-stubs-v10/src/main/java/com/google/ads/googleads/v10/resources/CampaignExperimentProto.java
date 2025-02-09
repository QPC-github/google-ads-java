// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_experiment.proto

package com.google.ads.googleads.v10.resources;

public final class CampaignExperimentProto {
  private CampaignExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CampaignExperiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CampaignExperiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v10/resources/cam" +
      "paign_experiment.proto\022\"google.ads.googl" +
      "eads.v10.resources\032?google/ads/googleads" +
      "/v10/enums/campaign_experiment_status.pr" +
      "oto\032Kgoogle/ads/googleads/v10/enums/camp" +
      "aign_experiment_traffic_split_type.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\315\007\n\022CampaignExperim" +
      "ent\022J\n\rresource_name\030\001 \001(\tB3\340A\005\372A-\n+goog" +
      "leads.googleapis.com/CampaignExperiment\022" +
      "\024\n\002id\030\r \001(\003B\003\340A\003H\000\210\001\001\022K\n\016campaign_draft\030" +
      "\016 \001(\tB.\340A\005\372A(\n&googleads.googleapis.com/" +
      "CampaignDraftH\001\210\001\001\022\021\n\004name\030\017 \001(\tH\002\210\001\001\022\030\n" +
      "\013description\030\020 \001(\tH\003\210\001\001\022\'\n\025traffic_split" +
      "_percent\030\021 \001(\003B\003\340A\005H\004\210\001\001\022\212\001\n\022traffic_spl" +
      "it_type\030\007 \001(\0162i.google.ads.googleads.v10" +
      ".enums.CampaignExperimentTrafficSplitTyp" +
      "eEnum.CampaignExperimentTrafficSplitType" +
      "B\003\340A\005\022K\n\023experiment_campaign\030\022 \001(\tB)\340A\003\372" +
      "A#\n!googleads.googleapis.com/CampaignH\005\210" +
      "\001\001\022j\n\006status\030\t \001(\0162U.google.ads.googlead" +
      "s.v10.enums.CampaignExperimentStatusEnum" +
      ".CampaignExperimentStatusB\003\340A\003\022(\n\026long_r" +
      "unning_operation\030\023 \001(\tB\003\340A\003H\006\210\001\001\022\027\n\nstar" +
      "t_date\030\024 \001(\tH\007\210\001\001\022\025\n\010end_date\030\025 \001(\tH\010\210\001\001" +
      ":v\352As\n+googleads.googleapis.com/Campaign" +
      "Experiment\022Dcustomers/{customer_id}/camp" +
      "aignExperiments/{campaign_experiment_id}" +
      "B\005\n\003_idB\021\n\017_campaign_draftB\007\n\005_nameB\016\n\014_" +
      "descriptionB\030\n\026_traffic_split_percentB\026\n" +
      "\024_experiment_campaignB\031\n\027_long_running_o" +
      "perationB\r\n\013_start_dateB\013\n\t_end_dateB\211\002\n" +
      "&com.google.ads.googleads.v10.resourcesB" +
      "\027CampaignExperimentProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v10/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V10.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V10\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CampaignExperimentStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CampaignExperiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CampaignExperiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CampaignExperiment_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "TrafficSplitType", "ExperimentCampaign", "Status", "LongRunningOperation", "StartDate", "EndDate", "Id", "CampaignDraft", "Name", "Description", "TrafficSplitPercent", "ExperimentCampaign", "LongRunningOperation", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.CampaignExperimentStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CampaignExperimentTrafficSplitTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
