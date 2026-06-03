---
tags: [BIP, 元数据, 数据字典, znbzbx.expensebill.ExpenseBillBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销单子表 (`znbzbx.expensebill.ExpenseBillBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expensebill_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`2e224b3e-7fda-4516-9c3c-33658c1a157d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销单子表 |
| 物理表 | `znbz_expensebill_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 345 个 |
| 子表 | 5 个 |
| 关联引用 | 54 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `invoicerefinfos` | `znbzbx.expensebill.InvoicerefVO` | composition |
| `expensebillbfellows` | `znbzbx.expensebill.ExpenseBillBFellowVO` | composition |
| `expensebillblives` | `znbzbx.expensebill.ExpenseBillBLiveVO` | composition |
| `expenseOfficial` | `znbzbx.expensebill.ExpenseOfficialCardVO` | composition |
| `expensebillbuserdefs` | `znbzbx.expensebill.ExpenseBillBUserdefVO` | composition |

## 关联引用 (54个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `vticketseatgrade` | `znbzbx_seatgraderef` |
| `pk_memoapply_b` | `` |
| `contractLedgerId` | `` |
| `pk_apct_plan` | `apct.apct_planref` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `` | `` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `vapplycurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `pk_begaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_expdutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `pk_expenserecord` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `vhotelstdcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `tax_code_id` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_receptionarchive_matter` | `znbzbx_receptionarchiveref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_memoapply` | `znbzbx_memoapplybref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `activity` | `` |
| `pk_receptionarchive_way` | `znbzbx_receptionarchiveref` |
| `vwelfarestdcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_receptionarchive_type` | `znbzbx_receptionarchiveref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_apct_margin` | `apct.apct_marginref` |
| `pk_fixedassetsinfo` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_costaddr` | `` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_receptionarchive_category` | `znbzbx_receptionarchiveref` |
| `corexchratetype` | `` |
| `whtax_id` | `` |
| `pk_receptionarchive_level` | `znbzbx_receptionarchiveref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |

## 继承接口 (5个, 16字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **通用标准** (`znbzbx.itf.IGenericStandard`)
  - `ngenericstdmny1` → `ngenericstdmny1`
  - `ngenericstdmny2` → `ngenericstdmny2`
  - `ngenericstdmny3` → `ngenericstdmny3`
  - `ngenericstdmny4` → `ngenericstdmny4`
  - `ngenericstdmny5` → `ngenericstdmny5`
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

> 共 345 个直连字段

### 文本字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expapportionrulecode` | `expapportionrulecode` | `expapportionrulecode` | 分摊规则code |
| `exchratedeviation` | `exchratedeviation` | `exchratedeviation` | 汇率偏差率 |
| `vorderid` | `vorderid` | `vorderid` | 订单ID |
| `pk_calendar` | `pk_calendar` | `pk_calendar` | 差旅日历主键 |
| `expapportionruleid` | `expapportionruleid` | `expapportionruleid` | 分摊规则id |
| `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | 分摊规则联动标识 |
| `` | `source` | `source` | 上游单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
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
| `vcontractcode` | `vcontractcode` | `vcontractcode` | 合同号 |
| `vmemoapplybilltype` | `vmemoapplybilltype` | `vmemoapplybilltype` | 事项申请单单据类型 |

### 引用字段 (49个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 记事id |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请id |
| `pk_memoapply_b` | `pk_memoapply_b` | `pk_memoapply_b` | 事项申请子表id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 报销人id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织id |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `pk_expdutyrank` | `pk_expdutyrank` | `pk_expdutyrank` | 报销职级id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 报销人成本中心id |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `whtax_id` | `whtax_id` | `whtax_id` | 代扣税税码 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `pk_receptionarchive_type` | `pk_receptionarchive_type` | `pk_receptionarchive_type` | 招待类型 |
| `pk_receptionarchive_level` | `pk_receptionarchive_level` | `pk_receptionarchive_level` | 招待级别 |
| `pk_receptionarchive_way` | `pk_receptionarchive_way` | `pk_receptionarchive_way` | 招待方式 |
| `pk_receptionarchive_category` | `pk_receptionarchive_category` | `pk_receptionarchive_category` | 会议类别 |
| `pk_receptionarchive_matter` | `pk_receptionarchive_matter` | `pk_receptionarchive_matter` | 会议事项 |
| `pk_costaddr` | `pk_costaddr` | `pk_costaddr` | 发生城市 |
| `pk_fixedassetsinfo` | `pk_fixedassetsinfo` | `pk_fixedassetsinfo` | 固定资产卡片 |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `corexchratetype` | `corexchratetype` | `corexchratetype` | 企业汇率类型 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心id |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地点 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 到达地点 |
| `vticketseatgrade` | `vticketseatgrade` | `vticketseatgrade` | 票面舱位等级id |
| `pk_apct` | `pk_apct` | `pk_apct` | 合同id |
| `pk_apct_plan` | `pk_apct_plan` | `pk_apct_plan` | 付款计划id |
| `pk_apct_margin` | `pk_apct_margin` | `pk_apct_margin` | 履约保证金id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务id |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 职位id |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级id |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 主表id |
| `vcurrency` | `vcurrency` | `vcurrency` | 报销币种id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `vhotelstdcurrency` | `vhotelstdcurrency` | `vhotelstdcurrency` | 住宿费标准币种id |
| `vwelfarestdcurrency` | `vwelfarestdcurrency` | `vwelfarestdcurrency` | 补贴标准币种id |
| `vapplycurrency` | `vapplycurrency` | `vapplycurrency` | 申请币种id |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `denddate` | `denddate` | `denddate` | 结束日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isgenbymergerule` | `isgenbymergerule` | `isgenbymergerule` | 是否账单合并规则生成 |
| `ismergereimburse` | `ismergereimburse` | `ismergereimburse` | 是否合并报销 |
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 是否引用立项申请 |
| `isrelateinvoice` | `isrelateinvoice` | `isrelateinvoice` | 是否关联账单 |
| `splitTax` | `splitTax` | `splitTax` | 是否拆分税额 |
| `ds_iseditrow` | `ds_iseditrow` | `ds_iseditrow` | 是否编辑行 |
| `istransferloan` | `istransferloan` | `istransferloan` | 转借款 |
| `isfinished` | `isfinished` | `isfinished` | 付款已结束 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `servernum` | `servernum` | `servernum` | 招待人数/参会人数 |
| `accompanynum` | `accompanynum` | `accompanynum` | 陪同人数 |
| `meetingdays` | `meetingdays` | `meetingdays` | 住宿天数/会议天数 |
| `journeytype` | `journeytype` | `journeytype` | 出发/返回 |
| `itranstools` | `itranstools` | `itranstools` | 交通工具 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `officialIreftype` | `officialIreftype` | `officialIreftype` | 流水可报销次数 |
| `isendefastatus` | `isendefastatus` | `isendefastatus` | 转固状态 |
| `officialDebtmodel` | `officialDebtmodel` | `officialDebtmodel` | 承债模式 |
| `iintranswelfaretype` | `iintranswelfaretype` | `iintranswelfaretype` | 市内交通费补贴类型 |
| `ihotelwelfaretype` | `ihotelwelfaretype` | `ihotelwelfaretype` | 住宿费补贴类型 |
| `imealwelfaretype` | `imealwelfaretype` | `imealwelfaretype` | 伙食费补贴类型 |
| `itripgrouptype` | `itripgrouptype` | `itripgrouptype` | 报销行程分组类型 |
| `nwelfaredaystype` | `nwelfaredaystype` | `nwelfaredaystype` | 补贴天数计算方式 |
| `itriptype` | `itriptype` | `itriptype` | 行程类型 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mergegroupid` | `mergegroupid` | `mergegroupid` | 账单合并分组id |
| `subsidydetailid` | `subsidydetailid` | `subsidydetailid` | 补贴明细关联id |
| `wht_parentid` | `wht_parentid` | `wht_parentid` | 与代扣税孙表关联的报销明细表字段 |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |
| `pk_expensetrip` | `pk_expensetrip` | `pk_expensetrip` | 报销行程id |
| `pk_expensetripgroup` | `pk_expensetripgroup` | `pk_expensetripgroup` | 报销行程分组id |
| `pk_contractpaycnd` | `pk_contractpaycnd` | `pk_contractpaycnd` | 付款条件 |

### 数值字段 (210个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fellowcount` | `fellowcount` | `fellowcount` | 同行人数 |
| `nmileagemny` | `nmileagemny` | `nmileagemny` | 里程价税合计 |
| `nmileagetaxmny` | `nmileagetaxmny` | `nmileagetaxmny` | 里程税额 |
| `nmileagstdmny` | `nmileagstdmny` | `nmileagstdmny` | 记事总补贴标准 |
| `nnatmileagemny` | `nnatmileagemny` | `nnatmileagemny` | 里程价税合计-本币 |
| `nmileagetaxmny` | `nmileagetaxmny` | `nnatmileagetaxmny` | 里程税额-本币 |
| `nnatmileagstdmny` | `nnatmileagstdmny` | `nnatmileagstdmny` | 记事总补贴标准-本币 |
| `vcontractreceivemny` | `vcontractreceivemny` | `vcontractreceivemny` | 合同收票金额(含税) |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 代扣税税额-本币 |
| `ntotalgenericstdmny1` | `ntotalgenericstdmny1` | `ntotalgenericstdmny1` | 通用标准总计1 |
| `ntotalgenericstdmny2` | `ntotalgenericstdmny2` | `ntotalgenericstdmny2` | 通用标准总计2 |
| `ntotalgenericstdmny3` | `ntotalgenericstdmny3` | `ntotalgenericstdmny3` | 通用标准总计3 |
| `ntotalgenericstdmny4` | `ntotalgenericstdmny4` | `ntotalgenericstdmny4` | 通用标准总计4 |
| `ntotalgenericstdmny5` | `ntotalgenericstdmny5` | `ntotalgenericstdmny5` | 通用标准总计5 |
| `ntotalgenericstdsummny` | `ntotalgenericstdsummny` | `ntotalgenericstdsummny` | 通用标准总计1-5合计 |
| `discount_amount` | `discount_amount` | `discount_amount` | 折扣金额 |
| `tip_amount` | `tip_amount` | `tip_amount` | 额外费用 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提金额 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提金额-本币 |
| `nsettlepromptlymny` | `nsettlepromptlymny` | `nsettlepromptlymny` | 立即结算金额 |
| `nnatsettlepromptlymny` | `nnatsettlepromptlymny` | `nnatsettlepromptlymny` | 立即结算金额-本币 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `nhoteldays` | `nhoteldays` | `nhoteldays` | 住宿天数 |
| `nwelfaredays` | `nwelfaredays` | `nwelfaredays` | 补贴天数 |
| `ntransmny` | `ntransmny` | `ntransmny` | 长途交通费价税合计 |
| `ntickettaxmny` | `ntickettaxmny` | `ntickettaxmny` | 长途交通费可抵扣税额 |
| `nhotelbasestdmny` | `nhotelbasestdmny` | `nhotelbasestdmny` | 住宿费每日标准 |
| `nhotelstdmny` | `nhotelstdmny` | `nhotelstdmny` | 住宿费总标准 |
| `nhotelinvmny` | `nhotelinvmny` | `nhotelinvmny` | 住宿费价税合计 |
| `nhotelinvtaxmny` | `nhotelinvtaxmny` | `nhotelinvtaxmny` | 住宿费可抵扣税额 |
| `nmealbasestdmny` | `nmealbasestdmny` | `nmealbasestdmny` | 伙食费每日补贴标准 |
| `nmealstandard` | `nmealstandard` | `nmealstandard` | 伙食费总补贴标准 |
| `nmealmny` | `nmealmny` | `nmealmny` | 伙食费价税合计 |
| `nintransbasestdmny` | `nintransbasestdmny` | `nintransbasestdmny` | 市内交通每日标准 |
| `nintransstdmny` | `nintransstdmny` | `nintransstdmny` | 市内交通费总补贴标准 |
| `nintranscostmny` | `nintranscostmny` | `nintranscostmny` | 市内交通费发票金额 |
| `nintransmny` | `nintransmny` | `nintransmny` | 市内交通费价税合计 |
| `nmiscellansexpbasestd` | `nmiscellansexpbasestd` | `nmiscellansexpbasestd` | 公杂费每日补贴标准 |
| `nmiscellansexpstd` | `nmiscellansexpstd` | `nmiscellansexpstd` | 公杂费总补贴标准 |
| `nmiscellansexp` | `nmiscellansexp` | `nmiscellansexp` | 公杂费补贴 |
| `notherwelfarebasestdmny1` | `notherwelfarebasestdmny1` | `notherwelfarebasestdmny1` | 其他补贴1每日补贴标准 |
| `notherwelfarestdmny1` | `notherwelfarestdmny1` | `notherwelfarestdmny1` | 其他补贴标准1总补贴标准 |
| `notherwelfaremny1` | `notherwelfaremny1` | `notherwelfaremny1` | 其他补贴1 |
| `notherwelfarebasestdmny2` | `notherwelfarebasestdmny2` | `notherwelfarebasestdmny2` | 其他补贴2每日补贴标准 |
| `notherwelfarestdmny2` | `notherwelfarestdmny2` | `notherwelfarestdmny2` | 其他补贴2总补贴标准 |
| `notherwelfaremny2` | `notherwelfaremny2` | `notherwelfaremny2` | 其他补贴2 |
| `notherwelfarebasestdmny3` | `notherwelfarebasestdmny3` | `notherwelfarebasestdmny3` | 其他补贴3每日补贴标准 |
| `notherwelfarestdmny3` | `notherwelfarestdmny3` | `notherwelfarestdmny3` | 其他补贴3总补贴标准 |
| `notherwelfaremny3` | `notherwelfaremny3` | `notherwelfaremny3` | 其他补贴3 |
| `notherwelfarebasestdmny4` | `notherwelfarebasestdmny4` | `notherwelfarebasestdmny4` | 其他补贴4每日补贴标准 |
| `notherwelfarestdmny4` | `notherwelfarestdmny4` | `notherwelfarestdmny4` | 其他补贴4总补贴标准 |
| `notherwelfaremny4` | `notherwelfaremny4` | `notherwelfaremny4` | 其他补贴4 |
| `notherwelfarebasestdmny5` | `notherwelfarebasestdmny5` | `notherwelfarebasestdmny5` | 其他补贴5每日标准 |
| `notherwelfarestdmny5` | `notherwelfarestdmny5` | `notherwelfarestdmny5` | 其他补贴标准5 |
| `notherwelfaremny5` | `notherwelfaremny5` | `notherwelfaremny5` | 其他补贴5 |
| `notherwelfarebasestdmny6` | `notherwelfarebasestdmny6` | `notherwelfarebasestdmny6` | 其他补贴6每日补贴标准 |
| `notherwelfarestdmny6` | `notherwelfarestdmny6` | `notherwelfarestdmny6` | 其他补贴6总补贴标准 |
| `notherwelfaremny6` | `notherwelfaremny6` | `notherwelfaremny6` | 其他补贴6 |
| `notherwelfarebasestdmny7` | `notherwelfarebasestdmny7` | `notherwelfarebasestdmny7` | 其他补贴7每日补贴标准 |
| `notherwelfarestdmny7` | `notherwelfarestdmny7` | `notherwelfarestdmny7` | 其他补贴7总补贴标准 |
| `notherwelfaremny7` | `notherwelfaremny7` | `notherwelfaremny7` | 其他补贴7 |
| `notherwelfarebasestdmny8` | `notherwelfarebasestdmny8` | `notherwelfarebasestdmny8` | 其他补贴8每日补贴标准 |
| `notherwelfarestdmny8` | `notherwelfarestdmny8` | `notherwelfarestdmny8` | 其他补贴8总补贴标准 |
| `notherwelfaremny8` | `notherwelfaremny8` | `notherwelfaremny8` | 其他补贴8 |
| `notherwelfarebasestdmny9` | `notherwelfarebasestdmny9` | `notherwelfarebasestdmny9` | 其他补贴9每日补贴标准 |
| `nnathotelstdmny` | `nnathotelstdmny` | `nnathotelstdmny` | 住宿费总补贴标准-本币 |
| `notherwelfarestdmny9` | `notherwelfarestdmny9` | `notherwelfarestdmny9` | 其他补贴9总补贴标准 |
| `notherwelfaremny9` | `notherwelfaremny9` | `notherwelfaremny9` | 其他补贴9 |
| `notherwelfarebasestdmny10` | `notherwelfarebasestdmny10` | `notherwelfarebasestdmny10` | 其他补贴10每日补贴标准 |
| `nhotelmny` | `nhotelmny` | `nhotelmny` | 住宿费价税合计 |
| `notherwelfarestdmny10` | `notherwelfarestdmny10` | `notherwelfarestdmny10` | 其他补贴10总补贴标准 |
| `nnathotelmny` | `nnathotelmny` | `nnathotelmny` | 住宿费价税合计-本币 |
| `notherwelfaremny10` | `notherwelfaremny10` | `notherwelfaremny10` | 其他补贴10 |
| `nstdhotelmny` | `nstdhotelmny` | `nstdhotelmny` | 住宿费价税合计-标准币种 |
| `ntotalwelfaremny` | `ntotalwelfaremny` | `ntotalwelfaremny` | 补助合计 |
| `nstationtransmny` | `nstationtransmny` | `nstationtransmny` | 往返场站交通费价税合计 |
| `nothermny` | `nothermny` | `nothermny` | 其他费用价税合计 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 不含税金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 可抵扣税额 |
| `nsummny` | `nsummny` | `nsummny` | 价税合计 |
| `nshouldpaymny` | `nshouldpaymny` | `nshouldpaymny` | 应付额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 核销额 |
| `npaymentmny` | `npaymentmny` | `npaymentmny` | 付款额 |
| `nnatmealstdmny` | `nnatmealstdmny` | `nnatmealstdmny` | 伙食费总补贴标准-本币 |
| `nstdmealmny` | `nstdmealmny` | `nstdmealmny` | 伙食费价税合计-标准币种 |
| `nnatintransstdmny` | `nnatintransstdmny` | `nnatintransstdmny` | 市内交通费总补贴标准-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nstdintransmny` | `nstdintransmny` | `nstdintransmny` | 市内交通费价税合计-标准币种 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |
| `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | 公杂费总补贴标准-本币 |
| `nstdmiscellansexp` | `nstdmiscellansexp` | `nstdmiscellansexp` | 公杂费-标准币种 |
| `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | 其他补贴1总补贴标准-本币 |
| `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | 其他补贴1-标准币种 |
| `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | 其他补贴2总补贴标准-本币 |
| `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | 其他补贴2-标准币种 |
| `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | 其他补贴3总补贴标准-本币 |
| `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | 其他补贴3-标准币种 |
| `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | 其他补贴4总补贴标准-本币 |
| `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | 其他补贴4-标准币种 |
| `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | 其他补贴5总补贴标准-本币 |
| `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | 其他补贴5-标准币种 |
| `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | 其他补贴6总补贴标准-本币 |
| `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | 其他补贴6-标准币种 |
| `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | 其他补贴7总补贴标准-本币 |
| `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | 其他补贴7-标准币种 |
| `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | 其他补贴8总补贴标准-本币 |
| `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | 其他补贴8-标准币种 |
| `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | 其他补贴9总补贴标准-本币 |
| `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | 其他补贴9-标准币种 |
| `nmealcostmny` | `nmealcostmny` | `nmealcostmny` | 伙食费发票金额 |
| `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | 其他补贴10总补贴标准-本币 |
| `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | 其他补贴10-标准币种 |
| `hotelhideexchrate1` | `hotelhideexchrate1` | `hotelhideexchrate1` | 住宿费后台隐含汇率1 |
| `subsidyhideexchrate1` | `subsidyhideexchrate1` | `subsidyhideexchrate1` | 补贴后台隐含汇率1 |
| `hotelhideexchrate2` | `hotelhideexchrate2` | `hotelhideexchrate2` | 住宿费后台隐含汇率2 |
| `subsidyhideexchrate2` | `subsidyhideexchrate2` | `subsidyhideexchrate2` | 补贴后台隐含汇率2 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nnattransmny` | `nnattransmny` | `nnattransmny` | 长途交通费价税合计-本币 |
| `nnattickettaxmny` | `nnattickettaxmny` | `nnattickettaxmny` | 长途交通费可抵扣税额-本币 |
| `nhotelstdexchrate` | `nhotelstdexchrate` | `nhotelstdexchrate` | 住宿费标准币种汇率 |
| `nnathotelinvmny` | `nnathotelinvmny` | `nnathotelinvmny` | 住宿费价税合计-本币 |
| `nstdhotelinvmny` | `nstdhotelinvmny` | `nstdhotelinvmny` | 住宿费发票金额-标准币种 |
| `nnathotelinvtaxmny` | `nnathotelinvtaxmny` | `nnathotelinvtaxmny` | 住宿费可抵扣税额-本币 |
| `nstdtotalmny` | `nstdtotalmny` | `nstdtotalmny` | 报销总额(含企业支付)价税合计-标准币种 |
| `nwelfarestdexchrate` | `nwelfarestdexchrate` | `nwelfarestdexchrate` | 补贴标准币种汇率 |
| `nnatmealcostmny` | `nnatmealcostmny` | `nnatmealcostmny` | 伙食费发票金额-本币 |
| `nstdmealcostmny` | `nstdmealcostmny` | `nstdmealcostmny` | 伙食费发票金额-标准币种 |
| `nnatmealmny` | `nnatmealmny` | `nnatmealmny` | 伙食费价税合计-本币 |
| `nnatintranscostmny` | `nnatintranscostmny` | `nnatintranscostmny` | 市内交通费发票金额-本币 |
| `nstdintranscostmny` | `nstdintranscostmny` | `nstdintranscostmny` | 市内交通费发票金额-标准币种 |
| `nnatintransmny` | `nnatintransmny` | `nnatintransmny` | 市内交通费价税合计-本币 |
| `nnatmiscellansexp` | `nnatmiscellansexp` | `nnatmiscellansexp` | 公杂费补贴-本币 |
| `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | 其他补贴1-本币 |
| `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | 其他补贴2-本币 |
| `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | 其他补贴3-本币 |
| `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | 其他补贴4-本币 |
| `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | 其他补贴5-本币 |
| `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | 其他补贴6-本币 |
| `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | 其他补贴7-本币 |
| `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | 其他补贴8-本币 |
| `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | 其他补贴9-本币 |
| `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | 其他补贴10-本币 |
| `nnattotalwelfaremny` | `nnattotalwelfaremny` | `nnattotalwelfaremny` | 补助合计-本币 |
| `nnatstationtransmny` | `nnatstationtransmny` | `nnatstationtransmny` | 往返场站交通费价税合计-本币 |
| `nnatothermny` | `nnatothermny` | `nnatothermny` | 其他费用价税合计-本币 |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 不含税金额-本币 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 可抵扣税额-本币 |
| `nnatsummny` | `nnatsummny` | `nnatsummny` | 价税合计-本币 |
| `ngenericstdmny5` | `ngenericstdmny5` | `ngenericstdmny5` | 通用标准5 |
| `nnatshouldpaymny` | `nnatshouldpaymny` | `nnatshouldpaymny` | 应付额-本币 |
| `ngenericstdmny4` | `ngenericstdmny4` | `ngenericstdmny4` | 通用标准4 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 核销额-本币 |
| `ngenericstdmny3` | `ngenericstdmny3` | `ngenericstdmny3` | 通用标准3 |
| `nnatpaymentmny` | `nnatpaymentmny` | `nnatpaymentmny` | 付款额-本币 |
| `ngenericstdmny2` | `ngenericstdmny2` | `ngenericstdmny2` | 通用标准2 |
| `nnataccpaymny` | `nnataccpaymny` | `nnataccpaymny` | 累计付款额-本币 |
| `ngenericstdmny1` | `ngenericstdmny1` | `ngenericstdmny1` | 通用标准1 |
| `ntransuntaxmny` | `ntransuntaxmny` | `ntransuntaxmny` | 长途交通费不含税金额 |
| `nnattransuntaxmny` | `nnattransuntaxmny` | `nnattransuntaxmny` | 长途交通费不含税金额-本币 |
| `nhotelinvuntaxmny` | `nhotelinvuntaxmny` | `nhotelinvuntaxmny` | 住宿费不含税金额 |
| `nnathotelinvuntaxmny` | `nnathotelinvuntaxmny` | `nnathotelinvuntaxmny` | 住宿费不含税金额-本币 |
| `nintranstaxmny` | `nintranstaxmny` | `nintranstaxmny` | 市内交通费可抵扣税额 |
| `nnatintranstaxmny` | `nnatintranstaxmny` | `nnatintranstaxmny` | 市内交通费可抵扣税额-本币 |
| `nintransuntaxmny` | `nintransuntaxmny` | `nintransuntaxmny` | 市内交通费不含税金额 |
| `nnatintransuntaxmny` | `nnatintransuntaxmny` | `nnatintransuntaxmny` | 市内交通费不含税金额-本币 |
| `nstationtranstaxmny` | `nstationtranstaxmny` | `nstationtranstaxmny` | 往返场站交通费可抵扣税额 |
| `nnatstationtranstaxmny` | `nnatstationtranstaxmny` | `nnatstationtranstaxmny` | 往返场站交通费可抵扣税额-本币 |
| `nstationtransuntaxmny` | `nstationtransuntaxmny` | `nstationtransuntaxmny` | 往返场站交通费不含税金额 |
| `nnatstationtransuntaxmny` | `nnatstationtransuntaxmny` | `nnatstationtransuntaxmny` | 往返场站交通费不含税金额-本币 |
| `nothertaxmny` | `nothertaxmny` | `nothertaxmny` | 其他费用可抵扣税额 |
| `nnatothertaxmny` | `nnatothertaxmny` | `nnatothertaxmny` | 其他费用可抵扣税额-本币 |
| `notheruntaxmny` | `notheruntaxmny` | `notheruntaxmny` | 其他费用不含税金额 |
| `nnatotheruntaxmny` | `nnatotheruntaxmny` | `nnatotheruntaxmny` | 其他费用不含税金额-本币 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `nmealtaxmny` | `nmealtaxmny` | `nmealtaxmny` | 伙食费可抵扣税额 |
| `nnatmealtaxmny` | `nnatmealtaxmny` | `nnatmealtaxmny` | 伙食费可抵扣税额-本币 |
| `nmealuntaxmny` | `nmealuntaxmny` | `nmealuntaxmny` | 伙食费不含税金额 |
| `nnatmealuntaxmny` | `nnatmealuntaxmny` | `nnatmealuntaxmny` | 伙食费不含税金额-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | 企业支付不含税金额-本币 |
| `nserviceuntaxmny` | `nserviceuntaxmny` | `nserviceuntaxmny` | 服务费不含税金额 |
| `nnatcompanypaymny` | `nnatcompanypaymny` | `nnatcompanypaymny` | 企业支付价税合计-本币 |
| `nservicemny` | `nservicemny` | `nservicemny` | 服务费价税合计 |
| `nnatserviceuntaxmny` | `nnatserviceuntaxmny` | `nnatserviceuntaxmny` | 服务费不含税金额-本币 |
| `nnattotalmny` | `nnattotalmny` | `nnattotalmny` | 报销总额(含企业支付)价税合计-本币 |
| `nnatservicemny` | `nnatservicemny` | `nnatservicemny` | 服务费价税合计-本币 |
| `nnattotaltaxmny` | `nnattotaltaxmny` | `nnattotaltaxmny` | 报销总额(含企业支付)可抵扣税额-本币 |
| `nnatcompanypaytaxmny` | `nnatcompanypaytaxmny` | `nnatcompanypaytaxmny` | 企业支付可抵扣税额-本币 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 报销总额(含企业支付)价税合计 |
| `nnatservicetaxmny` | `nnatservicetaxmny` | `nnatservicetaxmny` | 服务费可抵扣税额-本币 |
| `ncavwithholdingmny` | `ncavwithholdingmny` | `ncavwithholdingmny` | 本次预提核销额 |
| `nnattotaluntaxmny` | `nnattotaluntaxmny` | `nnattotaluntaxmny` | 报销总额(含企业支付)不含税金额-本币 |
| `naccpaymny` | `naccpaymny` | `naccpaymny` | 累计付款额 |
| `ntotaltaxmny` | `ntotaltaxmny` | `ntotaltaxmny` | 报销总额(含企业支付)可抵扣税额 |
| `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | 企业支付不含税金额 |
| `ntotaluntaxmny` | `ntotaluntaxmny` | `ntotaluntaxmny` | 报销总额(含企业支付)不含税金额 |
| `ncompanypaytaxmny` | `ncompanypaytaxmny` | `ncompanypaytaxmny` | 企业支付可抵扣税额 |
| `nservicetaxmny` | `nservicetaxmny` | `nservicetaxmny` | 服务费可抵扣税额 |
| `ncompanypaymny` | `ncompanypaymny` | `ncompanypaymny` | 企业支付价税合计 |
| `nnatcavwithholdingmny` | `nnatcavwithholdingmny` | `nnatcavwithholdingmny` | 本次预提核销额-本币 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `expenseOfficial` | 公务卡流水 |
| `` | `` | `expensebillbfellows` | 报销单明细同行人参照表 |
| `` | `` | `expensebillblives` | 报销单明细同住人参照表 |
| `` | `` | `expensebillbuserdefs` | 报销单子表（自定义项）表 |
| `hotelhideexchrate1Ops` | `hotelhideexchrate1Ops` | `hotelhideexchrate1Ops` | 住宿费后台隐含汇率1折算方式 |
| `hotelhideexchrate2Ops` | `hotelhideexchrate2Ops` | `hotelhideexchrate2Ops` | 住宿费后台隐含汇率2折算方式 |
| `` | `` | `invoicerefinfos` | 报销单明细合同对应发票表 |
| `nhotelstdexchrateOps` | `nhotelstdexchrateOps` | `nhotelstdexchrateOps` | 住宿费标准币种汇率折算方式 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `nwelfarestdexchrateOps` | `nwelfarestdexchrateOps` | `nwelfarestdexchrateOps` | 补贴标准币种汇率折算方式 |
| `subsidyhideexchrate1Ops` | `subsidyhideexchrate1Ops` | `subsidyhideexchrate1Ops` | 补贴后台隐含汇率1折算方式 |
| `subsidyhideexchrate2Ops` | `subsidyhideexchrate2Ops` | `subsidyhideexchrate2Ops` | 补贴后台隐含汇率2折算方式 |
