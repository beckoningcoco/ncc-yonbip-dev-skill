---
tags: [BIP, 元数据, 数据字典, drft.impawnBean.ImpawnBean]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据质押 (`drft.impawnBean.ImpawnBean`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_impawn` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`146c8f13-02fc-4b48-b9ae-1806a3763b36`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据质押 |
| 物理表 | `drft_impawn` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 121 个 |
| 子表 | 1 个 |
| 关联引用 | 38 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `drft.impawnBean.ImpawnBeanDefine` | composition |

## 关联引用 (38个)

| 字段名 | 引用类型 |
|--------|---------|
| `outimpawnerfundobject` | `` |
| `disableuserid` | `` |
| `pk_register_tran` | `` |
| `out_supplier` | `` |
| `` | `` |
| `impawnbankaccbyorg` | `` |
| `profit_center` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `pk_org` | `` |
| `bank` | `ucfbasedoc.bd_bankdotref` |
| `outimpawnbankaccbycust` | `` |
| `out_bank` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `outimpawneraccbyfundobject` | `` |
| `tenant_id` | `` |
| `olccurrency` | `bd_currencytenantreflist` |
| `ytenant_id` | `` |
| `cost_center` | `` |
| `pk_register` | `drft_billnoref` |
| `accentity_raw` | `bd_accbody` |
| `bill_type` | `` |
| `impawnbankaccbysupp` | `aa_vendorbankref` |
| `dept_id` | `` |
| `olcratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `impawneraccbyfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `outimpawnbankaccbysupp` | `` |
| `pk_backbankmsg` | `drft_instructRef` |
| `trade_type` | `transtype.bd_billtyperef` |
| `electronicbill` | `` |
| `impawnbankaccbycust` | `aa_merchantbankref` |
| `character_def` | `` |
| `out_customer` | `` |
| `pk_bankmsg` | `drft_instructRef` |
| `impawnerfundobject` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `customer` | `productcenter.aa_merchantref` |

## 继承接口 (3个, 8字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 121 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | `impawnerfundobjecttpye` | 质权人资金业务对象类型 |
| `impawnbackperson` | `impawnbackperson` | `impawnbackperson` | 解除质押人 |
| `ecds_status` | `ecds_status` | `ecdsStatus` | 电票状态 |
| `noteno` | `noteno` | `noteno` | 票据(包)号 |
| `impawnbackpersonid` | `impawnbackpersonid` | `impawnbackpersonid` | 解除质押人id |
| `bill_range` | `bill_range` | `billRange` | 显示区间 |
| `available_range` | `available_range` | `availableRange` | 可用区间 |
| `surplus_bill_range` | `surplus_bill_range` | `surplusBillRange` | 剩余质押区间 |
| `out_impawn_person` | `out_impawn_person` | `outImpawnPerson` | 出质人 |
| `outimpawnkind` | `outimpawnkind` | `outimpawnkind` | 出质人类别 |
| `outimpawnaccount` | `outimpawnaccount` | `outimpawnaccount` | 出质人银行账号 |
| `outimpawnaccname` | `outimpawnaccname` | `outimpawnaccname` | 出质人账户名称 |
| `outimpawnbankname` | `outimpawnbankname` | `outimpawnbankname` | 出质人银行名称 |
| `outimpawnbankno` | `outimpawnbankno` | `outimpawnbankno` | 出质人银行代码 |
| `outimpawnerfundobjecttpye` | `outimpawnerfundobjecttpye` | `outimpawnerfundobjecttpye` | 出质人资金业务对象类型 |
| `impawnaccname` | `impawnaccname` | `impawnaccname` | 质押人账户名称 |
| `impawnaccount` | `impawnaccount` | `impawnaccount` | 质押人银行账号 |
| `impawnbankname` | `impawnbankname` | `impawnbankname` | 质押人银行名称 |
| `impawnbankno` | `impawnbankno` | `impawnbankno` | 质押人银行代码 |
| `impawnkind` | `impawnkind` | `impawnkind` | 质押人类别 |
| `code` | `code` | `code` | 单据编号 |
| `impawn_person` | `impawn_person` | `impawnPerson` | 质押人 |
| `ele_account` | `ele_account` | `eleAccount` | 电票签约账户 |
| `ele_code` | `ele_code` | `eleCode` | 电票银行代码 |
| `ele_name` | `ele_name` | `eleName` | 电票账户名称 |
| `ele_bankname` | `ele_bankname` | `eleBankName` | 电票银行名称 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `ticket_id` | `ticket_id` | `ticketId` | 电子票据信息id |
| `srcbill_id` | `srcbill_id` | `srcbillId` | 来源单据id |
| `disableusername` | `disableusername` | `disableusername` | 作废人 |
| `disablenote` | `disablenote` | `disablenote` | 作废原因 |

### 引用字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `bill_type` | `bill_type` | `billType` | 票据类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `disableuserid` | `disableuserid` | `disableuserid` | 作废人 |
| `pk_register_tran` | `pk_register_tran` | `pkRegisterTran` | 票据子表主键 |
| `out_supplier` | `out_supplier` | `outSupplier` | 出质人供应商 |
| `out_customer` | `out_customer` | `outCustomer` | 出质人客户 |
| `out_bank` | `out_bank` | `outBank` | 出质人银行网点 |
| `outimpawnbankaccbycust` | `outimpawnbankaccbycust` | `outimpawnbankaccbycust` | 出质人客户银行账号 |
| `outimpawnbankaccbysupp` | `outimpawnbankaccbysupp` | `outimpawnbankaccbysupp` | 出质人供应商银行账号 |
| `outimpawnerfundobject` | `outimpawnerfundobject` | `outimpawnerfundobject` | 出质人资金业务对象 |
| `outimpawneraccbyfundobject` | `outimpawneraccbyfundobject` | `outimpawneraccbyfundobject` | 出质人资金业务对象账号 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `impawnbankaccbycust` | `impawnbankaccbycust` | `impawnbankaccbycust` | 质押人客户银行账号 |
| `impawnbankaccbyorg` | `impawnbankaccbyorg` | `impawnbankaccbyorg` | 被背书人会计主体银行账号 |
| `impawnbankaccbysupp` | `impawnbankaccbysupp` | `impawnbankaccbysupp` | 质押人供应商银行账号 |
| `impawnerfundobject` | `impawnerfundobject` | `impawnerfundobject` | 质权人id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_org` | `pk_org` | `pk_org` | 业务组织 |
| `impawneraccbyfundobject` | `impawneraccbyfundobject` | `impawneraccbyfundobject` | 质权人资金业务对象银行账号id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `trade_type` | `trade_type` | `bustype` | 交易类型id |
| `pk_register` | `pk_register` | `pk_register` | 票据信息主键 |
| `electronicbill` | `electronicbill` | `electronicbill` | 电票签约账户id |
| `olccurrency` | `olccurrency` | `olccurrency` | 组织本币id |
| `olcratetype` | `olcratetype` | `olcrateType` | 组织本币汇率类型id |
| `pk_bankmsg` | `pk_bankmsg` | `pk_bankmsg` | 指令信息主键 |
| `pk_backbankmsg` | `pk_backbankmsg` | `pk_backbankmsg` | 撤回指令信息主键 |
| `customer` | `customer` | `customer` | 客户id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `bank` | `bank` | `bank` | 供应商id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impawn_date` | `impawn_date` | `impawnDate` | 质押日期 |
| `unimpawn_date` | `unimpawn_date` | `unimpawnDate` | 解质押日期 |
| `impawn_to_date` | `impawn_to_date` | `impawnToDate` | 质押到期日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `disabledate` | `disabledate` | `disabledate` | 作废日期 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `is_all` | `is_all` | `isAll` | 是否整包 |
| `is_upload` | `is_upload` | `isUpload` | 是否上传附件 |
| `grm_flag` | `grm_flag` | `grmFlag` | 是否推送担保物权单 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `is_account` | `is_account` | `isAccount` | 是否直联 |
| `is_gather` | `is_gather` | `isGather` | 是否收票 |

### 短整数 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `olc_rate_ops` | `olc_rate_ops` | `olcRateOps` | 组织本币汇率折算方式 |
| `auditstatus` | `auditstatus` | `auditstatus` | 审批状态 |
| `billstatus` | `billstatus` | `billStatus` | 单据状态 |
| `propertystatus` | `propertystatus` | `propertyStatus` | 担保状态 |
| `generationtype` | `generationtype` | `generationType` | 单据生成方式 |
| `outimpawnroles` | `outimpawnroles` | `outimpawnroles` | 出质方 |
| `impawn_dir` | `impawn_dir` | `impawnDir` | 质押方向 |
| `` | `returncount` | `returncount` | 退回次数 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `impawnroles` | `impawnroles` | `impawnroles` | 质押方 |
| `` | `status` | `status` | 凭证状态 |
| `instruct_status` | `instruct_status` | `instructStatus` | 指令状态 |
| `event_type` | `event_type` | `eventType` | 事项类型 |
| `backinstruct_status` | `backinstruct_status` | `backinstructStatus` | 撤回指令状态 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_range_start` | `bill_range_start` | `billRangeStart` | 开始区间 |
| `bill_range_end` | `bill_range_end` | `billRangeEnd` | 结束区间 |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impawnbackbillmoney` | `impawnbackbillmoney` | `impawnbackbillmoney` | 解押票据金额 |
| `notemoney` | `notemoney` | `notemoney` | 票据(包)金额 |
| `olcimpawnbackbillmoney` | `olcimpawnbackbillmoney` | `olcimpawnbackbillmoney` | 组织本币解押票据金额 |
| `trans_money` | `trans_money` | `transMoney` | 交易金额 |
| `surplus_money` | `surplus_money` | `surplusMoney` | 剩余质押金额 |
| `impawnbackmoney` | `impawnbackmoney` | `impawnbackmoney` | 解除质押金额 |
| `olcrate` | `olcrate` | `olcrate` | 组织本币汇率 |
| `olcnote_money` | `olcnote_money` | `olcnoteMoney` | 组织本币金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_def` | `character_def` | `characterDefine` | 票据质押办理自定义特征属性组 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disabletime` | `disabletime` | `disabletime` | 作废时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 质押信息自由自定义项 |
