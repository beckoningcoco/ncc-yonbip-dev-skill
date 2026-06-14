---
tags: [BIP, 元数据, 数据字典, znbzbx.travelexpensebill.TravelLoanCavVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 差旅费报销单借款核销 (`znbzbx.travelexpensebill.TravelLoanCavVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loancav` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 差旅费报销单借款核销 |
| 物理表 | `znbz_loancav` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 92 个 |
| 子表 | 1 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loancavuserdefs` | `znbzbx.travelexpensebill.TravelLoanCavUserdefVO` | composition |

## 关联引用 (30个)

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
| `pk_cusdoc` | `productcenter.aa_vendor` |
| `pk_loanbill_b` | `` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `tenant_id` | `` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `cloanfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `loancavDcs` | `` |
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

## 字段列表（按类型分组）

> 共 92 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_loanbilltype` | `pk_loanbilltype` | `pk_loanbilltype` | 借款单据类型 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
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
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `vloanchandleorg` | `vloanchandleorg` | `vloanchandleorg` | 报销人组织 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `cloancostcenter` | `cloancostcenter` | `cloancostcenter` | 借款人成本中心 |
| `cloanfinacecostcenter` | `cloanfinacecostcenter` | `cloanfinacecostcenter` | 借款费用承担成本中心 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `cloanfinaceorg` | `cloanfinaceorg` | `cloanfinaceorg` | 借款费用承担组织 |
| `pk_apct` | `pk_apct` | `pk_apct` | 付款合同 |
| `pk_apct_plan` | `pk_apct_plan` | `pk_apct_plan` | 付款计划 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 差旅费报销单主表id |
| `pk_loanbill` | `pk_loanbill` | `pk_loanbill` | 借款单主键 |
| `pk_loanbill_b` | `pk_loanbill_b` | `pk_loanbill_b` | 借款单子表主键 |
| `pk_loanpsn` | `pk_loanpsn` | `pk_loanpsn` | 借款人 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vloancurrency` | `vloancurrency` | `vloancurrency` | 借款币种 |
| `vloandeptid` | `vloandeptid` | `vloandeptid` | 借款人部门 |
| `vloanfinacedeptid` | `vloanfinacedeptid` | `vloanfinacedeptid` | 借款费用承担部门 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

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
| `nacccavmny` | `nacccavmny` | `nacccavmny` | 核销额(含未审核) |
| `naccreturnmny` | `naccreturnmny` | `naccreturnmny` | 已还款 |
| `ncavmny` | `ncavmny` | `ncavmny` | 本次核销额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款额 |
| `nnatacccavmny` | `nnatacccavmny` | `nnatacccavmny` | 核销额(含未审核)-本币 |
| `nnataccreturnmny` | `nnataccreturnmny` | `nnataccreturnmny` | 累计还款额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 本次核销额-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款额-本币 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 本次还款额-本币 |
| `nnattotalcavmny` | `nnattotalcavmny` | `nnattotalcavmny` | 未还款金额-本币 |
| `nnatuncavmny` | `nnatuncavmny` | `nnatuncavmny` | 剩余未还款金额-本币 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 本次还款额 |
| `ntotalcavmny` | `ntotalcavmny` | `ntotalcavmny` | 未还款金额 |
| `nuncavmny` | `nuncavmny` | `nuncavmny` | 剩余未还款金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `loancavDcs` | `loancavDcs` | `loancavDcs` | 借款核销自定义项 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `loancavuserdefs` | 差旅费报销单借款核销（自定义项）表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
