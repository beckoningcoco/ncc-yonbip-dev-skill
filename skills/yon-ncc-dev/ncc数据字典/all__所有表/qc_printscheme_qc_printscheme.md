# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11110.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printscheme | pk_printscheme | pk_printscheme | char(20) | √ |
| 2 | bprintmaterial | bprintmaterial | bprintmaterial | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_mprintscheme | pk_mprintscheme | pk_mprintscheme | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | vmemo | vmemo | vmemo | varchar2(181) |
| 8 | vschemecode | vschemecode | vschemecode | varchar2(40) |
| 9 | vschemename | vschemename | vschemename | varchar2(300) |
| 10 | vschemename2 | vschemename2 | vschemename2 | varchar2(300) |
| 11 | vschemename3 | vschemename3 | vschemename3 | varchar2(300) |
| 12 | vschemename4 | vschemename4 | vschemename4 | varchar2(300) |
| 13 | vschemename5 | vschemename5 | vschemename5 | varchar2(300) |
| 14 | vschemename6 | vschemename6 | vschemename6 | varchar2(300) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |