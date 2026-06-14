---
tags: [BIP, 元数据, 数据字典, RSCM.materiallisttpl.MaterialListTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物资清单模板 (`RSCM.materiallisttpl.MaterialListTemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_material_list_template` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`3c2112a3-e7a1-4f04-8d6b-96027114680f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物资清单模板 |
| 物理表 | `prpr_material_list_template` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `RSCM` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MaterialListTemplateItemList` | `RSCM.materiallisttpl.MaterialListTemplateItem` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `material_tpl_define_character` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (5个, 10字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **主组织** (`iuap.busiObj.OrgItf`)
  - `org_id` → `org_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
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
| `dimension` | `dimension` | `dimension` | 物料维度 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `MaterialListTemplateItemList` | 物资清单模板详情 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_tpl_define_character` | `material_tpl_define_character` | `materialTplDefineCharacter` | 特征 |
