---
tags: [BIP, 元数据, 数据字典, bd.bank.BankVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 银行类别 (`bd.bank.BankVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_bank` | 应用: `DPMSETL`

## 属性（26 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `objid` | objid | `objid` | String | `text` |
| 5 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 6 | `enable` | enable | `enable` | Integer | `int` |
| 7 | `sourcetype` | sourcetype | `sourcetype` | Integer | `int` |
| 8 | `log` | log | `log` | String | `text` |
| 9 | `sysid` | sysid | `sysid` | String | `text` |
| 10 | `defineCharacter` | defineCharacter | `defineCharacter` | c31dd4f0-9b83-4d69-8ec2-22cd4e8aba7c | `UserDefine` |
| 11 | `level` | level | `level` | String | `text` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 13 | `sourceid` | sourceid | `sourceid` | cdf20fc4-0f96-4bd4-9949-e722912ac631 | `quote` |
| 14 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 15 | `bank` | bank | `bank` | String | `text` |
| 16 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 17 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 18 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 20 | `tenant` | tenant | `tenantid` | String | `text` |
| 21 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 22 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 25 | `defines` | defines | `` | c072ff34-a6d9-4b55-bb6d-9d890d29fa11 | `` |
| 26 | `execStatus` | execStatus | `exec_status` | String | `text` |

## 关联（7 个）

- `sourceid` -> `bd.bank.PresetBankVO` () 
- `country` -> `bd.country.CountryVO` () 
- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `defineCharacter` -> `bd.bank.BankVODefineCharacter` () 
- `defines` -> `bd.bank.BankVODefine` (1) 
