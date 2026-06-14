---
tags: [BIP, 元数据, 数据字典, znbzbx.deferexpensedetail.DeferExpenseDetailBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 摊销明细单表体 (`znbzbx.deferexpensedetail.DeferExpenseDetailBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_deferexpensedetail_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 摊销明细单表体 |
| 物理表 | `znbz_deferexpensedetail_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 46 个 |
| 子表 | 0 个 |
| 关联引用 | 22 个 |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `activity` | `` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `deferExpenseDetailBDcs` | `` |
| `wbs` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_project` | `ucfbasedoc.bd_projectNewRef` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `pk_deferexpensedetail` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `tenant_id` | `` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vmemo` | `vmemo` | `vmemo` | 备注 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_deferexpensedetail` | `pk_deferexpensedetail` | `pk_deferexpensedetail` | 摊销明细单主表id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `vcurrency` | `vcurrency` | `vcurrency` | 摊销币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `vlastbillrowid` | `vlastbillrowid` | `vlastbillrowid` | 上游单据行id |

### 数值字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nthismny` | `nthismny` | `nthismny` | 本期摊销金额 |
| `nmny` | `nmny` | `nmny` | 金额 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 已摊销金额 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 不含税金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatmny` | `nnatmny` | `nnatmny` | 本币金额 |
| `nnattotalmny` | `nnattotalmny` | `nnattotalmny` | 已摊销金额-本币 |
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 不含税金额-本币 |
| `nnatthismny` | `nnatthismny` | `nnatthismny` | 本期摊销金额-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nnattotaluntaxmny` | `nnattotaluntaxmny` | `nnattotaluntaxmny` | 已摊销不含税金额-本币 |
| `nnatthisuntaxmny` | `nnatthisuntaxmny` | `nnatthisuntaxmny` | 本期摊销不含税金额-本币 |
| `nnatdeducttaxmny` | `nnatdeducttaxmny` | `nnatdeducttaxmny` | 可抵扣税额-本币 |
| `ntotaluntaxmny` | `ntotaluntaxmny` | `ntotaluntaxmny` | 已摊销不含税金额 |
| `nthisuntaxmny` | `nthisuntaxmny` | `nthisuntaxmny` | 本期摊销不含税金额 |
| `ndeducttaxmny` | `ndeducttaxmny` | `ndeducttaxmny` | 可抵扣税额 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deferExpenseDetailBDcs` | `deferExpenseDetailBDcs` | `deferExpenseDetailBDcs` | 摊销明细单表体自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
