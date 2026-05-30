# |<<

**要货月计划子表 (to_mointraplan_b / nc.vo.to.m5p.entity.MoIntraPlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 子表标识 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinpsnid | 调入业务员 | cinpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | coutpsnid | 调出业务员 | coutpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | frowstatusflag | 行状态 | frowstatusflag | int |  | 行状态 (RowStatus) |  | 1=自由; |