# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12862.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_collectitem | pk_wa_collectitem | pk_wa_collectitem | char(20) | √ |
| 2 | code | code | code | number(38, 0) | √ |
| 3 | itemid | itemid | itemid | char(20) | √ |
| 4 | name | name | name | varchar2(50) | √ |
| 5 | name2 | name2 | name2 | varchar2(50) |
| 6 | name3 | name3 | name3 | varchar2(50) |
| 7 | name4 | name4 | name4 | varchar2(50) |
| 8 | name5 | name5 | name5 | varchar2(50) |
| 9 | name6 | name6 | name6 | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_item | pk_item | pk_item | char(20) | √ |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | char(20) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |