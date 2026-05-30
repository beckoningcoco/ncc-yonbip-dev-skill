# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aosmember | pk_aosmember | pk_aosmember | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | displayorder | displayorder | displayorder | number(38, 0) |  |  | 999999 |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 6 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_orgvid | pk_orgvid | pk_orgvid | varchar2(20) |  |  | '~' |
| 10 | seq | seq | seq | varchar2(50) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |