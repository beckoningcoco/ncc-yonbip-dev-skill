---
tags: [BIP, 元数据, 数据字典, sa.agent.AgentProductApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户商品对照适用范围 (`sa.agent.AgentProductApplyRange`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentproductapplyrange` | 应用: `SCMSA` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentProductAppliedDetail` | agentProductAppliedDetail | `` | 46ec4941-4149-435c-9d3d-6c73469636da | `` |
| 2 | `agentProductId` | agentProductID | `agentProductId` | 27a41e77-558c-4f2b-9fdb-f108db09b3b5 | `quote` |
| 3 | `customerId` | customerID | `customerId` | 69bfc334-60af-4138-acc8-c3b08eb1b6b4 | `quote` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `isApplied` | 是否Applied | `isApplied` | Boolean | `switch` |
| 6 | `isCreator` | 是否Creator | `isCreator` | Boolean | `switch` |
| 7 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 8 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 9 | `rangeType` | rangeType | `iRangeType` | Integer | `int` |
| 10 | `shopId` | shopID | `shopId` | 608a3638-ca04-48e4-be71-8a8a01ddaf3a | `quote` |
| 11 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `agentProductAppliedDetail` -> `sa.agent.AgentProductApplyRangeDetail` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `agentProductId` -> `sa.agent.AgentProductRelation` (1..n)
- `customerId` -> `aa.customer.Customer` ()
- `shopId` -> `pc.reportservice.MallOrderShop` ()
- `orgId` -> `bd.adminOrg.BaseOrgVO` ()
