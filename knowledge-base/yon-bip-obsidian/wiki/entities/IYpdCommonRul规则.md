---
tags: [BIP, 规则, 审核, 扩展]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: source_code
---

# IYpdCommonRul 规则

> BIP 审核后自动触发规则接口。实现 `IYpdCommonRul` 并注册为 Spring Bean，审核后平台自动回调。

## 标准模板

```java
public class PayableAudit2MKRule implements IYpdCommonRul {

    @Autowired
    private IPayablebillService payablebillService;

    @Override
    public void execute(IRuleContext context) {
        IBillDO billDO = context.getBillDO();
        // 异步处理，避免阻塞审核事务
        YmsExecutors.getYmsExecutor().execute(() -> {
            IBillDO apEvent = pollForDownstreamBill(billDO.getId());
            if (apEvent != null) {
                payablebillService.handlePushPayable2mk(apEvent);
            }
        });
    }
}
```

## 关键点

- 实现 `IYpdCommonRul` 接口
- 通过 `context.getBillDO()` 获取审核后的单据
- 必须使用 `YmsExecutors` 异步执行，避免阻塞审核主流程
- 常用于：审核后推送数据到外部系统、触发下游单据生成

## 与 BillPlugin 的区别

| 维度 | IYpdCommonRul | BillPlugin |
|------|--------------|------------|
| 触发时机 | 审核后 | 保存前/后、审核后 |
| 实现方式 | `implements IYpdCommonRul` | `extends AbstractBillPlugin` |
| 注册方式 | Spring Bean（按规则名） | `@BillPlugin` 注解 |
| 典型场景 | 外部系统推送、异步处理 | 数据校验、单据级逻辑 |

## 相关页面

- [[BillPlugin扩展]]
- [[YonbipUtil]]
- [[BIP后端开发模板]]
