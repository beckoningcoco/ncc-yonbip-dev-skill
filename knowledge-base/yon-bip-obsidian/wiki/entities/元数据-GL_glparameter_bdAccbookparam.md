---
tags: [BIP, 元数据, 数据字典, GL.glparameter.bdAccbookparam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计核算账簿总账参数 (`GL.glparameter.bdAccbookparam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_accbookparam` | domain：`yonbip-fi-egl` | 应用：`yonbip-fi-egl` | 业务对象ID：`ec1a3ce4-1f48-4c8d-b98d-8ac39554154d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计核算账簿总账参数 |
| 物理表 | `bd_accbookparam` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `yonbip-fi-egl` |
| 直连字段 | 99 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `glAccbookparamExtAutoauditList` | `GL.glparameter.glAccbookparamExtAutoaudit` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `accsubject` | `` |
| `creator` | `` |
| `incomesubject` | `` |
| `losesubject` | `` |
| `pk_org` | `` |
| `modifier` | `` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 99 个直连字段

### 文本字段 (66个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbookattr` | `accbookattr` | `accbookattr` | 账簿属性 |
| `accbookdesc` | `accbookdesc` | `accbookdesc` | 账簿描述 |
| `accountcheckstragegy` | `accountcheckstragegy` | `accountcheckstragegy` | 结账检查现金流量策略 |
| `accsubject_balance_deficit_check_type` | `accsubject_balance_deficit_check_type` | `accsubjectBalanceDeficitCheckType` | 科目余额赤字检查环节 |
| `aux_show` | `aux_show` | `auxShow` | 辅助核算展示 |
| `auxiliaryshowmode` | `auxiliaryshowmode` | `auxiliaryshowmode` | 辅助核算项显示方式 |
| `carrydown_ratetype` | `carrydown_ratetype` | `carrydownRatetype` | 汇兑损益结转汇率类型 |
| `cashflowinspectionlink` | `cashflowinspectionlink` | `cashflowinspectionlink` | 现金流量检察环节 |
| `classifyid` | `classifyid` | `classifyid` | 未使用 |
| `code` | `code` | `code` | 编码 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `currency` | `currency` | `currency` | 币种 |
| `currencyschema` | `currencyschema` | `currencyschema` | 外币汇率方案 |
| `def1` | `def1` | `def1` | 扩展字段 |
| `def10` | `def10` | `def10` | 扩展字段 |
| `def11` | `def11` | `def11` | 扩展字段 |
| `def12` | `def12` | `def12` | 扩展字段 |
| `def13` | `def13` | `def13` | 扩展字段 |
| `def14` | `def14` | `def14` | 扩展字段 |
| `def15` | `def15` | `def15` | 扩展字段 |
| `def16` | `def16` | `def16` | 扩展字段 |
| `def17` | `def17` | `def17` | 扩展字段 |
| `def18` | `def18` | `def18` | 扩展字段 |
| `def19` | `def19` | `def19` | 扩展字段 |
| `def2` | `def2` | `def2` | 扩展字段 |
| `def20` | `def20` | `def20` | 扩展字段 |
| `def21` | `def21` | `def21` | 扩展字段 |
| `def22` | `def22` | `def22` | 扩展字段 |
| `def23` | `def23` | `def23` | 扩展字段 |
| `def24` | `def24` | `def24` | 扩展字段 |
| `def25` | `def25` | `def25` | 扩展字段 |
| `def26` | `def26` | `def26` | 扩展字段 |
| `def27` | `def27` | `def27` | 扩展字段 |
| `def28` | `def28` | `def28` | 扩展字段 |
| `def29` | `def29` | `def29` | 扩展字段 |
| `def3` | `def3` | `def3` | 扩展字段 |
| `def30` | `def30` | `def30` | 扩展字段 |
| `def4` | `def4` | `def4` | 扩展字段 |
| `def5` | `def5` | `def5` | 扩展字段 |
| `def6` | `def6` | `def6` | 扩展字段 |
| `def7` | `def7` | `def7` | 扩展字段 |
| `def8` | `def8` | `def8` | 扩展字段 |
| `def9` | `def9` | `def9` | 扩展字段 |
| `description` | `description` | `description` | 描述 |
| `id` | `id` | `id` | 主键ID |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `multidimension` | `multidimension` | `multidimension` | 科目辅助结构 |
| `name` | `name` | `name` | 名称 |
| `name2` | `name2` | `name2` | 名称多语 |
| `name3` | `name3` | `name3` | 名称多语 |
| `name4` | `name4` | `name4` | 名称多语 |
| `name5` | `name5` | `name5` | 名称多语 |
| `name6` | `name6` | `name6` | 名称多语 |
| `parentid` | `parentid` | `parentid` | 父id |
| `pk_group` | `pk_group` | `pkGroup` | 未使用 |
| `profitmethod` | `profitmethod` | `profitmethod` | 利润结转方式 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `shortname2` | `shortname2` | `shortname2` | 简称2 |
| `shortname3` | `shortname3` | `shortname3` | 简称3 |
| `shortname4` | `shortname4` | `shortname4` | 简称4 |
| `shortname5` | `shortname5` | `shortname5` | 简称5 |
| `shortname6` | `shortname6` | `shortname6` | 简称6 |
| `srctplid` | `srctplid` | `srctplid` | 未使用 |
| `tenantid` | `tenantid` | `tenantid` | 租户id |
| `ts` | `ts` | `ts` | 时间戳 |
| `voucher_print_type` | `voucher_print_type` | `voucherPrintType` | 凭证打印方式 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject` | `accsubject` | `accsubject` | 科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `incomesubject` | `incomesubject` | `incomesubject` | 汇兑收益科目 |
| `losesubject` | `losesubject` | `losesubject` | 汇兑损失科目 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `aotu_supplement_no` | `aotu_supplement_no` | `aotuSupplementNo` | 自动补号 |
| `audit_cancel` | `audit_cancel` | `auditCancel` | 是否允许取消他人已审核凭证 |
| `autoaudit` | `autoaudit` | `autoaudit` | 自动审核 |
| `autocoord` | `autocoord` | `autocoord` | 自动协同,0:手动,1:自动 |
| `autoelecentryaccount` | `autoelecentryaccount` | `autoelecentryaccount` | 自动生成电子凭证入账信息,0:手动,1:自动 |
| `autotally` | `autotally` | `autotally` | 自动记账 |
| `balancedisplay` | `balancedisplay` | `balancedisplay` | 余额展示 |
| `bln_auto_balance_carry_over` | `bln_auto_balance_carry_over` | `blnAutoBalanceCarryOver` | 期初余额自动结转 |
| `bln_measure_doc_can_modify` | `bln_measure_doc_can_modify` | `blnMeasureDocCanModify` | 计量单位是否可以修改 |
| `check_cashflow` | `check_cashflow` | `checkCashflow` | 现金流量检查 |
| `check_coord` | `check_coord` | `checkCoord` | 结账检查协同凭证,0:不检查、1:警告项检查 2:异常项检查 |
| `check_settle_status` | `check_settle_status` | `checkSettleStatus` | 关注结账控制业务系统结转状态 |
| `check_tempvoucher` | `check_tempvoucher` | `checkTempvoucher` | 关解账时检查临时凭证 |
| `check_voucher_signature` | `check_voucher_signature` | `checkVoucherSignature` | 凭证签字检查,1:不签字 2:先签后审 3:先审后签 See:VoucherSignatureEnum |
| `convertable` | `convertable` | `convertable` | 允许折算 |
| `diffaccount` | `diffaccount` | `diffaccount` | 差异账 |
| `dr` | `dr` | `dr` | 删除标识 |
| `enable` | `enable` | `enable` | 启停用 |
| `futureamount` | `futureamount` | `futureamount` | 将来期间打开数量 |
| `nextperiod` | `nextperiod` | `nextperiod` | 本期关账,上游单据是否生成下期凭证 |
| `same_modified` | `same_modified` | `sameModified` | 是否允许维护他人填写的凭证 |
| `same_person` | `same_person` | `samePerson` | 是否制单人和审核人允许为同一个人 |
| `sequential` | `sequential` | `sequential` | 序时控制 |
| `systemgene` | `systemgene` | `systemgene` | 是否系统自动生成 |
| `tally_cancel` | `tally_cancel` | `tallyCancel` | 允许取消他人已记账凭证 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `glAccbookparamExtAutoauditList` | 账簿总账参数GL01自动审核业务来源应用表 |
