# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxregion | pk_taxregion | pk_taxregion | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 5 | name | name | name | varchar2(300) | √ |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | pk_country | pk_country | pk_country | varchar2(20) | √ |
| 12 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 14 | remark | remark | remark | varchar2(300) |
| 15 | remark2 | remark2 | remark2 | varchar2(300) |
| 16 | remark3 | remark3 | remark3 | varchar2(300) |
| 17 | remark4 | remark4 | remark4 | varchar2(300) |
| 18 | remark5 | remark5 | remark5 | varchar2(300) |
| 19 | remark6 | remark6 | remark6 | varchar2(300) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |