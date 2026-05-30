# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10913.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatemplet_id | pk_datatemplet_id | pk_datatemplet_id | char(20) | √ |
| 2 | bill_ts | bill_ts | bill_ts | varchar2(100) | √ |
| 3 | extend1 | extend1 | extend1 | varchar2(101) |
| 4 | extend2 | extend2 | extend2 | varchar2(101) |
| 5 | extend3 | extend3 | extend3 | varchar2(101) |
| 6 | extend4 | extend4 | extend4 | varchar2(101) |
| 7 | fun_code | fun_code | fun_code | char(20) | √ |
| 8 | isdefault | isdefault | isdefault | char(1) | √ |
| 9 | templetdata | templetdata | templetdata | blob |
| 10 | templet_name | templet_name | templet_name | varchar2(300) | √ |
| 11 | templet_name2 | templet_name2 | templet_name2 | varchar2(300) |
| 12 | templet_name3 | templet_name3 | templet_name3 | varchar2(300) |
| 13 | templet_name4 | templet_name4 | templet_name4 | varchar2(300) |
| 14 | templet_name5 | templet_name5 | templet_name5 | varchar2(300) |
| 15 | templet_name6 | templet_name6 | templet_name6 | varchar2(300) |
| 16 | templet_order | templet_order | templet_order | number(38, 0) | √ |
| 17 | user_pk | user_pk | user_pk | char(20) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |