# |<<

**销售出库对冲执行情况 (so_outrushexeinfo / nc.vo.so.m33.m4c.linkqryoutrush.entity.OutRushExeInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csquarebillbid | 销售出库单子实体 | csquarebillbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 出库单行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | vrushbillcode | 对冲出库单号 | vrushbillcode | varchar(40) |  | 字符串 (String) |
| 4 | crushbillrowno | 对冲出库单行号 | crushbillrowno | varchar(20) |  | 字符串 (String) |
| 5 | cmaterialvid | 物料多版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 出库数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | noutrushnum | 对冲数量 | noutrushnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |