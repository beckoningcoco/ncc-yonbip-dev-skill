# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_point | pk_measure_point | pk_measure_point | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(4) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 4 | iot_view_code | iot_view_code | iot_view_code | varchar2(200) |
| 5 | iot_view_name | iot_view_name | iot_view_name | varchar2(200) |
| 6 | memo | memo | memo | varchar2(200) |
| 7 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | point_code | point_code | point_code | varchar2(40) |
| 13 | point_name | point_name | point_name | varchar2(300) |
| 14 | point_name2 | point_name2 | point_name2 | varchar2(300) |
| 15 | point_name3 | point_name3 | point_name3 | varchar2(300) |
| 16 | point_name4 | point_name4 | point_name4 | varchar2(300) |
| 17 | point_name5 | point_name5 | point_name5 | varchar2(300) |
| 18 | point_name6 | point_name6 | point_name6 | varchar2(300) |
| 19 | def1 | def1 | def1 | varchar2(101) |
| 20 | def2 | def2 | def2 | varchar2(101) |
| 21 | def3 | def3 | def3 | varchar2(101) |
| 22 | def4 | def4 | def4 | varchar2(101) |
| 23 | def5 | def5 | def5 | varchar2(101) |
| 24 | def6 | def6 | def6 | varchar2(101) |
| 25 | def7 | def7 | def7 | varchar2(101) |
| 26 | def8 | def8 | def8 | varchar2(101) |
| 27 | def9 | def9 | def9 | varchar2(101) |
| 28 | def10 | def10 | def10 | varchar2(101) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |