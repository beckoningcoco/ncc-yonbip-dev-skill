# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partmng | pk_partmng | pk_partmng | char(20) | √ |
| 2 | apply_date | apply_date | apply_date | char(10) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_note | approve_note | approve_note | varchar2(2048) |
| 5 | approve_state | approve_state | approve_state | number(38, 0) |
| 6 | approve_time | approve_time | approve_time | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | bill_code | bill_code | bill_code | varchar2(50) | √ |
| 9 | business_type | business_type | business_type | varchar2(20) |  |  | '~' |
| 10 | clerkcode | clerkcode | clerkcode | varchar2(50) |
| 11 | deposemode | deposemode | deposemode | varchar2(20) |  |  | '~' |
| 12 | effectdate | effectdate | effectdate | char(10) | √ |
| 13 | ifsynwork | ifsynwork | ifsynwork | char(1) |
| 14 | isneedfile | isneedfile | isneedfile | char(1) |
| 15 | jobmode | jobmode | jobmode | varchar2(20) |  |  | '~' |
| 16 | memo | memo | memo | varchar2(1500) |
| 17 | occupation | occupation | occupation | varchar2(20) |  |  | '~' |
| 18 | partapp_mode | partapp_mode | partapp_mode | char(1) |
| 19 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 20 | pk_dept | pk_dept | pk_dept | varchar2(20) | √ |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_hi_hrorg | pk_hi_hrorg | pk_hi_hrorg | varchar2(20) |  |  | '~' |
| 23 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |  |  | '~' |
| 24 | pk_job | pk_job | pk_job | varchar2(20) |  |  | '~' |
| 25 | pk_jobgrade | pk_jobgrade | pk_jobgrade | varchar2(20) |  |  | '~' |
| 26 | pk_jobrank | pk_jobrank | pk_jobrank | varchar2(20) |  |  | '~' |
| 27 | pk_jobtype | pk_jobtype | pk_jobtype | varchar2(20) |  |  | '~' |
| 28 | pk_job_type | pk_job_type | pk_job_type | varchar2(20) | √ |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 30 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 31 | pk_postseries | pk_postseries | pk_postseries | varchar2(20) |  |  | '~' |
| 32 | pk_psncl | pk_psncl | pk_psncl | varchar2(20) | √ |  | '~' |
| 33 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 34 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |
| 35 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |  |  | '~' |
| 36 | poststate | poststate | poststate | char(1) |
| 37 | transtype | transtype | transtype | varchar2(50) |
| 38 | transtypeid | transtypeid | transtypeid | varchar2(20) |  |  | '~' |
| 39 | worktype | worktype | worktype | varchar2(20) |  |  | '~' |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |