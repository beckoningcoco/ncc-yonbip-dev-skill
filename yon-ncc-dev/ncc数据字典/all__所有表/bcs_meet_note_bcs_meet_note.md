# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetnote | pk_meetnote | pk_meetnote | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(64) | √ |
| 3 | creditconfirm | creditconfirm | creditconfirm | varchar2(20) |  |  | '~' |
| 4 | creditconfirmtime | creditconfirmtime | creditconfirmtime | char(19) |
| 5 | debiconfirm | debiconfirm | debiconfirm | varchar2(20) |  |  | '~' |
| 6 | debiconfirmtime | debiconfirmtime | debiconfirmtime | char(19) |
| 7 | meetcreditnote | meetcreditnote | meetcreditnote | varchar2(200) |
| 8 | meetdebinote | meetdebinote | meetdebinote | varchar2(200) |
| 9 | def1 | def1 | def1 | varchar2(50) |
| 10 | def2 | def2 | def2 | varchar2(50) |
| 11 | def3 | def3 | def3 | varchar2(50) |
| 12 | def4 | def4 | def4 | varchar2(50) |
| 13 | def5 | def5 | def5 | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |