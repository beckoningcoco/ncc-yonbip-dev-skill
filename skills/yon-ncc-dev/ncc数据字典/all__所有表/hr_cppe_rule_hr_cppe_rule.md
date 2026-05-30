# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scorule | pk_scorule | pk_scorule | char(20) | √ |
| 2 | code | code | code | varchar2(80) |
| 3 | decimal_digits | decimal_digits | decimal_digits | number(38, 0) |
| 4 | description | description | description | varchar2(1536) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) | √ |
| 6 | iscommon | iscommon | iscommon | char(1) |  |  | 'Y' |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | char(20) | √ |
| 14 | pk_org | pk_org | pk_org | char(20) | √ |
| 15 | remark | remark | remark | varchar2(1536) |
| 16 | rule_type | rule_type | rule_type | number(38, 0) | √ |
| 17 | score_max | score_max | score_max | number(38, 0) |
| 18 | score_min | score_min | score_min | number(38, 0) |
| 19 | sourcetype | sourcetype | sourcetype | number(38, 0) | √ |
| 20 | creationtime | creationtime | creationtime | char(19) | √ |
| 21 | creator | creator | creator | char(20) | √ |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | char(20) |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |