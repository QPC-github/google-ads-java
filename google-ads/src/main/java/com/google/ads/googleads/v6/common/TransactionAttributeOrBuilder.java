// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/offline_user_data.proto

package com.google.ads.googleads.v6.common;

public interface TransactionAttributeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.TransactionAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>string transaction_date_time = 8;</code>
   *
   * @return Whether the transactionDateTime field is set.
   */
  boolean hasTransactionDateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>string transaction_date_time = 8;</code>
   *
   * @return The transactionDateTime.
   */
  java.lang.String getTransactionDateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>string transaction_date_time = 8;</code>
   *
   * @return The bytes for transactionDateTime.
   */
  com.google.protobuf.ByteString getTransactionDateTimeBytes();

  /**
   *
   *
   * <pre>
   * Transaction amount in micros. Required.
   * </pre>
   *
   * <code>double transaction_amount_micros = 9;</code>
   *
   * @return Whether the transactionAmountMicros field is set.
   */
  boolean hasTransactionAmountMicros();
  /**
   *
   *
   * <pre>
   * Transaction amount in micros. Required.
   * </pre>
   *
   * <code>double transaction_amount_micros = 9;</code>
   *
   * @return The transactionAmountMicros.
   */
  double getTransactionAmountMicros();

  /**
   *
   *
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>string currency_code = 10;</code>
   *
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   *
   *
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>string currency_code = 10;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>string currency_code = 10;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>string conversion_action = 11;</code>
   *
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   *
   *
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>string conversion_action = 11;</code>
   *
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   *
   *
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>string conversion_action = 11;</code>
   *
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString getConversionActionBytes();

  /**
   *
   *
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string order_id = 12;</code>
   *
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   *
   *
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string order_id = 12;</code>
   *
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   *
   *
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string order_id = 12;</code>
   *
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString getOrderIdBytes();

  /**
   *
   *
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.StoreAttribute store_attribute = 6;</code>
   *
   * @return Whether the storeAttribute field is set.
   */
  boolean hasStoreAttribute();
  /**
   *
   *
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.StoreAttribute store_attribute = 6;</code>
   *
   * @return The storeAttribute.
   */
  com.google.ads.googleads.v6.common.StoreAttribute getStoreAttribute();
  /**
   *
   *
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.StoreAttribute store_attribute = 6;</code>
   */
  com.google.ads.googleads.v6.common.StoreAttributeOrBuilder getStoreAttributeOrBuilder();

  /**
   *
   *
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string custom_value = 13;</code>
   *
   * @return Whether the customValue field is set.
   */
  boolean hasCustomValue();
  /**
   *
   *
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string custom_value = 13;</code>
   *
   * @return The customValue.
   */
  java.lang.String getCustomValue();
  /**
   *
   *
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>string custom_value = 13;</code>
   *
   * @return The bytes for customValue.
   */
  com.google.protobuf.ByteString getCustomValueBytes();
}
