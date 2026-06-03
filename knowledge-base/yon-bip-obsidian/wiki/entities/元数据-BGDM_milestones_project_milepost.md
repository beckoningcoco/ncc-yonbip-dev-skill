---
tags: [BIP, 元数据, 数据字典, BGDM.milestones.project_milepost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目里程碑 (`BGDM.milestones.project_milepost`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgdm_project_milepost` | domain：`yonbip-pm-commonbd` | 应用：`BGDM` | 业务对象ID：`2f2a3a81-ae3a-4d1e-b5f4-311a2a636c67`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目里程碑 |
| 物理表 | `bgdm_project_milepost` |
| 数据库 schema | `yonbip-pm-commonbd` |
| 所属应用 | `BGDM` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity_id` | `yonbip-pm-projectme.project_activity_ref` |
| `milepost_character` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `standard_milepost_id` | `` |
| `ytenant_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `category_id` | `yonbip-pm-commonbd.milepost_category_ref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (4个, 9字段)

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

> 共 29 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_node` | `activity_node` | `activityNode` | 活动节点 |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `project_creation_id` | `project_creation_id` | `projectCreationId` | 立项id |
| `remark` | `remark` | `remark` | 备注 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 业务单元 |
| `project_id` | `project_id` | `projectId` | 项目编码 |
| `standard_milepost_id` | `standard_milepost_id` | `standardMilepostId` | 标准里程碑ID |
| `category_id` | `category_id` | `categoryId` | 里程碑类别ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `activity_id` | `activity_id` | `activity` | 活动 |

### 日期时间 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_complete_date` | `plan_complete_date` | `planCompleteDate` | 计划达成日期 |
| `real_complete_date` | `real_complete_date` | `realCompleteDate` | 实际达成日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `complete_status` | `complete_status` | `completeStatus` | 达成状态 |
| `type` | `type` | `type` | 里程碑类型 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 排序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `milestone_ratio` | `milestone_ratio` | `milestoneRatio` | 里程碑进度 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `useages` | `useages` | `useages` | 里程碑用途 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `milepost_character` | `milepost_character` | `milepostCharacter` | 自定义项特征 |
