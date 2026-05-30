# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10553.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkstandardclassify | pk_checkstandardclassify | pk_checkstandardclassify | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) | √ |
| 3 | bill_name | bill_name | bill_name | varchar2(300) | √ |
| 4 | bill_name2 | bill_name2 | bill_name2 | varchar2(300) |
| 5 | bill_name3 | bill_name3 | bill_name3 | varchar2(300) |
| 6 | bill_name4 | bill_name4 | bill_name4 | varchar2(300) |
| 7 | bill_name5 | bill_name5 | bill_name5 | varchar2(300) |
| 8 | bill_name6 | bill_name6 | bill_name6 | varchar2(300) |
| 9 | enablestate | enablestate | enablestate | number(38, 0) |
| 10 | innercode | innercode | innercode | varchar2(50) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 14 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |