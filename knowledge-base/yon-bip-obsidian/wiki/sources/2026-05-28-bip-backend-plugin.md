---
title: 后端插件开发（YDS）
date: 2026-05-28
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/HDCJKFYDS1
version: BIP5
tags: [YPD, 后端插件, AbstractBillPlugin, beforeSave, 插件开发, JAVAPOJO, SuperDO]
images: 26
image_paths: []
---

# 后端插件开发（YDS）

> 使用 YPD 脚手架工程对业务对象进行客开，通过继承 AbstractBillPlugin 在单据动作前后扩展业务逻辑。

## 适用场景

仅适用私有云/专属云（客户化定制 + ISV 生态开发），公有云不适用。

## YPD 框架原理

YPD 框架内置单据动作实现（覆盖页面上所有操作），提供单据动作调度器，定义插件扩展的切面。以保存操作为例：请求 → 动作调度器 → beforeSave 切面 → 保存逻辑 → afterSave 切面。

**开发环境**：BIP5 适配 **JDK 21**（All in One 版本需下载 JDK 21 内核）。

VS Code 全局配置：
```json
"java.configuration.runtimes": [
  {
    "name": "JavaSE-21",
    "path": "C:\Program Files\Java\jdk-21",
    "default": false
  }
]
```

## 脚手架工程结构

- `{引擎编码}-bootstrap` — 启动工程
- `{引擎编码}-service` — 业务功能客开（插件放在此子工程的 `com.yonyou.ucf.mdf.plugin` 包下）

## 插件开发流程

### 1. 导出 JAVAPOJO

应用构建 → 对象建模 → 选择业务对象 → 导出 JAVAPOJO → 解压到 `xxxxx-service` 子工程的 `com.yonyou.ucf.mdf.bill.entity` 包。

实体类继承 `SuperDO`，注解 `@YMSEntity`（name=实体URI，domain=域名）。

### 2. 创建插件类

继承 `AbstractBillPlugin`，添加 `@BillPlugin(busiObj = "业务对象编码")` 注解。

**规则**：一个业务对象只能有一个插件类；若多个插件类用同一 busiObj，系统只加载一个。

**0 租户插件**：不绑定业务对象的 Plugin（`@BillPlugin` 无 busiObj），运行时若未找到绑定插件则走 0 租户插件。

### 3. 重写钩子方法

## 完整插件方法表（23 个动作码）

| 序号 | 动作码 | 插件方法 | 备注 |
|------|--------|----------|------|
| 1 | `ACTIONCODE_ADD` | `initBillDefaultValueWhenNew` | 新增时初始化默认值 |
| 2 | `ACTIONCODE_AUDIT` | `beforeAudit`、`afterAudit` | 审批前后（终审触发） |
| 3 | `ACTIONCODE_BATCHAUDIT` | `beforeAudit`、`afterAudit` | 批量审批 |
| 4 | `ACTIONCODE_DELETE` | `beforeDelete`、`afterDelete` | 删除前后 |
| 5 | `ACTIONCODE_BATCHDELETE` | `beforeDelete`、`afterDelete` | 批量删除 |
| 6 | `ACTIONCODE_PRINTDATA` | `afterPrintDataQuery` | 打印数据查询后处理 |
| 7 | `ACTIONCODE_DETAIL` | `beforeBillDetailQuery`、`afterBillDetailQuery` | 卡片查询前后 |
| 8 | `ACTIONCODE_LIST` | `beforeBillListQuery`、`afterBillListQuery` | 列表查询前后 |
| 9 | `ACTIONCODE_REFER` | `beforeRefDataQuery`、`afterRefDataQuery` 等 5 个 | 参照查询 |
| 10 | `ACTIONCODE_SAVE` | `beforeSave`、`afterSave`、`initBillConfig` | 保存前后 |
| 11 | `ACTIONCODE_SAVEANDSUBMIT` | `beforeSubmit`、`afterSubmit` | 保存并提交 |
| 12 | `ACTIONCODE_SUBMIT` | `beforeSubmit`、`afterSubmit` | 提交前后 |
| 13 | `ACTIONCODE_UNAUDIT` | `beforeUnAudit`、`afterUnAudit` | 弃审前后 |
| 14 | `ACTIONCODE_UNSUBMIT` | `beforeUnSubmit`、`afterUnSubmit` | 反提交前后 |
| 15 | `ACTIONCODE_STOP` | `beforeStop`、`afterStop` | 停用前后 |
| 16 | `ACTIONCODE_UNSTOP` | `beforeUnStop`、`afterUnStop` | 启用前后 |
| 17 | `ACTIONCODE_COPY` | `beforeCopy`、`afterCopy` | 复制前后 |
| 18 | `ACTIONCODE_BIZFLOWPUSH` | `beforePush`、`afterConvert`、`afterPush` | 推单/生单/转换后 |
| 19 | `ACTIONCODE_BPMCOMPLETE` | `beforeBpmcomplete`、`afterBpmcomplete` | 审批流回调（不推荐，用 audit） |
| 20 | `ACTIONCODE_DELETEBPM` | `beforeDeleteBpm`、`afterDeleteBpm` | 删除审批流 |

## YpdBillContext 参数

| 名称 | 类型 | 说明 |
|------|------|------|
| billDO | IBillDO | 单据对象（强类型） |
| billDOs | IBillDO[] | 单据对象数组 |
| workflowParam | WorkflowParam | 工作流参数 |
| formulaMap | Map<String, String> | 公式 map |

**获取业务对象**：`(KkfnProductPurchaseRequisition) billContext.getBillDO()`
**字段赋值**：直接调用 POJO 的 set 方法
**附加方法**：`beforeDB`（持久化前）、`commonDoPlugin`（租户级扩展点）

## 完整示例

```java
@BillPlugin(busiObj = "fnProductPurchaseRequisition")
public class FnProductPurchaseRequisitionBillPlugin extends AbstractBillPlugin {

    @Override
    public void beforeSave(YpdBillContext billContext) throws Exception {
        super.beforeSave(billContext);

        FnProductPurchaseRequisition purreq = (FnProductPurchaseRequisition) billContext.getBillDO();

        // 校验：明细预算金额需大于0
        if (!CollectionUtils.isEmpty(purreq.getFnProductPurchaseReqDetailList())) {
            Set<String> materialcodes = null;
            for (FnProductPurchaseReqDetail dtl : purreq.getFnProductPurchaseReqDetailList()) {
                BigDecimal money = dtl.getTotal();
                if (money == null || BigDecimal.ZERO.compareTo(money) >= 0) {
                    if (materialcodes == null) materialcodes = new HashSet<>();
                    materialcodes.add(dtl.getMaterialCode());
                }
            }
            if (materialcodes != null) {
                throw new BizException("需求单明细中预算金额需大于0。不满足条件的物料编码为："
                    + StringUtils.join(materialcodes.toArray(), ","));
            }
        }

        // 赋值：采购组织信息加到备注字段
        String purorg = purreq.getPurOrg();
        if (StringUtils.isNotBlank(purorg)) {
            purreq.setRemark(purorg);
        }

        // 校验：来源单据号和付款日期不能同时为空
        if (StringUtils.isBlank(purreq.getSourceBillno())
                && StringUtils.isBlank(purreq.getPayDate())) {
            throw new BizException("来源单据号和付款日期不能同时为空！");
        }
    }
}
```

## 常见问题

| 问题 | 解决 |
|------|------|
| 插件类未加载 | 检查编译是否成功、业务对象编码是否正确 |
| 列表查询映射错误 | Maven 清理依赖包重新拉取 |
| 弱类型转换错误 | 确认 JAVAPOJO 已下载到工程目录且编译通过 |
| 子表数据不全 | 修改时未改动的子表数据不会提交到后端 |
| afterAudit 未触发 | afterAudit 对应终审节点（最后一次审批） |

## 相关页面

- [[专业开发]]
- [[BIP后端开发模板]]
- [[BillPlugin扩展]]
- [[SuperDO]]
