# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_overtime | pk_overtime | pk_overtime | varchar2(50) | √ |
| 2 | actuallen | actuallen | actuallen | number(28, 2) |
| 3 | applydate | applydate | applydate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(600) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | approvetime | approvetime | approvetime | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billsource | billsource | billsource | number(38, 0) |
| 11 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 12 | deptapplyid | deptapplyid | deptapplyid | varchar2(20) |  |  | '~' |
| 13 | isallnight | isallnight | isallnight | char(1) |
| 14 | isholiday | isholiday | isholiday | char(1) |
| 15 | isoverday | isoverday | isoverday | char(1) |
| 16 | otapplylength | otapplylength | otapplylength | number(28, 2) |
| 17 | overtimebegintime | overtimebegintime | overtimebegintime | char(19) |
| 18 | overtimeendtime | overtimeendtime | overtimeendtime | char(19) |
| 19 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 23 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 24 | remark | remark | remark | varchar2(600) |
| 25 | scheduday | scheduday | scheduday | number(38, 0) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(50) |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |