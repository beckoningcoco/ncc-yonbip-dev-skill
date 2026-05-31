# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_area | pk_area | pk_area | char(20) | √ |
| 2 | areadesc | areadesc | areadesc | varchar2(50) |
| 3 | areahide | areahide | areahide | char(1) |
| 4 | areastatus | areastatus | areastatus | varchar2(50) |
| 5 | areatype | areatype | areatype | number(38, 0) |
| 6 | associatedtab | associatedtab | associatedtab | varchar2(200) |
| 7 | associatedtablayout | associatedtablayout | associatedtablayout | varchar2(50) |
| 8 | clazz | clazz | clazz | varchar2(200) |
| 9 | code | code | code | varchar2(50) |
| 10 | isclosequickquery | isclosequickquery | isclosequickquery | char(1) |
| 11 | isgrandson | isgrandson | isgrandson | char(1) |
| 12 | isunfold | isunfold | isunfold | char(1) |
| 13 | metaid | metaid | metaid | varchar2(50) |
| 14 | metaname | metaname | metaname | varchar2(300) |
| 15 | metaspace | metaspace | metaspace | varchar2(50) |
| 16 | name | name | name | varchar2(100) |
| 17 | pagination | pagination | pagination | varchar2(50) |
| 18 | position | position | position | number(38, 0) |
| 19 | relationcode | relationcode | relationcode | varchar2(50) |
| 20 | resid | resid | resid | varchar2(50) |
| 21 | tabheadcode | tabheadcode | tabheadcode | varchar2(50) |
| 22 | templetid | templetid | templetid | varchar2(20) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |