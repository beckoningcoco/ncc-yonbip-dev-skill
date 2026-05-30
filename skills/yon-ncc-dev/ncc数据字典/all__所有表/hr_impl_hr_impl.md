# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_impl | pk_impl | pk_impl | char(20) | √ |
| 2 | default_flag | default_flag | default_flag | char(1) |
| 3 | impl_class_name | impl_class_name | impl_class_name | varchar2(101) |
| 4 | impl_desc | impl_desc | impl_desc | varchar2(750) |
| 5 | impl_name | impl_name | impl_name | varchar2(300) |
| 6 | impl_name2 | impl_name2 | impl_name2 | varchar2(300) |
| 7 | impl_name3 | impl_name3 | impl_name3 | varchar2(300) |
| 8 | impl_name4 | impl_name4 | impl_name4 | varchar2(300) |
| 9 | impl_name5 | impl_name5 | impl_name5 | varchar2(300) |
| 10 | impl_name6 | impl_name6 | impl_name6 | varchar2(300) |
| 11 | itf_code | itf_code | itf_code | varchar2(40) |
| 12 | modulename | modulename | modulename | varchar2(20) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_itf | pk_itf | pk_itf | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | user_def_flag | user_def_flag | user_def_flag | char(1) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |