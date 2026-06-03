---
tags: [BIP, 元数据, 数据字典, znbzbx.commonmemoapply.CommonMemoApplyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通用申请单 (`znbzbx.commonmemoapply.CommonMemoApplyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`273892b7-15c8-4a41-999e-f562def89a16`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通用申请单 |
| 物理表 | `znbz_memoapply` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 164 个 |
| 子表 | 8 个 |
| 关联引用 | 40 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MemoApplyUserdefVO` | `znbzbx.commonmemoapply.CommonMemoApplyUserdefVO` | composition |
| `MemoApplyApctVO` | `znbzbx.commonmemoapply.CommonMemoApplyApctVO` | composition |
| `memoapplyibpmcurrentauditor` | `znbzbx.commonmemoapply.CommonMemoApplyIBpmCurrentAuditor` | composition |
| `MemoapplyStdVO` | `znbzbx.commonmemoapply.CommonMemoApplyStdVO` | composition |
| `MemoapplyBVO` | `znbzbx.commonmemoapply.CommonMemoApplyBVO` | composition |
| `MemoApplyGroupVO` | `znbzbx.commonmemoapply.CommonMemoApplyGroupVO` | composition |
| `MemoApplyEndaddrVO` | `znbzbx.commonmemoapply.CommonMemoApplyEndaddrVO` | composition |
| `memoapplyibpmstep` | `znbzbx.commonmemoapply.CommonMemoApplyIBpmStep` | composition |

## 关联引用 (40个)

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
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `memoapplyDcs` | `` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 字段列表（按类型分组）

> 共 164 个直连字段

### 文本字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vreason` | `vreason` | `vreason` | 申请事由 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `vdescription` | `vdescription` | `vdescription` | 说明 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `joblistid` | `joblistid` | `joblistid` | 任职 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `` | `auditor` | `auditor` | 审批人名称 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `closer` | `closer` | `closer` | 关闭人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `vapplyname` | `vapplyname` | `vapplyname` | 申请名称 |
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
| `vhandlepsnmail` | `vhandlepsnmail` | `vhandlepsnmail` | 申请人邮箱 |
| `vhandlepsnphone` | `vhandlepsnphone` | `vhandlepsnphone` | 申请人电话 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vbtrsdealmsg` | `vbtrsdealmsg` | `vbtrsdealmsg` | 商旅处理信息 |
| `writeprojectapplymnyfield` | `writeprojectapplymnyfield` | `writeprojectapplymnyfield` | 回写立项申请金额依据 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 申请人成本中心 |
| `chandleorg` | `chandleorg` | `chandleorg` | 申请人组织 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 申请人部门 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织币 |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种 |
| `pk_projectapply` | `pk_projectapply` | `pk_projectapply` | 立项申请外键 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `closerId` | `closerId` | 关闭人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 目的地 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `dapplydate` | `dapplydate` | `dapplydate` | 申请日期 |
| `dclosedate` | `dclosedate` | `dclosedate` | 申请关闭日期 |
| `dexpectclosedate` | `dexpectclosedate` | `dexpectclosedate` | 预计申请关闭日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `close_Date` | `close_Date` | `closeDate` | 关闭日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 出差起始日期 |
| `dbusidate` | `dbusidate` | `dbusidate` | 业务日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `denddate` | `denddate` | `denddate` | 出差截止日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isquickfill` | `isquickfill` | `isquickfill` | 是否快速填写 |
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isapplyreffinished` | `isapplyreffinished` | `isapplyreffinished` | 是否申请参照完成 |
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 申请类型 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isapctfinished` | `isapctfinished` | `isapctfinished` | 是否合同参照完成 |
| `isclose` | `isclose` | `isclose` | 是否关闭 |
| `isfinished` | `isfinished` | `isfinished` | 是否结束 |
| `isloanfinished` | `isloanfinished` | `isloanfinished` | 是否借款/预付参照完成 |
| `isoverstd` | `isoverstd` | `isoverstd` | 是否超标 |
| `isusebody` | `isusebody` | `isusebody` | 是否启用表体明细 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `withholdingstatus` | `withholdingstatus` | `withholdingstatus` | 在途预提情况 |
| `withholdingrule` | `withholdingrule` | `withholdingrule` | 在途预提红冲规则 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |
| `itranstools` | `itranstools` | `itranstools` | 交通工具 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |

### 短整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `toHrFalg` | `toHrFalg` | `toHrFalg` | 传人力方式 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `iclosetype` | `iclosetype` | `iclosetype` | 申请关闭方式 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `ibtrsdealtype` | `ibtrsdealtype` | `ibtrsdealtype` | 商旅处理状态 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `isendbtrstype` | `isendbtrstype` | `isendbtrstype` | 传商旅方式 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `napplyrefmny` | `napplyrefmny` | `napplyrefmny` | 申请参照金额 |
| `napplyrelmny` | `napplyrelmny` | `napplyrelmny` | 申请释放金额 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提总额 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提总额-本币 |
| `nnatestimatedamount` | `nnatestimatedamount` | `nnatestimatedamount` | 预估金额-本币 |
| `nestimatedamount` | `nestimatedamount` | `nestimatedamount` | 预估金额 |
| `napctfinishmny` | `napctfinishmny` | `napctfinishmny` | 合同已执行金额 |
| `napctmny` | `napctmny` | `napctmny` | 合同参照金额 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 已核销金额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nfinishmny` | `nfinishmny` | `nfinishmny` | 参照完成金额 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款参照金额 |
| `nnatapplymny` | `nnatapplymny` | `nnatapplymny` | 申请金额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 基准汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 已核销金额-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatfinishmny` | `nnatfinishmny` | `nnatfinishmny` | 报销参照金额-本币 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款/预付参照金额-本币 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 还款/退款额-本币 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 还款/退款额 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `MemoApplyApctVO` | 通用申请合同子表 |
| `` | `` | `MemoApplyEndaddrVO` | 通用申请表头目的地 |
| `` | `` | `MemoApplyGroupVO` | 通用申请项目团队子表 |
| `` | `` | `MemoApplyUserdefVO` | 通用申请单主表（自定义项）表 |
| `` | `` | `MemoapplyBVO` | 通用申请单子表 |
| `` | `` | `MemoapplyStdVO` | 通用申请单差旅标准 |
| `` | `` | `memoapplyibpmcurrentauditor` | 通用申请单审批当前审批人 |
| `` | `` | `memoapplyibpmstep` | 通用申请单审批业务阶段 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `close_time` | `close_time` | `closeTime` | 关闭时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memoapplyDcs` | `memoapplyDcs` | `memoapplyDcs` | 通用申请单自定义项 |
