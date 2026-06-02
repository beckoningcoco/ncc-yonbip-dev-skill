---
tags: [BIP, 元数据, 数据字典, sa.agent.AgentProductExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户商品对照详情(管理组织) (`sa.agent.AgentProductExtend`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentproductextend` | 应用: `SCMSA` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `agentProductCode` | agentProduct编码 | `cAgentProductCode` | String | `text` |
| 2 | `agentProductId` | agentProductID | `agentProductId` | 27a41e77-558c-4f2b-9fdb-f108db09b3b5 | `quote` |
| 3 | `agentProductName` | agentProduct名称 | `cAgentProductName` | String | `text` |
| 4 | `agentSkuCode` | agentSku编码 | `cAgentSkuCode` | String | `text` |
| 5 | `agentSkuName` | agentSku名称 | `cAgentSkuName` | String | `text` |
| 6 | `detailDefineCharacter` | detailDefineCharacter | `detailDefineCharacter` | d24aa346-0537-4d68-be37-bb0ee38ce0e4 | `UserDefine` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 9 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 10 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 11 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 12 | `bodyItem` | bodyItem | `` | 23e058ed-aaca-49e2-8f1b-a809a6c24ae3 | `` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `bodyItem` -> `sa.agent.AgentProductDefine` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `agentProductId` -> `sa.agent.AgentProductRelation` (0..n)
- `detailDefineCharacter` -> `sa.agent.DetailDefineCharacter` ()
