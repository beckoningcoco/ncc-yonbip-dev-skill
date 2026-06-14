---
tags: [BIP, 元数据, 数据字典, znbzbx.personalreturnbill.PersonalReturnBillVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 还款单主表 (`znbzbx.personalreturnbill.PersonalReturnBillVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_returnbill` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`f3606cf8-d08e-409a-89cd-3fd805a5b236`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 还款单主表 |
| 物理表 | `znbz_returnbill` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 119 个 |
| 子表 | 5 个 |
| 关联引用 | 35 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `returnbillibpmstep` | `znbzbx.personalreturnbill.PersonalReturnBillIBpmStep` | composition |
| `ReturnBillBVO` | `znbzbx.personalreturnbill.PersonalReturnBillBVO` | composition |
| `RetSettleInfoVO` | `znbzbx.personalreturnbill.PersonalRetSettleInfoVO` | composition |
| `returnbillibpmcurrentauditor` | `znbzbx.personalreturnbill.PersonalReturnBillIBpmCurrentAuditor` | composition |
| `ReturnBillUserdefVO` | `znbzbx.personalreturnbill.PersonalReturnBillUserdefVO` | composition |

## 关联引用 (35个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `submitter` | `` |
| `` | `` |
| `activity` | `` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `returnBillDcs` | `` |
| `pk_expapportionruleid_settlement_11` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (2个, 8字段)

- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 119 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | 期望收款币种默认值 |
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `` | `source` | `source` | 上游单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `upcode` | `upcode` | 上游单据号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `vreason` | `vreason` | `vreason` | 还款说明 |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 还款人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 还款人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 还款人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 还款人成本中心 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | 1:1结算规则ID |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 还款币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `nsettledate` | `nsettledate` | `nsettledate` | 实际结算日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `isSendBackBankElectronic` | `isSendBackBankElectronic` | `isSendBackBankElectronic` | 是否自动回传银行电子回单 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `isendsettletype` | `isendsettletype` | `isendsettletype` | 传财资方式 |
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `isettleresult` | `isettleresult` | `isettleresult` | 财资结算结果 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `voucherGenerationTime` | `voucherGenerationTime` | `voucherGenerationTime` | 凭证生成时点 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 还款总额-本币 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 还款总额 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币企业汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `RetSettleInfoVO` | 还款单结算信息 |
| `` | `` | `ReturnBillBVO` | 还款单子表 |
| `` | `` | `ReturnBillUserdefVO` | 还款单主表（自定义项）表 |
| `` | `` | `returnbillibpmcurrentauditor` | 还款单审批当前审批人 |
| `` | `` | `returnbillibpmstep` | 还款单审批业务阶段 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `returnBillDcs` | `returnBillDcs` | `returnBillDcs` | 还款单自定义项 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `nsettletime` | `nsettletime` | `nsettletime` | 实际结算时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
