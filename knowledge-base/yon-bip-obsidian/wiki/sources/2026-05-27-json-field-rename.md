---
tags: [JSON, 字段名, Jackson, Fastjson, @JSONField, 序列化]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-json-field-rename.md]
---

# 实体转JSON时更改字段名称

> Java 实体字段名首字母大写，Jackson/Fastjson 序列化时默认转为小写，导致 JSON 字段名不符合预期。

## 问题

实体字段 `OutputMeasurementDetailsList`（首字母大写），序列化后变成 `outputMeasurementDetailsList`（驼峰），与外部系统要求不一致。

## 解决方案

使用 `@JSONField` 注解指定序列化后的字段名：

```java
@JSONField(name = "OutputMeasurementDetailsList")
private List<OutputMeasurementDetails> OutputMeasurementDetailsList;
```

## 关键概念

- [[JSON 序列化]]
- [[@JSONField]]
- [[Fastjson]]
- [[Jackson]]
