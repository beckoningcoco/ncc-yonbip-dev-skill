# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) |
| 3 | bill_type | bill_type | bill_type | varchar2(4) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | isolate_obj | isolate_obj | isolate_obj | varchar2(600) |
| 6 | isolate_require | isolate_require | isolate_require | varchar2(200) |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | templet_name | templet_name | templet_name | varchar2(300) |
| 14 | templet_name2 | templet_name2 | templet_name2 | varchar2(300) |
| 15 | templet_name3 | templet_name3 | templet_name3 | varchar2(300) |
| 16 | templet_name4 | templet_name4 | templet_name4 | varchar2(300) |
| 17 | templet_name5 | templet_name5 | templet_name5 | varchar2(300) |
| 18 | templet_name6 | templet_name6 | templet_name6 | varchar2(300) |
| 19 | def1 | def1 | def1 | varchar2(101) |
| 20 | def2 | def2 | def2 | varchar2(101) |
| 21 | def3 | def3 | def3 | varchar2(101) |
| 22 | def4 | def4 | def4 | varchar2(101) |
| 23 | def5 | def5 | def5 | varchar2(101) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |