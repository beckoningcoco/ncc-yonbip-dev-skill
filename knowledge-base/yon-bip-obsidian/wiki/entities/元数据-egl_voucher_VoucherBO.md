---
tags: [BIP, 元数据, 数据字典, egl.voucher.VoucherBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证 (`egl.voucher.VoucherBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_voucher` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`1bb925c0-6ded-4ee6-8431-67123091b280`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证 |
| 物理表 | `fi_voucher` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 118 个 |
| 子表 | 2 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `voucherExtBO` | `egl.voucher.VoucherExtBO` | composition |
| `bodies` | `egl.voucher.VoucherBodyBO` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype` | `fiepub.epub_vouchertype_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `maker` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `secondorg` | `finbd.bd_allaccbodyref` |
| `tallyman` | `bip-usercenter.bip_user_ref` |
| `pk_org` | `finbd.bd_allaccbodyref` |
| `free_characteristic` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `signer` | `bip-usercenter.bip_user_ref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`

## 字段列表（按类型分组）

> 共 118 个直连字段

### 文本字段 (71个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 期间年度 |
| `billno` | `billno` | `billNo` | 来源单据号(老架构) |
| `correct_voucher_id` | `correct_voucher_id` | `correctedVoucherId` | 更正凭证 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def10` | `def10` | `def10` | 自定义项10 |
| `def11` | `def11` | `def11` | 自定义项11 |
| `def12` | `def12` | `def12` | 自定义项12 |
| `def13` | `def13` | `def13` | 自定义项13 |
| `def14` | `def14` | `def14` | 自定义项14 |
| `def15` | `def15` | `def15` | 自定义项15 |
| `def16` | `def16` | `def16` | 自定义项16 |
| `def17` | `def17` | `def17` | 自定义项17 |
| `def18` | `def18` | `def18` | 自定义项18 |
| `def19` | `def19` | `def19` | 自定义项19 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def20` | `def20` | `def20` | 自定义项20 |
| `def21` | `def21` | `def21` | 自定义项21 |
| `def22` | `def22` | `def22` | 自定义项22 |
| `def23` | `def23` | `def23` | 自定义项23 |
| `def24` | `def24` | `def24` | 自定义项24 |
| `def25` | `def25` | `def25` | 自定义项25 |
| `def26` | `def26` | `def26` | 自定义项26 |
| `def27` | `def27` | `def27` | 自定义项27 |
| `def28` | `def28` | `def28` | 自定义项28 |
| `def29` | `def29` | `def29` | 自定义项29 |
| `def3` | `def3` | `def3` | 自定义项3 |
| `def30` | `def30` | `def30` | 自定义项30 |
| `def4` | `def4` | `def4` | 自定义项4 |
| `def5` | `def5` | `def5` | 自定义项5 |
| `def6` | `def6` | `def6` | 自定义项6 |
| `def7` | `def7` | `def7` | 自定义项7 |
| `def8` | `def8` | `def8` | 自定义项8 |
| `def9` | `def9` | `def9` | 自定义项9 |
| `description` | `description` | `description` | 凭证摘要 |
| `displayname` | `displayname` | `displayName` | 凭证字号 |
| `displayname2` | `displayname2` | `displayName2` | 凭证号显示字段2 |
| `displayname3` | `displayname3` | `displayName3` | 凭证号显示字段3 |
| `displayname4` | `displayname4` | `displayName4` | 凭证号显示字段4 |
| `displayname5` | `displayname5` | `displayName5` | 凭证号显示字段5 |
| `displayname6` | `displayname6` | `displayName6` | 凭证号显示字段6 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局分布式事务ID |
| `eaai_business_id` | `eaai_business_id` | `eaaiBusinessId` | 中台传总账凭证业务ID |
| `eaai_req_id` | `eaai_req_id` | `eaaiReqId` | 中台传总账凭证请求ID |
| `editrule` | `editrule` | `editRule` | 凭证修改规则 |
| `external_main_marking` | `external_main_marking` | `externalMainMarking` | 外部主要标记一般都是单据唯一标识 |
| `external_secondary_marking` | `external_secondary_marking` | `externalSecondaryMarking` | 外部次要标记一般都是单据编码 |
| `external_system_type` | `external_system_type` | `externalSystemType` | 外部系统类型 |
| `filter` | `filter` | `filter` | 损益结转凭证标志 |
| `flag` | `flag` | `flag` | 凭证标记 |
| `id` | `id` | `id` | 主键 |
| `maketime` | `maketime` | `makeTime` | 制单日期 |
| `organize_debit_total_amount` | `organize_debit_total_amount` | `organizeDebitTotalAmount` | 借方本币合计(组织) |
| `otpsign` | `otpsign` | `otpSign` | 会计平台传总账标记 |
| `period` | `period` | `period` | 不含调整期会计期间 |
| `periodunion` | `periodunion` | `periodUnion` | 会计期间 |
| `periodadjust` | `periodadjust` | `periodadjust` | 调整期 |
| `pk_group` | `pk_group` | `pkGroup` | 集团(废弃) |
| `reqid` | `reqid` | `reqId` | 批量审核记账的批量标记 |
| `reversalVoucherId` | `reversalVoucherId` | `reversalVoucherId` | 冲销凭证 |
| `srcsystemid` | `srcsystemid` | `srcSystem` | 来源应用主键 |
| `srcsystem` | `srcsystem` | `srcSystemName` | 来源应用 |
| `status` | `status` | `status` | 凭证状态(废弃) |
| `tenantid` | `tenantid` | `tenantId` | 租户id |
| `voucherkind` | `voucherkind` | `voucherKind` | 凭证类别(废弃) |
| `voucherstatus` | `voucherstatus` | `voucherStatus` | 凭证状态 |
| `external_source_system_id` | `external_source_system_id` | `externalSourceSystemId` | 外部来源系统id |
| `external_source_system_name` | `external_source_system_name` | `externalSourceSystemName` | 外部来源系统名称 |
| `external_source_data_id` | `external_source_data_id` | `externalSourceDataId` | 外部来源数据ID |
| `external_source_data_code` | `external_source_data_code` | `externalSourceDataCode` | 外部来源数据编码 |
| `external_source_data_type` | `external_source_data_type` | `externalSourceDataType` | 外部来源数据类型 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accBook` | 账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 期间 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 期间年 |
| `auditor` | `auditor` | `auditor` | 审核人 |
| `maker` | `maker` | `maker` | 制单人 |
| `pk_org` | `pk_org` | `pkOrg` | 会计主体(废弃) |
| `secondorg` | `secondorg` | `secondOrg` | 二级核算会计主体(废弃) |
| `signer` | `signer` | `signer` | 签字人 |
| `tallyman` | `tallyman` | `tallyMan` | 记账人 |
| `vouchertype` | `vouchertype` | `voucherType` | 凭证类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audittime` | `audittime` | `auditTime` | 审核日期 |
| `signtime` | `signtime` | `signTime` | 签字日期 |
| `tallytime` | `tallytime` | `tallyTime` | 记账日期 |

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eaai_data_version` | `eaai_data_version` | `eaaiDataVersion` | 同步事项会计数据版本号 |
| `ts` | `ts` | `ts` | ts |
| `creationTime` | `creationTime` | `creationTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `external_integration_status` | `external_integration_status` | `externalIntegrationStatus` | 三方同步状态 |

### 整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachedbill` | `attachedbill` | `attachedBill` | 附单据数 |
| `attachment_quantity` | `attachment_quantity` | `attachmentQuantity` | 附件数量 |
| `billcode` | `billcode` | `billCode` | 凭证号 |
| `correct_status` | `correct_status` | `correctStatus` | 更正状态 |
| `dr` | `dr` | `dr` | 逻辑删除表识 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `eaai_confirm_status` | `eaai_confirm_status` | `eaaiConfirmStatus` | 凭证记账同步至事项会计状态 |
| `eaai_draft_status` | `eaai_draft_status` | `eaaiDraftStatus` | 凭证保存同步至事项会计状态 |
| `qtyadjust` | `qtyadjust` | `qtyAdjust` | 数量调整凭证 |
| `reversal_mode` | `reversal_mode` | `reversalMode` | 冲销模式 |
| `reversaltype` | `reversaltype` | `reversalType` | 冲销程度 |
| `sign_status` | `sign_status` | `signStatus` | 能否签字 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `external_source_data_version` | `external_source_data_version` | `externalSourceDataVersion` | 外部来源数据版本号 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `organize_credit_total_amount` | `organize_credit_total_amount` | `organizeCreditTotalAmount` | 贷方本币合计(组织) |
| `totalcredit_global` | `totalcredit_global` | `totalCreditGlobal` | 贷方本币合计(全局) |
| `totalcredit_group` | `totalcredit_group` | `totalCreditGroup` | 贷方本币合计(集团) |
| `totalcredit_org` | `totalcredit_org` | `totalCreditOrg` | 贷方本币合计(账簿) |
| `totaldebit_global` | `totaldebit_global` | `totalDebitGlobal` | 借方本币合计(全局) |
| `totaldebit_group` | `totaldebit_group` | `totalDebitGroup` | 借方本币合计(集团) |
| `totaldebit_org` | `totaldebit_org` | `totalDebitOrg` | 借方本币合计(账簿) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_characteristic` | `free_characteristic` | `freeCharacteristic` | 特征 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `otpinfo` | `otpinfo` | `otpInfo` | 会计平台信息(老架构) |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 凭证分录 |
| `` | `` | `voucherExtBO` | 凭证表头扩展 |
