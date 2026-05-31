# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investset | pk_investset | pk_investset | char(20) | √ |
| 2 | dataversion | dataversion | dataversion | number(38, 0) |
| 3 | funnodetype | funnodetype | funnodetype | varchar2(10) |  |  | '0' |
| 4 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |
| 5 | pk_investee | pk_investee | pk_investee | varchar2(20) |
| 6 | pk_investor | pk_investor | pk_investor | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |