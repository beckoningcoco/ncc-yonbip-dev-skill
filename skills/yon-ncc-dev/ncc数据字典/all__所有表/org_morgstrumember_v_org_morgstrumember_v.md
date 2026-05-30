# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10241.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | idx | idx | idx | number(38, 0) |
| 3 | innercode | innercode | innercode | varchar2(50) |
| 4 | islastversion | islastversion | islastversion | char(1) |
| 5 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 6 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 7 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 8 | pk_morgstru | pk_morgstru | pk_morgstru | varchar2(20) |  |  | '~' |
| 9 | pk_morgstrumember | pk_morgstrumember | pk_morgstrumember | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_role | pk_role | pk_role | varchar2(20) |  |  | '~' |
| 12 | pk_svid | pk_svid | pk_svid | varchar2(20) |  |  | '~' |
| 13 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 14 | plan_flag | plan_flag | plan_flag | char(1) |
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