---
tags: [BIP, 元数据, 数据字典, znbzbx.travelexpensebill.TravelWithholdingCavVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 差旅费报销单预提冲销 (`znbzbx.travelexpensebill.TravelWithholdingCavVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_withholdingcav` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 差旅费报销单预提冲销 |
| 物理表 | `znbz_withholdingcav` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 81 个 |
| 子表 | 1 个 |
| 关联引用 | 27 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `withholdingcavuserdefs` | `znbzbx.travelexpensebill.TravelWithholdingCavUserdefVO` | composition |

## 关联引用 (27个)

| 字段名 | 引用类型 |
|--------|---------|
| `contractLedgerId` | `` |
| `activity` | `` |
| `` | `` |
| `pk_manualwithholding` | `znbzbx_manualwithholdingref` |
| `wbs` | `` |
| `vwithholdingfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `pk_cusdoc` | `productcenter.aa_vendor` |
| `pk_manualwithholding_b` | `` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `vwthdcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `cwhfinacecostcenter` | `finbd.bd_costcenterref` |
| `vwithholdingchandleorg` | `` |
| `tenant_id` | `` |
| `pk_customer` | `pk_customer` |
| `ytenant_id` | `` |
| `cwithholdingcostcenter` | `finbd.bd_costcenterref` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `caccountorg` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `withholdingcavDcs` | `` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cwithholdingfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_withholdingpsn` | `ucf-staff-center.bd_staff_ref` |
| `vwithholdingdeptid` | `ucf-org-center.bd_adminorgsharetreeref` |

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_manualwithholdingtype` | `pk_manualwithholdingtype` | `pk_manualwithholdingtype` | 手工预提单据类型 |
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

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `cwhfinacecostcenter` | `cwhfinacecostcenter` | `cwhfinacecostcenter` | 预提费用承担成本中心 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `vwithholdingchandleorg` | `vwithholdingchandleorg` | `vwithholdingchandleorg` | 预提人组织 |
| `cwithholdingcostcenter` | `cwithholdingcostcenter` | `cwithholdingcostcenter` | 预提人成本中心 |
| `cwithholdingfinaceorg` | `cwithholdingfinaceorg` | `cwithholdingfinaceorg` | 预提费用承担组织 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单主表主键 |
| `pk_manualwithholding` | `pk_manualwithholding` | `pk_manualwithholding` | 手工预提单主键 |
| `pk_manualwithholding_b` | `pk_manualwithholding_b` | `pk_manualwithholding_b` | 手工预提单子表主键 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_withholdingpsn` | `pk_withholdingpsn` | `pk_withholdingpsn` | 预提人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 组织本币汇率类型 |
| `vwithholdingdeptid` | `vwithholdingdeptid` | `vwithholdingdeptid` | 预提人部门 |
| `vwithholdingfinacedeptid` | `vwithholdingfinacedeptid` | `vwithholdingfinacedeptid` | 预提费用承担部门 |
| `vwthdcurrency` | `vwthdcurrency` | `vwthdcurrency` | 预提币种 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 组织本币汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bcav` | `bcav` | `bcav` | 冲销 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `naccredcavmny` | `naccredcavmny` | `naccredcavmny` | 红冲额(含未审核) |
| `nnatredcavmny` | `nnatredcavmny` | `nnatredcavmny` | 本次红冲金额-本币 |
| `nredcavmny` | `nredcavmny` | `nredcavmny` | 本次红冲金额 |
| `nacccavmny` | `nacccavmny` | `nacccavmny` | 累计已冲销金额 |
| `ncavmny` | `ncavmny` | `ncavmny` | 本次冲销金额 |
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
| `nnatacccavmny` | `nnatacccavmny` | `nnatacccavmny` | 累计已冲销金额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 本次冲销金额-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnattotalcavmny` | `nnattotalcavmny` | `nnattotalcavmny` | 未冲销金额-本币 |
| `nnatuncavmny` | `nnatuncavmny` | `nnatuncavmny` | 剩余未冲销金额-本币 |
| `nnatwithholdingmny` | `nnatwithholdingmny` | `nnatwithholdingmny` | 预提金额-本币 |
| `ntotalcavmny` | `ntotalcavmny` | `ntotalcavmny` | 未冲销金额 |
| `nuncavmny` | `nuncavmny` | `nuncavmny` | 剩余未冲销金额 |
| `nwithholdingmny` | `nwithholdingmny` | `nwithholdingmny` | 预提金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `withholdingcavDcs` | `withholdingcavDcs` | `withholdingcavDcs` | 预提冲销自定义项 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `withholdingcavuserdefs` | 差旅费报销单预提冲销（自定义项）表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
