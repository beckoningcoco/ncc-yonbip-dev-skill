---
tags: [ID生成, IdManager, 主键, Java, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-code-gen-id.md]
---

# 代码生成ID

> 在 Java 代码中生成 BIP 平台的主键 ID。

## 代码

```java
String.valueOf(IdManager.getInstance().nextId())
```

使用 `IdManager.getInstance().nextId()` 获取全局唯一 ID，通过 `String.valueOf()` 转为字符串。

## 关键概念

- [[IdManager]]
- [[主键生成]]
