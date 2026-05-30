# |<<

**开票确认子表 (po_comparebill_b / nccloud.vo.pu.comparebill.entity.CompareBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comparebill_b | 确认单子表主键 | pk_comparebill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 6 | csrctype | 来源类型 | csrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | csrcbillcode | 来源单据号 | csrcbillcode | varchar(50) |  | 字符串 (String) |
| 8 | csrcid | 来源单据主键 | csrcid | varchar(50) |  | 字符串 (String) |
| 9 | csrcrowno | 来源单据行号 | csrcrowno | varchar(50) |  | 字符串 (String) |
| 10 | csrcbid | 来源单据行主键 | csrcbid | varchar(50) |  | 字符串 (String) |
| 11 | csrcts | 来源单据时间戳 | csrcts | char(19) |  | 日期时间 (UFDateTime) |
| 12 | csrcbts | 来源单据行时间戳 | csrcbts | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_material | 物料编码版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | ninastnum | 入库数量 | ninastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 19 | ninnum | 入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nastnum | 确认开票数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nnum | 确认开票主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | norigtaxmny | 确认价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ncollectnum | 累计收票主数量 | ncollectnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ncollectastnum | 累计收票数量 | ncollectastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nqtprice | 本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nqttaxprice | 本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 35 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |