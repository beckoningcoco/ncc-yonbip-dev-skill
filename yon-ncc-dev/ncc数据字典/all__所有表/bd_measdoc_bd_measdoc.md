# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measdoc | pk_measdoc | pk_measdoc | char(20) | √ |
| 2 | basecodeflag | basecodeflag | basecodeflag | char(1) | √ |
| 3 | bitnumber | bitnumber | bitnumber | number(38, 0) | √ |  | 0 |
| 4 | code | code | code | varchar2(40) | √ |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | ename | ename | ename | varchar2(200) |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | oppdimen | oppdimen | oppdimen | char(1) | √ |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | char(20) | √ |
| 16 | scalefactor | scalefactor | scalefactor | number(20, 8) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |