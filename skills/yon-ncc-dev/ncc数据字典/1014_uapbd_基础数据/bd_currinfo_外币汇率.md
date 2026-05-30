# |<<

**外币汇率 (bd_currinfo / nc.vo.bd.currinfo.CurrinfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currinfo | 币种信息主键 | pk_currinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 源币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 3 | ratedigit | 汇率小数位数 | ratedigit | int |  | 汇率小数位数 (ratedigit) |  | 0=0; |