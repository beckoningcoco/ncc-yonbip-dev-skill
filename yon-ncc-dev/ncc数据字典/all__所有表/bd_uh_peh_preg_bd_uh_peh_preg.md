# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7191.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_peh_preg | pk_peh_preg | pk_peh_preg | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | pk_pehwf | pk_pehwf | pk_pehwf | char(20) | √ |
| 5 | pk_peh_wf_preg | pk_peh_wf_preg | pk_peh_wf_preg | char(20) | √ |
| 6 | weekbegin | weekbegin | weekbegin | number(38, 0) |
| 7 | weekend | weekend | weekend | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |