---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.MemoApplyBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事项申请单子表 (`znbzbx.memoapply.MemoApplyBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事项申请单子表 |
| 物理表 | `znbz_memoapply_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 256 个 |
| 子表 | 3 个 |
| 关联引用 | 38 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MemoApplyBUserdefVO` | `znbzbx.memoapply.MemoApplyBUserdefVO` | composition |
| `memoapplybfellows` | `znbzbx.memoapply.MemoApplyBFellowVO` | composition |
| `memoapplyblives` | `znbzbx.memoapply.MemoApplyBLiveVO` | composition |

## 关联引用 (38个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `vticketseatgrade` | `znbzbx_seatgraderef` |
| `activity` | `` |
| `pk_receptionarchive_way` | `znbzbx_receptionarchiveref` |
| `vwelfarestdcurrency` | `` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `pk_receptionarchive_type` | `znbzbx_receptionarchiveref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_begaddr` | `ucfbasedoc.bd_countryaddbuttonref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `vsubstdcurrency` | `` |
| `pk_costaddr` | `` |
| `pk_projectapply_b` | `` |
| `` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_receptionarchive_category` | `znbzbx_receptionarchiveref` |
| `vhotelstdcurrency` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_receptionarchive_matter` | `znbzbx_receptionarchiveref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_memoapply` | `` |
| `pk_receptionarchive_level` | `znbzbx_receptionarchiveref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (5个, 16字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **通用标准** (`znbzbx.itf.IGenericStandard`)
  - `ngenericstdmny1` → `ngenericstdmny1`
  - `ngenericstdmny2` → `ngenericstdmny2`
  - `ngenericstdmny3` → `ngenericstdmny3`
  - `ngenericstdmny4` → `ngenericstdmny4`
  - `ngenericstdmny5` → `ngenericstdmny5`
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

> 共 256 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `joblistid` | `joblistid` | `joblistid` | 任职ID |
| `pk_calendar` | `pk_calendar` | `pk_calendar` | 差旅日历主键 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `vtravalreason` | `vtravalreason` | `vtravalreason` | 申请事由 |
| `dbegintime` | `dbegintime` | `dbegintime` | 出差起始时间 |
| `dendtime` | `dendtime` | `dendtime` | 出差截止时间 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
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
| `vdef11` | `vdef11` | `vdef11` | 自定义项11 |
| `vdef12` | `vdef12` | `vdef12` | 自定义项12 |
| `vdef13` | `vdef13` | `vdef13` | 自定义项13 |
| `vdef14` | `vdef14` | `vdef14` | 自定义项14 |
| `vdef15` | `vdef15` | `vdef15` | 自定义项15 |
| `vdef16` | `vdef16` | `vdef16` | 自定义项16 |
| `vdef17` | `vdef17` | `vdef17` | 自定义项17 |
| `vdef18` | `vdef18` | `vdef18` | 自定义项18 |
| `vdef19` | `vdef19` | `vdef19` | 自定义项19 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |

### 引用字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_receptionarchive_type` | `pk_receptionarchive_type` | `pk_receptionarchive_type` | 招待类型 |
| `pk_receptionarchive_level` | `pk_receptionarchive_level` | `pk_receptionarchive_level` | 招待级别 |
| `pk_receptionarchive_way` | `pk_receptionarchive_way` | `pk_receptionarchive_way` | 招待方式 |
| `pk_receptionarchive_category` | `pk_receptionarchive_category` | `pk_receptionarchive_category` | 会议类别 |
| `pk_receptionarchive_matter` | `pk_receptionarchive_matter` | `pk_receptionarchive_matter` | 会议事项 |
| `pk_costaddr` | `pk_costaddr` | `pk_costaddr` | 发生城市 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_projectapply_b` | `pk_projectapply_b` | `pk_projectapply_b` | 立项申请明细外键 |
| `vhotelstdcurrency` | `vhotelstdcurrency` | `vhotelstdcurrency` | 住宿费标准币种 |
| `vsubstdcurrency` | `vsubstdcurrency` | `vsubstdcurrency` | 标准币种 |
| `vticketseatgrade` | `vticketseatgrade` | `vticketseatgrade` | 票面舱位等级 |
| `vwelfarestdcurrency` | `vwelfarestdcurrency` | `vwelfarestdcurrency` | 补贴标准币种 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 通用申请单主表id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 申请人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 申请人组织id |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 申请人成本中心id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地id |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 目的地id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务id |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级id |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 出差起始日期 |
| `denddate` | `denddate` | `denddate` | 出差截止日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isapplyreffinished` | `isapplyreffinished` | `isapplyreffinished` | 是否申请参照完成 |
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 申请类型 |
| `istransfer` | `istransfer` | `istransfer` | 是否中转 |
| `isfinished` | `isfinished` | `isfinished` | 是否报销参照完成 |
| `isloanfinished` | `isloanfinished` | `isloanfinished` | 是否借款/预付参照完成 |
| `isclose` | `isclose` | `isclose` | 是否关闭 |
| `isapctfinished` | `isapctfinished` | `isapctfinished` | 是否合同参照完成 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `servernum` | `servernum` | `servernum` | 招待人数/参会人数 |
| `accompanynum` | `accompanynum` | `accompanynum` | 陪同人数 |
| `meetingdays` | `meetingdays` | `meetingdays` | 住宿天数/会议天数 |
| `journeytype` | `journeytype` | `journeytype` | 出发/返回 |
| `itranstools` | `itranstools` | `itranstools` | 交通工具 |
| `ibxfeetype` | `ibxfeetype` | `ibxfeetype` | 费用类型 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ihotelwelfaretype` | `ihotelwelfaretype` | `ihotelwelfaretype` | 住宿补贴类型 |
| `iintranswelfaretype` | `iintranswelfaretype` | `iintranswelfaretype` | 市内交通费补贴类型 |
| `imealwelfaretype` | `imealwelfaretype` | `imealwelfaretype` | 伙食费补贴类型 |
| `isubsidtype` | `isubsidtype` | `isubsidtype` | 补贴类型 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `subsidydetailid` | `subsidydetailid` | `subsidydetailid` | 补贴明细关联id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |

### 数值字段 (153个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fellowcount` | `fellowcount` | `fellowcount` | 出行人数 |
| `hotelhideexchrate1` | `hotelhideexchrate1` | `hotelhideexchrate1` | 住宿费后台隐含汇率1 |
| `hotelhideexchrate2` | `hotelhideexchrate2` | `hotelhideexchrate2` | 住宿费后台隐含汇率2 |
| `napplyrefmny` | `napplyrefmny` | `napplyrefmny` | 申请参照金额 |
| `napplyrelmny` | `napplyrelmny` | `napplyrelmny` | 申请释放金额 |
| `nhotelbasestdmny` | `nhotelbasestdmny` | `nhotelbasestdmny` | 住宿费每日标准 |
| `nhoteldays` | `nhoteldays` | `nhoteldays` | 住宿天数 |
| `nhotelmny` | `nhotelmny` | `nhotelmny` | 住宿费申请金额 |
| `nhotelstdexchrate` | `nhotelstdexchrate` | `nhotelstdexchrate` | 住宿费标准币种汇率 |
| `nhotelstdmny` | `nhotelstdmny` | `nhotelstdmny` | 住宿费总标准 |
| `nintransbasestdmny` | `nintransbasestdmny` | `nintransbasestdmny` | 市内交通费每日标准 |
| `nintransmny` | `nintransmny` | `nintransmny` | 市内交通费申请金额 |
| `nintransstdmny` | `nintransstdmny` | `nintransstdmny` | 市内交通费总标准 |
| `nmealbasestdmny` | `nmealbasestdmny` | `nmealbasestdmny` | 伙食费每日标准 |
| `nphotelmny` | `nphotelmny` | `nphotelmny` | 住宿费预估金额 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提金额 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提金额-本币 |
| `ntotalgenericstdmny1` | `ntotalgenericstdmny1` | `ntotalgenericstdmny1` | 通用标准总计1 |
| `ntotalgenericstdmny2` | `ntotalgenericstdmny2` | `ntotalgenericstdmny2` | 通用标准总计2 |
| `ntotalgenericstdmny3` | `ntotalgenericstdmny3` | `ntotalgenericstdmny3` | 通用标准总计3 |
| `ntotalgenericstdmny4` | `ntotalgenericstdmny4` | `ntotalgenericstdmny4` | 通用标准总计4 |
| `ntotalgenericstdmny5` | `ntotalgenericstdmny5` | `ntotalgenericstdmny5` | 通用标准总计5 |
| `ntotalgenericstdsummny` | `ntotalgenericstdsummny` | `ntotalgenericstdsummny` | 通用标准总计1-5合计 |
| `nnatestimatedamount` | `nnatestimatedamount` | `nnatestimatedamount` | 预估金额-本币 |
| `ntransmny` | `ntransmny` | `ntransmny` | 长途交通申请金额 |
| `nnatpotherbbenefits` | `nnatpotherbbenefits` | `nnatpotherbbenefits` | 补贴及其他预估金额-本币 |
| `npotherbbenefits` | `npotherbbenefits` | `npotherbbenefits` | 补贴及其他预估金额 |
| `nestimatedamount` | `nestimatedamount` | `nestimatedamount` | 预估金额 |
| `nptransmny` | `nptransmny` | `nptransmny` | 长途交通预估金额 |
| `npintransmny` | `npintransmny` | `npintransmny` | 市内交通预估金额 |
| `nnatphotelmny` | `nnatphotelmny` | `nnatphotelmny` | 住宿费预估金额-本币 |
| `nnattransmny` | `nnattransmny` | `nnattransmny` | 长途交通申请金额-本币 |
| `nnatpintransmny` | `nnatpintransmny` | `nnatpintransmny` | 市内交通预估金额-本币 |
| `nnatptransmny` | `nnatptransmny` | `nnatptransmny` | 长途交通预估金额-本币 |
| `nmealmny` | `nmealmny` | `nmealmny` | 伙食费申请金额 |
| `nmealstandard` | `nmealstandard` | `nmealstandard` | 伙食费总标准 |
| `nmiscellansexp` | `nmiscellansexp` | `nmiscellansexp` | 公杂费申请金额 |
| `nmiscellansexpbasestd` | `nmiscellansexpbasestd` | `nmiscellansexpbasestd` | 公杂费每日标准 |
| `nmiscellansexpstd` | `nmiscellansexpstd` | `nmiscellansexpstd` | 公杂费总标准 |
| `nnathotelmny` | `nnathotelmny` | `nnathotelmny` | 住宿费申请金额-本币 |
| `nnathotelstdmny` | `nnathotelstdmny` | `nnathotelstdmny` | 住宿费总补贴标准-本币 |
| `nnatintransmny` | `nnatintransmny` | `nnatintransmny` | 市内交通费申请金额-本币 |
| `nnatintransstdmny` | `nnatintransstdmny` | `nnatintransstdmny` | 市内交通费总补贴标准-本币 |
| `nnatmealmny` | `nnatmealmny` | `nnatmealmny` | 伙食费申请金额-本币 |
| `nnatmealstdmny` | `nnatmealstdmny` | `nnatmealstdmny` | 伙食费总补贴标准-本币 |
| `nnatmiscellansexp` | `nnatmiscellansexp` | `nnatmiscellansexp` | 公杂费申请金额-本币 |
| `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | 公杂费总补贴标准-本币 |
| `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | 其他补贴1-本币 |
| `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | 其他补贴10-本币 |
| `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | 其他补贴2-本币 |
| `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | 其他补贴3-本币 |
| `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | 其他补贴4-本币 |
| `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | 其他补贴5-本币 |
| `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | 其他补贴6-本币 |
| `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | 其他补贴7-本币 |
| `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | 其他补贴8-本币 |
| `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | 其他补贴9-本币 |
| `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | 其他补贴1总补贴标准-本币 |
| `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | 其他补贴10总补贴标准-本币 |
| `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | 其他补贴2总补贴标准-本币 |
| `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | 其他补贴3总补贴标准-本币 |
| `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | 其他补贴4总补贴标准-本币 |
| `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | 其他补贴5总补贴标准-本币 |
| `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | 其他补贴6总补贴标准-本币 |
| `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | 其他补贴7总补贴标准-本币 |
| `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | 其他补贴8总补贴标准-本币 |
| `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | 其他补贴9总补贴标准-本币 |
| `nnatsubtotalstdmny` | `nnatsubtotalstdmny` | `nnatsubtotalstdmny` | 总补贴标准-本币 |
| `nnattotalwelfaremny` | `nnattotalwelfaremny` | `nnattotalwelfaremny` | 补助合计-本币 |
| `notherwelfarebasestdmny1` | `notherwelfarebasestdmny1` | `notherwelfarebasestdmny1` | 其他补贴1每日标准 |
| `notherwelfarebasestdmny10` | `notherwelfarebasestdmny10` | `notherwelfarebasestdmny10` | 其他补贴10每日标准 |
| `notherwelfarebasestdmny2` | `notherwelfarebasestdmny2` | `notherwelfarebasestdmny2` | 其他补贴2每日标准 |
| `notherwelfarebasestdmny3` | `notherwelfarebasestdmny3` | `notherwelfarebasestdmny3` | 其他补贴3每日标准 |
| `notherwelfarebasestdmny4` | `notherwelfarebasestdmny4` | `notherwelfarebasestdmny4` | 其他补贴4每日标准 |
| `notherwelfarebasestdmny5` | `notherwelfarebasestdmny5` | `notherwelfarebasestdmny5` | 其他补贴5每日标准 |
| `notherwelfarebasestdmny6` | `notherwelfarebasestdmny6` | `notherwelfarebasestdmny6` | 其他补贴6每日标准 |
| `notherwelfarebasestdmny7` | `notherwelfarebasestdmny7` | `notherwelfarebasestdmny7` | 其他补贴7每日标准 |
| `notherwelfarebasestdmny8` | `notherwelfarebasestdmny8` | `notherwelfarebasestdmny8` | 其他补贴8每日标准 |
| `notherwelfarebasestdmny9` | `notherwelfarebasestdmny9` | `notherwelfarebasestdmny9` | 其他补贴9每日标准 |
| `notherwelfaremny1` | `notherwelfaremny1` | `notherwelfaremny1` | 其他补贴1 |
| `notherwelfaremny10` | `notherwelfaremny10` | `notherwelfaremny10` | 其他补贴10 |
| `notherwelfaremny2` | `notherwelfaremny2` | `notherwelfaremny2` | 其他补贴2 |
| `notherwelfaremny3` | `notherwelfaremny3` | `notherwelfaremny3` | 其他补贴3 |
| `notherwelfaremny4` | `notherwelfaremny4` | `notherwelfaremny4` | 其他补贴4 |
| `notherwelfaremny5` | `notherwelfaremny5` | `notherwelfaremny5` | 其他补贴5 |
| `notherwelfaremny6` | `notherwelfaremny6` | `notherwelfaremny6` | 其他补贴6 |
| `notherwelfaremny7` | `notherwelfaremny7` | `notherwelfaremny7` | 其他补贴7 |
| `notherwelfaremny8` | `notherwelfaremny8` | `notherwelfaremny8` | 其他补贴8 |
| `notherwelfaremny9` | `notherwelfaremny9` | `notherwelfaremny9` | 其他补贴9 |
| `notherwelfarestdmny1` | `notherwelfarestdmny1` | `notherwelfarestdmny1` | 其他补贴1总标准 |
| `notherwelfarestdmny10` | `notherwelfarestdmny10` | `notherwelfarestdmny10` | 其他补贴10总标准 |
| `notherwelfarestdmny2` | `notherwelfarestdmny2` | `notherwelfarestdmny2` | 其他补贴2总标准 |
| `notherwelfarestdmny3` | `notherwelfarestdmny3` | `notherwelfarestdmny3` | 其他补贴3总标准 |
| `notherwelfarestdmny4` | `notherwelfarestdmny4` | `notherwelfarestdmny4` | 其他补贴4总标准 |
| `notherwelfarestdmny5` | `notherwelfarestdmny5` | `notherwelfarestdmny5` | 其他补贴5总标准 |
| `notherwelfarestdmny6` | `notherwelfarestdmny6` | `notherwelfarestdmny6` | 其他补贴6总标准 |
| `notherwelfarestdmny7` | `notherwelfarestdmny7` | `notherwelfarestdmny7` | 其他补贴7总标准 |
| `notherwelfarestdmny8` | `notherwelfarestdmny8` | `notherwelfarestdmny8` | 其他补贴8总标准 |
| `notherwelfarestdmny9` | `notherwelfarestdmny9` | `notherwelfarestdmny9` | 其他补贴9总标准 |
| `nstdapplymny` | `nstdapplymny` | `nstdapplymny` | 申请金额-标准币种 |
| `nstdhotelmny` | `nstdhotelmny` | `nstdhotelmny` | 住宿费申请金额-标准币种 |
| `nstdintransmny` | `nstdintransmny` | `nstdintransmny` | 市内交通费申请金额-标准币种 |
| `nstdmealmny` | `nstdmealmny` | `nstdmealmny` | 伙食费申请金额-标准币种 |
| `nstdmiscellansexp` | `nstdmiscellansexp` | `nstdmiscellansexp` | 公杂费申请金额-标准币种 |
| `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | 其他补贴1-标准币种 |
| `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | 其他补贴10-标准币种 |
| `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | 其他补贴2-标准币种 |
| `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | 其他补贴3-标准币种 |
| `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | 其他补贴4-标准币种 |
| `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | 其他补贴5-标准币种 |
| `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | 其他补贴6-标准币种 |
| `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | 其他补贴7-标准币种 |
| `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | 其他补贴8-标准币种 |
| `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | 其他补贴9-标准币种 |
| `nsubbasestdmny` | `nsubbasestdmny` | `nsubbasestdmny` | 每日补贴标准 |
| `nsubsiddays` | `nsubsiddays` | `nsubsiddays` | 差标天数 |
| `nsubtotalstd` | `nsubtotalstd` | `nsubtotalstd` | 总补贴标准 |
| `ntotalwelfaremny` | `ntotalwelfaremny` | `ntotalwelfaremny` | 补助合计 |
| `nwelfaredays` | `nwelfaredays` | `nwelfaredays` | 补贴天数 |
| `nwelfarestdexchrate` | `nwelfarestdexchrate` | `nwelfarestdexchrate` | 补贴标准币种汇率 |
| `subsidyhideexchrate1` | `subsidyhideexchrate1` | `subsidyhideexchrate1` | 补贴后台隐含汇率1 |
| `subsidyhideexchrate2` | `subsidyhideexchrate2` | `subsidyhideexchrate2` | 补贴后台隐含汇率2 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `nfinishmny` | `nfinishmny` | `nfinishmny` | 报销参照金额 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款/预付参照金额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 已核销金额 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 还款/退款额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ngenericstdmny5` | `ngenericstdmny5` | `ngenericstdmny5` | 通用标准5 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ngenericstdmny4` | `ngenericstdmny4` | `ngenericstdmny4` | 通用标准4 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ngenericstdmny3` | `ngenericstdmny3` | `ngenericstdmny3` | 通用标准3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ngenericstdmny2` | `ngenericstdmny2` | `ngenericstdmny2` | 通用标准2 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ngenericstdmny1` | `ngenericstdmny1` | `ngenericstdmny1` | 通用标准1 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |
| `napctmny` | `napctmny` | `napctmny` | 合同参照金额 |
| `napctfinishmny` | `napctfinishmny` | `napctfinishmny` | 合同已执行金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 基准汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatapplymny` | `nnatapplymny` | `nnatapplymny` | 申请金额-本币 |
| `nnatfinishmny` | `nnatfinishmny` | `nnatfinishmny` | 报销参照金额-本币 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款/预付参照金额-本币 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 还款/退款额 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 还款/退款额-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### other (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `hotelhideexchrate1Ops` | `hotelhideexchrate1Ops` | `hotelhideexchrate1Ops` | 住宿费后台隐含汇率1折算方式 |
| `subsidyhideexchrate1Ops` | `subsidyhideexchrate1Ops` | `subsidyhideexchrate1Ops` | 补贴后台隐含汇率1折算方式 |
| `hotelhideexchrate2Ops` | `hotelhideexchrate2Ops` | `hotelhideexchrate2Ops` | 住宿费后台隐含汇率2折算方式 |
| `subsidyhideexchrate2Ops` | `subsidyhideexchrate2Ops` | `subsidyhideexchrate2Ops` | 补贴后台隐含汇率2折算方式 |
| `nhotelstdexchrateOps` | `nhotelstdexchrateOps` | `nhotelstdexchrateOps` | 住宿费标准币种汇率折算方式 |
| `nwelfarestdexchrateOps` | `nwelfarestdexchrateOps` | `nwelfarestdexchrateOps` | 补贴标准币种汇率折算方式 |
| `` | `` | `MemoApplyBUserdefVO` | 事项申请单子表（自定义项）表 |
| `` | `` | `memoapplybfellows` | 出差申请单明细同行人参照表 |
| `` | `` | `memoapplyblives` | 出差申请单明细同住人参照表 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
