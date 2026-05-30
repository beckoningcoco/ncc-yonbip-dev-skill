# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | islastversion | islastversion | islastversion | char(1) |
| 6 | pk_bcs | pk_bcs | pk_bcs | varchar2(20) |  |  | '~' |
| 7 | pk_bcsmember | pk_bcsmember | pk_bcsmember | varchar2(20) | √ |
| 8 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 9 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_orgvid | pk_orgvid | pk_orgvid | varchar2(50) |  |  | '~' |
| 12 | pk_svid | pk_svid | pk_svid | varchar2(50) | √ |  | '~' |
| 13 | venddate | venddate | venddate | char(19) |
| 14 | vname | vname | vname | varchar2(75) |
| 15 | vno | vno | vno | varchar2(50) |
| 16 | vstartdate | vstartdate | vstartdate | char(19) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |