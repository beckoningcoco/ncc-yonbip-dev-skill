# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fileexattr | pk_fileexattr | pk_fileexattr | char(20) | √ |
| 2 | location | location | location | char(1) | √ |
| 3 | pk_bill | pk_bill | pk_bill | char(20) | √ |
| 4 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(10) |
| 5 | pk_exattr | pk_exattr | pk_exattr | char(20) | √ |
| 6 | pk_file | pk_file | pk_file | char(20) | √ |
| 7 | pk_filetype | pk_filetype | pk_filetype | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |