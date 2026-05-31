# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distrestrans_log | pk_distrestrans_log | pk_distrestrans_log | char(20) | √ |
| 2 | code | code | code | varchar2(100) |
| 3 | errormsg | errormsg | errormsg | varchar2(2000) |
| 4 | isallfieldrecepit | isallfieldrecepit | isallfieldrecepit | char(1) |  |  | 'Y' |
| 5 | isallfieldupload | isallfieldupload | isallfieldupload | char(1) |  |  | 'Y' |
| 6 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_bddoc | pk_bddoc | pk_bddoc | char(20) |
| 14 | pk_distributereglog | pk_distributereglog | pk_distributereglog | char(20) | √ |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | receiptstatus | receiptstatus | receiptstatus | number(38, 0) |  |  | 0 |
| 18 | uploadts | uploadts | uploadts | char(19) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |