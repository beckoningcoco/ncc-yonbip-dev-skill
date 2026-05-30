# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cuserid | cuserid | cuserid | char(20) | √ |
| 2 | abledate | abledate | abledate | char(19) | √ |
| 3 | base_doc_type | base_doc_type | base_doc_type | number(38, 0) |
| 4 | contentlang | contentlang | contentlang | varchar2(20) |  |  | '~' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | disabledate | disabledate | disabledate | char(19) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) |
| 8 | format | format | format | varchar2(20) |  |  | '~' |
| 9 | identityverifycode | identityverifycode | identityverifycode | varchar2(50) |
| 10 | isca | isca | isca | char(1) |
| 11 | islocked | islocked | islocked | char(1) |
| 12 | pk_base_doc | pk_base_doc | pk_base_doc | varchar2(20) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_usergroupforcreate | pk_usergroupforcreate | pk_usergroupforcreate | varchar2(20) |  |  | '~' |
| 16 | pwdlevelcode | pwdlevelcode | pwdlevelcode | varchar2(50) |
| 17 | pwdparam | pwdparam | pwdparam | varchar2(200) |
| 18 | user_code | user_code | user_code | varchar2(50) | √ |
| 19 | user_code_q | user_code_q | user_code_q | varchar2(50) | √ |
| 20 | user_name | user_name | user_name | varchar2(200) | √ |
| 21 | user_name2 | user_name2 | user_name2 | varchar2(200) |
| 22 | user_name3 | user_name3 | user_name3 | varchar2(200) |
| 23 | user_name4 | user_name4 | user_name4 | varchar2(200) |
| 24 | user_name5 | user_name5 | user_name5 | varchar2(200) |
| 25 | user_name6 | user_name6 | user_name6 | varchar2(200) |
| 26 | user_note | user_note | user_note | varchar2(75) |
| 27 | user_password | user_password | user_password | varchar2(50) |
| 28 | user_type | user_type | user_type | number(38, 0) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |