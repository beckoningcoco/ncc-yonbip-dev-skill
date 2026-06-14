---
tags: [BIP, 元数据, 数据字典, znbzbx.expensebill.ExpApportionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销单费用分摊 (`znbzbx.expensebill.ExpApportionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expapportion` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销单费用分摊 |
| 物理表 | `znbz_expapportion` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 93 个 |
| 子表 | 1 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expapportionuserdefs` | `znbzbx.expensebill.ExpApportionUserdefVO` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `pk_customer` | `` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `wbs` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `pk_cusdoc` | `` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tenant_id` | `` |
| `` | `` |

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

> 共 93 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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
| `expapportionrulecode` | `expapportionrulecode` | `expapportionrulecode` | 分摊规则编码 |
| `expapportionruleid` | `expapportionruleid` | `expapportionruleid` | 分摊规则ID |
| `expapportionrulelinkflagb` | `expapportionrulelinkflagb` | `expapportionrulelinkflagb` | 分摊规则分摊联动标识 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心id |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 主表id |
| `vcurrency` | `vcurrency` | `vcurrency` | 报销币种id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_costcenter` | `pk_costcenter` | `pk_costcenter` | 成本中心 |
| `id` | `id` | `id` | ID |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |

### 数值字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatoutmny` | `nnatoutmny` | `nnatoutmny` | 进项转出额-本币 |
| `noutmny` | `noutmny` | `noutmny` | 进项转出额 |
| `napportmny` | `napportmny` | `napportmny` | 价税合计 |
| `napportrate` | `napportrate` | `napportrate` | 分摊比例(%) |
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
| `napporttaxmny` | `napporttaxmny` | `napporttaxmny` | 可抵扣税额 |
| `napportnotaxmny` | `napportnotaxmny` | `napportnotaxmny` | 不含税金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nnatapportnotaxmny` | `nnatapportnotaxmny` | `nnatapportnotaxmny` | 不含税金额-本币 |
| `nnatapporttaxmny` | `nnatapporttaxmny` | `nnatapporttaxmny` | 可抵扣税额-本币 |
| `nnatapportmny` | `nnatapportmny` | `nnatapportmny` | 价税合计-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `discount_amount` | `discount_amount` | `discount_amount` | 折扣金额 |
| `ncpmny` | `ncpmny` | `ncpmny` | 本期发生额 |
| `ncpuntaxmny` | `ncpuntaxmny` | `ncpuntaxmny` | 本期发生不含税金额 |
| `ndeferredmny` | `ndeferredmny` | `ndeferredmny` | 待摊金额 |
| `ndeferreduntaxmny` | `ndeferreduntaxmny` | `ndeferreduntaxmny` | 待摊不含税金额 |
| `nnatcpmny` | `nnatcpmny` | `nnatcpmny` | 本期发生额-本币 |
| `nnatcpuntaxmny` | `nnatcpuntaxmny` | `nnatcpuntaxmny` | 本期发生不含税金额-本币 |
| `nnatdeferredmny` | `nnatdeferredmny` | `nnatdeferredmny` | 待摊金额-本币 |
| `nnatdeferreduntaxmny` | `nnatdeferreduntaxmny` | `nnatdeferreduntaxmny` | 待摊不含税金额-本币 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提金额-本币 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 代扣税税额-本币 |
| `nnatwithholdingcavmny` | `nnatwithholdingcavmny` | `nnatwithholdingcavmny` | 预提核销额-本币 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提金额 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nwithholdingcavmny` | `nwithholdingcavmny` | `nwithholdingcavmny` | 预提核销额 |
| `tip_amount` | `tip_amount` | `tip_amount` | 额外费用 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `expapportionuserdefs` | 报销单费用分摊（自定义项）表 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
