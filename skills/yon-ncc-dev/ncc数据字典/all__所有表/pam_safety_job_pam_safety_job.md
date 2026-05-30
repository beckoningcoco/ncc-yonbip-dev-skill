# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_safety_job | pk_safety_job | pk_safety_job | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) |
| 3 | bill_name | bill_name | bill_name | varchar2(120) |
| 4 | bill_name2 | bill_name2 | bill_name2 | varchar2(120) |
| 5 | bill_name3 | bill_name3 | bill_name3 | varchar2(120) |
| 6 | bill_name4 | bill_name4 | bill_name4 | varchar2(120) |
| 7 | bill_name5 | bill_name5 | bill_name5 | varchar2(120) |
| 8 | bill_name6 | bill_name6 | bill_name6 | varchar2(120) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | enablestate | enablestate | enablestate | number(38, 0) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 17 | requirepermit | requirepermit | requirepermit | char(1) |
| 18 | transi_type | transi_type | transi_type | varchar2(20) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |