---
tags: [BIP, 插件, 扩展, 单据]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: source_code
---

# BillPlugin 扩展

> BIP 单据生命周期插件，通过 @BillPlugin 注解绑定到指定业务对象，在保存/审核等节点插入自定义逻辑。

## 标准模板

```java
@BillPlugin(busiObj = "d20139_new_comparison")
public class ComparisonPlugin extends AbstractBillPlugin {

    @Autowired
    private ComparisonService comparisonService;

    @Override
    public void beforeSave(IBillContext context) {
        Map<String, Object> billData = context.getBillData();
        comparisonService.uniquenessCheck(billData);
    }
}
```

## 可用钩子

| 钩子 | 触发时机 | 典型用途 |
|------|----------|----------|
| `beforeSave` | 保存前 | 唯一性校验、数据校验 |
| `afterSave` | 保存后 | 日志记录、触发后续流程 |
| `afterAudit` | 审核后 | 推单、数据同步 |

## 关键点

- 注解 `@BillPlugin(busiObj = "xxx")` 指定目标业务对象
- 继承 `AbstractBillPlugin`
- 通过 `context.getBillData()` 获取当前单据数据
- 可注入任意 Spring Bean

## 相关页面

- [[IYpdCommonRul规则]]
- [[保存事件]]
- [[BusinessConvertService]]
- [[BIP后端开发模板]]
