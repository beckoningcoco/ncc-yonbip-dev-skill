# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskreport | pk_taskreport | pk_taskreport | char(20) | √ |
| 2 | commitattr | commitattr | commitattr | number(38, 0) |
| 3 | group_number | group_number | group_number | number(38, 0) |
| 4 | group_position | group_position | group_position | number(38, 0) |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_org | pk_org | pk_org | char(20) |
| 7 | pk_report | pk_report | pk_report | char(20) |
| 8 | pk_task | pk_task | pk_task | char(20) |
| 9 | report_order | report_order | report_order | number(38, 0) |
| 10 | type_dir | type_dir | type_dir | varchar2(50) |
| 11 | type_dir_order | type_dir_order | type_dir_order | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |