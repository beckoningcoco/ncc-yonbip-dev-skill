# |<<

**费用分摊明细 (er_cshare_detail / nc.vo.erm.costshare.CShareDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cshare_detail | 主键 | pk_cshare_detail | char(20) | √ | 主键 (UFID) |
| 2 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 字符串 (String) |
| 5 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (billstatus) |  | 0=暂存; |