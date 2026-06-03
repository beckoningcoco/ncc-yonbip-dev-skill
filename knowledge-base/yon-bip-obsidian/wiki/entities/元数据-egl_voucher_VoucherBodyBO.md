---
tags: [BIP, 元数据, 数据字典, egl.voucher.VoucherBodyBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证分录 (`egl.voucher.VoucherBodyBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_voucher_b` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`1bb925c0-6ded-4ee6-8431-67123091b280`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证分录 |
| 物理表 | `fi_voucher_b` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 98 个 |
| 子表 | 3 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `auxiliary` | `egl.voucher.AuxiliaryBO` | composition |
| `cashflow` | `egl.voucher.CashFlowBO` | composition |
| `voucherBodyExtBO` | `egl.voucher.VoucherBodyExtBO` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `global_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auxiliary` | `` |
| `organize_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accsubject` | `fiepub.fiepub_accsubjectref` |
| `` | `` |
| `group_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `settlementmode` | `productcenter.aa_settlemethodref` |
| `ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `pk_org` | `finbd.bd_allaccbodyref` |
| `voucherid` | `` |
| `free_characteristic` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `measuredoc` | `productcenter.pc_unitref` |
| `accsubject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `def5` | `productcenter.aa_merchantref` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 98 个直连字段

### 文本字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 期间年 |
| `bankreconciliationsettingid` | `bankreconciliationsettingid` | `bankReconciliationSettingId` | 银行对账方案id |
| `bankverifycode` | `bankverifycode` | `bankVerifyCode` | 银行对账码 |
| `billno` | `billno` | `billNo` | 票据号 |
| `billtime` | `billtime` | `billTime` | 票据日期 |
| `busidate` | `busidate` | `businessDate` | 业务日期 |
| `business_id` | `business_id` | `businessId` | 业务方生成的id |
| `checkno` | `checkno` | `checkNo` | 勾兑号 |
| `coordination_no` | `coordination_no` | `coordinationNo` | 协同号 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def10` | `def10` | `def10` | 自定义项10 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def3` | `def3` | `def3` | 自定义项3 |
| `def4` | `def4` | `def4` | 自定义项4 |
| `def6` | `def6` | `def6` | 自定义项6 |
| `def7` | `def7` | `def7` | 自定义项7 |
| `def8` | `def8` | `def8` | 自定义项8 |
| `def9` | `def9` | `def9` | 自定义项9 |
| `description` | `description` | `description` | 描述信息 |
| `description2` | `description2` | `description2` | 分录摘要2 |
| `description3` | `description3` | `description3` | 分录摘要3 |
| `description4` | `description4` | `description4` | 分录摘要4 |
| `description5` | `description5` | `description5` | 分录摘要5 |
| `description6` | `description6` | `description6` | 分录摘要6 |
| `editrule` | `editrule` | `editRule` | 修改规则 |
| `filter` | `filter` | `filter` | 损益结转凭证(0|null 正常凭证  ;  1 损益结转凭证  ; 2 表结法-损益结转凭证 )  |
| `flag` | `flag` | `flag` | 凭证子表的特殊标记  |
| `id` | `id` | `id` | 主键id |
| `maketime` | `maketime` | `maketime` | 制单日期 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `oppo_accsubject` | `oppo_accsubject` | `oppoAccSubject` | 对方科目 |
| `period` | `period` | `period` | 会计期间 |
| `periodunion` | `periodunion` | `periodUnion` | 完全会计期间 |
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `rate_org_op` | `rate_org_op` | `rateOrgOp` | 汇率 (账簿)运算方法 |
| `relate_receipt` | `relate_receipt` | `relateReceipt` | 关联银行回单 |
| `secondorg` | `secondorg` | `secondOrg` | 二级核算会计主体 |
| `tenantid` | `tenantid` | `tenantId` | 租户 |
| `verify_no` | `verify_no` | `verifyNO` | 核销号 |
| `external_source_data_id` | `external_source_data_id` | `externalSourceDataId` | 外部来源数据ID |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accBook` | 账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 期间 |
| `accsubject` | `accsubject` | `accSubject` | 科目OID |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计期间年 |
| `accsubject_vid` | `accsubject_vid` | `accsubjectVid` | 科目Vid |
| `auxiliary` | `auxiliary` | `auxiliaryId` | 辅助信息 |
| `currency` | `currency` | `currency` | 本币 |
| `def5` | `def5` | `def5` | 自定义项5 |
| `global_ratetype_id` | `global_ratetype_id` | `globalRatetype` | 全局币汇率类型 |
| `group_ratetype_id` | `group_ratetype_id` | `groupRatetype` | 集团币汇率类型 |
| `measuredoc` | `measuredoc` | `measureDoc` | 主计量单位 |
| `organize_ratetype_id` | `organize_ratetype_id` | `organizeRateType` | 组织币汇率类型 |
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `ratetype` | `ratetype` | `rateType` | 汇率类型 |
| `settlementmode` | `settlementmode` | `settlementMode` | 结算方式 |
| `two_level_accentity_id` | `two_level_accentity_id` | `twoLevelAccentityId` | 内部核算单元 |
| `voucherid` | `voucherid` | `voucherId` | 凭证 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifytime` | `verifytime` | `verifyTime` | 银行对账_对账日期 |
| `ts` | `ts` | `ts` | 最后修改时间ts |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_convert_param` | `accbook_convert_param` | `accbookConvertParam` | 账簿币折算参数 |
| `global_convert_param` | `global_convert_param` | `globalConvertParam` | 全局币折算参数 |
| `group_convert_param` | `group_convert_param` | `groupConvertParam` | 集团币折算参数 |
| `organize_rate_ops` | `organize_rate_ops` | `organizeRateOps` | 汇率折算方式(组织币) |
| `rate_global_ops` | `rate_global_ops` | `rateGlobalOps` | 汇率折算方式(全局币) |
| `rate_group_ops` | `rate_group_ops` | `rateGroupOps` | 汇率折算方式(集团币) |
| `rate_org_ops` | `rate_org_ops` | `rateOrgOps` | 汇率折算方式(账簿币) |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `checkflag` | `checkflag` | `checkFlag` | 是否勾兑 |
| `recordnumber` | `recordnumber` | `recordNumber` | 分录号 |
| `reversaledrecordnumber` | `reversaledrecordnumber` | `reversaledRecordNumber` | 冲销凭证中源凭证的凭证分录 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `external_source_data_version` | `external_source_data_version` | `externalSourceDataVersion` | 外部来源数据版本号 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_global` | `credit_global` | `creditGlobal` | 贷方本币(全局) |
| `credit_group` | `credit_group` | `creditGroup` | 贷方本币(集团) |
| `credit_org` | `credit_org` | `creditOrg` | 贷方本币(账簿) |
| `credit_original` | `credit_original` | `creditOriginal` | 贷方原币 |
| `credit_quantity` | `credit_quantity` | `creditQuantity` | 贷方数量 |
| `debit_global` | `debit_global` | `debitGlobal` | 借方本币(全局) |
| `debit_group` | `debit_group` | `debitGroup` | 借方本币(集团) |
| `debit_org` | `debit_org` | `debitOrg` | 借方本币(账簿) |
| `debit_original` | `debit_original` | `debitOriginal` | 借方原币 |
| `debit_quantity` | `debit_quantity` | `debitQuantity` | 借方数量 |
| `organize_credit_amount` | `organize_credit_amount` | `organizeCreditAmount` | 组织币贷方金额 |
| `organize_debit_amount` | `organize_debit_amount` | `organizeDebitAmount` | 组织币借方金额 |
| `organize_rate` | `organize_rate` | `organizeRate` | 组织币汇率 |
| `price` | `price` | `price` | 单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `rate_global` | `rate_global` | `rateGlobal` | 汇率(全局) |
| `rate_group` | `rate_group` | `rateGroup` | 汇率(集团) |
| `rate_org` | `rate_org` | `rateOrg` | 汇率(账簿) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_characteristic` | `free_characteristic` | `freeCharacteristic` | 特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `modifiedTime` | 最后修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `voucherBodyExtBO` | 凭证分录扩展 |
| `` | `` | `auxiliary` | 辅助核算项 |
| `` | `` | `cashflow` | 现金流量项目 |
