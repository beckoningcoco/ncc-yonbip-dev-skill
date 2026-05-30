# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7308.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | pk_dir | pk_dir | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | code | code | code | varchar2(50) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | note | note | note | varchar2(500) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |
| 15 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 16 | sysinit | sysinit | sysinit | char(50) |
| 17 | usagemode | usagemode | usagemode | number(38, 0) |  |  | 1 |
| 18 | def1 | def1 | def1 | varchar2(50) |
| 19 | def2 | def2 | def2 | varchar2(50) |
| 20 | def3 | def3 | def3 | varchar2(50) |
| 21 | def4 | def4 | def4 | varchar2(50) |
| 22 | def5 | def5 | def5 | varchar2(50) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |