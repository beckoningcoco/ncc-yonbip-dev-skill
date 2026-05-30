# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_personalization | pk_personalization | pk_personalization | char(20) | √ |
| 2 | leveltype | leveltype | leveltype | number(38, 0) |
| 3 | matchitem | matchitem | matchitem | varchar2(50) |
| 4 | matchitem1 | matchitem1 | matchitem1 | varchar2(50) |
| 5 | matchitem2 | matchitem2 | matchitem2 | varchar2(50) |
| 6 | matchitem3 | matchitem3 | matchitem3 | varchar2(50) |
| 7 | matchitem4 | matchitem4 | matchitem4 | varchar2(50) |
| 8 | matchitem5 | matchitem5 | matchitem5 | varchar2(50) |
| 9 | pk_levelobjectid | pk_levelobjectid | pk_levelobjectid | varchar2(20) |  |  | '~' |
| 10 | pk_resobjectid | pk_resobjectid | pk_resobjectid | varchar2(20) |  |  | '~' |
| 11 | pk_restype | pk_restype | pk_restype | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |