# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | attr | attr | attr | varchar2(50) |
| 2 | code | code | code | varchar2(50) |
| 3 | dt_system | dt_system | dt_system | varchar2(20) |
| 4 | flag_show | flag_show | flag_show | char(1) |
| 5 | name | name | name | varchar2(300) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_hp | pk_hp | pk_hp | varchar2(50) |
| 8 | pk_hpsegmdt | pk_hpsegmdt | pk_hpsegmdt | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | segmdesc | segmdesc | segmdesc | varchar2(200) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |