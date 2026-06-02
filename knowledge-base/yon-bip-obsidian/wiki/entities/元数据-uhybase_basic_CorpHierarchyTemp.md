---
tags: [BIP, 元数据, 数据字典, uhybase.basic.CorpHierarchyTemp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会籍 (`uhybase.basic.CorpHierarchyTemp`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_corphierarchy` | 应用: `SDMB` | 类型: `Class`

## 属性（16 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `bIsOpenUpMall` | 是否sOpenUpMall | `bIsOpenUpMall` | Short | `short` |
| 2 | `bOpenUpMall` | bOpenUpMall | `bOpenUpMall` | Short | `short` |
| 3 | `cAppID` | cAppID | `cAppID` | String | `text` |
| 4 | `cAppName` | cApp名称 | `cAppName` | String | `text` |
| 5 | `cECCustomerID` | cECCustomerID | `cECCustomerID` | String | `text` |
| 6 | `cOrgName` | cOrg名称 | `cOrgName` | String | `text` |
| 7 | `cOrgPath` | cOrgPath | `cOrgPath` | String | `text` |
| 8 | `cRegAgreement` | cRegAgreement | `cRegAgreement` | String | `text` |
| 9 | `cUserName` | cUser名称 | `cUserName` | String | `text` |
| 10 | `createTime` | 创建时间 | `dCreateTime` | Integer | `int` |
| 11 | `dUpdateTime` | dUpdateTime | `dUpdateTime` | Integer | `int` |
| 12 | `iOrgID` | iOrgID | `iOrgID` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `membercorp` | membercorp | `iCorpId` | Long | `long` |
| 15 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `iOrgID` -> `aa.baseorg.OrgMV` ()
