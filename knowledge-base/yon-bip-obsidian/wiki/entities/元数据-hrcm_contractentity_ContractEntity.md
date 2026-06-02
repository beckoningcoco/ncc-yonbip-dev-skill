---
tags: [BIP, 元数据, 数据字典, hrcm, hrcm.contractentity.ContractEntity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同主体 (`hrcm.contractentity.ContractEntity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cs_corp` | 应用: `HRCM`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `employerFileNumber` | employerFileNumber | `employer_file_number` | String | `text` | false |  |
| 2 | `employerName` | employer名称 | `employer_name` | String | `text` | false |  |
| 3 | `hkAccountCode` | hkAccount编码 | `hk_account_code` | String | `text` | false |  |
| 4 | `employerPhone` | employerPhone | `employer_phone` | String | `text` | false |  |
| 5 | `isCorp` | 是否Corp | `iscorp` | Boolean | `switch` |  | true |
| 6 | `position` | position | `position` | String | `text` | false |  |
| 7 | `memo` | 备注 | `memo` | String | `text` |  | true |
| 8 | `signerName` | signer名称 | `signer_name` | String | `text` | false |  |
| 9 | `name2` | name2 | `name2` | String | `text` |  | true |
| 10 | `name3` | name3 | `name3` | String | `text` |  | true |
| 11 | `name4` | name4 | `name4` | String | `text` |  | true |
| 12 | `name5` | name5 | `name5` | String | `text` |  | true |
| 13 | `name6` | name6 | `name6` | String | `text` |  | true |
| 14 | `userDefineCharacter001` | userDefineCharacter001 | `userDefineCharacter001` | 5eb95c5c-ef55-41d8-af7f-79f260c95e60 | `UserDefine` |  | true |
| 15 | `code` | 编码 | `code` | String | `text` |  | true |
| 16 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | true |
| 17 | `creator` | 创建人 | `creatorYhtId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 18 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 19 | `creatorName` | creator名称 | `creator` | String | `text` |  | true |
| 20 | `disablets` | disablets | `disablets` | DateTime | `timestamp` | false | true |
| 21 | `eOrgId` | eOrgID | `e_org_id` | String | `text` |  | true |
| 22 | `enable` | enable | `enable` | Boolean | `switch` | false | true |
| 23 | `enablets` | enablets | `enablets` | DateTime | `timestamp` | false | true |
| 24 | `id` | 主键ID | `id` | String | `text` |  | true |
| 25 | `isAttestation` | 是否Attestation | `is_attestation` | Boolean | `switch` |  | true |
| 26 | `isDeleted` | 是否Deleted | `dr` | Boolean | `switch` |  | true |
| 27 | `modifier` | 修改人 | `modifierYhtId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 28 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 29 | `modifierName` | modifier名称 | `modifier` | String | `text` |  | true |
| 30 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | true |
| 31 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 32 | `orgId` | orgID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 33 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | true |
| 34 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 35 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 36 | `contractentityScopeOrgdept` | contractentityScopeOrgdept | `` | d27a61a0-7a47-4ea9-b771-23d08db813ce | `` |  |  |
| 37 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |  | true |

## 关联属性（9 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creatorYhtId` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `modifier` | `base.user.BipUser` | `modifierYhtId` |  |  |  |
| 4 | `distributionSite` | `hrcb.distributionSite.DistributionSite` | `distribution_site` |  |  |  |
| 5 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 6 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 7 | `userDefineCharacter001` | `hrcm.contractentity.userDefineCharacter001` | `userDefineCharacter001` |  |  |  |
| 8 | `contractentityScopeOrgdept` | `hrcm.contractentity.ContractEntityScope` | `` | 0..n | Y |  |
| 9 | `orgId` | `bd.adminOrg.BaseOrgVO` | `orgId` |  |  |  |

## 依赖接口（6 个）

- `ITenant` → `ucfbase.ucfbaseItf.ITenant` (v77)
- `Deletable` → `base.itf.Deletable` (v67)
- `IEnable` → `hrcm.common.IEnable` (v96)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)
- `IDistributionSource` → `hrbase.hrbaseItf.IDistributionSource` (v1)

## SQL 示例

```sql
SELECT employer_file_number, employer_name, hk_account_code, employer_phone, iscorp, position, memo, signer_name
FROM cs_corp
```