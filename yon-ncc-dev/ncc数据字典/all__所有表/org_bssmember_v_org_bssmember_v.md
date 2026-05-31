# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | islastversion | islastversion | islastversion | char(1) |
| 6 | pk_bos | pk_bos | pk_bos | varchar2(20) | √ |
| 7 | pk_bosmember | pk_bosmember | pk_bosmember | varchar2(20) |  |  | '~' |
| 8 | pk_bssmember | pk_bssmember | pk_bssmember | char(20) | √ |
| 9 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 10 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 11 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 13 | pk_orgvid | pk_orgvid | pk_orgvid | char(20) | √ |
| 14 | pk_svid | pk_svid | pk_svid | varchar2(20) |  |  | '~' |
| 15 | venddate | venddate | venddate | char(19) |
| 16 | virtualorg | virtualorg | virtualorg | char(1) |
| 17 | vname | vname | vname | varchar2(50) |
| 18 | vno | vno | vno | varchar2(50) |
| 19 | vstartdate | vstartdate | vstartdate | char(19) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |