# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cuserid | cuserid | cuserid | char(20) | √ |
| 2 | able_time | able_time | able_time | varchar2(10) |
| 3 | authen_type | authen_type | authen_type | varchar2(100) |
| 4 | datastate | datastate | datastate | number(38, 0) |
| 5 | disable_time | disable_time | disable_time | varchar2(10) |
| 6 | isca | isca | isca | char(1) |
| 7 | keyuser | keyuser | keyuser | char(1) |
| 8 | langcode | langcode | langcode | varchar2(20) |
| 9 | locked_tag | locked_tag | locked_tag | char(1) |
| 10 | pk_corp | pk_corp | pk_corp | char(4) | √ |
| 11 | pk_project | pk_project | pk_project | char(20) |
| 12 | pwdlevelcode | pwdlevelcode | pwdlevelcode | varchar2(50) |
| 13 | pwdparam | pwdparam | pwdparam | varchar2(50) |
| 14 | pwdtype | pwdtype | pwdtype | number(38, 0) |
| 15 | user_code | user_code | user_code | varchar2(30) | √ |
| 16 | user_name | user_name | user_name | varchar2(50) |
| 17 | user_note | user_note | user_note | varchar2(75) |
| 18 | user_password | user_password | user_password | varchar2(50) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |