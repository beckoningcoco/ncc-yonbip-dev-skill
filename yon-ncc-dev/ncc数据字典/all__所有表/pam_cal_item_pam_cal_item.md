# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cal_item | pk_cal_item | pk_cal_item | char(20) | √ |
| 2 | calitem_code | calitem_code | calitem_code | varchar2(40) |
| 3 | calitem_name | calitem_name | calitem_name | varchar2(120) |
| 4 | calitem_name2 | calitem_name2 | calitem_name2 | varchar2(120) |
| 5 | calitem_name3 | calitem_name3 | calitem_name3 | varchar2(120) |
| 6 | calitem_name4 | calitem_name4 | calitem_name4 | varchar2(120) |
| 7 | calitem_name5 | calitem_name5 | calitem_name5 | varchar2(120) |
| 8 | calitem_name6 | calitem_name6 | calitem_name6 | varchar2(120) |
| 9 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 10 | func_content | func_content | func_content | varchar2(2000) |
| 11 | func_ref | func_ref | func_ref | varchar2(2000) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |