---
title: "哈勃监控"
type: reference
source: "iuap-哈勃监控技术红皮书 (57页)"
tags: ["BIP", "旗舰版", "监控", "哈勃", "链路追踪", "Prometheus"]
created: 2026-06-01
---

# 哈勃监控

四大能力：指标监控（Prometheus Exporters）、日志中心（Fluentd）、告警中心（AlertManager）、链路跟踪（哈勃链路 Agent）。

Maven：`apm-common`。Agent 配置 sampler-rate 控制采样率。前端：`window.hubble.recordAction()`。

数据存储：MinIO，定期清理 30 天前数据。
