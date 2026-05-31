# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9706.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskreferprintscheme | pk_taskreferprintscheme | pk_taskreferprintscheme | char(20) | √ |
| 2 | defaultscheme | defaultscheme | defaultscheme | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_printscheme | pk_printscheme | pk_printscheme | varchar2(50) |
| 6 | pk_task | pk_task | pk_task | varchar2(50) |
| 7 | printscheme_name | printscheme_name | printscheme_name | varchar2(50) |
| 8 | scheme_type | scheme_type | scheme_type | number(38, 0) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |