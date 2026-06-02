---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctDcsVo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同自定义项 (`apct.contract.ApctDcsVo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `apct_apct_dcs` | 应用: `APCT`

## 属性（12 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `CXCX` | CXCX | `vcol2` | String | `text` |
| 2 | `HTLXTZ` | HTLXTZ | `vcol3` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb | `quote` |
| 3 | `HTTZ` | HTTZ | `vcol1` | 88256f6a-5ca6-4c4c-9b6d-4b290b94444a | `quote` |
| 4 | `NBXTHTH` | NBXTHTH | `vcol55` | String | `text` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `jhrq` | jhrq | `dcol50` | Date | `date` |
| 7 | `marassistant2` | marassistant2 | `vcol5` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `sfkjht` | sfkjht | `bcol50` | Boolean | `switch` |
| 10 | `xthth` | xthth | `lcol1` | 84a309b9-2fd0-48d8-9b75-8251a20928c2 | `quote` |
| 11 | `ydzbl` | ydzbl | `vcol4` | 30fee802-b3f1-44d1-b42b-72f33a7d981e | `quote` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `HTTZ` -> `bd.customerdoc_09991.09991` () 
- `xthth` -> `apct.contract.Apct` () 
- `ydzbl` -> `bd.customerdoc_ydzbl.ydzbl` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `marassistant2` -> `bd.project.ProjectVO` () 
- `HTLXTZ` -> `DZHTFW.econtract.contractType` () 
