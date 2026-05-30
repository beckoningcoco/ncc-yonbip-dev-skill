# |<<

**缴交地规则子表 (bm_detailrule / nc.vo.bm.locationrule.DetailRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1227.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loctrule_b | pk_loctrule_b | pk_loctrule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_loctrule | pk_loctrule | pk_loctrule | varchar(20) |  | 缴交地规则 (locationrule) |
| 3 | pk_bm_class | 险种编码 | pk_bm_class | varchar(20) | √ | 险种 (bmclass) |
| 4 | entpportion | 单位缴纳比例(%) | entpportion | decimal(31, 2) |  | 数值 (UFDouble) | 0 |
| 5 | entpfixvalue | 单位缴纳固定值 | entpfixvalue | decimal(31, 2) |  | 数值 (UFDouble) | 0 |
| 6 | personportion | 个人缴纳比例(%) | personportion | decimal(31, 2) |  | 数值 (UFDouble) | 0 |
| 7 | personfixvalue | 个人缴纳固定值 | personfixvalue | decimal(31, 2) |  | 数值 (UFDouble) | 0 |
| 8 | entpremit | 单位划转比例(%) | entpremit | decimal(31, 2) |  | 数值 (UFDouble) | 0 |
| 9 | roundmode | 进位方式 | roundmode | int |  | 进位方式 (RoundType) | 0 | 0=四舍五入; |