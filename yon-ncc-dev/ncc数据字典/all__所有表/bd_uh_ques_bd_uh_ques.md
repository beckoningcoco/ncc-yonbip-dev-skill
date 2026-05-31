# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7212.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvques | pk_pvques | pk_pvques | char(20) | √ |
| 2 | addr_board | addr_board | addr_board | varchar2(256) |
| 3 | code | code | code | varchar2(30) |
| 4 | dept_name | dept_name | dept_name | varchar2(200) |
| 5 | dt_quetype | dt_quetype | dt_quetype | varchar2(50) |
| 6 | enablestate | enablestate | enablestate | char(1) |
| 7 | name | name | name | varchar2(200) |
| 8 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pvquerule | pk_pvquerule | pk_pvquerule | varchar2(20) |  |  | '~' |
| 12 | pk_quetype | pk_quetype | pk_quetype | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |