# |<<

**分摊方法定义子表 (cost_spmethod_b / nc.vo.hrpco.spmethod.SpmethodBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptspagency_b | 子表主键 | pk_deptspagency_b | char(20) | √ | 主键 (UFID) |
| 2 | vmemo | 备注 | vmemo | varchar(200) |  | 字符串 (String) |
| 3 | pk_sppara | 分摊参数编码 | pk_sppara | varchar(20) |  | 分摊参数-成本组织 (CostSpparaOrgVO) |
| 4 | pk_coproject | 成本项目编码 | pk_coproject | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 5 | pk_coprojectmid | 成本项目中介编码 | pk_coprojectmid | varchar(20) |  | 成本分摊中介子表 (CospagencyinfoVO) |
| 6 | pk_codeptmid | 科室中介编码 | pk_codeptmid | varchar(20) |  | 科室分摊中介子表 (DeptspagencyinfoVO) |
| 7 | vcrowno | 行号 | vcrowno | varchar(50) |  | 字符串 (String) |
| 8 | pk_itemclass | 成本分类 | pk_itemclass | varchar(20) |  | 成本分类-成本组织 (CostingclassVO) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 15 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 16 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 17 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 18 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 19 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 20 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 21 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 22 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 23 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 24 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 25 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 26 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 27 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 28 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |