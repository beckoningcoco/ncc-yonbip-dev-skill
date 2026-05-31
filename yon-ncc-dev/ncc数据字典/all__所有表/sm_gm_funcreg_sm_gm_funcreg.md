# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gm_func | pk_gm_func | pk_gm_func | char(20) | √ |
| 2 | funcode | funcode | funcode | varchar2(50) |  |  | '~' |
| 3 | moduleid | moduleid | moduleid | varchar2(20) |  |  | '~' |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |