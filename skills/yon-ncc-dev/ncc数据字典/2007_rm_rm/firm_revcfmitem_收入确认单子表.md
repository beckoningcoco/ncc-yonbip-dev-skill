# |<<

**收入确认单子表 (firm_revcfmitem / nc.vo.rm.revconfirm.RevConfirmItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2284.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_revcfmitem | 详细信息主键 | pk_revcfmitem | char(20) | √ | 主键 (UFID) |
| 2 | summary | 摘要 | summary | varchar(50) |  | 字符串 (String) |
| 3 | pk_material | 物料 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 4 | pk_customer | 客户 | pk_customer | varchar(20) | √ | 客户基本信息 (customer) |
| 5 | pk_freecustomer | 散户 | pk_freecustomer | varchar(20) |  | 散户 (freecustom) |
| 6 | pk_ordcustomer | 订单客户 | pk_ordcustomer | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_dept_v | 部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | pk_cemployee | 业务员 | pk_cemployee | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 12 | notaxprice | 无税单价 | notaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | price | 含税单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 15 | pk_taxrate | 税率 | pk_taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_currtype | 币种 | pk_currtype | varchar(20) | √ | 币种 (currtype) |
| 17 | nglobaltax | 全局本币税额 | nglobaltax | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nglobaltaxmny | 全局本币价税合计 | nglobaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nglobalexchrate | 全局本币汇率 | nglobalexchrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ngouptax | 集团本币税额 | ngouptax | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ngroupexchrate | 集团本币汇率 | ngroupexchrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntax | 本币税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | notaxmny | 本币价税合计 | notaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nexchangerate | 本币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | norigtax | 原币税额 | norigtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigtaxmny | 原币价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | norigmny | 原币无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | pk_revcttype | 收入合同类型 | pk_revcttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 33 | revcontcode | 收入合同单据号 | revcontcode | varchar(50) |  | 字符串 (String) |
| 34 | pk_firm_sale | 收入合同 | pk_firm_sale | varchar(20) |  | 收入合同 (revenue_contract) |
| 35 | pk_revenuect_b | 收入合同信息主键 | pk_revenuect_b | varchar(50) |  | 字符串 (String) |
| 36 | revctlinenum | 收入合同信息行号 | revctlinenum | varchar(50) |  | 字符串 (String) |
| 37 | pk_revctplan | 收入计划主键 | pk_revctplan | varchar(50) |  | 字符串 (String) |
| 38 | top_billid | 上层单据主键 | top_billid | varchar(50) |  | 字符串 (String) |
| 39 | top_billcode | 上层单据号 | top_billcode | varchar(50) |  | 字符串 (String) |
| 40 | top_itemid | 上层单据行主键 | top_itemid | varchar(50) |  | 字符串 (String) |
| 41 | top_itemno | 上层单据行号 | top_itemno | varchar(50) |  | 字符串 (String) |
| 42 | top_billtype | 上层单据类型 | top_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 43 | top_tradetype | 上层交易类型 | top_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 44 | top_src_billid | 上层来源单据主键 | top_src_billid | varchar(50) |  | 字符串 (String) |
| 45 | top_src_billtype | 上层来源单据类型 | top_src_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 46 | src_tradetype | 源头交易类型 | src_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 47 | src_billtype | 源头单据类型 | src_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 48 | src_billid | 源头单据主键 | src_billid | varchar(50) |  | 字符串 (String) |
| 49 | src_billcode | 源头单据号 | src_billcode | varchar(50) |  | 字符串 (String) |
| 50 | src_itemid | 源头单据行主键 | src_itemid | varchar(50) |  | 字符串 (String) |
| 51 | src_itemno | 源头单据行号 | src_itemno | varchar(50) |  | 字符串 (String) |
| 52 | csalesquareid | 出库单id | csalesquareid | varchar(50) |  | 字符串 (String) |
| 53 | csalesquarebid | 出库单子表id | csalesquarebid | varchar(50) |  | 字符串 (String) |
| 54 | pk_conftime | 收入确认时点 | pk_conftime | varchar(20) |  | 收入确认时点 (confirmtime) |
| 55 | pk_rule | 收入分摊规则 | pk_rule | varchar(20) |  | 收入分摊规则 (sharingrules) |
| 56 | pk_sendcountry | 发货国家/地区 | pk_sendcountry | varchar(20) |  | 国家地区 (countryzone) |
| 57 | pk_receviecountry | 收货国家/地区 | pk_receviecountry | varchar(20) |  | 国家地区 (countryzone) |
| 58 | pk_taxcountry | 报税国家/地区 | pk_taxcountry | varchar(20) |  | 国家地区 (countryzone) |
| 59 | saletype | 购销类型 | saletype | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |