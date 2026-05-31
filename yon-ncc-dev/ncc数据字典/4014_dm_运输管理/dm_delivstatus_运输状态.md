# |<<

**运输状态 (dm_delivstatus / nc.vo.dm.delivstatus.entity.DelivStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1721.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_delivstatus | 运输状态主键 | pk_delivstatus | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | vpuplancode | 要货月计划 | vpuplancode | varchar(20) |  | 字符串 (String) |
| 4 | cinventoryid | 物料版本信息 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 7 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nsendnum | 累计运输数量 | nsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ncansendnum | 待运输数量 | ncansendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | bsendendflag | 运输关闭 | bsendendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | capplybill_bid | 运输申请单子表主键 | capplybill_bid | varchar(20) |  | 字符串 (String) |