# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eps | pk_eps | pk_eps | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | eps_code | eps_code | eps_code | varchar2(40) |
| 4 | eps_level | eps_level | eps_level | number(38, 0) |
| 5 | eps_name | eps_name | eps_name | varchar2(120) |
| 6 | eps_name2 | eps_name2 | eps_name2 | varchar2(120) |
| 7 | eps_name3 | eps_name3 | eps_name3 | varchar2(120) |
| 8 | eps_name4 | eps_name4 | eps_name4 | varchar2(120) |
| 9 | eps_name5 | eps_name5 | eps_name5 | varchar2(120) |
| 10 | eps_name6 | eps_name6 | eps_name6 | varchar2(120) |
| 11 | innercode | innercode | innercode | varchar2(40) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 14 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 15 | upload_flag | upload_flag | upload_flag | char(1) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |