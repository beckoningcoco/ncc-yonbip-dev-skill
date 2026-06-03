---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail_riskresponsestrategyId]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 风险业务清单操作明细_风险应对策略 (`RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail_riskresponsestrategyId`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskbusinesslistdetail_riskresponsestrategy` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`be0a589e-303b-44ba-9a9b-b9a7e37837fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 风险业务清单操作明细_风险应对策略 |
| 物理表 | `rcp_riskbusinesslistdetail_riskresponsestrategy` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `RCP` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `mainid` | `yonbip-ec-contract.RefTable_dfe60f7056` |
| `` | `` |
| `fkid` | `` |

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | ID |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fkid` | `fkid` | `fkid` | 风险业务清单操作明细 |
| `mainid` | `mainid` | `riskresponsestrategyId` | 风险应对策略 |
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

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
