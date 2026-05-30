# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_blsqlparam | pk_blsqlparam | pk_blsqlparam | char(20) | √ |
| 2 | flag_use | flag_use | flag_use | char(1) |
| 3 | sql_code | sql_code | sql_code | varchar2(400) |
| 4 | sql_desc | sql_desc | sql_desc | varchar2(400) |
| 5 | sql_param | sql_param | sql_param | clob |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |