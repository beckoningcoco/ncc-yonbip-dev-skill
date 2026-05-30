# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7990.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sharerule | pk_sharerule | pk_sharerule | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | rule_code | rule_code | rule_code | varchar2(50) |
| 5 | rule_name | rule_name | rule_name | varchar2(300) |
| 6 | rule_name2 | rule_name2 | rule_name2 | varchar2(300) |
| 7 | rule_name3 | rule_name3 | rule_name3 | varchar2(300) |
| 8 | rule_name4 | rule_name4 | rule_name4 | varchar2(300) |
| 9 | rule_name5 | rule_name5 | rule_name5 | varchar2(300) |
| 10 | rule_name6 | rule_name6 | rule_name6 | varchar2(300) |
| 11 | rule_type | rule_type | rule_type | number(38, 0) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |