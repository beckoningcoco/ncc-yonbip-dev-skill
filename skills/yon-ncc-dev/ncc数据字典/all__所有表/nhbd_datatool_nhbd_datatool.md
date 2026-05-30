# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatool | pk_datatool | pk_datatool | char(20) | √ |
| 2 | active | active | active | number(38, 0) |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | datatool_code | datatool_code | datatool_code | varchar2(50) |
| 5 | datatool_name | datatool_name | datatool_name | varchar2(50) |
| 6 | datatool_type | datatool_type | datatool_type | number(38, 0) |
| 7 | modifytime | modifytime | modifytime | char(19) |
| 8 | pk_datatool_cate | pk_datatool_cate | pk_datatool_cate | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | sql_template | sql_template | sql_template | varchar2(200) |
| 12 | usecount | usecount | usecount | number(38, 0) |
| 13 | version | version | version | number(38, 0) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |