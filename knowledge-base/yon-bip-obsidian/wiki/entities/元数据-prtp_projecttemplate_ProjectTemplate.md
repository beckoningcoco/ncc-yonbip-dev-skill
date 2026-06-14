---
tags: [BIP, 元数据, 数据字典, prtp.projecttemplate.ProjectTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目模板主表 (`prtp.projecttemplate.ProjectTemplate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prtp_project_template` | domain：`yonbip-pm-projectme` | 应用：`PRTP` | 业务对象ID：`1918a1f1-91f6-43bf-a2f8-1d077792a17f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目模板主表 |
| 物理表 | `prtp_project_template` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRTP` |
| 直连字段 | 17 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `items` | `prtp.projecttemplate.ProjectTemplateParam` | composition |
| `procedureItems` | `prtp.projecttemplate.ProjectProcedure` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `org_v_id` | `` |
| `` | `` |
| `category_id` | `ucfbasedoc.bd_projectclasstreeref` |
| `org_id` | `` |

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

> 共 17 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 模板编码 |
| `group_id` | `group_id` | `groupId` | 集团 |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 模板名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_id` | `category_id` | `categoryId` | 项目类别id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 业务单元最新版 |
| `org_v_id` | `org_v_id` | `orgVId` | 业务单元 |
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

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 项目模板专属属性 |
| `` | `` | `procedureItems` | 立项导航 |
