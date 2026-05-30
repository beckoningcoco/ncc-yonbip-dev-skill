# |<<

**合并方案关键字 (ufoc_schemekey / nc.vo.ufoc.hbschemekey.SchemeKeyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbschemekey | 主键 | pk_hbschemekey | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 3 | pk_adjscheme | 调整方案 | pk_adjscheme | varchar(20) |  | 报表调整方案 (adjscheme) |
| 4 | pk_dxscheme | 抵销方案 | pk_dxscheme | varchar(20) |  | 抵销方案 (dxscheme) |
| 5 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 6 | pk_dxrelation | 抵销模板 | pk_dxrelation | varchar(20) |  | 调整及抵销模板 (dxrelation) |
| 7 | contrastresult | 对账结果 | contrastresult | int |  | 对账结果 (contrastresult) |  | 3=全部; |