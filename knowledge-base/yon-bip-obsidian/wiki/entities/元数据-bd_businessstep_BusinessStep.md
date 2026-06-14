---
tags: [BIP, 元数据, 数据字典, bd.businessstep.BusinessStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务活动 (`bd.businessstep.BusinessStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_business_step` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`c7a80b75-5bea-4291-8489-1cd776d86b4e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务活动 |
| 物理表 | `bd_business_step` |
| domain/服务域 | `transtype` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `BMMMM` |
| 直连字段 | 26 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `phase` | `ucfbasedoc.businessPhaseRef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `bill_type` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |

## 继承接口 (6个, 11字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 关系主键 |
| `step_code` | `step_code` | `code` | 编码 |
| `step_status` | `step_status` | `stepStatus` | 发布状态 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `applicationCode` | `applicationCode` | `applicationCode` | 应用编码 |
| `extend_attr` | `extend_attr` | `extendAttr` | 拓展字段 |
| `iorder` | `iorder` | `iorder` | 排序号 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `sourceid` | `sourceid` | `sourceId` | 来源ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type` | `bill_type` | `billType` | 单据类型id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `phase` | `phase` | `phase` | 业务阶段 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_business_take` | `is_business_take` | `isBusinessTake` | 是否业务接管环节 |
| `is_print` | `is_print` | `isPrint` | 是否能打印 |
| `is_edit` | `is_edit` | `isEdit` | 是否控制编辑 |
| `is_batch_approval` | `is_batch_approval` | `isBatchApproval` | 是否允许批量审批 |
| `dr` | `dr` | `dr` | 删除标识 |
| `step_level` | `step_level` | `stepLevel` | 级别 0系统级 1租户级 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `step_name` | `step_name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
