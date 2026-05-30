# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depmethod | pk_depmethod | pk_depmethod | char(20) | √ |
| 2 | amountexpression | amountexpression | amountexpression | varchar2(200) |
| 3 | amountformula | amountformula | amountformula | varchar2(200) |
| 4 | depclass | depclass | depclass | varchar2(80) |
| 5 | depmethod_code | depmethod_code | depmethod_code | varchar2(40) |
| 6 | depmethod_name | depmethod_name | depmethod_name | varchar2(120) |
| 7 | depmethod_name2 | depmethod_name2 | depmethod_name2 | varchar2(120) |
| 8 | depmethod_name3 | depmethod_name3 | depmethod_name3 | varchar2(120) |
| 9 | depmethod_name4 | depmethod_name4 | depmethod_name4 | varchar2(120) |
| 10 | depmethod_name5 | depmethod_name5 | depmethod_name5 | varchar2(120) |
| 11 | depmethod_name6 | depmethod_name6 | depmethod_name6 | varchar2(120) |
| 12 | enablestate | enablestate | enablestate | number(38, 0) |
| 13 | isdaydep_flag | isdaydep_flag | isdaydep_flag | char(1) |
| 14 | isunsealdaydep_flag | isunsealdaydep_flag | isunsealdaydep_flag | char(1) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pre_flag | pre_flag | pre_flag | char(1) |
| 18 | rateexpression | rateexpression | rateexpression | varchar2(200) |
| 19 | rateformula | rateformula | rateformula | varchar2(200) |
| 20 | relegation | relegation | relegation | varchar2(80) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |