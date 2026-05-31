# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | datasource | datasource | datasource | varchar2(200) |
| 5 | forbidnccflag | forbidnccflag | forbidnccflag | char(1) |  |  | 'N' |
| 6 | modelcode | modelcode | modelcode | varchar2(15) |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | note | note | note | varchar2(1024) |
| 14 | pk_dir | pk_dir | pk_dir | char(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | reportcode | reportcode | reportcode | varchar2(50) |
| 18 | reportinfo | reportinfo | reportinfo | blob |
| 19 | sysinit | sysinit | sysinit | varchar2(50) |
| 20 | def1 | def1 | def1 | varchar2(101) |
| 21 | def2 | def2 | def2 | varchar2(101) |
| 22 | def3 | def3 | def3 | varchar2(101) |
| 23 | def4 | def4 | def4 | varchar2(101) |
| 24 | def5 | def5 | def5 | varchar2(101) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |