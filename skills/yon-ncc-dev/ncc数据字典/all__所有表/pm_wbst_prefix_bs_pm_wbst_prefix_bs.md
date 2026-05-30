# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10734.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbs_prefix | pk_wbs_prefix | pk_wbs_prefix | char(20) | √ |
| 2 | delaytime | delaytime | delaytime | number(38, 0) |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | pk_prefixwbs | pk_prefixwbs | pk_prefixwbs | varchar2(36) |  |  | '~' |
| 5 | pk_wbstemplet_b | pk_wbstemplet_b | pk_wbstemplet_b | char(20) | √ |
| 6 | relation | relation | relation | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |