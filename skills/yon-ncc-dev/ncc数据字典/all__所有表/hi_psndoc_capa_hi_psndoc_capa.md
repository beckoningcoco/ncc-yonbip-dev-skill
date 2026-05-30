# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | asssource | asssource | asssource | varchar2(50) |
| 3 | asssourcetype | asssourcetype | asssourcetype | number(38, 0) |  |  | 3 |
| 4 | begindate | begindate | begindate | char(10) |
| 5 | enddate | enddate | enddate | char(10) |
| 6 | eva_date | eva_date | eva_date | char(10) |
| 7 | indicode | indicode | indicode | varchar2(80) |
| 8 | lastflag | lastflag | lastflag | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_indi_type | pk_indi_type | pk_indi_type | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pe_indi | pk_pe_indi | pk_pe_indi | varchar2(20) |
| 13 | pk_pe_scogrditem | pk_pe_scogrditem | pk_pe_scogrditem | varchar2(20) |  |  | '~' |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 15 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 16 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 17 | recordnum | recordnum | recordnum | number(38, 0) |
| 18 | score | score | score | number(28, 8) |
| 19 | scorestandard | scorestandard | scorestandard | varchar2(4000) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |