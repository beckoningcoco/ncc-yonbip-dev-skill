# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpttemp | pk_rpttemp | pk_rpttemp | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | data_temp | data_temp | data_temp | blob |
| 4 | dt_rpttype | dt_rpttype | dt_rpttype | char(1) |
| 5 | flag_active | flag_active | flag_active | char(1) |
| 6 | flag_replace | flag_replace | flag_replace | char(1) |
| 7 | flag_sys | flag_sys | flag_sys | char(1) |
| 8 | mnecode | mnecode | mnecode | varchar2(30) |
| 9 | name | name | name | varchar2(200) |
| 10 | note | note | note | varchar2(256) |
| 11 | path_temp | path_temp | path_temp | varchar2(256) |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | sql_order | sql_order | sql_order | varchar2(50) |
| 15 | sql_temp | sql_temp | sql_temp | clob |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | char(20) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | char(20) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |