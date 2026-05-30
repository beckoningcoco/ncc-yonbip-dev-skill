# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9809.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | authorizable | authorizable | authorizable | char(1) |
| 5 | componentid | componentid | componentid | varchar2(50) |
| 6 | createtime | createtime | createtime | varchar2(50) |
| 7 | description | description | description | varchar2(50) |
| 8 | displayname | displayname | displayname | varchar2(512) |
| 9 | isservice | isservice | isservice | char(1) |
| 10 | modifitime | modifitime | modifitime | char(19) |
| 11 | name | name | name | varchar2(512) |
| 12 | ownertype | ownertype | ownertype | varchar2(50) |
| 13 | resid | resid | resid | varchar2(90) |
| 14 | tag | tag | tag | varchar2(512) |
| 15 | creator | creator | creator | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifier | modifier | modifier | varchar2(30) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |