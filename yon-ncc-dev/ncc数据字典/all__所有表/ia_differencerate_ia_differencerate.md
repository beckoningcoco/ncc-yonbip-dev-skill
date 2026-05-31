# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8889.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdifferencerateid | cdifferencerateid | cdifferencerateid | char(20) | √ |
| 2 | cinvclassid | cinvclassid | cinvclassid | varchar2(20) |  |  | '~' |
| 3 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 4 | cinventoryvid | cinventoryvid | cinventoryvid | varchar2(20) |  |  | '~' |
| 5 | ndiffdownlimit | ndiffdownlimit | ndiffdownlimit | number(28, 15) |
| 6 | ndiffuplimit | ndiffuplimit | ndiffuplimit | number(28, 15) |
| 7 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |