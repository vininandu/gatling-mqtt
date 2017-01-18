package com.github.mnogu.gatling.mqtt.action

import io.gatling.core.action.Action
import io.gatling.core.action.builder.ActionBuilder
import io.gatling.core.structure.ScenarioContext

class MqttRequestDisconnectActionBuilder()
  extends ActionBuilder {

  override def build(
                      ctx: ScenarioContext, next: Action
                    ): Action = {
    new MqttRequestDisconnectAction(next)
  }
}
