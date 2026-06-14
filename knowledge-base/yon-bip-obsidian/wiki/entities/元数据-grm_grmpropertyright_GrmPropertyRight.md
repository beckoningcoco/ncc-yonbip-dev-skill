---
tags: [BIP, 元数据, 数据字典, grm.grmpropertyright.GrmPropertyRight]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 担保物权管理 (`grm.grmpropertyright.GrmPropertyRight`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_propertyright` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：`9a3849f9-5489-454b-8da8-92e59f213b47`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 担保物权管理 |
| 物理表 | `grm_propertyright` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 79 个 |
| 子表 | 6 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `GrmPropertyRightRecord` | `grm.grmpropertyright.GrmPropertyRightRecord` | composition |
| `GrmPropertyRightAsset` | `grm.grmpropertyright.GrmPropertyRightAsset` | composition |
| `GrmPropertyRightEquip` | `grm.grmpropertyright.GrmPropertyRightEquip` | composition |
| `GrmPropertyRightFiear` | `grm.grmpropertyright.GrmPropertyRightFiear` | composition |
| `GrmPropertyRightObtain` | `grm.grmpropertyright.GrmPropertyRightObtain` | composition |
| `defines` | `grm.grmpropertyright.GrmPropertyRightDefine` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `assess_unit` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `` | `` |
| `activity` | `` |
| `project` | `` |
| `wbs` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `vendor_unit` | `yssupplier.aa_vendor` |
| `pr_type` | `grm_rightsettingref` |
| `pr_character_def` | `` |
| `protocolNumber` | `yonbip-fi-ctmtlm.tlm_financingregisterRef` |
| `currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |
| `fundbusinobjtype` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `fundobjtype` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `org_unit` | `bd_accbody` |
| `customer_unit` | `productcenter.aa_merchantref` |
| `dept` | `` |
| `trade_type` | `bd_transtypelistref` |

## 继承接口 (5个, 11字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 79 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `serialNumber` | `serialNumber` | `serialNumber` | 流水号 |
| `businessCode` | `businessCode` | `businessCode` | 业务编号 |
| `` | `code` | `code` | 物权编码 |
| `pr_code` | `pr_code` | `prCode` | 担保物权编码 |
| `pr_name` | `pr_name` | `prName` | 物权名称 |
| `other_unit` | `other_unit` | `otherUnit` | 所属单位 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 修改状态 |
| `` | `auditor` | `auditor` | 审批人 |
| `unit_name` | `unit_name` | `unitName` | 所属单位 |
| `assetIntegration_method` | `assetIntegration_method` | `assetIntegrationMethod` | 资产集成方式 |
| `freeze` | `freeze` | `freeze` | 是否冻结 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `fundobjtype` | `fundobjtype` | `fundobjtype` | 资金伙伴类型 |
| `project` | `project` | `project` | 项目 |
| `dept` | `dept` | `dept` | 部门 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocolNumber` | `protocolNumber` | `protocolNumber` | 协议号id |
| `org_unit` | `org_unit` | `orgUnit` | 所属单位id |
| `customer_unit` | `customer_unit` | `customerUnit` | 所属单位id |
| `vendor_unit` | `vendor_unit` | `vendorUnit` | 所属单位id |
| `pr_type` | `pr_type` | `prType` | 物权类别id |
| `fundbusinobjtype` | `fundbusinobjtype` | `fundbusinobjtype` | 所属单位id |
| `currency` | `currency` | `currency` | 币种id |
| `assess_unit` | `assess_unit` | `assessUnit` | 评估机构 |
| `trade_type` | `trade_type` | `bustype` | 交易类型id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `assess_date` | `assess_date` | `assessDate` | 评估日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `connected` | `connected` | `connected` | 是否被关联 |
| `version` | `version` | `version` | 版本号 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `abandon_before_status` | `abandon_before_status` | `abandonBeforeStatus` | 废弃前物权状态 |
| `` | `status` | `status` | 单据状态 |
| `pr_source_type` | `pr_source_type` | `prSourceType` | 所属类型 |
| `unit_property` | `unit_property` | `unitProperty` | 所属单位属性 |
| `purpose` | `purpose` | `purpose` | 用途分类 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `pr_status` | `pr_status` | `prStatus` | 物权状态 |
| `billtype` | `billtype` | `billtype` | 单据类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `event_type` | `event_type` | `eventType` | 事项类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |
| `sourceId` | `sourceId` | `sourceId` | 来源单据ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financing_amount` | `financing_amount` | `financingAmount` | 融资占用金额 |
| `release_amount` | `release_amount` | `releaseAmount` | 融资释放金额 |
| `unuse_pledge_price` | `unuse_pledge_price` | `unusePledgePrice` | 剩余抵质押价值 |
| `pr_price` | `pr_price` | `prPrice` | 物权价值 |
| `assess_price` | `assess_price` | `assessPrice` | 评估价值 |
| `rate` | `rate` | `rate` | 抵(质)押率% |
| `pledge_price` | `pledge_price` | `pledgePrice` | 可抵(质)押价值 |
| `use_pledge_price` | `use_pledge_price` | `usePledgePrice` | 已使用抵(质)押价值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pr_character_def` | `pr_character_def` | `prCharacterDef` | 物权登记自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `GrmPropertyRightAsset` | 固定资产明细 |
| `` | `` | `GrmPropertyRightEquip` | 资产明细 |
| `` | `` | `GrmPropertyRightFiear` | 应收账款明细 |
| `` | `` | `GrmPropertyRightObtain` | 收到物权价值占用记录 |
| `` | `` | `GrmPropertyRightRecord` | 评估价值记录 |
| `` | `` | `defines` | 担保物权自定义项 |
