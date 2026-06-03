---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslist]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 风险业务清单 (`RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslist`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskbusinesslist` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`be0a589e-303b-44ba-9a9b-b9a7e37837fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 风险业务清单 |
| 物理表 | `rcp_riskbusinesslist` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `RCP` |
| 直连字段 | 32 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ctp_rcp_riskbusinesslistdetailList` | `RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistdetail` | composition |
| `ctp_rcp_riskbusinesslistruleList` | `RCP.ctp_rcp_riskbusinesslist.ctp_rcp_riskbusinesslistrule` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `billtype_id` | `ucfbasedoc.bd_billtypetreeref` |
| `` | `` |
| `ytenant_id` | `` |
| `transtype_id` | `ucfbasedoc.bd_billtyperef` |
| `character_define` | `` |

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 服务名称 |
| `busi_service_id` | `busi_service_id` | `busiServiceId` | 原子服务 |
| `busi_service_code` | `busi_service_code` | `busiServiceCode` | 服务编码 |
| `busi_code_field` | `busi_code_field` | `busiCodeField` | 业务编码字段 |
| `busi_org_field` | `busi_org_field` | `busiOrgField` | 业务单元字段 |
| `control_range_field` | `control_range_field` | `controlRangeField` | 控制范围字段 |
| `domain_id` | `domain_id` | `domainId` | 领域名称 |
| `busi_code` | `busi_code` | `busiCode` | 业务对象编码 |
| `busi_entity_name` | `busi_entity_name` | `busiEntityName` | 业务元数据路径 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `id` | `id` | `id` | ID |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `transtype_code` | `transtype_code` | `transtypeCode` | 交易类型编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billtypeId` | 单据类型 |
| `transtype_id` | `transtype_id` | `transtypeId` | 交易类型 |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sys_flag` | `sys_flag` | `sysFlag` | 是否预置数据 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_type` | `control_type` | `controlType` | 控制范围类型 |
| `risk_domain` | `risk_domain` | `riskDomain` | 风险所属领域 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_define` | `character_define` | `characterDefine` | 特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ctp_rcp_riskbusinesslistdetailList` | 风险业务清单操作明细 |
| `` | `` | `ctp_rcp_riskbusinesslistruleList` | 风险业务清单规则接口 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
