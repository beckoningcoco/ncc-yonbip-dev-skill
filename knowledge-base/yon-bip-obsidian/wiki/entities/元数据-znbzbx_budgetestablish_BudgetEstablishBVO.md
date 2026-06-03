---
tags: [BIP, 元数据, 数据字典, znbzbx.budgetestablish.BudgetEstablishBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算编制子表 (`znbzbx.budgetestablish.BudgetEstablishBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_budgetestablish_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算编制子表 |
| 物理表 | `znbz_budgetestablish_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 82 个 |
| 子表 | 1 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `BudgetBillRelationVO` | `znbzbx.budgetestablish.BudgetBillRelationVO` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `period_half_year_id` | `` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `pk_budgetestablish` | `` |
| `activity` | `yonbip-pm-projectme.project_activity_ref` |
| `pk_budget_ref` | `yonbip-pm-commonbd.bgdm_budget_ref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectNewRef` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `period_quarter_id` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_budgetsubject_ref` | `yonbip-pm-commonbd.bgdm_budgetsubject_ref` |
| `costcenter` | `finbd.bd_costcenterref` |
| `tenant_id` | `` |
| `pk_period` | `finbd.bd_period` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_periodyear` | `finbd.bd_periodyear` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `budgetEstablishBDcs` | `` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `budget_establish_bus_type` | `` |
| `pk_budgetmodeldef` | `znbzbx.znbzbx_budgetmodeldefref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `staffId` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 82 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budget_establish_code` | `budget_establish_code` | `budgetEstablishCode` | 编制单号 |
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

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `period_quarter_id` | `period_quarter_id` | `periodQuarterId` | 期间(季)id |
| `budget_establish_bus_type` | `budget_establish_bus_type` | `budgetEstablishBusType` | 编制单交易类型 |
| `period_half_year_id` | `period_half_year_id` | `periodHalfYearId` | 期间(半年)id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_budgetestablish` | `pk_budgetestablish` | `pk_budgetestablish` | 主表主键 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 编制人id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 编制人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 编制人组织id |
| `staffId` | `staffId` | `staffId` | 员工id |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `costcenter` | `costcenter` | `costcenter` | 成本中心id |
| `pk_period` | `pk_period` | `pk_period` | 期间id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商id |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户id |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种id |
| `pk_budget_ref` | `pk_budget_ref` | `pk_budget_ref` | 预算科目表id |
| `pk_budgetmodeldef` | `pk_budgetmodeldef` | `pk_budgetmodeldef` | 预算模型id |
| `wbs` | `wbs` | `wbs` | WBS |
| `pk_budgetsubject_ref` | `pk_budgetsubject_ref` | `pk_budgetsubject_ref` | 预算科目id |
| `activity` | `activity` | `activity` | 项目活动id |
| `pk_periodyear` | `pk_periodyear` | `pk_periodyear` | 期间(年)id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `denddate` | `denddate` | `denddate` | 结束日期 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supplementary_budget` | `supplementary_budget` | `supplementaryBudget` | 调整单补录预算 |
| `ibudgettype` | `ibudgettype` | `ibudgettype` | 编制类型 |
| `ieffectstatus` | `ieffectstatus` | `ieffectstatus` | 生效状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `revision_count` | `revision_count` | `revisionCount` | 调整次数 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vlastbillrowid` | `vlastbillrowid` | `vlastbillrowid` | 来源单据行id |
| `id` | `id` | `id` | ID |
| `budget_establish_detail_id` | `budget_establish_detail_id` | `budgetEstablishDetailId` | 编制单明细id |
| `budget_establish_id` | `budget_establish_id` | `budgetEstablishId` | 编制单id |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual` | `actual` | `actual` | 执行数 |
| `before_actual` | `before_actual` | `before_actual` | 预占数 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `budget_surplus` | `budget_surplus` | `budgetSurplus` | 剩余预算 |
| `ninitmny` | `ninitmny` | `ninitmny` | 初始预算数 |
| `nbeforeadjmny` | `nbeforeadjmny` | `nbeforeadjmny` | 调整前预算数 |
| `nadjmny` | `nadjmny` | `nadjmny` | 本次调整数 |
| `nfinalmny` | `nfinalmny` | `nfinalmny` | 预算数 |
| `nbegoccupymny` | `nbegoccupymny` | `nbegoccupymny` | 期初占用 |
| `nbegexcmny` | `nbegexcmny` | `nbegexcmny` | 期初执行 |
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

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budgetEstablishBDcs` | `budgetEstablishBDcs` | `budgetEstablishBDcs` | 编制明细自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `BudgetBillRelationVO` | 预算编制生单记录表 |
