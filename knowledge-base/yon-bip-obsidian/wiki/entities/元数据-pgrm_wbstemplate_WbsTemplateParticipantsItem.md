---
tags: [BIP, 元数据, 数据字典, pgrm.wbstemplate.WbsTemplateParticipantsItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 参与人模板明细 (`pgrm.wbstemplate.WbsTemplateParticipantsItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_template_participants` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5b1fe33b-f5ca-4a2f-96c1-94bf2d130a37`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 参与人模板明细 |
| 物理表 | `pgrm_template_participants` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `wbs_template_item_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `define_character` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `member_id` | `bd_staff_all_ref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `user_id` | `user_id` | `userId` | 用户 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `member_id` | `member_id` | `memberId` | 参与人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织 |
| `wbs_template_item_id` | `wbs_template_item_id` | `wbsTemplateItemId` | WBS模板明细 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_hours` | `plan_hours` | `planHours` | 计划工时 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_labor_cost` | `plan_labor_cost` | `planLaborCost` | 人工成本 |
| `rank_rate` | `rank_rate` | `rankRate` | 费率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_character` | `define_character` | `defineCharacter` | 自定义特征项 |
