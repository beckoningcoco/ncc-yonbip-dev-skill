# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modelfield | pk_modelfield | pk_modelfield | char(20) | √ |
| 2 | classid | classid | classid | varchar2(36) |
| 3 | code | code | code | varchar2(50) | √ |
| 4 | enumvalue | enumvalue | enumvalue | varchar2(500) |
| 5 | fieldkind | fieldkind | fieldkind | char(1) | √ |
| 6 | fieldorder | fieldorder | fieldorder | number(38, 0) |
| 7 | fieldtype | fieldtype | fieldtype | char(1) | √ |
| 8 | ifmust | ifmust | ifmust | char(1) |
| 9 | isdefdim | isdefdim | isdefdim | char(1) |
| 10 | isextend | isextend | isextend | char(1) |
| 11 | ismultiple | ismultiple | ismultiple | char(1) |
| 12 | isquery | isquery | isquery | char(1) |
| 13 | name | name | name | varchar2(200) | √ |
| 14 | name2 | name2 | name2 | varchar2(200) |
| 15 | name3 | name3 | name3 | varchar2(200) |
| 16 | name4 | name4 | name4 | varchar2(200) |
| 17 | name5 | name5 | name5 | varchar2(200) |
| 18 | name6 | name6 | name6 | varchar2(200) |
| 19 | pk_datamodel | pk_datamodel | pk_datamodel | char(20) | √ |
| 20 | pk_fatherfield | pk_fatherfield | pk_fatherfield | varchar2(20) |  |  | '~' |
| 21 | refname | refname | refname | varchar2(100) |
| 22 | refpath | refpath | refpath | varchar2(500) |
| 23 | specialdim | specialdim | specialdim | char(1) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |