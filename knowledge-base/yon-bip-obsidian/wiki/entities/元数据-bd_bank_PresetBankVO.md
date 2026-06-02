---
tags: [BIP, 元数据, 数据字典, bd.bank.PresetBankVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 预置银行类别 (`bd.bank.PresetBankVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_bank` | 应用: `DPMSETL`

## 属性（25 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `bank` | bank | `bank` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 6 | `defineCharacter` | defineCharacter | `defineCharacter` | c31dd4f0-9b83-4d69-8ec2-22cd4e8aba7c | `UserDefine` |
| 7 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 8 | `enable` | enable | `enable` | Integer | `int` |
| 9 | `execStatus` | execStatus | `exec_status` | String | `text` |
| 10 | `id` | ID | `id` | String | `text` |
| 11 | `level` | level | `level` | String | `text` |
| 12 | `log` | log | `log` | String | `text` |
| 13 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `name` | 名称 | `name` | String | `multiLanguage` |
| 16 | `objid` | objid | `objid` | String | `text` |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 18 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 19 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 20 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 21 | `sourceid` | sourceid | `sourceid` | cdf20fc4-0f96-4bd4-9949-e722912ac631 | `quote` |
| 22 | `sourcetype` | sourcetype | `sourcetype` | Integer | `int` |
| 23 | `sysid` | sysid | `sysid` | String | `text` |
| 24 | `tenant` | tenant | `tenantid` | String | `text` |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `sourceid` -> `bd.bank.PresetBankVO` () 
- `country` -> `bd.country.CountryVO` () 
- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `defineCharacter` -> `bd.bank.BankVODefineCharacter` () 
