---
tags: [BIP, 元数据, 数据字典, znbzbx.manualwithholding.ManualWithholdingBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 手工预提单表体 (`znbzbx.manualwithholding.ManualWithholdingBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_manualwithholding_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 手工预提单表体 |
| 物理表 | `znbz_manualwithholding_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 136 个 |
| 子表 | 1 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ManualWithholdingBUserdefVO` | `znbzbx.manualwithholding.ManualWithholdingBUserdefVO` | composition |

## 关联引用 (32个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `sourcebustype` | `bd_billtyperef` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `contractLedgerId` | `yonbip-ec-contract.clmContractLibRef` |
| `activity` | `` |
| `pk_manualwithholding` | `` |
| `wbs` | `` |
| `` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectNewRef` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_expensebill` | `` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `manualwithholdingBDcs` | `` |
| `voriginbillid` | `` |
| `voriginbillrowid` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (4个, 11字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
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

> 共 136 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `source` | `source` | 来源单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `sourcebill_type` | `sourcebill_type` | `sourcebill_type` | 源单单据类型 |
| `sourcebill_code` | `sourcebill_code` | `sourcebill_code` | 源单编号 |
| `sourcebill_rowid` | `sourcebill_rowid` | `sourcebill_rowid` | 源单明细id |
| `sourcebill_id` | `sourcebill_id` | `sourcebill_id` | 源单id |
| `` | `upcode` | `upcode` | 上游单据号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `voriginbilltype` | `voriginbilltype` | `voriginbilltype` | 原单据类型 |
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

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 通用报销单主表id |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `pk_manualwithholding` | `pk_manualwithholding` | `pk_manualwithholding` | 预提单主表id |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 统一合同id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `sourcebustype` | `sourcebustype` | `sourcebustype` | 源单交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `voriginbillid` | `voriginbillid` | `voriginbillid` | 原单据表头 |
| `voriginbillrowid` | `voriginbillrowid` | `voriginbillrowid` | 原单据表体 |
| `vcurrency` | `vcurrency` | `vcurrency` | 预提币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bfinished` | `bfinished` | `bfinished` | 是否冲销完成 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourcebill_body` | `sourcebill_body` | `sourcebill_body` | 源单关联表体 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `sourceid` | `sourceid` | 业务流来源id |
| `` | `sourceautoid` | `sourceautoid` | 来源单据子表id |

### 数值字段 (63个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ntransuntaxmny` | `ntransuntaxmny` | `ntransuntaxmny` | 长途交通费金额(差旅) |
| `nnattransuntaxmny` | `nnattransuntaxmny` | `nnattransuntaxmny` | 长途交通费金额-本币(差旅) |
| `nhotelinvuntaxmny` | `nhotelinvuntaxmny` | `nhotelinvuntaxmny` | 住宿费金额(差旅) |
| `nnathotelinvuntaxmny` | `nnathotelinvuntaxmny` | `nnathotelinvuntaxmny` | 住宿费金额-本币(差旅) |
| `nmealuntaxmny` | `nmealuntaxmny` | `nmealuntaxmny` | 伙食费金额(差旅) |
| `nnatmealuntaxmny` | `nnatmealuntaxmny` | `nnatmealuntaxmny` | 伙食费金额-本币(差旅) |
| `nintransuntaxmny` | `nintransuntaxmny` | `nintransuntaxmny` | 市内交通费金额(差旅) |
| `nnatintransuntaxmny` | `nnatintransuntaxmny` | `nnatintransuntaxmny` | 市内交通费金额-本币(差旅) |
| `nmiscellansexp` | `nmiscellansexp` | `nmiscellansexp` | 公杂费(差旅) |
| `nnatmiscellansexp` | `nnatmiscellansexp` | `nnatmiscellansexp` | 公杂费-本币(差旅) |
| `nmileagemny` | `nmileagemny` | `nmileagemny` | 里程价税合计(差旅) |
| `nnatmileagemny` | `nnatmileagemny` | `nnatmileagemny` | 里程价税合计-本币(差旅) |
| `nserviceuntaxmny` | `nserviceuntaxmny` | `nserviceuntaxmny` | 服务费金额(差旅) |
| `nnatserviceuntaxmny` | `nnatserviceuntaxmny` | `nnatserviceuntaxmny` | 服务费金额-本币(差旅) |
| `nstationtransuntaxmny` | `nstationtransuntaxmny` | `nstationtransuntaxmny` | 往返场站交通费金额(差旅) |
| `nnatstationtransuntaxmny` | `nnatstationtransuntaxmny` | `nnatstationtransuntaxmny` | 往返场站交通费金额-本币(差旅) |
| `notheruntaxmny` | `notheruntaxmny` | `notheruntaxmny` | 其他费用金额(差旅) |
| `nnatotheruntaxmny` | `nnatotheruntaxmny` | `nnatotheruntaxmny` | 其他费用金额-本币(差旅) |
| `notherwelfaremny1` | `notherwelfaremny1` | `notherwelfaremny1` | 其他补贴1(差旅) |
| `notherwelfaremny2` | `notherwelfaremny2` | `notherwelfaremny2` | 其他补贴2(差旅) |
| `notherwelfaremny3` | `notherwelfaremny3` | `notherwelfaremny3` | 其他补贴3(差旅) |
| `notherwelfaremny4` | `notherwelfaremny4` | `notherwelfaremny4` | 其他补贴4(差旅) |
| `notherwelfaremny5` | `notherwelfaremny5` | `notherwelfaremny5` | 其他补贴5(差旅) |
| `notherwelfaremny6` | `notherwelfaremny6` | `notherwelfaremny6` | 其他补贴6(差旅) |
| `notherwelfaremny7` | `notherwelfaremny7` | `notherwelfaremny7` | 其他补贴7(差旅) |
| `notherwelfaremny8` | `notherwelfaremny8` | `notherwelfaremny8` | 其他补贴8(差旅) |
| `notherwelfaremny9` | `notherwelfaremny9` | `notherwelfaremny9` | 其他补贴9(差旅) |
| `notherwelfaremny10` | `notherwelfaremny10` | `notherwelfaremny10` | 其他补贴10(差旅) |
| `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | `nnatotherwelfaremny1` | 其他补贴1-本币(差旅) |
| `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | `nnatotherwelfaremny2` | 其他补贴2-本币(差旅) |
| `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | `nnatotherwelfaremny3` | 其他补贴3-本币(差旅) |
| `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | `nnatotherwelfaremny4` | 其他补贴4-本币(差旅) |
| `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | `nnatotherwelfaremny5` | 其他补贴5-本币(差旅) |
| `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | `nnatotherwelfaremny6` | 其他补贴6-本币(差旅) |
| `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | `nnatotherwelfaremny7` | 其他补贴7-本币(差旅) |
| `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | `nnatotherwelfaremny8` | 其他补贴8-本币(差旅) |
| `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | `nnatotherwelfaremny9` | 其他补贴9-本币(差旅) |
| `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | `nnatotherwelfaremny10` | 其他补贴10-本币(差旅) |
| `ntotalwelfaremny` | `ntotalwelfaremny` | `ntotalwelfaremny` | 补贴合计(差旅) |
| `nnattotalwelfaremny` | `nnattotalwelfaremny` | `nnattotalwelfaremny` | 补贴合计-本币(差旅) |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 个人支付金额(差旅) |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 个人支付金额-本币(差旅) |
| `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | 企业支付金额(差旅) |
| `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | 企业支付金额-本币(差旅) |
| `nwithholdingmny` | `nwithholdingmny` | `nwithholdingmny` | 预提金额 |
| `nexpcavmny` | `nexpcavmny` | `nexpcavmny` | 核销金额(含未审核) |
| `nredcavmny` | `nredcavmny` | `nredcavmny` | 红冲金额(含未审核) |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatwithholdingmny` | `nnatwithholdingmny` | `nnatwithholdingmny` | 预提金额-本币 |
| `nnatexpcavmny` | `nnatexpcavmny` | `nnatexpcavmny` | 核销金额(含未审核)-本币 |
| `nnatredcavmny` | `nnatredcavmny` | `nnatredcavmny` | 红冲金额(含未审核)-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manualwithholdingBDcs` | `manualwithholdingBDcs` | `manualwithholdingBDcs` | 预提明细自定义项 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `ManualWithholdingBUserdefVO` | 手工预提单子表（自定义项）表 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
