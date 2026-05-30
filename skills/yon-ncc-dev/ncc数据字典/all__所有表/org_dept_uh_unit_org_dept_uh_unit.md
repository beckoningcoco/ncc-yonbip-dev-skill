# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10198.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unit | pk_unit | pk_unit | char(20) | √ |
| 2 | cnt | cnt | cnt | number(38, 0) |
| 3 | code | code | code | varchar2(20) |
| 4 | desc_unit | desc_unit | desc_unit | varchar2(256) |
| 5 | eu_butype | eu_butype | eu_butype | number(28, 8) |
| 6 | eu_unittype | eu_unittype | eu_unittype | number(28, 8) |
| 7 | flag_online | flag_online | flag_online | char(1) |
| 8 | name | name | name | varchar2(30) |
| 9 | pk_dept | pk_dept | pk_dept | char(20) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_org | pk_org | pk_org | char(20) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |