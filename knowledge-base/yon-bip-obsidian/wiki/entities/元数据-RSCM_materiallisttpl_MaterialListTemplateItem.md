---
tags: [BIP, 元数据, 数据字典, RSCM.materiallisttpl.MaterialListTemplateItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物资清单模板详情 (`RSCM.materiallisttpl.MaterialListTemplateItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_material_list_template_b` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`3c2112a3-e7a1-4f04-8d6b-96027114680f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物资清单模板详情 |
| 物理表 | `prpr_material_list_template_b` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `material_list_template_id` | `yonbip-pm-projectme.RefTable_46d4554598` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `material_tpl_b_define_character` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `material_classify_id` | `productcenter.pc_managementclassref` |

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

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `material_classify_id` | `material_classify_id` | `materialClassifyId` | 物料分类 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `material_list_template_id` | `material_list_template_id` | `materialListTemplateId` | 物资清单模板 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_tpl_b_define_character` | `material_tpl_b_define_character` | `materialTplBDefineCharacter` | 明细特征 |
