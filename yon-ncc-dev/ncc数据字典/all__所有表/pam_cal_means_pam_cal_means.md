# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cal_means | pk_cal_means | pk_cal_means | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | func_content | func_content | func_content | varchar2(2000) |
| 4 | func_ref | func_ref | func_ref | varchar2(2000) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | method_code | method_code | method_code | varchar2(80) |
| 7 | method_name | method_name | method_name | varchar2(300) |
| 8 | method_name2 | method_name2 | method_name2 | varchar2(300) |
| 9 | method_name3 | method_name3 | method_name3 | varchar2(300) |
| 10 | method_name4 | method_name4 | method_name4 | varchar2(300) |
| 11 | method_name5 | method_name5 | method_name5 | varchar2(300) |
| 12 | method_name6 | method_name6 | method_name6 | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | type | type | type | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |