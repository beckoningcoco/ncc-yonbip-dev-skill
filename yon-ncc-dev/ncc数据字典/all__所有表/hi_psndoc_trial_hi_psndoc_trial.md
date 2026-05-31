# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) | √ |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | enddate | enddate | enddate | char(10) |
| 5 | endflag | endflag | endflag | char(1) |
| 6 | lastflag | lastflag | lastflag | char(1) |
| 7 | memo | memo | memo | varchar2(1536) |
| 8 | pk_group | pk_group | pk_group | char(20) |
| 9 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | char(20) | √ |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 12 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 13 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |  | '~' |
| 14 | recordnum | recordnum | recordnum | number(38, 0) |
| 15 | regulardate | regulardate | regulardate | char(10) |
| 16 | trialresult | trialresult | trialresult | number(38, 0) |
| 17 | trial_type | trial_type | trial_type | number(38, 0) | √ |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |