---
tags: [BIP, 元数据, 数据字典, 其他入库, ST, st.othinrecord.OthInRecordsParallel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 其他入库单子表平行表 (`st.othinrecord.OthInRecordsParallel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_othinrecords_parallel` | 应用: `ST`

## 属性（10 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `consumerProfitCenter` | consumerProfitCenter | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 2 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 3 | `id` | ID | `id` | 6bbb450a-8303-4528-978e-f552eda93a6f | `quote` |
| 4 | `providerProfitCenter` | providerProfitCenter | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 5 | `collaborationPocode` | collaborationPocode | `collaboration_pocode` | String | `text` |
| 6 | `collaborationPodetailid` | collaborationPodetailid | `collaboration_podetailid` | Long | `long` |
| 7 | `collaborationPoid` | collaborationPoid | `collaboration_poid` | Long | `long` |
| 8 | `collaborationPorowno` | collaborationPorowno | `collaboration_porowno` | Long | `long` |
| 9 | `collaborationSource` | collaborationSource | `collaboration_source` | String | `text` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `providerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `costCenter` -> `bd.costcenter.CostCenter` () 
- `id` -> `st.othinrecord.OthInRecords` (1) 
- `consumerProfitCenter` -> `bd.virtualaccbody.VirtualAccbody` () 
