# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocruleset | pk_allocruleset | pk_allocruleset | char(20) | √ |
| 2 | alloccontent | alloccontent | alloccontent | number(38, 0) |
| 3 | allocruletype | allocruletype | allocruletype | number(38, 0) |
| 4 | code | code | code | varchar2(200) |
| 5 | effectdate | effectdate | effectdate | varchar2(20) |  |  | '~' |
| 6 | expiredate | expiredate | expiredate | varchar2(20) |  |  | '~' |
| 7 | isaccountbook | isaccountbook | isaccountbook | char(1) |
| 8 | islatestv | islatestv | islatestv | char(1) |
| 9 | name | name | name | varchar2(300) |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | note | note | note | varchar2(200) |
| 16 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 17 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) |  |  | '~' |
| 18 | pk_controlarea | pk_controlarea | pk_controlarea | varchar2(20) |  |  | '~' |
| 19 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_origin | pk_origin | pk_origin | varchar2(50) |
| 24 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 25 | pk_vid | pk_vid | pk_vid | varchar2(50) |
| 26 | rulestate | rulestate | rulestate | char(1) |
| 27 | vcode | vcode | vcode | varchar2(50) |
| 28 | vname | vname | vname | varchar2(300) |
| 29 | vname2 | vname2 | vname2 | varchar2(300) |
| 30 | vname3 | vname3 | vname3 | varchar2(300) |
| 31 | vname4 | vname4 | vname4 | varchar2(300) |
| 32 | vname5 | vname5 | vname5 | varchar2(300) |
| 33 | vname6 | vname6 | vname6 | varchar2(300) |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |