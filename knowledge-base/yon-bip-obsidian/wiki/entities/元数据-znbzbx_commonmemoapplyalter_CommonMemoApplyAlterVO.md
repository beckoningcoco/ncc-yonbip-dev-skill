---
tags: [BIP, 元数据, 数据字典, znbzbx.commonmemoapplyalter.CommonMemoApplyAlterVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通用申请变更单 (`znbzbx.commonmemoapplyalter.CommonMemoApplyAlterVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapplyalter` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`8d85a92b-d2be-431b-962c-36c052ac6847`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通用申请变更单 |
| 物理表 | `znbz_memoapplyalter` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 161 个 |
| 子表 | 7 个 |
| 关联引用 | 41 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MemoApplyAlterAfterVO` | `znbzbx.commonmemoapplyalter.CommonMemoApplyAlterAfterVO` | composition |
| `MemoApplyAlterUserdefVO` | `znbzbx.commonmemoapplyalter.CommonMemoApplyAlterUserdefVO` | composition |
| `MemoApplyAlterBeforeVO` | `znbzbx.commonmemoapplyalter.CommonMemoApplyAlterBeforeVO` | composition |
| `MemoApplyAlterEndaddrBeforeVO` | `znbzbx.commonmemoapplyalter.CommonMemoApplyAlterEndaddrBeforeVO` | composition |
| `memoapplyalteribpmcurrentauditor` | `znbzbx.commonmemoapplyalter.CommonMemoapplyAlterIBpmCurrentAuditor` | composition |
| `memoapplyalteribpmstep` | `znbzbx.commonmemoapplyalter.CommonMemoapplyAlterIBpmStep` | composition |
| `MemoApplyAlterEndaddrAfterVO` | `znbzbx.commonmemoapplyalter.CommonMemoApplyAlterEndaddrAfterVO` | composition |

## 关联引用 (41个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `submitter` | `` |
| `activity` | `` |
| `pk_busimemo_before` | `finbd.bd_expenseitemref` |
| `pk_begaddr_before` | `ucfbasedoc.bd_countryaddbuttonref` |
| `` | `` |
| `wbs` | `` |
| `pk_begaddr_after` | `ucfbasedoc.bd_countryaddbuttonref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `pk_busimemotype_before` | `finbd.bd_expenseitemtyperef` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_project_before` | `ucfbasedoc.bd_projectcardref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_busimemotype_after` | `finbd.bd_expenseitemtyperef` |
| `pk_project_after` | `ucfbasedoc.bd_projectcardref` |
| `bustype` | `bd_billtyperef` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `pk_busimemo_after` | `finbd.bd_expenseitemref` |
| `memoapplyalterDcs` | `` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_memoapply` | `znbzbx_memoapplyref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 字段列表（按类型分组）

> 共 161 个直连字段

### 文本字段 (56个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `vdef8_before` | `vdef8_before` | `vdef8_before` | 自定义项8_变更前 |
| `vdef7_before` | `vdef7_before` | `vdef7_before` | 自定义项7_变更前 |
| `vdef9_before` | `vdef9_before` | `vdef9_before` | 自定义项9_变更前 |
| `vdef1_after` | `vdef1_after` | `vdef1_after` | 自定义项1_变更后 |
| `vdef9_after` | `vdef9_after` | `vdef9_after` | 自定义项9_变更后 |
| `vdef2_before` | `vdef2_before` | `vdef2_before` | 自定义项2_变更前 |
| `vdef4_before` | `vdef4_before` | `vdef4_before` | 自定义项4_变更前 |
| `vdef6_before` | `vdef6_before` | `vdef6_before` | 自定义项6_变更前 |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `vdef4_after` | `vdef4_after` | `vdef4_after` | 自定义项4_变更后 |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `vdef3_before` | `vdef3_before` | `vdef3_before` | 自定义项3_变更前 |
| `vdescription_after` | `vdescription_after` | `vdescription_after` | 说明_变更后 |
| `vdef3_after` | `vdef3_after` | `vdef3_after` | 自定义项3_变更后 |
| `vmemo_before` | `vmemo_before` | `vmemo_before` | 备注_变更前 |
| `vmemo_after` | `vmemo_after` | `vmemo_after` | 备注_变更后 |
| `vdef2_after` | `vdef2_after` | `vdef2_after` | 自定义项2_变更后 |
| `vdescription_before` | `vdescription_before` | `vdescription_before` | 说明_变更前 |
| `vdef10_before` | `vdef10_before` | `vdef10_before` | 自定义项10_变更前 |
| `vdef8_after` | `vdef8_after` | `vdef8_after` | 自定义项8_变更后 |
| `vdef5_after` | `vdef5_after` | `vdef5_after` | 自定义项5_变更后 |
| `vdef7_after` | `vdef7_after` | `vdef7_after` | 自定义项7_变更后 |
| `vdef10_after` | `vdef10_after` | `vdef10_after` | 自定义项10_变更后 |
| `vdef6_after` | `vdef6_after` | `vdef6_after` | 自定义项6_变更后 |
| `vdef1_before` | `vdef1_before` | `vdef1_before` | 自定义项1_变更前 |
| `vdef5_before` | `vdef5_before` | `vdef5_before` | 自定义项5_变更前 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `` | `creator` | `creator` | 创建人名称 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `dendtime_after` | `dendtime_after` | `dendtime_after` | 出差截止时间_变更后 |
| `dendtime_before` | `dendtime_before` | `dendtime_before` | 出差截止时间_变更前 |
| `dstarttime_after` | `dstarttime_after` | `dstarttime_after` | 出差起始时间_变更后 |
| `dstarttime_before` | `dstarttime_before` | `dstarttime_before` | 出差起始时间_变更前 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
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
| `vdescription` | `vdescription` | `vdescription` | 说明 |
| `vmemo` | `vmemo` | `vmemo` | 变更原因 |
| `vreason_after` | `vreason_after` | `vreason_after` | 申请事由_变更后 |
| `vreason_before` | `vreason_before` | `vreason_before` | 申请事由 |

### 引用字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 申请人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 申请人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 申请人成本中心 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_begaddr_after` | `pk_begaddr_after` | `pk_begaddr_after` | 出发地_变更后 |
| `pk_begaddr_before` | `pk_begaddr_before` | `pk_begaddr_before` | 出发地_变更前 |
| `pk_busimemo_after` | `pk_busimemo_after` | `pk_busimemo_after` | 费用项目_变更后 |
| `pk_busimemo_before` | `pk_busimemo_before` | `pk_busimemo_before` | 费用项目_变更前 |
| `pk_busimemotype_after` | `pk_busimemotype_after` | `pk_busimemotype_after` | 费用项目类别_变更后 |
| `pk_busimemotype_before` | `pk_busimemotype_before` | `pk_busimemotype_before` | 费用项目类别_变更前 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 通用申请id |
| `pk_project_after` | `pk_project_after` | `pk_project_after` | 项目_变更后 |
| `pk_project_before` | `pk_project_before` | `pk_project_before` | 项目_变更前 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dapplydate` | `dapplydate` | `dapplydate` | 申请日期 |
| `denddate_after` | `denddate_after` | `denddate_after` | 出差截止日期_变更后 |
| `denddate_before` | `denddate_before` | `denddate_before` | 出差截止日期_变更前 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `dstartdate_after` | `dstartdate_after` | `dstartdate_after` | 出差起始日期_变更后 |
| `dstartdate_before` | `dstartdate_before` | `dstartdate_before` | 出差起始日期_变更前 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isoverstd` | `isoverstd` | `isoverstd` | 是否超标 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isusebody` | `isusebody` | `isusebody` | 是否启用表体明细 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `nbusitravalday_before` | `nbusitravalday_before` | `nbusitravalday_before` | 出差天数变更前 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nestimatedamount_before` | `nestimatedamount_before` | `nestimatedamount_before` | 预估金额_变更前 |
| `nnatestimatedamount_before` | `nnatestimatedamount_before` | `nnatestimatedamount_before` | 预估金额-本币_变更前 |
| `nestimatedamount_after` | `nestimatedamount_after` | `nestimatedamount_after` | 预估金额_变更后 |
| `nnatestimatedamount_after` | `nnatestimatedamount_after` | `nnatestimatedamount_after` | 预估金额-本币_变更后 |
| `ndefnum1_after` | `ndefnum1_after` | `ndefnum1_after` | 自定义项(小数)1_变更后 |
| `ndefnum4_after` | `ndefnum4_after` | `ndefnum4_after` | 自定义项(小数)4_变更后 |
| `ndefnum3_after` | `ndefnum3_after` | `ndefnum3_after` | 自定义项(小数)3_变更后 |
| `ndefnum2_after` | `ndefnum2_after` | `ndefnum2_after` | 自定义项(小数)2_变更后 |
| `ndefnum1_before` | `ndefnum1_before` | `ndefnum1_before` | 自定义项(小数)1_变更前 |
| `ndefnum5_before` | `ndefnum5_before` | `ndefnum5_before` | 自定义项(小数)5_变更前 |
| `ndefnum5_after` | `ndefnum5_after` | `ndefnum5_after` | 自定义项(小数)5_变更后 |
| `ndefnum2_before` | `ndefnum2_before` | `ndefnum2_before` | 自定义项(小数)2_变更前 |
| `ndefnum4_before` | `ndefnum4_before` | `ndefnum4_before` | 自定义项(小数)4_变更前 |
| `ndefnum3_before` | `ndefnum3_before` | `ndefnum3_before` | 自定义项(小数)3_变更前 |
| `napplymny_after` | `napplymny_after` | `napplymny_after` | 申请金额_变更后 |
| `napplymny_before` | `napplymny_before` | `napplymny_before` | 申请金额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nnatapplymny_after` | `nnatapplymny_after` | `nnatapplymny_after` | 申请金额_变更后-本币 |
| `nnatapplymny_before` | `nnatapplymny_before` | `nnatapplymny_before` | 申请金额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 基准汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |

### other (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `MemoApplyAlterAfterVO` | 通用申请单子表变更后 |
| `` | `` | `MemoApplyAlterBeforeVO` | 通用申请单子表变更前 |
| `` | `` | `MemoApplyAlterEndaddrAfterVO` | 通用申请变更表头目的地_变更后 |
| `` | `` | `MemoApplyAlterEndaddrBeforeVO` | 通用申请变更表头目的地_变更前 |
| `` | `` | `MemoApplyAlterUserdefVO` | 事项申请变更单主表(自定义项)表 |
| `` | `` | `memoapplyalteribpmcurrentauditor` | 通用申请变更单审批当前审批人 |
| `` | `` | `memoapplyalteribpmstep` | 通用申请变更单审批业务阶段 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memoapplyalterDcs` | `memoapplyalterDcs` | `memoapplyalterDcs` | 通用申请变更单自定义项 |
