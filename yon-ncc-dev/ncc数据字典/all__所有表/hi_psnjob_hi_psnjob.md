# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8682.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnjob | pk_psnjob | pk_psnjob | char(20) | √ |
| 2 | accountattr | accountattr | accountattr | varchar2(20) |
| 3 | assgid | assgid | assgid | number(38, 0) | √ |
| 4 | begindate | begindate | begindate | char(10) |
| 5 | clerkcode | clerkcode | clerkcode | varchar2(50) | √ |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 7 | deposemode | deposemode | deposemode | char(20) |  |  | '~' |
| 8 | enddate | enddate | enddate | char(10) |
| 9 | endflag | endflag | endflag | char(1) |  |  | 'Y' |
| 10 | ismainjob | ismainjob | ismainjob | char(1) | √ |
| 11 | jobmode | jobmode | jobmode | varchar2(20) |  |  | '~' |
| 12 | lastflag | lastflag | lastflag | char(1) | √ |
| 13 | memo | memo | memo | varchar2(1536) |
| 14 | occupation | occupation | occupation | varchar2(20) |  |  | '~' |
| 15 | oribillpk | oribillpk | oribillpk | char(20) |
| 16 | oribilltype | oribilltype | oribilltype | char(20) |
| 17 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 18 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | char(20) |
| 20 | pk_hrgroup | pk_hrgroup | pk_hrgroup | varchar2(20) |  |  | '~' |
| 21 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |  |  | '~' |
| 22 | pk_job | pk_job | pk_job | varchar2(20) |  |  | '~' |
| 23 | pk_jobgrade | pk_jobgrade | pk_jobgrade | varchar2(20) |  |  | '~' |
| 24 | pk_jobrank | pk_jobrank | pk_jobrank | varchar2(20) |  |  | '~' |
| 25 | pk_job_type | pk_job_type | pk_job_type | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | char(20) | √ |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 29 | pk_postseries | pk_postseries | pk_postseries | varchar2(20) |  |  | '~' |
| 30 | pk_psncl | pk_psncl | pk_psncl | varchar2(20) | √ |  | '~' |
| 31 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |  | '~' |
| 32 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |  | '~' |
| 33 | poststat | poststat | poststat | char(1) |  |  | 'Y' |
| 34 | psntype | psntype | psntype | number(38, 0) | √ |
| 35 | recordnum | recordnum | recordnum | number(38, 0) | √ |
| 36 | series | series | series | varchar2(20) |  |  | '~' |
| 37 | showorder | showorder | showorder | number(38, 0) | √ |  | 999999 |
| 38 | trial_flag | trial_flag | trial_flag | char(1) |
| 39 | trial_type | trial_type | trial_type | number(38, 0) |
| 40 | trnsevent | trnsevent | trnsevent | number(38, 0) |
| 41 | trnsreason | trnsreason | trnsreason | varchar2(20) |  |  | '~' |
| 42 | trnstype | trnstype | trnstype | varchar2(20) |  |  | '~' |
| 43 | wagrade | wagrade | wagrade | varchar2(20) |
| 44 | worktype | worktype | worktype | varchar2(20) |  |  | '~' |
| 45 | creationtime | creationtime | creationtime | char(19) |
| 46 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 49 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |