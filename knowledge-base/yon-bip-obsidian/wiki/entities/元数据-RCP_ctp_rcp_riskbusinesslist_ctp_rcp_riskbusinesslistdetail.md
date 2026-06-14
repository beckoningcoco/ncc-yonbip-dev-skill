---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 风险业务清单操作明细 (`RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskbusinesslistdetail` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`be0a589e-303b-44ba-9a9b-b9a7e37837fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 风险业务清单操作明细 |
| 物理表 | `rcp_riskbusinesslistdetail` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `RCP` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ctp_rcp_riskbusinesslistdetail_riskresponsestrategyIdList` | `RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail_riskresponsestrategyId` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `riskresponsestrategy_id` | `yonbip-ec-contract.RefTable_dfe60f7056` |
| `main_id` | `` |
| `character_define` | `` |

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oper_code` | `oper_code` | `operCode` | 操作编码 |
| `oper_name` | `oper_name` | `operName` | 操作名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | ID |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `main_id` | `main_id` | `mainId` | 风险业务清单 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_define` | `character_define` | `characterDefine` | 特征 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `riskresponsestrategy_id` | `riskresponsestrategy_id` | `riskresponsestrategyId` | 风险应对策略 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ctp_rcp_riskbusinesslistdetail_riskresponsestrategyIdList` | 风险业务清单操作明细_风险应对策略 |
