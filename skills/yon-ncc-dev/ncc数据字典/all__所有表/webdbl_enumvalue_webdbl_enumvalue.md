# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enumvalue | pk_enumvalue | pk_enumvalue | char(20) | √ |
| 2 | enumsequence | enumsequence | enumsequence | number(38, 0) |
| 3 | enumvalue | enumvalue | enumvalue | varchar2(50) |
| 4 | enumvaluename | enumvaluename | enumvaluename | varchar2(50) |
| 5 | ishidden | ishidden | ishidden | char(1) |
| 6 | pk_enumtype | pk_enumtype | pk_enumtype | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |