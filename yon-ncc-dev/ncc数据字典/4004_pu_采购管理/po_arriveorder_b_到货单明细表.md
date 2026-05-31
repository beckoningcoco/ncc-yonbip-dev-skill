# |<<

**到货单明细表 (po_arriveorder_b / nc.vo.pu.m23.entity.ArriveItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arriveorder_b | 到货单明细 | pk_arriveorder_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_psfinanceorg | 结算财务组织最新版本 | pk_psfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_psfinanceorg_v | 结算财务组织 | pk_psfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_apfinanceorg | 应付组织最新版本 | pk_apfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_apfinanceorg_v | 应付组织 | pk_apfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_reqstoorg | 需求库存组织最新版本 | pk_reqstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 11 | pk_reqstoorg_v | 需求库存组织 | pk_reqstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 12 | pk_reqstore | 需求仓库 | pk_reqstore | varchar(20) |  | 仓库 (stordoc) |
| 13 | pk_material | 物料版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 18 | nnum | 到货主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nastnum | 到货数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nwastnum | 途耗主数量 | nwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nwastastnum | 途耗数量 | nwastastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nplannum | 应到主数量 | nplannum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nplanastnum | 应到数量 | nplanastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | bpresent | 赠品 | bpresent | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | npresentnum | 赠品主数量 | npresentnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | npresentastnum | 赠品数量 | npresentastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 28 | norigtaxprice | 主原币含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | norigprice | 主原币无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigtaxmny | 原币含税金额 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | norigmny | 原币无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 33 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ntaxmny | 本币含税金额 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |