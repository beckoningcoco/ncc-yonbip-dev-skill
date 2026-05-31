# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8747.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leave | pk_leave | pk_leave | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | applytype | applytype | applytype | number(38, 0) |
| 4 | approvenote | approvenote | approvenote | varchar2(600) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | approvetime | approvetime | approvetime | char(19) |
| 8 | begintime | begintime | begintime | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billno | billno | billno | varchar2(50) |
| 11 | billsource | billsource | billsource | number(38, 0) |
| 12 | billtype | billtype | billtype | varchar2(50) |
| 13 | breastfeedingleaveday | breastfeedingleaveday | breastfeedingleaveday | number(38, 0) |
| 14 | breastfeedingleaveway | breastfeedingleaveway | breastfeedingleaveway | number(38, 0) |
| 15 | deptapplyid | deptapplyid | deptapplyid | varchar2(50) |
| 16 | dr_flag | dr_flag | dr_flag | number(38, 0) |
| 17 | endtime | endtime | endtime | char(19) |
| 18 | end_day_type | end_day_type | end_day_type | number(38, 0) |
| 19 | isrevoked | isrevoked | isrevoked | char(1) |
| 20 | leaveday | leaveday | leaveday | number(28, 2) |
| 21 | leaveoffapprovestatus | leaveoffapprovestatus | leaveoffapprovestatus | number(38, 0) |
| 22 | leaveremark | leaveremark | leaveremark | varchar2(600) |
| 23 | minunit | minunit | minunit | number(38, 0) |
| 24 | pk_dept | pk_dept | pk_dept | varchar2(50) |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_leaveoff | pk_leaveoff | pk_leaveoff | char(20) |
| 27 | pk_leave_type | pk_leave_type | pk_leave_type | varchar2(36) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 30 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 31 | scheduday | scheduday | scheduday | number(38, 0) |
| 32 | showbegindate | showbegindate | showbegindate | char(19) |
| 33 | showenddate | showenddate | showenddate | char(19) |
| 34 | start_day_type | start_day_type | start_day_type | number(38, 0) |
| 35 | vacationquota | vacationquota | vacationquota | number(28, 2) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |