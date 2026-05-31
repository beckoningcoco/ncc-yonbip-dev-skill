# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_simulatedep | pk_simulatedep | pk_simulatedep | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) |
| 3 | bill_code | bill_code | bill_code | varchar2(40) |
| 4 | bill_date | bill_date | bill_date | char(19) |
| 5 | bill_operator | bill_operator | bill_operator | varchar2(20) |  |  | '~' |
| 6 | enddate | enddate | enddate | char(19) |
| 7 | iscompare1 | iscompare1 | iscompare1 | char(1) |
| 8 | iscompare2 | iscompare2 | iscompare2 | char(1) |
| 9 | iscompare3 | iscompare3 | iscompare3 | char(1) |
| 10 | iscompare4 | iscompare4 | iscompare4 | char(1) |
| 11 | pk_accbook1 | pk_accbook1 | pk_accbook1 | varchar2(20) |
| 12 | pk_accbook2 | pk_accbook2 | pk_accbook2 | varchar2(20) |
| 13 | pk_accbook3 | pk_accbook3 | pk_accbook3 | varchar2(20) |
| 14 | pk_accbook4 | pk_accbook4 | pk_accbook4 | varchar2(20) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_program1 | pk_program1 | pk_program1 | varchar2(20) |  |  | '~' |
| 19 | pk_program2 | pk_program2 | pk_program2 | varchar2(20) |  |  | '~' |
| 20 | pk_program3 | pk_program3 | pk_program3 | varchar2(20) |  |  | '~' |
| 21 | pk_program4 | pk_program4 | pk_program4 | varchar2(20) |  |  | '~' |
| 22 | simulatedep_name | simulatedep_name | simulatedep_name | varchar2(200) |
| 23 | simulatedep_name2 | simulatedep_name2 | simulatedep_name2 | varchar2(200) |
| 24 | simulatedep_name3 | simulatedep_name3 | simulatedep_name3 | varchar2(200) |
| 25 | simulatedep_name4 | simulatedep_name4 | simulatedep_name4 | varchar2(200) |
| 26 | simulatedep_name5 | simulatedep_name5 | simulatedep_name5 | varchar2(200) |
| 27 | simulatedep_name6 | simulatedep_name6 | simulatedep_name6 | varchar2(200) |
| 28 | tb_flag | tb_flag | tb_flag | char(1) |  |  | 'N' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |