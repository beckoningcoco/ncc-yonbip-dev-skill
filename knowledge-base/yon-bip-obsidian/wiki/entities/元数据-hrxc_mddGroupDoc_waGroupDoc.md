---
tags: [BIP, 元数据, 数据字典, hrxc.mddGroupDoc.waGroupDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资组参照 (`hrxc.mddGroupDoc.waGroupDoc`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`wa_group_doc` | domain：`yonbip-hr-paybiz` | 应用：`HRXZHS_MDD` | 业务对象ID：`2ff32620-2a21-49cf-bee0-ee3e4f098df6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 薪资组参照 |
| 物理表 | `wa_group_doc` |
| 数据库 schema | `yonbip-hr-paybiz` |
| 所属应用 | `HRXZHS_MDD` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `waGroupAuths` | `hrxc.mddGroupDoc.WaGroupDocAuth` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `CREATOR` | `` |
| `ytenant_id` | `` |
| `MODIFIER` | `` |
| `ORGID` | `ucf-org-center.member_org_tree_ref` |
| `TENANTID` | `` |
| `` | `` |

## 继承接口 (4个, 3字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **自动编码** (`ucfbase.ucfbaseItf.IAutoCode`)

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `DESCRIPTION2` | `DESCRIPTION2` | `description2` | 描述2 |
| `DESCRIPTION3` | `DESCRIPTION3` | `description3` | 描述3 |
| `DESCRIPTION4` | `DESCRIPTION4` | `description4` | 描述4 |
| `DESCRIPTION5` | `DESCRIPTION5` | `description5` | 描述5 |
| `DESCRIPTION6` | `DESCRIPTION6` | `description6` | 描述6 |
| `ORG_NAME` | `ORG_NAME` | `orgName` | 组织名称 |
| `NAME2` | `NAME2` | `name2` | 多语名称2 |
| `NAME3` | `NAME3` | `name3` | 多语名称3 |
| `NAME4` | `NAME4` | `name4` | 多语名称4 |
| `NAME5` | `NAME5` | `name5` | 多语名称5 |
| `NAME6` | `NAME6` | `name6` | 多语名称6 |
| `CODE` | `CODE` | `code` | 薪资组编码 |
| `DESCRIPTION` | `DESCRIPTION` | `description` | 备注 |
| `ID` | `ID` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ORGID` | `ORGID` | `orgId` | 组织主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户主键 |
| `CREATOR` | `CREATOR` | `creator` | 创建人 |
| `MODIFIER` | `MODIFIER` | `modifier` | 修改人 |
| `TENANTID` | `TENANTID` | `tenant` | 租户主键(旧) |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ENABLE` | `ENABLE` | `enable` | 启用状态 |
| `DR` | `DR` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `NAME` | `NAME` | `name` | 薪资组名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `PUBTS` | `PUBTS` | `pubts` | 时间戳 |
| `CREATIONTIME` | `CREATIONTIME` | `createTime` | 创建时间 |
| `MODIFIEDTIME` | `MODIFIEDTIME` | `modifyTime` | 修改时间 |
| `TS` | `TS` | `ts` | 时间戳(旧) |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `waGroupAuths` | 薪资组授权 |
