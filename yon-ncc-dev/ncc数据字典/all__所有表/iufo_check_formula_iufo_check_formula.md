# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_check_formula | pk_check_formula | pk_check_formula | char(20) | √ |
| 2 | formula | formula | formula | varchar2(1024) | √ |
| 3 | mnecode | mnecode | mnecode | varchar2(50) |
| 4 | name | name | name | varchar2(300) | √ |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | note | note | note | varchar2(1024) |
| 11 | pk_check_schema | pk_check_schema | pk_check_schema | char(20) | √ |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | sealflag | sealflag | sealflag | char(1) |
| 15 | usedflag | usedflag | usedflag | char(1) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | char(20) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | char(20) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |