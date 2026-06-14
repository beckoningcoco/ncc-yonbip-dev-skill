---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.feedback.Feedback"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 反馈单 (`suppliermgr.feedback.Feedback`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_feedback_mdd` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.feedback.Feedback` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 反馈单 |
| 物理表 | `cpu_feedback_mdd` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `8ce959b2-712d-4fc2-b2b9-e91abf05f3b8` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:49.7350` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:53:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601151119_metadata_suppliermgr-feedback_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `8ddaa248-cef2-4f40-8c2f-2685ec0e1dcd`

## 业务场景

- `print`
- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `report`
- `billcode`
- `userdefine`
- `msgtemplate`

## 术语标记

`BusinessData`, `data_auth`, `isBillLevelCfg`, `isMain`, `isMultiCodeRule`, `isUseCondition`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 8 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 7 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 8 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |

---

## 直接属性（共 68 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 2 | `verifystate` | 审批流状态 | `verifystate` | Short | `short` |  | ✓ |
| 3 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 4 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 5 | `name` | 标题 | `name` | String | `text` |  | ✓ |
| 6 | `billStatus` | 是否审批流控制 | `bill_status` | String | `text` |  | ✓ |
| 7 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 8 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 9 | `orgName` | 反馈组织名称 | `org_name` | String | `text` |  | ✓ |
| 10 | `productClassName` | 物料分类名称 | `product_class_name` | String | `text` |  | ✓ |
| 11 | `productName` | 物料名称 | `product_name` | String | `text` |  | ✓ |
| 12 | `ytenantId` | ytenantId | `ytenant_id` | String | `text` |  | ✓ |
| 13 | `pubts` | 最后修改时间 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 14 | `vendorTenant` | 供应商租户ID | `vendor_tenant_id` | String | `text` |  | ✓ |
| 15 | `buyerTenant` | 跨租户采购商ID | `buyer_tenant_id` | String | `text` |  | ✓ |
| 16 | `enterpriseId` | 租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 17 | `bustype` | 交易类型 | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 22 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 23 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 24 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 26 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 28 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 29 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 30 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 31 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 32 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 33 | `orgId` | 反馈组织id | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 34 | `staffId` | 反馈人id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 35 | `isSynergy` | 协同供应商 | `is_synergy` | Boolean | `switch` |  | ✓ |
| 36 | `sourceType` | 来源类型 | `source_type` | String | `text` |  | ✓ |
| 37 | `businessDate` | 反馈日期 | `business_date` | DateTime | `timestamp` |  | ✓ |
| 38 | `docNo` | 单据号 | `doc_no` | String | `text` |  | ✓ |
| 39 | `docLineNo` | 单据行号 | `doc_line_no` | String | `text` |  | ✓ |
| 40 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 41 | `productClassId` | 物料分类id | `product_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 42 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 43 | `templateId` | 模板id | `template_id` | 0f1b9f8e-a486-4e1c-a5ee-b4aa7534106f | `quote` |  | ✓ |
| 44 | `intFeedbackSug` | 内部反馈建议 | `int_feedback_sug` | String | `text` |  | ✓ |
| 45 | `extSynergySug` | 外部协同建议 | `ext_synergy_sug` | String | `text` |  | ✓ |
| 46 | `costType` | 费用类型 | `cost_type` | String | `text` |  | ✓ |
| 47 | `costAmount` | 费用金额 | `cost_amount` | Decimal | `number` |  | ✓ |
| 48 | `costCurrency` | 费用币种ID | `cost_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 49 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 50 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 51 | `feedbackDefineCharacter` | 反馈单自定义项特征 | `feedback_define_character` | 050d7ae3-0779-4f3d-99df-3cb598c07eab | `UserDefine` |  | ✓ |
| 52 | `auditor` | 审批人 | `auditor` | String | `text` |  | ✓ |
| 53 | `auditTime` | 审核时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 54 | `fileId` | 说明文件 | `file_id` | String | `text` |  | ✓ |
| 55 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 56 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 57 | `isLineFeedback5` | 采购入库表体行是否已生成反馈单 | `is_line_feedback5` | Boolean | `switch` |  | ✓ |
| 58 | `isFeedback5` | 采购入库表头是否已生成反馈单 | `is_feedback5` | Boolean | `switch` |  | ✓ |
| 59 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 60 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 61 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 62 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 63 | `rejectReasons` | 拒绝原因 | `reject_reasons` | String | `text` |  | ✓ |
| 64 | `supFileId` | 响应文件 | `sup_file_id` | String | `text` |  | ✓ |
| 65 | `bizFlow` | 业务流id | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 66 | `contactWay` | 联系方式 | `contacts` | String | `text` |  | ✓ |
| 67 | `feedbackDetail` | 反馈明细表 | `` | e443cca0-61a3-41ee-9aa8-b0668f88db0a | `` |  |  |
| 68 | `feedbackExtend` | 反馈扩展表 | `` | 4f8951db-87b9-4c17-ae60-9ff8916aa2e0 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `productClassId` | 物料分类id | `pc.cls.ManagementClass` | `product_class_id` |  →  |  |  | Service |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | `product_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 7 | `bizFlow` | 业务流id | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 8 | `feedbackDefineCharacter` | 反馈单自定义项特征 | `suppliermgr.feedback.FeedbackDefineCharacter` | `feedback_define_character` |  →  |  |  | None |  |
| 9 | `templateId` | 模板id | `suppliermgr.template.Template` | `template_id` |  →  |  |  | None |  |
| 10 | `bustype` | 交易类型 | `bd.bill.TransType` | `bustype` |  →  |  |  | Service |  |
| 11 | `orgId` | 反馈组织id | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 12 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 13 | `feedbackDetail` | 反馈明细表 | `suppliermgr.feedback.FeedbackDetail` | `` | feedbackDetail → feedbackId | 0..n | true | None |  |
| 14 | `feedbackExtend` | 反馈扩展表 | `suppliermgr.feedback.FeedbackExtend` | `` | feedbackExtend → id | 1 | true | None |  |
| 15 | `enterpriseId` | 租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 16 | `costCurrency` | 费用币种ID | `bd.currencytenant.CurrencyTenantVO` | `cost_currency` |  →  |  |  | Service |  |
| 17 | `staffId` | 反馈人id | `bd.staff.Staff` | `staff_id` |  →  |  |  | Service |  |

### Composition（子表）

- **feedbackDetail**: `feedbackDetail` → `suppliermgr.feedback.FeedbackDetail` | 0..n
- **feedbackExtend**: `feedbackExtend` → `suppliermgr.feedback.FeedbackExtend` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `productClassId` (物料分类id) | `pc.cls.ManagementClass` | `product_class_id` |
| `supplierId` (供应商id) | `aa.vendor.Vendor` | `supplier_id` |
| `productId` (物料id) | `pc.product.Product` | `product_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `bizFlow` (业务流id) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `bustype` (交易类型) | `bd.bill.TransType` | `bustype` |
| `orgId` (反馈组织id) | `bd.adminOrg.BaseOrgVO` | `org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `enterpriseId` (租户ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `costCurrency` (费用币种ID) | `bd.currencytenant.CurrencyTenantVO` | `cost_currency` |
| `staffId` (反馈人id) | `bd.staff.Staff` | `staff_id` |
