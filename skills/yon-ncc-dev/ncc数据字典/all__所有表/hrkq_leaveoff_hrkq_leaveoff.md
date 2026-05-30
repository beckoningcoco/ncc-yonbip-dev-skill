# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leaveoff | pk_leaveoff | pk_leaveoff | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(600) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billtype | billtype | billtype | varchar2(50) |
| 8 | breastfeedingleaveday | breastfeedingleaveday | breastfeedingleaveday | number(38, 0) |
| 9 | breastfeedingleaveway | breastfeedingleaveway | breastfeedingleaveway | number(38, 0) |
| 10 | dr_flag | dr_flag | dr_flag | number(38, 0) |
| 11 | leavebegintime | leavebegintime | leavebegintime | char(19) |
| 12 | leaveday | leaveday | leaveday | number(28, 2) |
| 13 | leaveendtime | leaveendtime | leaveendtime | char(19) |
| 14 | leaveoffbegintime | leaveoffbegintime | leaveoffbegintime | char(19) |
| 15 | leaveoffday | leaveoffday | leaveoffday | number(28, 2) |
| 16 | leaveoffendtime | leaveoffendtime | leaveoffendtime | char(19) |
| 17 | leaveoffremark | leaveoffremark | leaveoffremark | varchar2(600) |
| 18 | leaveoffshowbegindate | leaveoffshowbegindate | leaveoffshowbegindate | char(19) |
| 19 | leaveoffshowenddate | leaveoffshowenddate | leaveoffshowenddate | char(19) |
| 20 | leaveoff_end_day_type | leaveoff_end_day_type | leaveoff_end_day_type | number(38, 0) |
| 21 | leaveoff_start_day_type | leaveoff_start_day_type | leaveoff_start_day_type | number(38, 0) |
| 22 | leaveremark | leaveremark | leaveremark | varchar2(600) |
| 23 | leaveshowbegindate | leaveshowbegindate | leaveshowbegindate | char(19) |
| 24 | leaveshowenddate | leaveshowenddate | leaveshowenddate | char(19) |
| 25 | leave_end_day_type | leave_end_day_type | leave_end_day_type | number(38, 0) |
| 26 | leave_start_day_type | leave_start_day_type | leave_start_day_type | number(38, 0) |
| 27 | mainid | mainid | mainid | varchar2(50) |
| 28 | minunit | minunit | minunit | number(38, 0) |
| 29 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_leave_type | pk_leave_type | pk_leave_type | varchar2(36) |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 34 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |