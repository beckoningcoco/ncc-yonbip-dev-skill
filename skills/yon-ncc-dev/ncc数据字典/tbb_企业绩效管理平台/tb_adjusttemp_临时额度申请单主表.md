# |<<

**临时额度申请单主表 (tb_adjusttemp / nc.vo.tb.adjbill.AdjustTempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjusttemp | 临时额度申请单主键 | pk_adjusttemp | char(20) | √ | 主键 (UFID) |
| 2 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 3 | billtype | 单据类型编码 | billtype | varchar(50) |  | 字符串 (String) |
| 4 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | transtype | 交易类型编码 | transtype | varchar(50) |  | 字符串 (String) |
| 6 | billno | 单据编号 | billno | varchar(30) |  | 字符串 (String) |
| 7 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (tbb_billstatus) |  | 0=编制中; |