# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meas_items | pk_meas_items | pk_meas_items | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | file_val_all | file_val_all | file_val_all | varchar2(512) |
| 4 | iot_properties_id | iot_properties_id | iot_properties_id | varchar2(200) |
| 5 | item_code | item_code | item_code | varchar2(40) |
| 6 | item_name | item_name | item_name | varchar2(300) |
| 7 | item_name2 | item_name2 | item_name2 | varchar2(300) |
| 8 | item_name3 | item_name3 | item_name3 | varchar2(300) |
| 9 | item_name4 | item_name4 | item_name4 | varchar2(300) |
| 10 | item_name5 | item_name5 | item_name5 | varchar2(300) |
| 11 | item_name6 | item_name6 | item_name6 | varchar2(300) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pre_flag | pre_flag | pre_flag | char(1) |
| 17 | result_type | result_type | result_type | number(38, 0) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |