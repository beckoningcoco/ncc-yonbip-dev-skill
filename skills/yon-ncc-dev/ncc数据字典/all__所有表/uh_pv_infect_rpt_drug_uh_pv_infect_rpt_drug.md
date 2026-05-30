# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12748.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect_rpt | pk_infect_rpt | pk_infect_rpt | char(20) | √ |
| 2 | pk_inf_rpt_drug | pk_inf_rpt_drug | pk_inf_rpt_drug | char(20) | √ |
| 3 | pk_ord | pk_ord | pk_ord | char(20) | √ |
| 4 | def1 | def1 | def1 | varchar2(100) |
| 5 | def2 | def2 | def2 | varchar2(100) |
| 6 | def3 | def3 | def3 | varchar2(100) |
| 7 | def4 | def4 | def4 | varchar2(100) |
| 8 | def5 | def5 | def5 | varchar2(100) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |