# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7193.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ph | pk_ph | pk_ph | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | dy_phtype | dy_phtype | dy_phtype | varchar2(20) |  |  | '~' |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | guide_ph | guide_ph | guide_ph | varchar2(256) |
| 6 | name | name | name | varchar2(50) |
| 7 | name2 | name2 | name2 | varchar2(50) |
| 8 | name3 | name3 | name3 | varchar2(50) |
| 9 | name4 | name4 | name4 | varchar2(50) |
| 10 | name5 | name5 | name5 | varchar2(50) |
| 11 | name6 | name6 | name6 | varchar2(50) |
| 12 | note | note | note | varchar2(256) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | sortno | sortno | sortno | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |