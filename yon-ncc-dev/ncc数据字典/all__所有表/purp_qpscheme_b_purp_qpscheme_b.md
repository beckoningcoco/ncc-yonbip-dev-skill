# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11067.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpscheme_b | pk_qpscheme_b | pk_qpscheme_b | char(20) | √ |
| 2 | bweightavg | bweightavg | bweightavg | char(1) |
| 3 | fschemetype | fschemetype | fschemetype | number(38, 0) |
| 4 | npriority | npriority | npriority | number(38, 0) |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 7 | pk_qpstandardbase | pk_qpstandardbase | pk_qpstandardbase | varchar2(20) |  |  | '~' |
| 8 | qpschemebody | qpschemebody | qpschemebody | char(20) | √ |
| 9 | vbmemo | vbmemo | vbmemo | varchar2(181) |
| 10 | vprecondcode | vprecondcode | vprecondcode | varchar2(996) |
| 11 | vprecondname | vprecondname | vprecondname | varchar2(996) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |