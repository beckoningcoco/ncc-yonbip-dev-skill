# |<<

**工作许可 (ewm_permit / nc.vo.ewm.permit.PermitHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permit | 工作许可主键 | pk_permit | char(20) | √ | 主键 (UFID) |
| 2 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 3 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 4 | pk_transitype | 交易类型主键 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |