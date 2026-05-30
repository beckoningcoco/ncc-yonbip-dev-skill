# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | dspk | dspk | dspk | char(20) | √ |
| 2 | datasourcecode | datasourcecode | datasourcecode | varchar2(50) |
| 3 | datatype | datatype | datatype | varchar2(20) |  |  | '~' |
| 4 | fetchdatarule | fetchdatarule | fetchdatarule | varchar2(400) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_scheme | pk_scheme | pk_scheme | varchar2(50) |
| 8 | smartmodelpk | smartmodelpk | smartmodelpk | varchar2(20) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |