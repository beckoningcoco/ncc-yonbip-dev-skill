---
tags: [BIP, 元数据, 数据字典, TMSP.liquidityProject.tmsp_lp_busi_releation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 关联交易信息 (`TMSP.liquidityProject.tmsp_lp_busi_releation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tmsp_lp_busi_releation` | domain：`yonbip-fi-ctmtmsp` | 应用：`TMSP` | 业务对象ID：`be38743e-1be0-408d-8fa2-0b2d9e072c3b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关联交易信息 |
| 物理表 | `tmsp_lp_busi_releation` |
| domain/服务域 | `yonbip-fi-ctmtmsp` |
| schema | `yonbip_fi_ctmpub` |
| 所属应用 | `TMSP` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `trans_type` | `ucfbasedoc.bd_billtyperef` |
| `ytenant_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `main_id` | `yonbip-fi-ctmtmsp.tmsp_lp_ref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (5个, 13字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_name` | `bill_name` | `billName` | 单据名称 |
| `bill_no` | `bill_no` | `billNo` | 单据编码 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 节点标题 |
| `path` | `path` | `path` | 路径 |
| `trans_type_code` | `trans_type_code` | `transTypeCode` | 交易类型编码 |
| `trans_type_name` | `trans_type_name` | `transTypeName` | 交易类型名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型id |
| `creator` | `creator` | `creator` | 创建人 |
| `main_id` | `main_id` | `mainId` | 流动性项目id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `trans_type` | `trans_type` | `transType` | 交易类型id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
| `ifend` | `ifend` | `isEnd` | 是否末级 |
