# |<<

**执行情况 (icdmc_finexecute / nc.vo.icdmc.icdmc.financepay.FinExecuteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iexecute_b | 主键 | pk_iexecute_b | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | summary | 执行情况类型 | summary | varchar(50) |  | 执行情况类型 (ExecuteTypeEnum) |  | HBJ=还本; |