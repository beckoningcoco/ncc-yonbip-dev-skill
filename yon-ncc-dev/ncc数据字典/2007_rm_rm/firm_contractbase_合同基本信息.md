# |<<

**合同基本信息 (firm_contractbase / nc.vo.rm.revenue.RevenueContractBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2279.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contractbase | 合同基本信息主键 | pk_contractbase | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_financeorg_v | 财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_material_n | 物料最新版本 | pk_material_n | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_material_t | 物料分类 | pk_material_t | varchar(20) |  | 物料基本分类 (marbasclass) |
| 9 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 10 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 11 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 12 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pricetaxmny | 价税合计 | pricetaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | caltaxmny | 计税金额 | caltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | taxpureprice | 含税净价 | taxpureprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | oripureprice | 无税净价 | oripureprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | notaxmny | 无税金额 | notaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | discountmny | 折扣额 | discountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | currency | 本位币 | currency | varchar(20) |  | 币种 (currtype) |
| 23 | orgcurrexrate | 组织本币汇率 | orgcurrexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ctaxprice | 本币含税单价 | ctaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | cprice | 本币无税单价 | cprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ctaxpureprice | 本币含税净价 | ctaxpureprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | coripureprice | 本币无税净价 | coripureprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | currnotaxmny | 本币无税金额 | currnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | taxnum | 本币税额 | taxnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | currmny | 本币价税合计 | currmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | cdiscountmny | 本币折扣额 | cdiscountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | grpexrate | 集团本位币汇率 | grpexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | grpnotaxmny | 集团本币无税金额 | grpnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | grpcurrmny | 集团本币价税合计 | grpcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | glbexrate | 全局本位币汇率 | glbexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | glbnotaxmny | 全局本币无税金额 | glbnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | glbcurrmny | 全局本币价税合计 | glbcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | oritaxnum | 原币税额 | oritaxnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | pk_incomepolicy | 收入确认政策 | pk_incomepolicy | varchar(20) |  | 收入确认政策 (rm_incomepolicy) |
| 40 | lateintype | 递延收入确认类型 | lateintype | int |  | 收入确认类型 (IncomeTypeEnum) |  | 1=按时点; |