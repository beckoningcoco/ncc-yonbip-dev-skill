---
tags: [BIP, 实体, SuperDO, 数据模型]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: source_code
---

# SuperDO

> BIP 自定义实体基类。所有客开自定义的 YMS 实体必须继承 SuperDO 并实现 ILogicDelete。

## 定义模板

```java
@YMSEntity(name = "WXTJCRZ.WXTJCRZ.extSysLog", domain = "c-scm-xfp-mgpkk")
public class ExtSysLog extends SuperDO implements ILogicDelete {

    public static final String ENTITY_NAME = "WXTJCRZ.WXTJCRZ.extSysLog";
    public static final String REQUEST_BODY = "requestBody";

    private String requestBody;
    private Short dr;   // ILogicDelete 逻辑删除标记

    // getter/setter...

    @Override
    public String getFullName() {
        if (fullName != null && fullName.contains("#PT#.")) {
            return fullName;   // 并行表，返回带后缀的完整名称
        }
        return ENTITY_NAME;
    }
}
```

## 关键约定

| 约定 | 说明 |
|------|------|
| 基类 | 必须 `extends SuperDO` |
| 逻辑删除 | 必须 `implements ILogicDelete`，提供 `dr` 字段 |
| 实体注解 | `@YMSEntity(name="schema.table", domain="模块")` |
| 字段常量 | 每个字段定义 `public static final String`，值 = DB 列名 |
| getFullName | 覆盖以处理并行表 `#PT#.` 后缀 |
| _status | `"Insert"` 或 `2` = 新增，`1` = 修改 |

## 子表关联

父实体中定义 `List<ChildEntity> childList`，BIP 的 bill/save API 自动级联保存父子数据。

## 相关页面

- [[IBillQueryRepository]]
- [[BIP后端开发模板]]
