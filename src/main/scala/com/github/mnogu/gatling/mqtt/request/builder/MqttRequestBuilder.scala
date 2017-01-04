package com.github.mnogu.gatling.mqtt.request.builder

import com.github.mnogu.gatling.mqtt.action.{MqttRequestConnectActionBuilder, MqttRequestPublishActionBuilder}
import io.gatling.core.session.Expression
import org.fusesource.mqtt.client.QoS

case class MqttAttributes(
  requestName: Expression[String],
  topic: Expression[String],
  payload: Expression[String],
  qos: QoS,
  retain: Boolean)

case class MqttRequestBuilder(requestName: Expression[String]) {
  def publish(
    topic: Expression[String],
    payload: Expression[String],
    qos: QoS,
    retain: Boolean): MqttRequestPublishActionBuilder =
    new MqttRequestPublishActionBuilder(MqttAttributes(
      requestName,
      topic,
      payload,
      qos,
      retain))

  def connect(): MqttRequestConnectActionBuilder = new MqttRequestConnectActionBuilder(requestName)
}
