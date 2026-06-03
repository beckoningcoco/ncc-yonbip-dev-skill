---
tags: [BIP, 元数据, 数据字典, znbzbx.pubprepayloanbill.PubPrePayLoanBillBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对公预付单表体 (`znbzbx.pubprepayloanbill.PubPrePayLoanBillBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loanbill_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对公预付单表体 |
| 物理表 | `znbz_loanbill_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 118 个 |
| 子表 | 1 个 |
| 关联引用 | 42 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loanbillbuserdefs` | `znbzbx.pubprepayloanbill.PubPrePayLoanBillBUserdefVO` | composition |

## 关联引用 (42个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_unit_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_loanbill` | `` |
| `be_id` | `znbzbx_loanbillref` |
| `pk_memoapply_b` | `znbzbx_memoapplybref` |
| `contractLedgerId` | `` |
| `former_vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `activity` | `` |
| `former_cfinaceorgid` | `ucf-org-center.org_pure_tree_ref` |
| `pk_apct_plan` | `apct.apct_planref` |
| `` | `` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `vapplycurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `former_handlepsnid` | `ucf-staff-center.bd_staff_ref` |
| `former_chandleorgid` | `ucf-org-center.org_pure_tree_ref` |
| `profitcenter` | `` |
| `cfinaceorg` | `ucf-org-center.org_unit_tree_ref` |
| `pk_apct` | `apct.apct_apctref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `former_vfinacedeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `loanBillBDcs` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `be_detail_id` | `` |
| `tax_code_id` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_memoapply` | `znbzbx_memoapplyref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `former_busimemo` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 字段列表（按类型分组）

> 共 118 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | `expapportionrulelinkflaga` | 规则联动标识 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `upcode` | `upcode` | 上游单据号 |
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
| `vmemoapplybilltype` | `vmemoapplybilltype` | `vmemoapplybilltype` | 事项申请单据类型 |

### 引用字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `be_detail_id` | `be_detail_id` | `be_detail_id` | 转交前单据明细id |
| `be_id` | `be_id` | `be_id` | 转交前单据id |
| `former_cfinaceorgid` | `former_cfinaceorgid` | `former_cfinaceorgid` | 转交前费用承担组织 |
| `former_chandleorgid` | `former_chandleorgid` | `former_chandleorgid` | 转交前经办人/借款人组织 |
| `former_handlepsnid` | `former_handlepsnid` | `former_handlepsnid` | 转交前借款人/经办人 |
| `former_vfinacedeptid` | `former_vfinacedeptid` | `former_vfinacedeptid` | 转交前费用承担部门 |
| `former_vhandledeptid` | `former_vhandledeptid` | `former_vhandledeptid` | 转交前经办人/借款人部门 |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 统一合同id |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `former_busimemo` | `former_busimemo` | `former_busimemo` | 转交前费用项目 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `pk_apct` | `pk_apct` | `pk_apct` | 合同台账 |
| `pk_apct_plan` | `pk_apct_plan` | `pk_apct_plan` | 付款计划 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `pk_loanbill` | `pk_loanbill` | `pk_loanbill` | 预付单主表id |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请主表id |
| `pk_memoapply_b` | `pk_memoapply_b` | `pk_memoapply_b` | 事项申请子表id |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vapplycurrency` | `vapplycurrency` | `vapplycurrency` | 申请币种 |
| `vcurrency` | `vcurrency` | `vcurrency` | 预付币种 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isprojectapply` | `isprojectapply` | `isprojectapply` | 申请类型 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `wht_parentid` | `wht_parentid` | `wht_parentid` | 与代扣税孙表关联的明细字段(代扣税孙表也有这个字段) |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |

### 数值字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transfer_finalloanmny` | `transfer_finalloanmny` | `transfer_finalloanmny` | 转交金额 |
| `transfer_loanmny` | `transfer_loanmny` | `transfer_loanmny` | 转交金额(含未审核) |
| `transfer_natfinalloanmny` | `transfer_natfinalloanmny` | `transfer_natfinalloanmny` | 转交金额-本币 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 本币代扣税税额 |
| `transfer_natloanmny` | `transfer_natloanmny` | `transfer_natloanmny` | 转交金额(含未审核)-本币 |
| `natstoppedamountbody` | `natstoppedamountbody` | `natstoppedamountbody` | 实际结算止付金额-本币 |
| `nfinalsummnybody` | `nfinalsummnybody` | `nfinalsummnybody` | 实际结算金额 |
| `nnatfinalsummnybody` | `nnatfinalsummnybody` | `nnatfinalsummnybody` | 实际付款金额-本币 |
| `stoppedamountbody` | `stoppedamountbody` | `stoppedamountbody` | 实际结算止付金额 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
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
| `nfinalcavmny` | `nfinalcavmny` | `nfinalcavmny` | 核销额 |
| `nfinalreturnmny` | `nfinalreturnmny` | `nfinalreturnmny` | 退款额 |
| `ngenericstdmny1` | `ngenericstdmny1` | `ngenericstdmny1` | 通用标准1 |
| `ngenericstdmny2` | `ngenericstdmny2` | `ngenericstdmny2` | 通用标准2 |
| `ngenericstdmny3` | `ngenericstdmny3` | `ngenericstdmny3` | 通用标准3 |
| `ngenericstdmny4` | `ngenericstdmny4` | `ngenericstdmny4` | 通用标准4 |
| `ngenericstdmny5` | `ngenericstdmny5` | `ngenericstdmny5` | 通用标准5 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nloanmny` | `nloanmny` | `nloanmny` | 预付金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币基准汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 核销额(含未审核)-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatfinalcavmny` | `nnatfinalcavmny` | `nnatfinalcavmny` | 核销额-本币 |
| `nnatfinalreturnmny` | `nnatfinalreturnmny` | `nnatfinalreturnmny` | 退款额-本币 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 预付额-本币 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 退款额(含未审核)-本币 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 退款额(含未审核) |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `loanbillbuserdefs` | 对公预付单子表(自定义项)表 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `loanBillBDcs` | `loanBillBDcs` | `loanBillBDcs` | 预付明细自定义项 |
