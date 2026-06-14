---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjtype.FundBusinObjType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资金业务伙伴类型 (`tmsp.fundbusinobjtype.FundBusinObjType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tmsp_fundbusinobj_type` | domain：`yonbip-fi-ctmtmsp` | 应用：`TMSP` | 业务对象ID：`ae7feccd-b8bb-4e1e-a0fa-cab5ba80bcc4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资金业务伙伴类型 |
| 物理表 | `tmsp_fundbusinobj_type` |
| domain/服务域 | `yonbip-fi-ctmtmsp` |
| schema | `yonbip_fi_ctmpub` |
| 所属应用 | `TMSP` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `fundbusinobj_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fundbusinobjbank_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |

## 继承接口 (5个, 15字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
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

> 共 25 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 资金业务伙伴类型编号 |
| `ext` | `ext` | `ext` | ext |
| `name` | `name` | `name` | 节点标题 |
| `id` | `id` | `id` | 主键 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fundbusinobjbank_id` | `fundbusinobjbank_id` | `fundbusinobjbankid` | 资金业务伙伴银行信息参照 |
| `fundbusinobj_id` | `fundbusinobj_id` | `fundbusinobjid` | 资金业务伙伴参照 |
| `parent` | `parent` | `parent` | 上级分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enabled` | `enabled` | `enabled` | 启停用状态 |
| `systemPrepare` | `systemPrepare` | `systemPrepare` | 是否系统预制 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 排序号 |
| `level` | `level` | `level` | 层级 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | dr |
| `is_end` | `is_end` | `isEnd` | 是否末级 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `objectName` | `objectName` | `objectName` | 资金业务伙伴类型名称 |
