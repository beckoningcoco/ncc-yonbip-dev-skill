# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustscheme | pk_adjustscheme | pk_adjustscheme | char(20) | √ |
| 2 | code | code | code | number(38, 0) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | isaddadjust | isaddadjust | isaddadjust | char(1) |
| 5 | name | name | name | varchar2(200) |
| 6 | name2 | name2 | name2 | varchar2(200) |
| 7 | name3 | name3 | name3 | varchar2(200) |
| 8 | name4 | name4 | name4 | varchar2(200) |
| 9 | name5 | name5 | name5 | varchar2(200) |
| 10 | name6 | name6 | name6 | varchar2(200) |
| 11 | note | note | note | varchar2(1024) |
| 12 | parent_id | parent_id | parent_id | char(20) |
| 13 | pk_group | pk_group | pk_group | char(20) |
| 14 | pk_org | pk_org | pk_org | char(20) |
| 15 | sealflag | sealflag | sealflag | char(1) |
| 16 | usedflag | usedflag | usedflag | char(1) |
| 17 | version | version | version | number(38, 0) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | char(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | char(20) |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |