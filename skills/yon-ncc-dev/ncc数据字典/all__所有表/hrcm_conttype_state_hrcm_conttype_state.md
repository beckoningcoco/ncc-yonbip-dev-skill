# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conttype_state | pk_conttype_state | pk_conttype_state | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) |
| 3 | contstate | contstate | contstate | number(38, 0) |
| 4 | conttype | conttype | conttype | char(20) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 6 | pk_psnorg | pk_psnorg | pk_psnorg | char(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |