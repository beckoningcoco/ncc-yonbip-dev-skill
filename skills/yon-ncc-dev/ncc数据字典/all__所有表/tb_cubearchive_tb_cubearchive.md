# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | archivestatus | archivestatus | archivestatus | number(38, 0) |
| 3 | cubecode | cubecode | cubecode | varchar2(50) | √ |
| 4 | message | message | message | varchar2(255) |
| 5 | year | year | year | number(38, 0) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |