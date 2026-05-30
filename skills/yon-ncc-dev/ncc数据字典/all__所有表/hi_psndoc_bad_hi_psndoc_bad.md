# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_bad | pk_psndoc_bad | pk_psndoc_bad | char(20) | √ |
| 2 | birthday | birthday | birthday | char(10) |
| 3 | cause | cause | cause | varchar2(1536) | √ |
| 4 | checkcause | checkcause | checkcause | varchar2(1536) |
| 5 | checkdate | checkdate | checkdate | char(10) |
| 6 | checkpsn | checkpsn | checkpsn | varchar2(20) |  |  | '~' |
| 7 | code | code | code | varchar2(25) |
| 8 | comefrom | comefrom | comefrom | number(38, 0) |
| 9 | delflag | delflag | delflag | char(1) |
| 10 | id | id | id | varchar2(25) | √ |
| 11 | idtype | idtype | idtype | varchar2(20) |
| 12 | permanentres | permanentres | permanentres | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | char(20) | √ |
| 14 | pk_org | pk_org | pk_org | char(20) | √ |
| 15 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 16 | psncode | psncode | psncode | varchar2(20) |  |  | '~' |
| 17 | psnname | psnname | psnname | varchar2(300) | √ |
| 18 | psnname2 | psnname2 | psnname2 | varchar2(300) |
| 19 | psnname3 | psnname3 | psnname3 | varchar2(300) |
| 20 | psnname4 | psnname4 | psnname4 | varchar2(300) |
| 21 | psnname5 | psnname5 | psnname5 | varchar2(300) |
| 22 | psnname6 | psnname6 | psnname6 | varchar2(300) |
| 23 | sex | sex | sex | number(38, 0) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |