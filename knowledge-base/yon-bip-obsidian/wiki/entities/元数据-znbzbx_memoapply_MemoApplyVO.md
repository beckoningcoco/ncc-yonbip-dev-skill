---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.MemoApplyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事项申请单 (`znbzbx.memoapply.MemoApplyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`238c765a-25f2-4279-933e-da8ecd144980`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事项申请单 |
| 物理表 | `znbz_memoapply` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 165 个 |
| 子表 | 10 个 |
| 关联引用 | 41 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MemoApplyUserdefVO` | `znbzbx.memoapply.MemoApplyUserdefVO` | composition |
| `MemoApplyPlan` | `znbzbx.memoapply.MemoApplyPlan` | composition |
| `expsubsidydetails` | `znbzbx.memoapply.ApplySubsidyDetailVO` | composition |
| `MemoApplyApctVO` | `znbzbx.memoapply.MemoApplyApctVO` | composition |
| `memoapplyibpmcurrentauditor` | `znbzbx.memoapply.MemoApplyIBpmCurrentAuditor` | composition |
| `MemoapplyStdVO` | `znbzbx.memoapply.MemoApplyStdVO` | composition |
| `MemoapplyBVO` | `znbzbx.memoapply.MemoApplyBVO` | composition |
| `MemoApplyGroupVO` | `znbzbx.memoapply.MemoApplyGroupVO` | composition |
| `MemoApplyEndaddrVO` | `znbzbx.memoapply.MemoApplyEndaddrVO` | composition |
| `memoapplyibpmstep` | `znbzbx.memoapply.MemoApplyIBpmStep` | composition |

## 关联引用 (41个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `submitter` | `` |
| `activity` | `` |
| `` | `` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_begaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_projectapply` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
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
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (11个, 37字段)

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
- **关闭信息** (`base.itf.IClosing`)
  - `close_Date` → `close_Date`
  - `closer` → `closer`
  - `` → ``
  - `close_time` → `close_time`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
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
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 165 个直连字段

### 文本字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `writeprojectapplymnyfield` | `writeprojectapplymnyfield` | `writeprojectapplymnyfield` | 回写立项申请金额依据 |
| `joblistid` | `joblistid` | `joblistid` | 任职 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `` | `code` | `code` | 单据编号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vhandlepsnphone` | `vhandlepsnphone` | `vhandlepsnphone` | 申请人电话 |
| `vhandlepsnmail` | `vhandlepsnmail` | `vhandlepsnmail` | 申请人邮箱 |
| `vreason` | `vreason` | `vreason` | 申请事由 |
| `vapplyname` | `vapplyname` | `vapplyname` | 申请名称 |
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
| `vdescription` | `vdescription` | `vdescription` | 说明 |
| `vbtrsdealmsg` | `vbtrsdealmsg` | `vbtrsdealmsg` | 商旅处理信息 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `closer` | `closer` | `closer` | 关闭人名称 |
| `itplid` | `itplid` | `itplid` | 模板id |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_projectapply` | `pk_projectapply` | `pk_projectapply` | 立项申请外键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 申请人成本中心 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 申请人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 申请人组织id |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人ID |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 目的地id |
| `` | `closerId` | `closerId` | 关闭人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dexpectclosedate` | `dexpectclosedate` | `dexpectclosedate` | 预计申请关闭日期 |
| `dclosedate` | `dclosedate` | `dclosedate` | 申请关闭日期 |
| `dapplydate` | `dapplydate` | `dapplydate` | 申请日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 出差起始日期 |
| `denddate` | `denddate` | `denddate` | 出差截止日期 |
| `dbusidate` | `dbusidate` | `dbusidate` | 业务日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `close_Date` | `close_Date` | `closeDate` | 关闭日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isapplyreffinished` | `isapplyreffinished` | `isapplyreffinished` | 是否申请参照完成 |
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 申请类型 |
| `isoverstd` | `isoverstd` | `isoverstd` | 是否超标 |
| `isclose` | `isclose` | `isclose` | 是否关闭 |
| `isfinished` | `isfinished` | `isfinished` | 是否报销参照完成 |
| `isloanfinished` | `isloanfinished` | `isloanfinished` | 是否借款/预付参照完成 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isapctfinished` | `isapctfinished` | `isapctfinished` | 是否合同参照完成 |
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isusebody` | `isusebody` | `isusebody` | 是否启用表体明细 |
| `isquickfill` | `isquickfill` | `isquickfill` | 是否快速填写 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `withholdingstatus` | `withholdingstatus` | `withholdingstatus` | 在途预提情况 |
| `withholdingrule` | `withholdingrule` | `withholdingrule` | 在途预提红冲规则 |
| `itranstools` | `itranstools` | `itranstools` | 交通工具 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `toHrFalg` | `toHrFalg` | `toHrFalg` | 传人力方式 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `iclosetype` | `iclosetype` | `iclosetype` | 申请关闭方式 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `isendbtrstype` | `isendbtrstype` | `isendbtrstype` | 传商旅方式 |
| `ibtrsdealtype` | `ibtrsdealtype` | `ibtrsdealtype` | 商旅处理状态 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `napplyrefmny` | `napplyrefmny` | `napplyrefmny` | 申请参照金额 |
| `napplyrelmny` | `napplyrelmny` | `napplyrelmny` | 申请释放金额 |
| `nnatestimatedamount` | `nnatestimatedamount` | `nnatestimatedamount` | 预估金额-本币 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提总额 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提总额-本币 |
| `nestimatedamount` | `nestimatedamount` | `nestimatedamount` | 预估金额 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `nfinishmny` | `nfinishmny` | `nfinishmny` | 报销参照金额 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款参照金额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 已核销金额 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 还款/退款额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `napctmny` | `napctmny` | `napctmny` | 合同参照金额 |
| `napctfinishmny` | `napctfinishmny` | `napctfinishmny` | 合同已执行金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 基准汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatapplymny` | `nnatapplymny` | `nnatapplymny` | 申请金额-本币 |
| `nnatfinishmny` | `nnatfinishmny` | `nnatfinishmny` | 报销参照金额-本币 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款/预付参照金额-本币 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 还款/退款额 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 还款/退款额-本币 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `close_time` | `close_time` | `closeTime` | 关闭时间 |

### other (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `MemoApplyApctVO` | 事项申请合同子表 |
| `` | `` | `MemoApplyEndaddrVO` | 事项申请表头目的地 |
| `` | `` | `MemoApplyGroupVO` | 事项申请项目团队子表 |
| `` | `` | `MemoApplyPlan` | 行程规划子表 |
| `` | `` | `MemoApplyUserdefVO` | 事项申请单主表（自定义项）表 |
| `` | `` | `MemoapplyBVO` | 事项申请单子表 |
| `` | `` | `MemoapplyStdVO` | 事项申请单差旅标准 |
| `` | `` | `expsubsidydetails` | 申请单补贴明细 |
| `` | `` | `memoapplyibpmcurrentauditor` | 申请单审批当前审批人 |
| `` | `` | `memoapplyibpmstep` | 申请单审批业务阶段 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
