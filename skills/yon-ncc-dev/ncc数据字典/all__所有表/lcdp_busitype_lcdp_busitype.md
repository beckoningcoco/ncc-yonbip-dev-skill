# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busitype | pk_busitype | pk_busitype | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | name | name | name | varchar2(200) |
| 4 | name2 | name2 | name2 | varchar2(200) |
| 5 | name3 | name3 | name3 | varchar2(200) |
| 6 | name4 | name4 | name4 | varchar2(200) |
| 7 | name5 | name5 | name5 | varchar2(200) |
| 8 | name6 | name6 | name6 | varchar2(200) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |