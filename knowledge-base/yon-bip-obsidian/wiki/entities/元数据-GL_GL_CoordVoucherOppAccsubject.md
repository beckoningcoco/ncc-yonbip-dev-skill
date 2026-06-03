---
tags: [BIP, 元数据, 数据字典, GL.GL.CoordVoucherOppAccsubject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对方科目 (`GL.GL.CoordVoucherOppAccsubject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_coordination_opp_accsubject_b` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`2e3bba74-7292-46b3-9627-82a8c2dd7ba9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对方科目 |
| 物理表 | `gl_coordination_opp_accsubject_b` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `coordination_setting_id` | `` |
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 11 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `oppaccsubject` | `oppaccsubject` | `oppaccsubject` | 科目编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject_id` | `accsubject_id` | `accsubjectId` | 科目 |
| `coordination_setting_id` | `coordination_setting_id` | `coordinationSettingId` | 协同凭证设置 |
| `creator` | `creator` | `creator` | 创建人 |
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
