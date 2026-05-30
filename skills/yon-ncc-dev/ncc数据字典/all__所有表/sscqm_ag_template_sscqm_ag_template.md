# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_template | pk_template | pk_template | char(20) | √ |
| 2 | code | code | code | varchar2(500) |
| 3 | content | content | content | blob |
| 4 | enablestate | enablestate | enablestate | varchar2(50) |
| 5 | isdefault | isdefault | isdefault | char(1) |  |  | 'N' |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | remark | remark | remark | varchar2(500) |
| 15 | templatetype | templatetype | templatetype | varchar2(50) |
| 16 | defitem1 | defitem1 | defitem1 | varchar2(101) |
| 17 | defitem2 | defitem2 | defitem2 | varchar2(101) |
| 18 | defitem3 | defitem3 | defitem3 | varchar2(101) |
| 19 | defitem4 | defitem4 | defitem4 | varchar2(101) |
| 20 | defitem5 | defitem5 | defitem5 | varchar2(101) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |