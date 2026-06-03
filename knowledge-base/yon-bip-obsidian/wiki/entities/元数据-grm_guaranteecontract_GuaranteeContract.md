---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 担保合同 (`grm.guaranteecontract.GuaranteeContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：`89e6bbd7-3846-430b-9353-a2e80df17bda`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 担保合同 |
| 物理表 | `grm_guarantee_contract` |
| 数据库 schema | `yonbip-fi-ctmgrm` |
| 所属应用 | `GRM` |
| 直连字段 | 144 个 |
| 子表 | 13 个 |
| 关联引用 | 39 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `guaranteeContractItemGetCounterGuarantee` | `grm.guaranteecontract.GuaranteeContractItemGetCounterGuarantee` | composition |
| `guaranteeContractItemMortgage` | `grm.guaranteecontract.GuaranteeContractItemMortgage` | composition |
| `guaranteeContractFeeDetail` | `grm.guaranteecontract.GuaranteeContractFeeDetail` | composition |
| `guaranteeContractOtherOwnDetail` | `grm.guaranteecontract.GuaranteeContractOtherOwnDetail` | composition |
| `guaranteeContractItemThirdGuarantee` | `grm.guaranteecontract.GuaranteeContractItemThirdGuarantee` | composition |
| `guaranteeContractFeePlan` | `grm.guaranteecontract.GuaranteeContractFeePlan` | composition |
| `defines` | `grm.guaranteecontract.GuaranteeContractDefine` | composition |
| `guaranteeContractItemThirdPledge` | `grm.guaranteecontract.GuaranteeContractItemThirdPledge` | composition |
| `guaranteeContractItemPledge` | `grm.guaranteecontract.GuaranteeContractItemPledge` | composition |
| `guaranteeContractItemThirdMortgage` | `grm.guaranteecontract.GuaranteeContractItemThirdMortgage` | composition |
| `guaranteeContractOtherThirdDetail` | `grm.guaranteecontract.GuaranteeContractOtherThirdDetail` | composition |
| `guaranteeContractItemProvideCounterGuarantee` | `grm.guaranteecontract.GuaranteeContractItemProvideCounterGuarantee` | composition |
| `guaranteeContractItemShareholder` | `grm.guaranteecontract.GuaranteeContractItemShareholder` | composition |

## 关联引用 (39个)

| 字段名 | 引用类型 |
|--------|---------|
| `customer_debtor` | `productcenter.aa_merchantref` |
| `` | `` |
| `activity` | `` |
| `fund_business_object_creditor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `vendor_debtor` | `yssupplier.aa_vendor` |
| `project` | `` |
| `wbs` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `rate_type` | `` |
| `accentity_debtor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `sync_source_contract` | `` |
| `org_guarantor` | `bd_accbody` |
| `currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |
| `org_debtor` | `bd_accbody` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `contract_lib_id` | `` |
| `dept` | `` |
| `guaranteeContractCharacterDef` | `` |
| `obversion_urrency` | `` |
| `trade_type` | `bd_transtypelistref` |
| `contract_type_id` | `` |
| `vendor_creditor` | `yssupplier.aa_vendor` |

## 继承接口 (5个, 11字段)

- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 144 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finish_reason` | `finish_reason` | `finishReason` | 结项原因 |
| `creditor_type` | `creditor_type` | `creditorType` | 债权人类型 |
| `guarantee_method_name` | `guarantee_method_name` | `guaranteeMethodName` | 担保方式名称 |
| `sync_accessory` | `sync_accessory` | `syncAccessory` | 是否协同附件 |
| `debtor` | `debtor` | `debtor` | 债务人 |
| `source_code` | `source_code` | `sourceCode` | 来源单据编号 |
| `generation_method` | `generation_method` | `generationMethod` | 生成方式 |
| `generation_method_name` | `generation_method_name` | `generationMethodName` | 生成方式名称 |
| `guarantor_str` | `guarantor_str` | `guarantorstr` | 担保人 |
| `debtor_str` | `debtor_str` | `debtorstr` | 债务人 |
| `apply_code` | `apply_code` | `applyCode` | 担保申请单号 |
| `apply_id` | `apply_id` | `applyId` | 担保申请id |
| `stock_ratio_type` | `stock_ratio_type` | `stockRatioType` | 超股比标识 |
| `save_currencyId` | `save_currencyId` | `saveCurrencyId` | 储存币种id |
| `save_yhtId` | `save_yhtId` | `saveYhtId` | 储存友互通id |
| `` | `code` | `code` | 单据编号 |
| `contract_code` | `contract_code` | `contractCode` | 合同编号 |
| `creditor` | `creditor` | `creditor` | 债权人id |
| `third_party_agreement_number` | `third_party_agreement_number` | `thirdPartyAgreementNumber` | 委托担保协议编号 |
| `debtor_type` | `debtor_type` | `debtorType` | 债务人类型 |
| `term` | `term` | `term` | 期限 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `finish_operator` | `finish_operator` | `finishOperator` | 结项人 |
| `disable_operator` | `disable_operator` | `disableOperator` | 废弃人 |
| `sync_dest_contract` | `sync_dest_contract` | `syncDestContract` | 协同生成的目的担保合同id |
| `sync_source_contract_code` | `sync_source_contract_code` | `syncSourceContractCode` | 协同生成的源担保合同编码 |
| `is_effect` | `is_effect` | `isEffect` | 是否生效 |
| `related_biz_code` | `related_biz_code` | `relatedBizCode` | 关联业务 |

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_debtor` | `accentity_debtor` | `accentityDebtor` | 会计主体债务人 |
| `fund_business_object_creditor` | `fund_business_object_creditor` | `fundBusinessObjectCreditor` | 资金业务对象债权人 |
| `vendor_creditor` | `vendor_creditor` | `vendorCreditor` | 供应商债权人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `obversion_urrency` | `obversion_urrency` | `obversionCurrency` | 折算币种 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `project` | `project` | `project` | 项目 |
| `dept` | `dept` | `dept` | 部门 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `org_debtor` | `org_debtor` | `orgDebtor` | 债务人id |
| `org_guarantor` | `org_guarantor` | `orgGuarantor` | 担保人id |
| `customer_debtor` | `customer_debtor` | `customerDebtor` | 债务人id |
| `vendor_debtor` | `vendor_debtor` | `vendorDebtor` | 债务人id |
| `currency` | `currency` | `currency` | 币种id |
| `sync_source_contract` | `sync_source_contract` | `syncSourceContract` | 协同生成的源担保合同id |
| `trade_type` | `trade_type` | `bustype` | 交易类型id |
| `contract_lib_id` | `contract_lib_id` | `contractLibId` | 合同台账id |
| `contract_type_id` | `contract_type_id` | `contractTypeId` | 合同类型 |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execution_date` | `execution_date` | `executionDate` | 执行日期 |
| `query_date` | `query_date` | `queryDate` | 查询日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `contract_date` | `contract_date` | `contractDate` | 签约日期 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `finish_date` | `finish_date` | `finishDate` | 结项日期 |
| `disable_date` | `disable_date` | `disableDate` | 废弃日期 |

### 布尔字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_history` | `is_history` | `isHistory` | 是否历史版本 |
| `is_saved` | `is_saved` | `isSaved` | 是否已经过保存规则 |
| `is_sync` | `is_sync` | `isSync` | 是否已协同 |
| `is_over_share` | `is_over_share` | `isOverShare` | 是否超股比计费 |
| `import_flag` | `import_flag` | `importFlag` | 导入标识 |
| `import_edit` | `import_edit` | `importEdit` | 导入是否编辑 |
| `occupy_status` | `occupy_status` | `occupyStatus` | 占用状态 |
| `is_government_project` | `is_government_project` | `isGovernmentProject` | 是否政府项目 |
| `is_in_the_market` | `is_in_the_market` | `isInTheMarket` | 是否上市 |
| `equity_funds` | `equity_funds` | `equityFunds` | 少数股东含有员工持股计划或股权基金 |
| `budgeted` | `budgeted` | `budgeted` | 是否已发起预算 |
| `can_sync` | `can_sync` | `canSync` | 是否可以发起协同 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 合同版本 |
| `term_number` | `term_number` | `termNumber` | 期限 |
| `sync_source_contract_version` | `sync_source_contract_version` | `syncSourceContractVersion` | 协同生成的源担保合同版本 |

### 短整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_connect` | `is_connect` | `isConnect` | 关联状态 |
| `guarantee_classification` | `guarantee_classification` | `guaranteeClassification` | 保证担保分类 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `guarantee_direction` | `guarantee_direction` | `guaranteeDirection` | 担保方向 |
| `guarantee_type` | `guarantee_type` | `guaranteeType` | 担保类型 |
| `equity_relationship` | `equity_relationship` | `equityRelationship` | 股权关系 |
| `term_unit` | `term_unit` | `termUnit` | 期限单位 |
| `audit_status` | `audit_status` | `auditStatus` | 审核状态 |
| `contract_status` | `contract_status` | `contractStatus` | 合同状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `event_type` | `event_type` | `eventType` | 事项类型 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_id` | `source_id` | `sourceId` | 来源单据id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |

### 数值字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance` | `balance` | `balance` | 余额 |
| `end_balance` | `end_balance` | `endBalance` | 期末余额 |
| `init_balance` | `init_balance` | `initBalance` | 期初余额 |
| `actual_balance` | `actual_balance` | `actualBalance` | 余额 |
| `applyBalance` | `applyBalance` | `applyBalance` | 申请可用余额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `obversion_amount` | `obversion_amount` | `obversionAmout` | 金额(折算币种) |
| `used_inamount` | `used_inamount` | `usedInAmout` | 已使用金额(折算币种) |
| `balance_amount` | `balance_amount` | `balanceAmout` | 余额(折算币种) |
| `init_balance_obversion` | `init_balance_obversion` | `initBalanceObversion` | 期初余额(折算币种) |
| `todayChange_TotalAmount_obversion` | `todayChange_TotalAmount_obversion` | `todayChangeTotalAmountObversion` | 当日变动金额累计(折算币种) |
| `end_balance_obversion` | `end_balance_obversion` | `endBalanceObversion` | 期末余额(折算币种) |
| `guarantee_third_total_amount` | `guarantee_third_total_amount` | `guaranteeThirdTotalAmount` | 第三方担保总额 |
| `guarantee_ratio` | `guarantee_ratio` | `guaranteeRatio` | 担保比例(%) |
| `todayChange_TotalAmount` | `todayChange_TotalAmount` | `todayChangeTotalAmount` | 当日变动金额累计 |
| `used_amount` | `used_amount` | `usedAmount` | 已使用金额 |
| `shareholding_ratio` | `shareholding_ratio` | `shareholdingRatio` | 持股比例(%) |
| `amount` | `amount` | `amount` | 金额 |
| `guarantee_limited` | `guarantee_limited` | `guaranteeLimited` | 担保限额 |
| `guarantee_available_balanceB` | `guarantee_available_balanceB` | `guaranteeAvailableBalanceB` | 担保可用余额 |
| `guarantee_amount` | `guarantee_amount` | `guaranteeAmount` | 本次保证金额 |
| `guarantee_finance_execute_balance` | `guarantee_finance_execute_balance` | `guaranteeFinanceExecuteBalance` | 保证融资执行余额 |
| `guarantee_execute_balance` | `guarantee_execute_balance` | `guaranteeExecuteBalance` | 保证执行余额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guaranteeContractCharacterDef` | `guaranteeContractCharacterDef` | `guaranteeContractCharacterDef` | 担保合同自定义项 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `finish_time` | `finish_time` | `finishTime` | 结项时间 |
| `disable_time` | `disable_time` | `disableTime` | 废弃时间 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_method` | `guarantee_method` | `guaranteeMethod` | 担保方式 |

### other (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 自由自定义项 |
| `` | `` | `guaranteeContractFeeDetail` | 费用明细 |
| `` | `` | `guaranteeContractFeePlan` | 费用方案 |
| `` | `` | `guaranteeContractItemGetCounterGuarantee` | 反担保(获得担保) |
| `` | `` | `guaranteeContractItemMortgage` | 抵押担保 |
| `` | `` | `guaranteeContractItemPledge` | 质押担保 |
| `` | `` | `guaranteeContractItemProvideCounterGuarantee` | 反担保(提供担保) |
| `` | `` | `guaranteeContractItemShareholder` | 股东担保明细 |
| `` | `` | `guaranteeContractItemThirdGuarantee` | 第三方保证担保 |
| `` | `` | `guaranteeContractItemThirdMortgage` | 第三方抵押担保 |
| `` | `` | `guaranteeContractItemThirdPledge` | 第三方质押担保 |
| `` | `` | `guaranteeContractOtherOwnDetail` | 其他自有担保明细 |
| `` | `` | `guaranteeContractOtherThirdDetail` | 其他第三方担保明细 |
