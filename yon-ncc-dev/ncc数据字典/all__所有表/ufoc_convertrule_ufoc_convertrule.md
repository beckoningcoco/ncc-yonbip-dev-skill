# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertrule | pk_convertrule | pk_convertrule | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | datatype | datatype | datatype | number(38, 0) |
| 4 | descurrtype | descurrtype | descurrtype | varchar2(20) |  |  | '~' |
| 5 | isorgrate | isorgrate | isorgrate | char(1) |  |  | 'N' |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | varchar2(20) |  |  | '~' |
| 13 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 14 | pk_cvtrulesort | pk_cvtrulesort | pk_cvtrulesort | varchar2(20) |  |  | '~' |
| 15 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |