# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8753.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tripoff | pk_tripoff | pk_tripoff | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(600) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billtype | billtype | billtype | varchar2(50) |
| 8 | cost | cost | cost | number(28, 2) |
| 9 | destination | destination | destination | varchar2(50) |
| 10 | dr_flag | dr_flag | dr_flag | number(38, 0) |
| 11 | handover | handover | handover | varchar2(200) |
| 12 | mainid | mainid | mainid | varchar2(50) |
| 13 | minunit | minunit | minunit | number(38, 0) |
| 14 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 18 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 19 | remark | remark | remark | varchar2(600) |
| 20 | tripbegintime | tripbegintime | tripbegintime | char(19) |
| 21 | tripday | tripday | tripday | number(28, 2) |
| 22 | tripendtime | tripendtime | tripendtime | char(19) |
| 23 | tripoffbegintime | tripoffbegintime | tripoffbegintime | char(19) |
| 24 | tripoffday | tripoffday | tripoffday | number(28, 2) |
| 25 | tripoffendtime | tripoffendtime | tripoffendtime | char(19) |
| 26 | tripoffremark | tripoffremark | tripoffremark | varchar2(600) |
| 27 | triptypeid | triptypeid | triptypeid | varchar2(36) |  |  | '~' |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |