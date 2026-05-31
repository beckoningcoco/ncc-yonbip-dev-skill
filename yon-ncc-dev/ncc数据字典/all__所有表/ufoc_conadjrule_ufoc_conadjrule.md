# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conadjrule | pk_conadjrule | pk_conadjrule | char(20) | √ |
| 2 | linenum | linenum | linenum | number(38, 0) |
| 3 | pk_adjrule | pk_adjrule | pk_adjrule | varchar2(20) |  |  | '~' |
| 4 | pk_batchrule | pk_batchrule | pk_batchrule | char(20) | √ |
| 5 | pk_createorg | pk_createorg | pk_createorg | char(20) |
| 6 | def1 | def1 | def1 | varchar2(101) |
| 7 | def2 | def2 | def2 | varchar2(101) |
| 8 | def3 | def3 | def3 | varchar2(101) |
| 9 | def4 | def4 | def4 | varchar2(101) |
| 10 | def5 | def5 | def5 | varchar2(101) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |