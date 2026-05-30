# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rack | pk_rack | pk_rack | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | inpriority | inpriority | inpriority | number(38, 0) |  |  | 0 |
| 7 | ischecked | ischecked | ischecked | char(1) | √ |  | 'N' |
| 8 | isrmplace | isrmplace | isrmplace | char(1) | √ |  | 'N' |
| 9 | memo | memo | memo | varchar2(300) |
| 10 | name | name | name | varchar2(300) | √ |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | outpriority | outpriority | outpriority | number(38, 0) |  |  | 0 |
| 17 | pk_group | pk_group | pk_group | char(20) | √ |
| 18 | pk_org | pk_org | pk_org | char(20) | √ |
| 19 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 20 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 21 | pk_stordoc | pk_stordoc | pk_stordoc | char(20) | √ |
| 22 | volume | volume | volume | number(20, 8) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |