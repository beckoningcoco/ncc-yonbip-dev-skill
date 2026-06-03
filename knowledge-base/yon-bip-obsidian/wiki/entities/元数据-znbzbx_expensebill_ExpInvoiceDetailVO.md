---
tags: [BIP, 元数据, 数据字典, znbzbx.expensebill.ExpInvoiceDetailVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销单发票明细 (`znbzbx.expensebill.ExpInvoiceDetailVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expinvoicedetail` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销单发票明细 |
| 物理表 | `znbz_expinvoicedetail` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 160 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expinvoicedetailuserdefs` | `znbzbx.expensebill.ExpInvoiceDetailUserdefVO` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcountryId` | `` |
| `pk_startaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `ytenant_id` | `` |
| `pk_invoicetype` | `znbzbx_invoicetyperef` |
| `pk_consumekind` | `znbzbx_consumekindref` |
| `` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `pk_cusdoc` | `` |
| `pk_taxrate` | `ucfbasedoc.bd_taxrate` |
| `pk_expensebill` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_expenserecord` | `` |
| `pk_tallydata_amount_b` | `` |
| `pk_costaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_tallydata` | `` |
| `vinvoicecurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_costpsndoc` | `ucf-staff-center.bd_staff_ref` |
| `pk_seatgrade` | `znbzbx_seatgraderef` |
| `tenant_id` | `` |

## 继承接口 (3个, 9字段)

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

## 字段列表（按类型分组）

> 共 160 个直连字段

### 文本字段 (62个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recordcode` | `recordcode` | `recordcode` | 记事编号 |
| `vcusttaxid` | `vcusttaxid` | `vcusttaxid` | 销售方纳税人识别号 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 发票号码 |
| `vinvoicecode` | `vinvoicecode` | `vinvoicecode` | 发票代码 |
| `vcustname` | `vcustname` | `vcustname` | 销方名称 |
| `vname` | `vname` | `vname` | 姓名 |
| `vtriprelatefield` | `vtriprelatefield` | `vtriprelatefield` | 报销行程关联字段 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vuserid` | `vuserid` | `vuserid` | 证件号 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vtrainnum` | `vtrainnum` | `vtrainnum` | 航班号/车次号 |
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
| `numberplate` | `numberplate` | `numberplate` | 通行费车牌号 |
| `vparentsourcesysid` | `vparentsourcesysid` | `vparentsourcesysid` | 来源系统父订单id |
| `batchno` | `batchno` | `batchno` | 批次号 |
| `buyerName` | `buyerName` | `buyerName` | 购买方名称 |
| `buyerTaxId` | `buyerTaxId` | `buyerTaxId` | 购买方纳税人识别号 |
| `carrier` | `carrier` | `carrier` | 承运人(航空公司) |
| `destAddr` | `destAddr` | `destAddr` | 目的地 |
| `free_baggage` | `free_baggage` | `free_baggage` | 免费行李 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `materialno` | `materialno` | `materialno` | 物料号 |
| `orderNo` | `orderNo` | `orderNo` | 商旅订单号 |
| `original_voucher_no` | `original_voucher_no` | `original_voucher_no` | 原凭证号 |
| `origvinvoiceno` | `origvinvoiceno` | `origvinvoiceno` | 原税票发票号码 |
| `period_of_tax` | `period_of_tax` | `period_of_tax` | 税款所属时期 |
| `project_code` | `project_code` | `project_code` | 项目编码 |
| `project_name` | `project_name` | `project_name` | 项目名称 |
| `quantity_per_unit` | `quantity_per_unit` | `quantity_per_unit` | 数量单位 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `sn` | `sn` | `sn` | 发票编码 |
| `` | `source` | `source` | 上游单据类型 |
| `specification_model` | `specification_model` | `specification_model` | 规格型号 |
| `standard` | `standard` | `standard` | 标准 |
| `startAddr` | `startAddr` | `startAddr` | 出发地 |
| `tax_identification` | `tax_identification` | `tax_identification` | 税号 |
| `tspz` | `tspz` | `tspz` | 特定业务类型 |
| `type_tax` | `type_tax` | `type_tax` | 税种 |
| `unit` | `unit` | `unit` | 单位 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `upperNo` | `upperNo` | `upperNo` | 上级订单号 |
| `vbuyBRN` | `vbuyBRN` | `vbuyBRN` | 购买方公司注册号 |
| `vcusBRN` | `vcusBRN` | `vcusBRN` | 销售方公司注册号 |
| `vvehicletype` | `vvehicletype` | `vvehicletype` | 通行车辆类型 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 记事id |
| `pk_invoicetype` | `pk_invoicetype` | `pk_invoicetype` | 账单类型id |
| `pk_consumekind` | `pk_consumekind` | `pk_consumekind` | 消费类型id |
| `pk_startaddr` | `pk_startaddr` | `pk_startaddr` | 出发城市pk |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_costaddr` | `pk_costaddr` | `pk_costaddr` | 发生地点pk |
| `pk_costpsndoc` | `pk_costpsndoc` | `pk_costpsndoc` | 报销人pk |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 主表id |
| `pk_seatgrade` | `pk_seatgrade` | `pk_seatgrade` | 舱位等级pk |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 记账数据pk |
| `pk_taxrate` | `pk_taxrate` | `pk_taxrate` | 税目税率(%) |
| `vinvoicecurrency` | `vinvoicecurrency` | `vinvoicecurrency` | 账单币种id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 渠道 |
| `pk_tallydata_amount_b` | `pk_tallydata_amount_b` | `pk_tallydata_amount_b` | 账单金额子表 |
| `vcountryId` | `vcountryId` | `vcountryId` | 国家地区 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voutdate` | `voutdate` | `voutdate` | 转出日期 |
| `dopendate` | `dopendate` | `dopendate` | 开票日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dupdate` | `dupdate` | `dupdate` | 上传日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `end_date` | `end_date` | `end_date` | 到达日期 |
| `origdopendate` | `origdopendate` | `origdopendate` | 原税票开票日期 |
| `start_date` | `start_date` | `start_date` | 出行日期 |
| `ticket_effective_date` | `ticket_effective_date` | `ticket_effective_date` | 客票生效日期 |
| `ticket_expiry_date` | `ticket_expiry_date` | `ticket_expiry_date` | 有效截止日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isallowmannualmerge` | `isallowmannualmerge` | `isallowmannualmerge` | 是否允许用户手工合并 |
| `ismergereimburse` | `ismergereimburse` | `ismergereimburse` | 是否合并报销 |
| `isrelateinvoice` | `isrelateinvoice` | `isrelateinvoice` | 是否关联账单 |
| `bocrmodify` | `bocrmodify` | `bocrmodify` | 是否被修改 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `icarscenario` | `icarscenario` | `icarscenario` | 用车场景 |
| `voutreason` | `voutreason` | `voutreason` | 转出原因 |
| `invoicenum` | `invoicenum` | `invoicenum` | 账单数量 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `collectionWay` | `collectionWay` | `collectionWay` | 采集方式 |
| `invstatus` | `invstatus` | `invstatus` | 账单状态 |
| `airporttype` | `airporttype` | `airporttype` | 机票类型 |
| `checkresult` | `checkresult` | `checkresult` | 配单结果 |
| `fileattribute` | `fileattribute` | `fileattribute` | 文件属性 |
| `iinvreleaseed` | `iinvreleaseed` | `iinvreleaseed` | 释放账单 |
| `isEleInvoice` | `isEleInvoice` | `isEleInvoice` | 是否电子 |
| `isaudited` | `isaudited` | `isaudited` | 是否已审核 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mergegroupid` | `mergegroupid` | `mergegroupid` | 账单合并分组id |
| `id` | `id` | `id` | ID |
| `pk_expensetrip` | `pk_expensetrip` | `pk_expensetrip` | 报销行程id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |

### 数值字段 (42个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ncadevelopmentfund` | `ncadevelopmentfund` | `ncadevelopmentfund` | 民航发展基金 |
| `nnatoutmny` | `nnatoutmny` | `nnatoutmny` | 进项转出额-本币 |
| `noutmny` | `noutmny` | `noutmny` | 进项转出额 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 不含税金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `nmny` | `nmny` | `nmny` | 价税合计 |
| `ndeductrate` | `ndeductrate` | `ndeductrate` | 可抵扣税率(%) |
| `ndeducttaxmny` | `ndeducttaxmny` | `ndeducttaxmny` | 可抵扣税额 |
| `nexpmny` | `nexpmny` | `nexpmny` | 可报销金额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `nnatexpmny` | `nnatexpmny` | `nnatexpmny` | 可报销金额-本币 |
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
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 不含税金额-本币 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 税额-本币 |
| `nnatmny` | `nnatmny` | `nnatmny` | 价税合计-本币 |
| `nnatdeducttaxmny` | `nnatdeducttaxmny` | `nnatdeducttaxmny` | 可抵扣税额-本币 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nnatservicetaxmny` | `nnatservicetaxmny` | `nnatservicetaxmny` | 服务费可抵扣税额-本币 |
| `nnatcompanypaymny` | `nnatcompanypaymny` | `nnatcompanypaymny` | 企业支付金额-本币 |
| `nservicemny` | `nservicemny` | `nservicemny` | 服务费价税合计 |
| `nservicetaxrate` | `nservicetaxrate` | `nservicetaxrate` | 服务费可抵扣税率 |
| `nservicetaxmny` | `nservicetaxmny` | `nservicetaxmny` | 服务费可抵扣税额 |
| `nnatservicemny` | `nnatservicemny` | `nnatservicemny` | 服务费价税合计-本币 |
| `ncompanypaymny` | `ncompanypaymny` | `ncompanypaymny` | 企业支付金额 |
| `diffmny` | `diffmny` | `diffmny` | 差异金额 |
| `discount_amount` | `discount_amount` | `discount_amount` | 折扣金额 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `orignmny` | `orignmny` | `orignmny` | 原税票金额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `tip_amount` | `tip_amount` | `tip_amount` | 额外费用 |
| `unit_price` | `unit_price` | `unit_price` | 单价 |
| `vdiscount` | `vdiscount` | `vdiscount` | 折扣金额 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arrival_time` | `arrival_time` | `arrival_time` | 到达时间 |
| `` | `` | `expinvoicedetailuserdefs` | 报销单发票明细（自定义项）表 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `travel_time` | `travel_time` | `travel_time` | 乘坐时间 |
