# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 3 | asstype | asstype | asstype | number(38, 0) |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | description | description | description | varchar2(512) |
| 6 | displayname | displayname | displayname | varchar2(90) |
| 7 | endcardinality | endcardinality | endcardinality | varchar2(10) |
| 8 | endfieldid | endfieldid | endfieldid | varchar2(50) | √ |
| 9 | endtableid | endtableid | endtableid | varchar2(50) | √ |
| 10 | help | help | help | varchar2(1024) |
| 11 | isforeignkey | isforeignkey | isforeignkey | char(1) |
| 12 | modifytime | modifytime | modifytime | char(19) |
| 13 | name | name | name | varchar2(90) | √ |
| 14 | resid | resid | resid | varchar2(90) |
| 15 | startattrid | startattrid | startattrid | varchar2(50) |
| 16 | startcardinality | startcardinality | startcardinality | varchar2(10) |
| 17 | startfieldid | startfieldid | startfieldid | varchar2(50) | √ |
| 18 | starttableid | starttableid | starttableid | varchar2(50) | √ |
| 19 | creator | creator | creator | varchar2(30) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifier | modifier | modifier | varchar2(30) |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |