# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdiagtcm | pk_pvdiagtcm | pk_pvdiagtcm | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | date_diag | date_diag | date_diag | char(19) |
| 4 | describe | describe | describe | varchar2(256) |
| 5 | dt_diagtype_tcm | dt_diagtype_tcm | dt_diagtype_tcm | varchar2(50) |
| 6 | flag_cure | flag_cure | flag_cure | char(1) |
| 7 | flag_maj | flag_maj | flag_maj | char(1) |
| 8 | name | name | name | varchar2(50) |
| 9 | name2 | name2 | name2 | varchar2(50) |
| 10 | name3 | name3 | name3 | varchar2(50) |
| 11 | name4 | name4 | name4 | varchar2(50) |
| 12 | name5 | name5 | name5 | varchar2(50) |
| 13 | name6 | name6 | name6 | varchar2(50) |
| 14 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 15 | pk_diagtype_tcm | pk_diagtype_tcm | pk_diagtype_tcm | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 19 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 20 | sortno | sortno | sortno | number(38, 0) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |