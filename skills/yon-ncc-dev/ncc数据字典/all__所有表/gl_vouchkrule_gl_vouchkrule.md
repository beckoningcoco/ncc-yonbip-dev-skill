# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchkrule | pk_vouchkrule | pk_vouchkrule | char(20) | √ |
| 2 | accbalancerule | accbalancerule | accbalancerule | char(1) |
| 3 | accountrule | accountrule | accountrule | char(1) |
| 4 | cashaccrule | cashaccrule | cashaccrule | char(1) |
| 5 | code | code | code | varchar2(50) | √ |
| 6 | enablestate | enablestate | enablestate | number(38, 0) |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 17 | remark | remark | remark | varchar2(200) |
| 18 | voukindrule | voukindrule | voukindrule | char(1) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |