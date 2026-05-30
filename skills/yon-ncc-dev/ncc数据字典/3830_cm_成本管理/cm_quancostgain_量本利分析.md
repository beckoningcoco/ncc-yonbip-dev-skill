# |<<

**量本利分析 (cm_quancostgain / nc.vo.cm.report.ca1708.QuancostgainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cquancostgainid | 量本例分析 | cquancostgainid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 预测期间 | cperiod | varchar(200) |  | 字符串 (String) |
| 6 | vorginfo | 工厂信息 | vorginfo | varchar(200) |  | 字符串 (String) |
| 7 | vfilecode | 文件编码 | vfilecode | varchar(20) |  | 字符串 (String) |
| 8 | vfilename | 文件名 | vfilename | varchar(100) |  | 字符串 (String) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | pk_marbasclass | 产品基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 12 | pk_marcostclass | 产品成本分类 | pk_marcostclass | varchar(20) |  | 物料成本分类 (marcostclass) |
| 13 | cspec | 规格 | cspec | varchar(20) |  | 字符串 (String) |
| 14 | ctype | 型号 | ctype | varchar(20) |  | 字符串 (String) |
| 15 | cmeasdoc | 计量单位 | cmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 16 | nnum | 产量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | nsellnum | 销售量 | nsellnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | nprice | 价格 | nprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 19 | nchgunitcost | 单位变动成本 | nchgunitcost | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | nfixcost | 固定成本 | nfixcost | decimal(20, 8) |  | 数值 (UFDouble) |
| 21 | ncost | 总成本 | ncost | decimal(20, 8) |  | 数值 (UFDouble) |
| 22 | ngain | 利润 | ngain | decimal(20, 8) |  | 数值 (UFDouble) |
| 23 | nfixupcost | 保本点销售量 | nfixupcost | decimal(20, 8) |  | 数值 (UFDouble) |
| 24 | npointsellmny | 保本点销售额 | npointsellmny | decimal(20, 8) |  | 数值 (UFDouble) |
| 25 | nboundoffer | 边际贡献 | nboundoffer | decimal(20, 8) |  | 数值 (UFDouble) |
| 26 | analyseobjtype | 分析对象类型 | analyseobjtype | int |  | 分析对象类型 (analyseObjTypeEnum) |  | 0=产品; |