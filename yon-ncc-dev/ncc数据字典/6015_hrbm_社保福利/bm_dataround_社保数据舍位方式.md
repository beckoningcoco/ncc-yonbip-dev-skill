# |<<

**社保数据舍位方式 (bm_dataround / nc.vo.bm.data.BmDataroundVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1226.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataround | 主键 | pk_dataround | char(20) | √ | 主键 (UFID) |
| 2 | pk_classitem | 险种项目 | pk_classitem | varchar(20) | √ | 险种项目 (bmclassitem) |
| 3 | pk_loctrule | 缴交地 | pk_loctrule | varchar(20) | √ | 缴交地规则 (locationrule) |
| 4 | round_type | 舍位方式 | round_type | int | √ | 舍位方式 (BmRoundType) |  | 8=四舍五入到分; |