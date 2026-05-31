# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_check_schema | pk_check_schema | pk_check_schema | char(20) | √ |
| 2 | busi_prop | busi_prop | busi_prop | varchar2(20) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | id | id | id | varchar2(40) | √ |
| 5 | mnecode | mnecode | mnecode | varchar2(50) |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | note | note | note | varchar2(1024) |
| 13 | parent_id | parent_id | parent_id | char(20) |
| 14 | pk_group | pk_group | pk_group | char(20) |
| 15 | pk_org | pk_org | pk_org | char(20) |
| 16 | sealflag | sealflag | sealflag | char(1) |
| 17 | usedflag | usedflag | usedflag | char(1) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | char(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | char(20) |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |