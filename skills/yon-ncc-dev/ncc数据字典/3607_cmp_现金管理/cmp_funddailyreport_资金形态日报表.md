# |<<

**资金形态日报表 (cmp_funddailyreport / nc.vo.cmp.funddailyreport.funddailyreport)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_funddailyrpt | 主键 | pk_funddailyrpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(0) |  | 币种 (currtype) |
| 3 | pk_notetype | 票据类型 | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 4 | fundformcode | 资金形态 | fundformcode | int |  | 资金形态 (fundformcode) |  | 0=库存现金; |