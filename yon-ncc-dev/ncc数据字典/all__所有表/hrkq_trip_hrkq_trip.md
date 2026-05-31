# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8752.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trip | pk_trip | pk_trip | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(600) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | approvetime | approvetime | approvetime | char(19) |
| 7 | billno | billno | billno | varchar2(50) |
| 8 | billsource | billsource | billsource | number(38, 0) |
| 9 | billtype | billtype | billtype | varchar2(50) |
| 10 | cost | cost | cost | number(28, 2) |
| 11 | destination | destination | destination | varchar2(50) |
| 12 | dr_flag | dr_flag | dr_flag | number(38, 0) |
| 13 | handover | handover | handover | varchar2(200) |
| 14 | isrevoked | isrevoked | isrevoked | char(1) |
| 15 | minunit | minunit | minunit | number(38, 0) |
| 16 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 20 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 21 | pk_tripoff | pk_tripoff | pk_tripoff | char(20) |
| 22 | remark | remark | remark | varchar2(600) |
| 23 | scheduday | scheduday | scheduday | number(38, 0) |
| 24 | tripbegintime | tripbegintime | tripbegintime | char(19) |
| 25 | tripday | tripday | tripday | number(28, 2) |
| 26 | tripendtime | tripendtime | tripendtime | char(19) |
| 27 | tripoffapprovestatus | tripoffapprovestatus | tripoffapprovestatus | number(38, 0) |
| 28 | triptypeid | triptypeid | triptypeid | varchar2(36) |  |  | '~' |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |