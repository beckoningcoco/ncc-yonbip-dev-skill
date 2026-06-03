---
tags: [BIP, 元数据, 数据字典, cust.custoperatetarget.CustOperateTarget]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 年度经营计划 (`cust.custoperatetarget.CustOperateTarget`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_operate_target` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：`f23fc4fc-0c05-407b-bb0d-3221c2898ff9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 年度经营计划 |
| 物理表 | `cust_operate_target` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDef` | `cust.custoperatetarget.CustOperateTargetDef` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `cust_operate_target_define_character` | `` |
| `cust_plan_id` | `` |
| `tenant_id` | `` |
| `customer` | `` |

## 继承接口 (4个, 11字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `target_name` | `target_name` | `targetName` | 经营目标 |
| `progress_comment` | `progress_comment` | `progressComment` | 进度说明 |
| `comment` | `comment` | `comment` | 描述 |
| `strategy` | `strategy` | `strategy` | 实现策略 |
| `code` | `code` | `code` | 序号 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ower` | `ower` | `ower` | 负责人ID |
| `cust_plan_id` | `cust_plan_id` | `custPlanId` | 客户经营计划 |
| `customer` | `customer` | `customer` | 客户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginDate` | `beginDate` | `beginDate` | 开始日期 |
| `endDate` | `endDate` | `endDate` | 截止日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finish_status` | `finish_status` | `finishStatus` | 完成状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_target` | `sign_target` | `signTarget` | 签约目标金额 |
| `return_money_target` | `return_money_target` | `returnMoneyTarget` | 回款目标金额 |
| `oppt_plan_money` | `oppt_plan_money` | `opptPlanMoney` | 商机规划金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cust_operate_target_define_character` | `cust_operate_target_define_character` | `custOperateTargetDefineCharacter` | 年度经营计划自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headDef` | 客户经营目标自定义项 |
