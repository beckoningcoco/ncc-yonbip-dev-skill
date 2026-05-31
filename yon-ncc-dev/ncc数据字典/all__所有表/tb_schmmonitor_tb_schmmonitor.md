# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | checkts | checkts | checkts | varchar2(19) |
| 3 | pk_ctrlformula | pk_ctrlformula | pk_ctrlformula | char(20) |
| 4 | pk_ctrlscheme | pk_ctrlscheme | pk_ctrlscheme | char(20) |
| 5 | pk_task | pk_task | pk_task | char(20) |
| 6 | prereadydata | prereadydata | prereadydata | number(30, 8) |
| 7 | prerundata | prerundata | prerundata | number(30, 8) |
| 8 | readydata | readydata | readydata | number(30, 8) |
| 9 | rundata | rundata | rundata | number(30, 8) |
| 10 | varno | varno | varno | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |