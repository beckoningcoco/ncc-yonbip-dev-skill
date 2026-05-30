# |<<

**内部托管办理明细 (cfbm_innerkeep_b / nc.vo.cfbm.innerkeep.InnerKeepBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerkeep_b | 主键 | pk_innerkeep_b | char(20) | √ | 主键 (UFID) |
| 2 | isreceive | 接收 | isreceive | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 4 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 5 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 6 | fbmbilltype | 票据类型 | fbmbilltype | varchar(20) |  | 票据类型 (notetype) |
| 7 | returnreason | 中心退回原因 | returnreason | varchar(181) |  | 字符串 (String) |
| 8 | returnresult | 中心处理结果 | returnresult | varchar(50) |  | 中心处理结果 (ReturnResultEnum) |  | receive=接收; |