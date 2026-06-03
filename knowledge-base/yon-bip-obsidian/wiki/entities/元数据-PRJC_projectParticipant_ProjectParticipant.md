---
tags: [BIP, 元数据, 数据字典, PRJC.projectParticipant.ProjectParticipant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目参与单位 (`PRJC.projectParticipant.ProjectParticipant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_participant` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`b27c6ed6-5f27-4b1e-90e2-9c78304de2a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目参与单位 |
| 物理表 | `prjc_project_participant` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PRJC` |
| 直连字段 | 26 个 |
| 子表 | 3 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ProjectParticipantOrgList` | `PRJC.projectParticipant.ProjectParticipantOrg` | composition |
| `ProjectParticipantItemList` | `PRJC.projectParticipant.ProjectParticipantItem` | composition |
| `ProjectParticipant_participantRoleList` | `PRJC.projectParticipant.ProjectParticipant_participantRole` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `country` | `ucfbasedoc.bd_countryref` |
| `unit` | `ucf-org-center.org_pure_tree_ref_na` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `time_zone` | `` |
| `ytenant_id` | `` |
| `participant_role` | `yonbip-pm-projectme.RefTable_718e6ba236` |

## 继承接口 (5个, 10字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `remark` | `remark` | `remark` | 备注 |
| `search_code` | `search_code` | `searchCode` | 助记码 |
| `short_name` | `short_name` | `shortName` | 简称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `time_zone` | `time_zone` | `timeZone` | 时区 |
| `unit` | `unit` | `unit` | 业务单元 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partner_type` | `partner_type` | `partnerType` | 类别 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `participant_role` | `participant_role` | `participantRole` | 参与方角色 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ProjectParticipantItemList` | 人员信息 |
| `` | `` | `ProjectParticipantOrgList` | 适用组织 |
| `` | `` | `ProjectParticipant_participantRoleList` | 参与方角色多选引用子实体 |
