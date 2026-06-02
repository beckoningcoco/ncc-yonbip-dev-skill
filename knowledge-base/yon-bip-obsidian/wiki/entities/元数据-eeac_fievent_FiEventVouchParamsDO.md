---
tags: [BIP, 元数据, 数据字典, eeac.fievent.FiEventVouchParamsDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 凭证生成参数 (`eeac.fievent.FiEventVouchParamsDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `eac_fi_event_voucher_params` | 应用: `EVNT`

## 属性（15 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accpurposeId` | accpurposeID | `accpurpose_id` | String | `text` |
| 2 | `blnGenVoucher` | blnGenVoucher | `bln_gen_voucher` | String | `text` |
| 3 | `condition` | condition | `condition` | String | `text` |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `fiEventId` | fiEventID | `fi_event_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 8 | `id` | ID | `id` | String | `text` |
| 9 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 12 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 13 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 14 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 15 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `fiEventId` -> `eeac.fievent.FiEventDO` (0..n) [废]
