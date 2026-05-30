# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_udcate | pk_udcate | pk_udcate | char(20) | √ |
| 2 | code | code | code | varchar2(30) | √ |
| 3 | innercode | innercode | innercode | varchar2(50) |
| 4 | name | name | name | varchar2(200) | √ |
| 5 | name_invtemp | name_invtemp | name_invtemp | varchar2(255) |
| 6 | name_rpttemp | name_rpttemp | name_rpttemp | varchar2(255) |
| 7 | note | note | note | varchar2(200) |
| 8 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |