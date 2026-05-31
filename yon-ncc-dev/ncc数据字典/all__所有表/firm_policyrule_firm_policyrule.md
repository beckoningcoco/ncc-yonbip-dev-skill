# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_policyrule | pk_policyrule | pk_policyrule | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | contracttype | contracttype | contracttype | varchar2(20) |  |  | '~' |
| 4 | fsalemode | fsalemode | fsalemode | varchar2(20) |  |  | '~' |
| 5 | giveawayflag | giveawayflag | giveawayflag | varchar2(50) |
| 6 | martype | martype | martype | varchar2(20) |  |  | '~' |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 15 | policy | policy | policy | varchar2(20) |  |  | '~' |
| 16 | policyname | policyname | policyname | varchar2(20) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |