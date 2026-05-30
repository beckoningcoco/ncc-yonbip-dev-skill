# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleparam | pk_ruleparam | pk_ruleparam | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | pk_accrule | pk_accrule | pk_accrule | varchar2(20) |  |  | '~' |
| 4 | pk_corule | pk_corule | pk_corule | varchar2(20) |  |  | '~' |
| 5 | pk_rulescheme | pk_rulescheme | pk_rulescheme | char(20) | √ |
| 6 | ruletype | ruletype | ruletype | number(38, 0) |  |  | 1 |
| 7 | showorder | showorder | showorder | number(38, 0) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |