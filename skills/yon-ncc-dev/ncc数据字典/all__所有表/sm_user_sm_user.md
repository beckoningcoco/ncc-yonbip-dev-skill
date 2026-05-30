# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11649.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cuserid | cuserid | cuserid | char(20) | √ |
| 2 | abledate | abledate | abledate | char(19) | √ |
| 3 | agreementstatus | agreementstatus | agreementstatus | varchar2(10) |
| 4 | base_doc_type | base_doc_type | base_doc_type | number(38, 0) |
| 5 | contentlang | contentlang | contentlang | varchar2(20) |  |  | '~' |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 7 | disabledate | disabledate | disabledate | char(19) |
| 8 | email | email | email | varchar2(50) |
| 9 | enablestate | enablestate | enablestate | number(38, 0) |
| 10 | format | format | format | varchar2(20) |  |  | '~' |
| 11 | identityverifycode | identityverifycode | identityverifycode | varchar2(50) |
| 12 | isca | isca | isca | char(1) |
| 13 | islocked | islocked | islocked | char(1) |
| 14 | pk_base_doc | pk_base_doc | pk_base_doc | varchar2(101) |
| 15 | pk_customer | pk_customer | pk_customer | varchar2(101) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(101) |
| 19 | pk_supplier | pk_supplier | pk_supplier | varchar2(101) |
| 20 | pk_usergroupforcreate | pk_usergroupforcreate | pk_usergroupforcreate | varchar2(20) |  |  | '~' |
| 21 | pwderrorcount | pwderrorcount | pwderrorcount | number(38, 0) |
| 22 | pwdlevelcode | pwdlevelcode | pwdlevelcode | varchar2(50) |
| 23 | pwdparam | pwdparam | pwdparam | varchar2(200) |
| 24 | secondverify | secondverify | secondverify | varchar2(20) |
| 25 | systype | systype | systype | varchar2(50) |
| 26 | user_code | user_code | user_code | varchar2(50) | √ |
| 27 | user_code_q | user_code_q | user_code_q | varchar2(50) | √ |
| 28 | user_name | user_name | user_name | varchar2(300) | √ |
| 29 | user_name2 | user_name2 | user_name2 | varchar2(300) |
| 30 | user_name3 | user_name3 | user_name3 | varchar2(300) |
| 31 | user_name4 | user_name4 | user_name4 | varchar2(300) |
| 32 | user_name5 | user_name5 | user_name5 | varchar2(300) |
| 33 | user_name6 | user_name6 | user_name6 | varchar2(300) |
| 34 | user_note | user_note | user_note | varchar2(75) |
| 35 | user_password | user_password | user_password | varchar2(50) |
| 36 | user_type | user_type | user_type | number(38, 0) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |