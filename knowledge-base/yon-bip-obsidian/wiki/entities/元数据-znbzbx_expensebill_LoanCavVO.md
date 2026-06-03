---
tags: [BIP, 元数据, 数据字典, znbzbx.expensebill.LoanCavVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销单借款核销 (`znbzbx.expensebill.LoanCavVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loancav` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销单借款核销 |
| 物理表 | `znbz_loancav` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 91 个 |
| 子表 | 1 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loancavuserdefs` | `znbzbx.expensebill.LoanCavUserdefVO` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_loanbill` | `znbzbx_loanbillref` |
| `cloanfinacecostcenter` | `finbd.bd_costcenterref` |
| `contractLedgerId` | `` |
| `activity` | `` |
| `pk_apct_plan` | `apct.apct_planref` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `vloanchandleorg` | `` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `pk_loanbill_b` | `` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `tenant_id` | `` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `cloanfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `` | `` |
| `vloanfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `vloancurrency` | `ucfbasedoc.bd_currencytenantref` |
| `caccountorg` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_loanpsn` | `ucf-staff-center.bd_staff_ref` |
| `pk_memoapply` | `` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cloancostcenter` | `finbd.bd_costcenterref` |
| `vloandeptid` | `ucf-org-center.bd_adminorgsharetreeref` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 91 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_loanbilltype` | `pk_loanbilltype` | `pk_loanbilltype` | 借款单据类型 |
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

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `vloanchandleorg` | `vloanchandleorg` | `vloanchandleorg` | 报销人组织 |
| `pk_loanbill` | `pk_loanbill` | `pk_loanbill` | 借款单主键 |
| `pk_loanbill_b` | `pk_loanbill_b` | `pk_loanbill_b` | 借款单子表主键 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_apct` | `pk_apct` | `pk_apct` | 合同id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `pk_apct_plan` | `pk_apct_plan` | `pk_apct_plan` | 付款计划id |
| `vloandeptid` | `vloandeptid` | `vloandeptid` | 借款人部门id |
| `pk_loanpsn` | `pk_loanpsn` | `pk_loanpsn` | 借款人id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `vloanfinacedeptid` | `vloanfinacedeptid` | `vloanfinacedeptid` | 借款费用承担部门id |
| `cloanfinaceorg` | `cloanfinaceorg` | `cloanfinaceorg` | 借款费用承担组织id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `cloancostcenter` | `cloancostcenter` | `cloancostcenter` | 借款人成本中心id |
| `cloanfinacecostcenter` | `cloanfinacecostcenter` | `cloanfinacecostcenter` | 借款费用承担成本中心id |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 主表id |
| `vloancurrency` | `vloancurrency` | `vloancurrency` | 借款币种id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bcav` | `bcav` | `bcav` | 核销 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nfinalsummnybody` | `nfinalsummnybody` | `nfinalsummnybody` | 实际付款金额 |
| `nacctransferloanmny` | `nacctransferloanmny` | `nacctransferloanmny` | 累计转交金额 |
| `nnatfinalsummnybody` | `nnatfinalsummnybody` | `nnatfinalsummnybody` | 实际付款金额-本币 |
| `nnatacctransferloanmny` | `nnatacctransferloanmny` | `nnatacctransferloanmny` | 累计转交金额-本币 |
| `noccupiedmny` | `noccupiedmny` | `noccupiedmny` | 本单占用金额 |
| `nnatoccupiedmny` | `nnatoccupiedmny` | `nnatoccupiedmny` | 本单占用金额-本币 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款额 |
| `nacccavmny` | `nacccavmny` | `nacccavmny` | 核销额(含未审核) |
| `naccreturnmny` | `naccreturnmny` | `naccreturnmny` | 还款额(含未审核) |
| `ntotalcavmny` | `ntotalcavmny` | `ntotalcavmny` | 余额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 本次核销 |
| `nuncavmny` | `nuncavmny` | `nuncavmny` | 剩余未还金额 |
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
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款/预付额-本币 |
| `nnatacccavmny` | `nnatacccavmny` | `nnatacccavmny` | 核销额(含未审核)-本币 |
| `nnataccreturnmny` | `nnataccreturnmny` | `nnataccreturnmny` | 还款额(含未审核)-本币 |
| `nnattotalcavmny` | `nnattotalcavmny` | `nnattotalcavmny` | 余额-本币 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 本次核销-本币 |
| `nnatuncavmny` | `nnatuncavmny` | `nnatuncavmny` | 剩余金额-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 本次还款额 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 本次还款额-本币 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `loancavuserdefs` | 报销单借款核销（自定义项）表 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
