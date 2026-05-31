# |<<

**作业成本报表表体 (cm_ActCostBody / nc.vo.cm.actcostreport.ActCostReportBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1434.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactcost_bid | 作业成本子表主键 | cactcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | cactcostid | 作业成本表头主键 | cactcostid | varchar(50) |  | 字符串 (String) |
| 3 | cmaterialid | 材料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ncost | 成本 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nstdnum | 标准数量 | nstdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nstdprice | 标准单价 | nstdprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nstdcost | 标准成本 | nstdcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nnumdiff | 数量差异 | nnumdiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ncostdiff | 成本差异 | ncostdiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |