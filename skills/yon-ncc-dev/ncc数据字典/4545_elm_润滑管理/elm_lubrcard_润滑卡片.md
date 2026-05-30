# |<<

**润滑卡片 (elm_lubrcard / nc.vo.elm.lubrcard.LubrCardHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lubrcard | 润滑卡片主键 | pk_lubrcard | char(20) | √ | 主键 (UFID) |
| 2 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 3 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 4 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 5 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |