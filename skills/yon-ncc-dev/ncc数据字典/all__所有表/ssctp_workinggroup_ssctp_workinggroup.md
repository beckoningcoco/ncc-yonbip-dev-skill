# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workinggroup | pk_workinggroup | pk_workinggroup | char(20) | √ |
| 2 | code | code | code | varchar2(200) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | formula | formula | formula | varchar2(2000) |
| 5 | formulashow | formulashow | formulashow | varchar2(2000) |
| 6 | fullpath | fullpath | fullpath | varchar2(2000) |
| 7 | fullpathshow | fullpathshow | fullpathshow | varchar2(2000) |
| 8 | innercode | innercode | innercode | varchar2(40) |
| 9 | isleaf | isleaf | isleaf | char(1) |
| 10 | name | name | name | varchar2(300) |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | parentid | parentid | parentid | varchar2(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |