# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | activecode | activecode | activecode | varchar2(40) |
| 3 | activename | activename | activename | varchar2(200) |
| 4 | activename2 | activename2 | activename2 | varchar2(200) |
| 5 | activename3 | activename3 | activename3 | varchar2(200) |
| 6 | activename4 | activename4 | activename4 | varchar2(200) |
| 7 | activename5 | activename5 | activename5 | varchar2(200) |
| 8 | activename6 | activename6 | activename6 | varchar2(200) |
| 9 | authorizedept | authorizedept | authorizedept | varchar2(128) |
| 10 | certificatenum | certificatenum | certificatenum | varchar2(192) |
| 11 | coursecode | coursecode | coursecode | varchar2(40) |
| 12 | coursename | coursename | coursename | varchar2(200) |
| 13 | coursename2 | coursename2 | coursename2 | varchar2(200) |
| 14 | coursename3 | coursename3 | coursename3 | varchar2(200) |
| 15 | coursename4 | coursename4 | coursename4 | varchar2(200) |
| 16 | coursename5 | coursename5 | coursename5 | varchar2(200) |
| 17 | coursename6 | coursename6 | coursename6 | varchar2(200) |
| 18 | enddate | enddate | enddate | char(10) |
| 19 | istop | istop | istop | char(1) |  |  | 'Y' |
| 20 | lastdate | lastdate | lastdate | char(10) |
| 21 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 22 | occupation | occupation | occupation | varchar2(20) |  |  | '~' |
| 23 | occupationadress | occupationadress | occupationadress | varchar2(200) |
| 24 | occupationclass | occupationclass | occupationclass | varchar2(128) |
| 25 | occuptype | occuptype | occuptype | varchar2(20) |  |  | '~' |
| 26 | pk_cert | pk_cert | pk_cert | varchar2(20) |
| 27 | pk_group | pk_group | pk_group | char(20) | √ |
| 28 | pk_org | pk_org | pk_org | char(20) |
| 29 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 30 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 31 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 32 | recordnum | recordnum | recordnum | number(38, 0) |
| 33 | remark | remark | remark | varchar2(500) |
| 34 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 35 | workdate | workdate | workdate | char(10) |
| 36 | worklevel | worklevel | worklevel | varchar2(20) |  |  | '~' |
| 37 | workname | workname | workname | char(20) |
| 38 | workunitname | workunitname | workunitname | varchar2(192) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |