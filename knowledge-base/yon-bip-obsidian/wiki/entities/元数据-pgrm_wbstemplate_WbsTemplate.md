---
tags: [BIP, 元数据, 数据字典, pgrm.wbstemplate.WbsTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划模板 (`pgrm.wbstemplate.WbsTemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pm_pgrm_wbstpl` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5b1fe33b-f5ca-4a2f-96c1-94bf2d130a37`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划模板 |
| 物理表 | `pm_pgrm_wbstpl` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 30 个 |
| 子表 | 2 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `items` | `pgrm.wbstemplate.WbsTemplateItem` | composition |
| `WbsTemplateDefineList` | `pgrm.wbstemplate.WbsTemplateDefine` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_type_id` | `transtype.bd_billtyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `transi_type_id` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `wbs_template_define_character` | `` |
| `` | `` |
| `category_id` | `ucfbasedoc.bd_projectclasstreeref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (5个, 10字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
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
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 计划名称 |
| `name2` | `name2` | `name2` | 计划名称(英语) |
| `name3` | `name3` | `name3` | 计划名称(繁体) |
| `project_template_id` | `project_template_id` | `projectTemplateId` | 项目模板ID |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `category_id` | `category_id` | `categoryId` | 项目类别 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_type_id` | `project_type_id` | `projectTypeId` | 项目类型 |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
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

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `presets_flag` | `presets_flag` | `presetsFlag` | 是否预置 |
| `schedule_model_type` | `schedule_model_type` | `scheduleModelType` | 计划模型 |
| `tpl_type` | `tpl_type` | `tplType` | 模板类型 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `wbs_template_define_character` | `wbs_template_define_character` | `wbsTemplateDefineCharacter` | 自定义特征属性 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WbsTemplateDefineList` | WBS模板自定义项 |
| `` | `` | `items` | WBS模板明细 |
