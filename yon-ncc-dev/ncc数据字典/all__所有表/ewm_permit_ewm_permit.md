# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8013.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permit | pk_permit | pk_permit | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_terminate_time | bill_terminate_time | bill_terminate_time | char(19) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | cancel_time | cancel_time | cancel_time | char(19) |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | delay_flag | delay_flag | delay_flag | char(1) |
| 13 | doubsign | doubsign | doubsign | char(1) |
| 14 | memo | memo | memo | varchar2(500) |
| 15 | permit_start_time | permit_start_time | permit_start_time | char(19) |
| 16 | perm_statustype | perm_statustype | perm_statustype | number(38, 0) |
| 17 | pk_bill_terminator | pk_bill_terminator | pk_bill_terminator | varchar2(20) |  |  | '~' |
| 18 | pk_cancel_psn | pk_cancel_psn | pk_cancel_psn | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_permiter | pk_permiter | pk_permiter | varchar2(20) |  |  | '~' |
| 23 | pk_permitstatus | pk_permitstatus | pk_permitstatus | varchar2(20) |  |  | '~' |
| 24 | pk_prin | pk_prin | pk_prin | varchar2(20) |  |  | '~' |
| 25 | pk_prin_dept | pk_prin_dept | pk_prin_dept | varchar2(20) |  |  | '~' |
| 26 | pk_prin_dept_v | pk_prin_dept_v | pk_prin_dept_v | varchar2(20) |  |  | '~' |
| 27 | pk_prin_new | pk_prin_new | pk_prin_new | varchar2(20) |  |  | '~' |
| 28 | pk_ratify_psn | pk_ratify_psn | pk_ratify_psn | varchar2(20) |  |  | '~' |
| 29 | pk_signer | pk_signer | pk_signer | varchar2(20) |  |  | '~' |
| 30 | pk_specialty | pk_specialty | pk_specialty | varchar2(20) |  |  | '~' |
| 31 | pk_taskpsn | pk_taskpsn | pk_taskpsn | varchar2(20) |  |  | '~' |
| 32 | pk_team | pk_team | pk_team | varchar2(20) |  |  | '~' |
| 33 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 34 | pk_wo | pk_wo | pk_wo | varchar2(20) |  |  | '~' |
| 35 | pk_work_terminator | pk_work_terminator | pk_work_terminator | varchar2(20) |  |  | '~' |
| 36 | plan_end_time | plan_end_time | plan_end_time | char(19) |
| 37 | plan_start_time | plan_start_time | plan_start_time | char(19) |
| 38 | prin_flag | prin_flag | prin_flag | char(1) |
| 39 | psnnum | psnnum | psnnum | number(38, 0) |
| 40 | ratify_end_time | ratify_end_time | ratify_end_time | char(19) |
| 41 | ratify_start_time | ratify_start_time | ratify_start_time | char(19) |
| 42 | receiver | receiver | receiver | varchar2(20) |  |  | '~' |
| 43 | receive_time | receive_time | receive_time | char(19) |
| 44 | secsigner | secsigner | secsigner | varchar2(200) |
| 45 | sign_opinion | sign_opinion | sign_opinion | varchar2(200) |
| 46 | sign_time | sign_time | sign_time | char(19) |
| 47 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 48 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 49 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 50 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 51 | src_rowno | src_rowno | src_rowno | varchar2(40) |
| 52 | src_transi_type | src_transi_type | src_transi_type | varchar2(40) |
| 53 | team_psns | team_psns | team_psns | varchar2(200) |
| 54 | transi_type | transi_type | transi_type | varchar2(30) |
| 55 | workcontent | workcontent | workcontent | varchar2(200) |
| 56 | worksite | worksite | worksite | varchar2(200) |
| 57 | work_terminate_time | work_terminate_time | work_terminate_time | char(19) |
| 58 | def1 | def1 | def1 | varchar2(101) |
| 59 | def2 | def2 | def2 | varchar2(101) |
| 60 | def3 | def3 | def3 | varchar2(101) |
| 61 | def4 | def4 | def4 | varchar2(101) |
| 62 | def5 | def5 | def5 | varchar2(101) |
| 63 | def6 | def6 | def6 | varchar2(101) |
| 64 | def7 | def7 | def7 | varchar2(101) |
| 65 | def8 | def8 | def8 | varchar2(101) |
| 66 | def9 | def9 | def9 | varchar2(101) |
| 67 | def10 | def10 | def10 | varchar2(101) |
| 68 | def11 | def11 | def11 | varchar2(101) |
| 69 | def12 | def12 | def12 | varchar2(101) |
| 70 | def13 | def13 | def13 | varchar2(101) |
| 71 | def14 | def14 | def14 | varchar2(101) |
| 72 | def15 | def15 | def15 | varchar2(101) |
| 73 | def16 | def16 | def16 | varchar2(101) |
| 74 | def17 | def17 | def17 | varchar2(101) |
| 75 | def18 | def18 | def18 | varchar2(101) |
| 76 | def19 | def19 | def19 | varchar2(101) |
| 77 | def20 | def20 | def20 | varchar2(101) |
| 78 | def21 | def21 | def21 | varchar2(101) |
| 79 | def22 | def22 | def22 | varchar2(101) |
| 80 | def23 | def23 | def23 | varchar2(101) |
| 81 | def24 | def24 | def24 | varchar2(101) |
| 82 | def25 | def25 | def25 | varchar2(101) |
| 83 | def26 | def26 | def26 | varchar2(101) |
| 84 | def27 | def27 | def27 | varchar2(101) |
| 85 | def28 | def28 | def28 | varchar2(101) |
| 86 | def29 | def29 | def29 | varchar2(101) |
| 87 | def30 | def30 | def30 | varchar2(101) |
| 88 | def31 | def31 | def31 | varchar2(101) |
| 89 | def32 | def32 | def32 | varchar2(101) |
| 90 | def33 | def33 | def33 | varchar2(101) |
| 91 | def34 | def34 | def34 | varchar2(101) |
| 92 | def35 | def35 | def35 | varchar2(101) |
| 93 | def36 | def36 | def36 | varchar2(101) |
| 94 | def37 | def37 | def37 | varchar2(101) |
| 95 | def38 | def38 | def38 | varchar2(101) |
| 96 | def39 | def39 | def39 | varchar2(101) |
| 97 | def40 | def40 | def40 | varchar2(101) |
| 98 | def41 | def41 | def41 | varchar2(101) |
| 99 | def42 | def42 | def42 | varchar2(101) |
| 100 | def43 | def43 | def43 | varchar2(101) |
| 101 | def44 | def44 | def44 | varchar2(101) |
| 102 | def45 | def45 | def45 | varchar2(101) |
| 103 | def46 | def46 | def46 | varchar2(101) |
| 104 | def47 | def47 | def47 | varchar2(101) |
| 105 | def48 | def48 | def48 | varchar2(101) |
| 106 | def49 | def49 | def49 | varchar2(101) |
| 107 | def50 | def50 | def50 | varchar2(101) |
| 108 | creationtime | creationtime | creationtime | char(19) |
| 109 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 110 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 111 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 112 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 113 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |