# |<<

**票据台帐子表 (fbm_counterbook_b / nc.vo.fbm.report.counterbook.CounterBookBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_action | 主键 | pk_action | char(20) | √ | 主键 (UFID) |
| 2 | pk_register | 主表主键 | pk_register | char(20) |  | 主键 (UFID) |
| 3 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 4 | actiondate | 操作日期 | actiondate | char(19) |  | 日期 (UFDate) |
| 5 | actioncode | 动作编码 | actioncode | varchar(50) |  | 字符串 (String) |
| 6 | actionname | 操作 | actionname | varchar(50) |  | 字符串 (String) |
| 7 | beginstatus | 开始状态 | beginstatus | varchar(50) |  | 票据状态 (RegisterStatusEnum) |  | error=状态错误; |