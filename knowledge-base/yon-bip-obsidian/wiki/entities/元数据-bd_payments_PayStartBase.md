---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, bd.payments.PayStartBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款起算依据 (`bd.payments.PayStartBase`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_paystartbase` | 应用: `DPMSETL`

## 属性（19 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `cCode` | String | `text` |
| 3 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 4 | `objid` | objid | `objid` | String | `text` |
| 5 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |
| 6 | `enable` | enable | `enable` | Integer | `int` |
| 7 | `order` | order | `iorder` | Integer | `int` |
| 8 | `comment` | comment | `cComment` | String | `text` |
| 9 | `payBase` | payBase | `paybase` | String | `text` |
| 10 | `startColumn` | startColumn | `startcolumn` | String | `text` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 12 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 13 | `sysid` | sysid | `sysid` | String | `text` |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 15 | `tenant` | tenant | `tenantid` | String | `text` |
| 16 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
