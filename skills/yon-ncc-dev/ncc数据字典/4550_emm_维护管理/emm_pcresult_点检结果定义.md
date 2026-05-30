# |<<

**点检结果定义 (emm_pcresult / nc.vo.emm.pcresult.PCResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcresult | 点检结果主键 | pk_pcresult | char(20) | √ | 主键 (UFID) |
| 2 | result_code | 编码 | result_code | varchar(40) |  | 字符串 (String) |
| 3 | result_name | 名称 | result_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | symbol | 记录符号 | symbol | varchar(50) |  | 字符串 (String) |
| 5 | alert_flag | 预警标志 | alert_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | exception_flag | 异常标志 | exception_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | default_flag | 默认标志 | default_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |