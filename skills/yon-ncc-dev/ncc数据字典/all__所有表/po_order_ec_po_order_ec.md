# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order | pk_order | pk_order | char(20) | √ |
| 2 | bpublish | bpublish | bpublish | char(1) |  |  | 'N' |
| 3 | breleasedover | breleasedover | breleasedover | char(1) |
| 4 | irespstatus | irespstatus | irespstatus | number(38, 0) |
| 5 | pk_pubpsn | pk_pubpsn | pk_pubpsn | varchar2(20) |  |  | '~' |
| 6 | pk_resppsn | pk_resppsn | pk_resppsn | varchar2(20) |  |  | '~' |
| 7 | tpubtime | tpubtime | tpubtime | char(19) |
| 8 | tresptime | tresptime | tresptime | char(19) |
| 9 | vreason | vreason | vreason | varchar2(181) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |