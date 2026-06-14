---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlanInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划明细 (`mka.activityplan.ActivityPlanInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activityplan_info` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动计划明细 |
| 物理表 | `mka_activityplan_info` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `activityPlanInfoDefineCharacter` | `` |
| `reply_person` | `ucf-staff-center.bd_staff_ref` |
| `ytenant_id` | `` |
| `activityplan_id` | `` |
| `supply_customer` | `yycrm.cust_customerref` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `tenant_id` | `` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `theme` | `theme` | `theme` | 活动主题 |
| `regionCode` | `regionCode` | `regionCode` | 行政区划编码 |
| `address` | `address` | `address` | 活动地址 |
| `activity_expect` | `activity_expect` | `activityExpect` | 活动费用 |
| `supply_customer_filter` | `supply_customer_filter` | `supplyCustomerFilter` | 供货客户过滤 |
| `activity_display` | `activity_display` | `activityDisplay` | 活动陈列 |
| `activity_material` | `activity_material` | `activityMaterial` | 活动物料 |
| `reject_message` | `reject_message` | `rejectMessage` | 驳回意见 |
| `generate_fail_reason` | `generate_fail_reason` | `generateFailReason` | 生成失败原因 |
| `delete_fail_reason` | `delete_fail_reason` | `deleteFailReason` | 删除失败原因 |
| `attachmentId` | `attachmentId` | `attachmentId` | 附件 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityplan_id` | `activityplan_id` | `activityplanId` | 活动计划 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `terminal` | `terminal` | `terminal` | 终端主键 |
| `customer` | `customer` | `customer` | 客户主键 |
| `ower` | `ower` | `ower` | 负责人ID |
| `supply_customer` | `supply_customer` | `supplyCustomer` | 供货客户ID |
| `reply_person` | `reply_person` | `replyPerson` | 最近批复人主键 |
| `activity_id` | `activity_id` | `activityId` | 活动主键 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rejected` | `rejected` | `rejected` | 驳回标识 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_num` | `display_num` | `displayNum` | 陈列数量 |
| `material_num` | `material_num` | `materialNum` | 物料数量 |
| `execution_frequency` | `execution_frequency` | `executionFrequency` | 执行频率 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_status` | `settle_status` | `settleStatus` | 结算标识 |
| `sync_result` | `sync_result` | `syncResult` | 同步结果 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `line_no` | `line_no` | `lineNo` | 行号 |
| `longitude` | `longitude` | `longitude` | 经度 |
| `latitude` | `latitude` | `latitude` | 纬度 |
| `expenses_total` | `expenses_total` | `expensesTotal` | 费用投入 |
| `expect_produce` | `expect_produce` | `expectProduce` | 预计产出 |
| `expect_sales_rate` | `expect_sales_rate` | `expectSalesRate` | 预计费率 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `reply_time` | `reply_time` | `replyTime` | 最近批复时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityPlanInfoDefineCharacter` | `activityPlanInfoDefineCharacter` | `activityPlanInfoDefineCharacter` | 自定义项特征组 |
