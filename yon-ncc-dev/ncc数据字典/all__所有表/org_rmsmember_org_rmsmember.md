# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rmsmember | pk_rmsmember | pk_rmsmember | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | entityorgtype | entityorgtype | entityorgtype | number(38, 0) |
| 4 | idx | idx | idx | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | isbalanceunit | isbalanceunit | isbalanceunit | char(1) |
| 7 | islastversion | islastversion | islastversion | char(1) |
| 8 | ismanageorg | ismanageorg | ismanageorg | char(1) |
| 9 | pk_entityorg | pk_entityorg | pk_entityorg | varchar2(20) |  |  | '~' |
| 10 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 11 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | pk_orgvid | pk_orgvid | pk_orgvid | char(20) | √ |
| 14 | pk_rms | pk_rms | pk_rms | char(20) | √ |
| 15 | pk_svid | pk_svid | pk_svid | varchar2(20) |  |  | '~' |
| 16 | pk_vid | pk_vid | pk_vid | char(20) |
| 17 | venddate | venddate | venddate | char(19) |
| 18 | vname | vname | vname | varchar2(300) |
| 19 | vname2 | vname2 | vname2 | varchar2(300) |
| 20 | vname3 | vname3 | vname3 | varchar2(300) |
| 21 | vname4 | vname4 | vname4 | varchar2(300) |
| 22 | vname5 | vname5 | vname5 | varchar2(300) |
| 23 | vname6 | vname6 | vname6 | varchar2(300) |
| 24 | vno | vno | vno | varchar2(50) |
| 25 | vstartdate | vstartdate | vstartdate | char(19) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |