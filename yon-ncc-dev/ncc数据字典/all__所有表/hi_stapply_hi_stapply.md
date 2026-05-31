# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hi_stapply | pk_hi_stapply | pk_hi_stapply | char(20) | √ |
| 2 | addreason | addreason | addreason | varchar2(1536) |
| 3 | apply_date | apply_date | apply_date | char(10) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approve_note | approve_note | approve_note | varchar2(3072) |
| 6 | approve_state | approve_state | approve_state | number(38, 0) | √ |
| 7 | approve_time | approve_time | approve_time | char(19) |
| 8 | assgid | assgid | assgid | number(38, 0) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) | √ |  | '~' |
| 10 | bill_code | bill_code | bill_code | varchar2(28) | √ |
| 11 | business_type | business_type | business_type | varchar2(20) |  |  | '~' |
| 12 | effectdate | effectdate | effectdate | char(10) |
| 13 | fun_code | fun_code | fun_code | varchar2(60) |
| 14 | ifaddblack | ifaddblack | ifaddblack | char(1) |
| 15 | ifaddpsnchg | ifaddpsnchg | ifaddpsnchg | char(1) |
| 16 | ifendpart | ifendpart | ifendpart | char(1) |
| 17 | ifsynwork | ifsynwork | ifsynwork | char(1) |
| 18 | isdisablepsn | isdisablepsn | isdisablepsn | char(1) |
| 19 | isend | isend | isend | char(1) |
| 20 | ishrssbill | ishrssbill | ishrssbill | char(1) |
| 21 | isneedfile | isneedfile | isneedfile | char(1) |
| 22 | isrelease | isrelease | isrelease | char(1) |
| 23 | memo | memo | memo | varchar2(768) |
| 24 | newdeposemode | newdeposemode | newdeposemode | varchar2(20) |  |  | '~' |
| 25 | newjobmode | newjobmode | newjobmode | varchar2(20) |  |  | '~' |
| 26 | newmemo | newmemo | newmemo | varchar2(1536) |
| 27 | newoccupation | newoccupation | newoccupation | varchar2(20) |  |  | '~' |
| 28 | newpk_dept | newpk_dept | newpk_dept | varchar2(20) |  |  | '~' |
| 29 | newpk_job | newpk_job | newpk_job | varchar2(20) |  |  | '~' |
| 30 | newpk_jobgrade | newpk_jobgrade | newpk_jobgrade | varchar2(20) |  |  | '~' |
| 31 | newpk_jobrank | newpk_jobrank | newpk_jobrank | varchar2(20) |  |  | '~' |
| 32 | newpk_job_type | newpk_job_type | newpk_job_type | varchar2(20) |  |  | '~' |
| 33 | newpk_org | newpk_org | newpk_org | varchar2(20) |  |  | '~' |
| 34 | newpk_post | newpk_post | newpk_post | varchar2(20) |  |  | '~' |
| 35 | newpk_postseries | newpk_postseries | newpk_postseries | varchar2(20) |  |  | '~' |
| 36 | newpk_psncl | newpk_psncl | newpk_psncl | varchar2(20) |  |  | '~' |
| 37 | newpoststat | newpoststat | newpoststat | char(1) |
| 38 | newseries | newseries | newseries | varchar2(20) |  |  | '~' |
| 39 | newworktype | newworktype | newworktype | varchar2(20) |  |  | '~' |
| 40 | olddeposemode | olddeposemode | olddeposemode | varchar2(20) |  |  | '~' |
| 41 | oldjobmode | oldjobmode | oldjobmode | varchar2(20) |  |  | '~' |
| 42 | oldmemo | oldmemo | oldmemo | varchar2(1536) |
| 43 | oldoccupation | oldoccupation | oldoccupation | varchar2(20) |  |  | '~' |
| 44 | oldpk_dept | oldpk_dept | oldpk_dept | varchar2(20) |  |  | '~' |
| 45 | oldpk_job | oldpk_job | oldpk_job | varchar2(20) |  |  | '~' |
| 46 | oldpk_jobgrade | oldpk_jobgrade | oldpk_jobgrade | varchar2(20) |  |  | '~' |
| 47 | oldpk_jobrank | oldpk_jobrank | oldpk_jobrank | varchar2(20) |  |  | '~' |
| 48 | oldpk_job_type | oldpk_job_type | oldpk_job_type | varchar2(20) |  |  | '~' |
| 49 | oldpk_org | oldpk_org | oldpk_org | varchar2(20) |  |  | '~' |
| 50 | oldpk_post | oldpk_post | oldpk_post | varchar2(20) |  |  | '~' |
| 51 | oldpk_postseries | oldpk_postseries | oldpk_postseries | varchar2(20) |  |  | '~' |
| 52 | oldpk_psncl | oldpk_psncl | oldpk_psncl | varchar2(20) |  |  | '~' |
| 53 | oldpoststat | oldpoststat | oldpoststat | char(1) |
| 54 | oldseries | oldseries | oldseries | varchar2(20) |  |  | '~' |
| 55 | oldworktype | oldworktype | oldworktype | varchar2(20) |  |  | '~' |
| 56 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 57 | pk_group | pk_group | pk_group | char(20) |
| 58 | pk_hi_org | pk_hi_org | pk_hi_org | varchar2(20) |  |  | '~' |
| 59 | pk_hrcm_org | pk_hrcm_org | pk_hrcm_org | varchar2(20) |
| 60 | pk_old_hi_org | pk_old_hi_org | pk_old_hi_org | varchar2(20) |  |  | '~' |
| 61 | pk_old_hrcm_org | pk_old_hrcm_org | pk_old_hrcm_org | varchar2(20) |
| 62 | pk_org | pk_org | pk_org | char(20) | √ |
| 63 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |  | '~' |
| 64 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 65 | pk_psnorg | pk_psnorg | pk_psnorg | char(20) |
| 66 | pk_trnstype | pk_trnstype | pk_trnstype | varchar2(20) | √ |  | '~' |
| 67 | sreason | sreason | sreason | varchar2(20) | √ |  | '~' |
| 68 | stapply_mode | stapply_mode | stapply_mode | number(38, 0) |
| 69 | transtype | transtype | transtype | varchar2(20) |
| 70 | transtypeid | transtypeid | transtypeid | varchar2(20) |  |  | '~' |
| 71 | trialbegindate | trialbegindate | trialbegindate | char(10) |
| 72 | trialdays | trialdays | trialdays | number(38, 0) |
| 73 | trialenddate | trialenddate | trialenddate | char(10) |
| 74 | trial_flag | trial_flag | trial_flag | char(1) |
| 75 | trial_unit | trial_unit | trial_unit | number(38, 0) |
| 76 | workflow_state | workflow_state | workflow_state | number(38, 0) |
| 77 | creationtime | creationtime | creationtime | char(19) |
| 78 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 79 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 80 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 81 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 82 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |