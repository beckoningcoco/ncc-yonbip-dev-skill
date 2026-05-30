# |<<

**拣货查询出库单条件表体 (ic_pickbillquery_b / nc.vo.ic.m4v.entity.PickBillQueryCondBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2954.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 拣货查询出库单条件表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息 (material_v) |
| 4 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 5 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |