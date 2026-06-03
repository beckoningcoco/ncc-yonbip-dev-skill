---
tags: [BIP, 元数据, 数据字典, sfa.contractdraft.ContractDraft]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同草案 (`sfa.contractdraft.ContractDraft`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_contract_draft` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`1496a3a4-1a86-4006-94b5-47cc568fb372`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同草案 |
| 物理表 | `sfa_contract_draft` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 72 个 |
| 子表 | 4 个 |
| 关联引用 | 34 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contractDraftParticipantList` | `sfa.contractdraft.ContractDraftParticipant` | composition |
| `headDef` | `sfa.contractdraft.ContractDraftDef` | composition |
| `contractReviewPersonList` | `sfa.contractdraft.ContractReviewPerson` | composition |
| `contractReviewStatusList` | `sfa.contractdraft.ContractReviewStatus` | composition |

## 关联引用 (34个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_stage_id` | `sfa_stageref` |
| `country` | `ucfbasedoc.bd_countryref` |
| `contract_type` | `` |
| `` | `` |
| `contractDraftDefineCharacter` | `` |
| `local_currency` | `ucfbasedoc.bd_currencytenantref` |
| `attachment_group_item_id` | `` |
| `oppt_id` | `sfa_opptref` |
| `attachment_group_id` | `` |
| `sign_contract_org` | `ucf-org-center.bd_salesorg` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `process_id` | `` |
| `customer_industry` | `productcenter.aa_customertraderef` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `process_stage` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `sign_person` | `ucf-staff-center.bd_staff_ref` |
| `final_customer` | `cust_customerref` |
| `final_customer_contact_id` | `cust_contactref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `transType` | `` |
| `superior_contract_no` | `sfa_contractdraftref` |
| `change_applicant` | `` |
| `publisher` | `ucf-staff-center.bd_staff_ref` |
| `customer_id` | `cust_customerref` |

## 继承接口 (5个, 15字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 72 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `region` | `region` | `region` | 客户所属省份 |
| `code` | `code` | `code` | 合同号 |
| `name` | `name` | `name` | 合同名称 |
| `version` | `version` | `version` | 合同版本 |
| `customer_contract_no` | `customer_contract_no` | `customerContractNo` | 客户合同号 |
| `remark` | `remark` | `remark` | 合同备注 |
| `contact_phone` | `contact_phone` | `contactPhone` | 联系电话 |
| `mailbox` | `mailbox` | `mailbox` | 邮箱 |
| `region_code` | `region_code` | `regionCode` | 行政区划编码 |
| `receiving_address` | `receiving_address` | `receivingAddress` | 收货地址 |
| `addressee` | `addressee` | `addressee` | 收件人 |
| `phone` | `phone` | `phone` | 电话 |
| `zip_code` | `zip_code` | `zipCode` | 邮编 |
| `change_content_desc` | `change_content_desc` | `changeContentDesc` | 变更内容描述 |
| `` | `creator` | `creator` | 制单人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `contract_type` | `contract_type` | `contractType` | 合同类型ID |
| `customer_id` | `customer_id` | `customer` | 签约客户ID |
| `superior_contract_no` | `superior_contract_no` | `superiorContractNo` | 上级合同号 |
| `oppt_id` | `oppt_id` | `oppt` | 商机ID |
| `sign_contract_org` | `sign_contract_org` | `signContractOrg` | 签约组织ID |
| `ower` | `ower` | `ower` | 负责人 |
| `dept` | `dept` | `dept` | 所属部门ID |
| `salearea` | `salearea` | `saleArea` | 所属区域ID |
| `contract_stage_id` | `contract_stage_id` | `contractStage` | 合同阶段ID |
| `sign_person` | `sign_person` | `signPerson` | 签订人ID |
| `publisher` | `publisher` | `publisher` | 发布人ID |
| `currency` | `currency` | `currency` | 币种ID |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型ID |
| `local_currency` | `local_currency` | `localCurrency` | 本币ID |
| `final_customer` | `final_customer` | `finalCustomer` | 最终客户ID |
| `customer_industry` | `customer_industry` | `customerIndustry` | 客户行业ID |
| `final_customer_contact_id` | `final_customer_contact_id` | `finalCustomerContact` | 最终客户联系人ID |
| `country` | `country` | `country` | 国家id |
| `change_applicant` | `change_applicant` | `changeApplicant` | 变更申请人ID |
| `process_id` | `process_id` | `process` | 流程id |
| `process_stage` | `process_stage` | `processStage` | 流程阶段id |
| `transType` | `transType` | `transType` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 合同状态 |
| `delivery_way` | `delivery_way` | `deliveryWay` | 发货方式 |
| `transport_way` | `transport_way` | `transportWay` | 运输方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_period` | `contract_period` | `contractPeriod` | 合同期限(月) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_amount_include_tax` | `contract_amount_include_tax` | `contractAmountIncludeTax` | 合同含税金额 |
| `contract_money_without_tax` | `contract_money_without_tax` | `contractAmountWithoutTax` | 合同无税金额 |
| `contract_tax` | `contract_tax` | `contractTax` | 合同税额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `contract_amount_after_change` | `contract_amount_after_change` | `contractAmountAfterChange` | 变更后合同金额 |
| `change_amount` | `change_amount` | `changeAmount` | 变更金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contractDraftDefineCharacter` | `contractDraftDefineCharacter` | `contractDraftDefineCharacter` | 合同草案自定义项 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `end_date` | `end_date` | `endDate` | 终止日期 |
| `sign_date` | `sign_date` | `signDate` | 签订日期 |
| `sign_time` | `sign_time` | `signTime` | 签订时间 |
| `release_time` | `release_time` | `releaseTime` | 发布时间 |
| `change_application_date` | `change_application_date` | `changeApplicationDate` | 变更申请日期 |
| `create_time` | `create_time` | `createTime` | 制单时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contractDraftParticipantList` | 合同草案参与人 |
| `` | `` | `contractReviewPersonList` | 合同条款的评审人 |
| `` | `` | `contractReviewStatusList` | 合同条款的评审状态 |
| `` | `` | `headDef` | 合同草案主表自定义项扩展 |
