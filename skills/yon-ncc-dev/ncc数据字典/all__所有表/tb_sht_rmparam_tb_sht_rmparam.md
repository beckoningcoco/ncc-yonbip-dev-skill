# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | isdimlevel | isdimlevel | isdimlevel | number(38, 0) | √ |
| 3 | param_key | param_key | param_key | varchar2(20) | √ |
| 4 | param_value | param_value | param_value | varchar2(20) |
| 5 | pk_parent | pk_parent | pk_parent | varchar2(20) | √ |
| 6 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 7 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |