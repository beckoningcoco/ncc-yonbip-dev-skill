---
tags: [BIP, 元数据, 数据字典, znbzbx.personalreturnbill.PersonalReturnBillBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 还款单子表 (`znbzbx.personalreturnbill.PersonalReturnBillBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_returnbill_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 还款单子表 |
| 物理表 | `znbz_returnbill_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 95 个 |
| 子表 | 1 个 |
| 关联引用 | 35 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ReturnBillBUserdefVO` | `znbzbx.personalreturnbill.PersonalReturnBillBUserdefVO` | composition |

## 关联引用 (35个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_loanbill` | `znbzbx_loanbillref` |
| `activity` | `` |
| `pk_apct_plan` | `apct.apct_planref` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `pk_returnbill` | `` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_loanbill_b` | `` |
| `profitcenter` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `returnBillBDcs` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `vloancurrency` | `ucfbasedoc.bd_currencytenantref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_loanpsn` | `ucf-staff-center.bd_staff_ref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cloancostcenter` | `finbd.bd_costcenterref` |
| `vloandeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 95 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | 规则联动标识 |
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

### 引用字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 还款人成本中心 |
| `chandleorg` | `chandleorg` | `chandleorg` | 还款人组织 |
| `wbs` | `wbs` | `wbs` | WBS |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `cloancostcenter` | `cloancostcenter` | `cloancostcenter` | 借款人成本中心 |
| `pk_apct` | `pk_apct` | `pk_apct` | 付款合同 |
| `pk_apct_plan` | `pk_apct_plan` | `pk_apct_plan` | 付款计划 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 还款人 |
| `pk_loanbill` | `pk_loanbill` | `pk_loanbill` | 借款单主表id |
| `pk_loanbill_b` | `pk_loanbill_b` | `pk_loanbill_b` | 借款单子表id |
| `pk_loanpsn` | `pk_loanpsn` | `pk_loanpsn` | 借款人 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_returnbill` | `pk_returnbill` | `pk_returnbill` | 还款单主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 还款币种 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 还款人部门 |
| `vloancurrency` | `vloancurrency` | `vloancurrency` | 借款币种 |
| `vloandeptid` | `vloandeptid` | `vloandeptid` | 借款人部门 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `breturn` | `breturn` | `breturn` | 还款 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nbaseexchrate` | `nbaseexchrate` | `nbaseexchrate` | 还款币种企业汇率 |
| `ncavmny` | `ncavmny` | `ncavmny` | 核销额(含未审核) |
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
| `nexchrate` | `nexchrate` | `nexchrate` | 还款币种汇率 |
| `ngenericstdmny1` | `ngenericstdmny1` | `ngenericstdmny1` | 通用标准1 |
| `ngenericstdmny2` | `ngenericstdmny2` | `ngenericstdmny2` | 通用标准2 |
| `ngenericstdmny3` | `ngenericstdmny3` | `ngenericstdmny3` | 通用标准3 |
| `ngenericstdmny4` | `ngenericstdmny4` | `ngenericstdmny4` | 通用标准4 |
| `ngenericstdmny5` | `ngenericstdmny5` | `ngenericstdmny5` | 通用标准5 |
| `nhistoryreturnmny` | `nhistoryreturnmny` | `nhistoryreturnmny` | 已还金额 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nloanmny` | `nloanmny` | `nloanmny` | 借款金额 |
| `nloanreturnmny` | `nloanreturnmny` | `nloanreturnmny` | 本次冲销借款额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 本次冲销借款额-本币 |
| `nremainmny` | `nremainmny` | `nremainmny` | 还款后余额 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 本次还款额 |
| `ntotalremainmny` | `ntotalremainmny` | `ntotalremainmny` | 待还款金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `returnBillBDcs` | `returnBillBDcs` | `returnBillBDcs` | 还款明细自定义项 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nbaseexchrateOps` | `nbaseexchrateOps` | `nbaseexchrateOps` | 还款币种企业汇率折算方式 |
| `nexchrateOps` | `nexchrateOps` | `nexchrateOps` | 还款币种汇率折算方式 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币企业汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `ReturnBillBUserdefVO` | 还款单子表（自定义项）表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
