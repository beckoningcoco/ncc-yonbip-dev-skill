# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | billortrantypecode | billortrantypecode | billortrantypecode | varchar2(50) |
| 3 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 4 | billtypename | billtypename | billtypename | varchar2(50) |
| 5 | creater | creater | creater | varchar2(20) |  |  | '~' |
| 6 | enablestate | enablestate | enablestate | varchar2(20) |  |  | '~' |
| 7 | is_driveflow | is_driveflow | is_driveflow | char(1) |
| 8 | is_needscan | is_needscan | is_needscan | char(1) |
| 9 | ownmodulename | ownmodulename | ownmodulename | varchar2(50) |
| 10 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_trantypecode | pk_trantypecode | pk_trantypecode | varchar2(20) |  |  | '~' |
| 13 | scanway | scanway | scanway | varchar2(20) |  |  | '~' |
| 14 | trantypecode | trantypecode | trantypecode | varchar2(50) |
| 15 | trantypename | trantypename | trantypename | varchar2(50) |
| 16 | def0 | def0 | def0 | char(1) |
| 17 | def1 | def1 | def1 | varchar2(50) |
| 18 | def2 | def2 | def2 | varchar2(50) |
| 19 | def3 | def3 | def3 | varchar2(50) |
| 20 | def4 | def4 | def4 | char(1) |
| 21 | def5 | def5 | def5 | char(1) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |