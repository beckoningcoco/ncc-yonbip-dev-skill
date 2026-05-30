# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printnumber | pk_printnumber | pk_printnumber | char(20) | √ |
| 2 | alternum | alternum | alternum | number(38, 0) |
| 3 | billcode | billcode | billcode | varchar2(50) |
| 4 | billdata | billdata | billdata | char(19) |
| 5 | billid | billid | billid | varchar2(50) |
| 6 | controltype | controltype | controltype | number(38, 0) |
| 7 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 10 | printlimit | printlimit | printlimit | number(38, 0) |
| 11 | printnumber | printnumber | printnumber | number(38, 0) |
| 12 | printorder | printorder | printorder | number(38, 0) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |