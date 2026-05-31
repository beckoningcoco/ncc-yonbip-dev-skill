# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportitem | pk_reportitem | pk_reportitem | char(20) | √ |
| 2 | caloperator | caloperator | caloperator | number(38, 0) |
| 3 | code | code | code | varchar2(50) | √ |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | fathercode | fathercode | fathercode | varchar2(50) |
| 6 | glorient | glorient | glorient | number(38, 0) |
| 7 | innercode | innercode | innercode | varchar2(200) |
| 8 | itemlevel | itemlevel | itemlevel | number(38, 0) |
| 9 | itemprop | itemprop | itemprop | number(38, 0) | √ |  | 1 |
| 10 | itemtype | itemtype | itemtype | number(38, 0) |
| 11 | member | member | member | varchar2(20) |  |  | '~' |
| 12 | name | name | name | varchar2(300) | √ |
| 13 | name2 | name2 | name2 | varchar2(300) |
| 14 | name3 | name3 | name3 | varchar2(300) |
| 15 | name4 | name4 | name4 | varchar2(300) |
| 16 | name5 | name5 | name5 | varchar2(300) |
| 17 | name6 | name6 | name6 | varchar2(300) |
| 18 | pk_fatheritem | pk_fatheritem | pk_fatheritem | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_reportsystem | pk_reportsystem | pk_reportsystem | char(20) | √ |
| 22 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 23 | record | record | record | varchar2(36) |  |  | '~' |
| 24 | remark | remark | remark | varchar2(200) |
| 25 | tborient | tborient | tborient | number(38, 0) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |