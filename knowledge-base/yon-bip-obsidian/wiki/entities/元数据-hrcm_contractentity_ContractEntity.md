---
tags: [BIP, 元数据, 数据字典, hrcm.contractentity.ContractEntity]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cs_corp` | domain：`hrcloud-contract` | 应用：`HRCM` | 业务对象ID：`1fd2be33-8dcd-4820-8397-ebc5d5c66f8a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同主体 |
| 物理表 | `cs_corp` |
| domain/服务域 | `hrcloud-contract` |
| schema | `corehr` |
| 所属应用 | `HRCM` |
| 直连字段 | 37 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contractentityScopeOrgdept` | `hrcm.contractentity.ContractEntityScope` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creatorYhtId` | `` |
| `ytenant_id` | `` |
| `modifierYhtId` | `` |
| `distribution_site` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `userDefineCharacter001` | `` |
| `` | `` |
| `orgId` | `ucf-org-center.org_unit_tree_ref` |

## 继承接口 (6个, 11字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **启用** (`hrcm.common.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `employer_file_number` | `employer_file_number` | `employerFileNumber` | 雇主档案号码 |
| `employer_name` | `employer_name` | `employerName` | 雇主名称 |
| `hk_account_code` | `hk_account_code` | `hkAccountCode` | 雇主账户号码 |
| `employer_phone` | `employer_phone` | `employerPhone` | 雇主电话 |
| `position` | `position` | `position` | 职位 |
| `memo` | `memo` | `memo` | 描述 |
| `signer_name` | `signer_name` | `signerName` | 签署人姓名 |
| `name2` | `name2` | `name2` | name2 |
| `name3` | `name3` | `name3` | name3 |
| `name4` | `name4` | `name4` | name4 |
| `name5` | `name5` | `name5` | name5 |
| `name6` | `name6` | `name6` | name6 |
| `code` | `code` | `code` | 编码 |
| `creator` | `creator` | `creatorName` | 创建人姓名 |
| `e_org_id` | `e_org_id` | `eOrgId` | e签宝对应的企业ID |
| `id` | `id` | `id` | ID |
| `modifier` | `modifier` | `modifierName` | 修改人姓名 |
| `tenantid` | `tenantid` | `tenant` | 租户id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorYhtId` | `creatorYhtId` | `creator` | 创建人 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierYhtId` | `modifierYhtId` | `modifier` | 修改人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `orgId` | `orgId` | `orgId` | 盖章组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `distribution_site` | `distribution_site` | `distributionSite` | 站点 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iscorp` | `iscorp` | `isCorp` | 是否法人 |
| `enable` | `enable` | `enable` | 启用状态 |
| `is_attestation` | `is_attestation` | `isAttestation` | 是否证实 |
| `dr` | `dr` | `isDeleted` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `userDefineCharacter001` | `userDefineCharacter001` | `userDefineCharacter001` | 特征 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contractentityScopeOrgdept` | 适用范围 |
