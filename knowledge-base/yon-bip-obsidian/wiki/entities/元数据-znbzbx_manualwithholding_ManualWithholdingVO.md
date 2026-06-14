---
tags: [BIP, 元数据, 数据字典, znbzbx.manualwithholding.ManualWithholdingVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 手工预提单表头 (`znbzbx.manualwithholding.ManualWithholdingVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_manualwithholding` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`a1217686-381f-4966-8500-8e6be3c9f601`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 手工预提单表头 |
| 物理表 | `znbz_manualwithholding` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 128 个 |
| 子表 | 4 个 |
| 关联引用 | 37 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ManualWithholdingBVO` | `znbzbx.manualwithholding.ManualWithholdingBVO` | composition |
| `ManualWithholdingUserdefVO` | `znbzbx.manualwithholding.ManualWithholdingUserdefVO` | composition |
| `ManualWithholdingibpmstep` | `znbzbx.manualwithholding.ManualwithholdingIBpmStep` | composition |
| `ManualWithholdingibpmcurrentauditor` | `znbzbx.manualwithholding.ManualwithholdingIBpmCurrentAuditor` | composition |

## 关联引用 (37个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `submitter` | `` |
| `contractLedgerId` | `yonbip-ec-contract.clmContractLibRef` |
| `activity` | `` |
| `` | `` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectNewRef` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `pk_intransexpwithholding` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `manualwithholdingDcs` | `` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (10个, 33字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 128 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编号 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 来源单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `` | `upcode` | `upcode` | 上游单据号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vreason` | `vreason` | `vreason` | 预提事由 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |

### 引用字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 统一合同id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_intransexpwithholding` | `pk_intransexpwithholding` | `pk_intransexpwithholding` | 费用预提处理id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人id |
| `vcurrency` | `vcurrency` | `vcurrency` | 预提币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `autoRedDate` | `autoRedDate` | `autoRedDate` | 红冲日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isAutoRed` | `isAutoRed` | `isAutoRed` | 是否自动红冲 |
| `bredbacked` | `bredbacked` | `bredbacked` | 是否被红冲 |
| `bfinished` | `bfinished` | `bfinished` | 是否冲销完成 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `redcavrule` | `redcavrule` | `redcavrule` | 在途预提生单规则 |
| `processrule` | `processrule` | `processrule` | 在途预提流程规则 |
| `makebillrule` | `makebillrule` | `makebillrule` | 在途预提生单规则 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |
| `igenmethod` | `igenmethod` | `igenmethod` | 单据制作途径 |
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `iredbluestatus` | `iredbluestatus` | `iredbluestatus` | 红/蓝单 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 来源单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 来源单据子表id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nwithholdingmny` | `nwithholdingmny` | `nwithholdingmny` | 预提金额 |
| `nnatwithholdingmny` | `nnatwithholdingmny` | `nnatwithholdingmny` | 预提金额-本币 |
| `nexpcavmny` | `nexpcavmny` | `nexpcavmny` | 核销金额(含未审核) |
| `nredcavmny` | `nredcavmny` | `nredcavmny` | 红冲金额(含未审核) |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatexpcavmny` | `nnatexpcavmny` | `nnatexpcavmny` | 核销金额(含未审核)-本币 |
| `nnatredcavmny` | `nnatredcavmny` | `nnatredcavmny` | 红冲金额(含未审核)-本币 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `ManualWithholdingBVO` | 手工预提单表体 |
| `` | `` | `ManualWithholdingUserdefVO` | 手工预提单主表（自定义项）表 |
| `` | `` | `ManualWithholdingibpmcurrentauditor` | 预提单审批当前审批人 |
| `` | `` | `ManualWithholdingibpmstep` | 预提单审批业务阶段 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manualwithholdingDcs` | `manualwithholdingDcs` | `manualwithholdingDcs` | 预提单自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
