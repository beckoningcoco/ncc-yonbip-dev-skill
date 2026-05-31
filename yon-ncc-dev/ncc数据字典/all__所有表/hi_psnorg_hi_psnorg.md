# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnorg | pk_psnorg | pk_psnorg | char(20) | √ |
| 2 | adjustcorpage | adjustcorpage | adjustcorpage | number(38, 0) |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | corpworkage | corpworkage | corpworkage | varchar2(1000) |
| 5 | empforms | empforms | empforms | varchar2(20) |  |  | '~' |
| 6 | enddate | enddate | enddate | char(10) |
| 7 | endflag | endflag | endflag | char(1) | √ |
| 8 | indocflag | indocflag | indocflag | char(1) | √ |
| 9 | indoc_source | indoc_source | indoc_source | number(38, 0) |
| 10 | joinsysdate | joinsysdate | joinsysdate | char(10) |
| 11 | lastflag | lastflag | lastflag | char(1) | √ |
| 12 | orgrelaid | orgrelaid | orgrelaid | number(38, 0) | √ |
| 13 | pk_group | pk_group | pk_group | char(20) |
| 14 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | char(20) | √ |
| 16 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |  | '~' |
| 17 | psntype | psntype | psntype | number(38, 0) | √ |  | 1 |
| 18 | startpaydate | startpaydate | startpaydate | char(10) |
| 19 | stoppaydate | stoppaydate | stoppaydate | char(10) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |