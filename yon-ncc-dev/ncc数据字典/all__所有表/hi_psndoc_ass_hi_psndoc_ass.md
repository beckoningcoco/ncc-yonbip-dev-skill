# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | enddate | enddate | enddate | char(10) |
| 4 | lastflag | lastflag | lastflag | char(1) |
| 5 | period_name | period_name | period_name | varchar2(200) |
| 6 | period_name2 | period_name2 | period_name2 | varchar2(200) |
| 7 | period_name3 | period_name3 | period_name3 | varchar2(200) |
| 8 | period_name4 | period_name4 | period_name4 | varchar2(200) |
| 9 | period_name5 | period_name5 | period_name5 | varchar2(200) |
| 10 | period_name6 | period_name6 | period_name6 | varchar2(200) |
| 11 | period_type | period_type | period_type | number(38, 0) |
| 12 | period_year | period_year | period_year | varchar2(20) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |
| 15 | pk_orgass | pk_orgass | pk_orgass | varchar2(20) |  |  | '~' |
| 16 | pk_orgpsn | pk_orgpsn | pk_orgpsn | varchar2(20) |  |  | '~' |
| 17 | pk_perank | pk_perank | pk_perank | varchar2(20) |  |  | '~' |
| 18 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 19 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 20 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 21 | recordnum | recordnum | recordnum | number(38, 0) |
| 22 | schemecode | schemecode | schemecode | varchar2(28) |
| 23 | schemename | schemename | schemename | varchar2(300) |
| 24 | schemename2 | schemename2 | schemename2 | varchar2(300) |
| 25 | schemename3 | schemename3 | schemename3 | varchar2(300) |
| 26 | schemename4 | schemename4 | schemename4 | varchar2(300) |
| 27 | schemename5 | schemename5 | schemename5 | varchar2(300) |
| 28 | schemename6 | schemename6 | schemename6 | varchar2(300) |
| 29 | schemequotiety | schemequotiety | schemequotiety | number(16, 4) |
| 30 | schemescore | schemescore | schemescore | number(16, 4) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |