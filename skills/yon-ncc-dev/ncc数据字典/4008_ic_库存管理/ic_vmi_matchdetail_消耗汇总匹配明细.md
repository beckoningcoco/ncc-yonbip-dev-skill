# |<<

**消耗汇总匹配明细 (ic_vmi_matchdetail / nc.vo.ic.m50.entity.VmiMatchDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvmimatchid | 消耗汇总匹配明细主键 | cvmimatchid | char(20) | √ | 主键 (UFID) |
| 2 | vtrantypecode | 匹配交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 3 | cgeneralhid | 匹配单据表头主键 | cgeneralhid | char(20) |  | 主键 (UFID) |
| 4 | cgeneralbid | 匹配单据表体主键 | cgeneralbid | char(20) |  | 主键 (UFID) |
| 5 | nnum | 匹配主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | cbilltypecode | 匹配单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | nprice | 匹配单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ctrantypeid | 匹配交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |