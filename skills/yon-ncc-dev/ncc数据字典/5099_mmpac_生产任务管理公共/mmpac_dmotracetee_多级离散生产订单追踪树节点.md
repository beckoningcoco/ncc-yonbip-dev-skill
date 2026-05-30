# |<<

**多级离散生产订单追踪树节点 (mmpac_dmotracetee / nc.vo.mmpac.dmo.dmot.entity.DmoTraceTreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_moid | 生产订单主键 | pk_moid | varchar(50) | √ | 字符串 (String) |
| 2 | nodeid | 节点 | nodeid | varchar(50) |  | 字符串 (String) |
| 3 | vbillcode | 生产订单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 4 | moitemid | 生产订单明细 | moitemid | varchar(50) |  | 字符串 (String) |
| 5 | morowno | 生产订单行号 | morowno | varchar(50) |  | 字符串 (String) |
| 6 | parent_moid | 上级生产订单主键 | parent_moid | varchar(50) |  | 字符串 (String) |
| 7 | parent_nodeid | 父节点 | parent_nodeid | varchar(50) |  | 字符串 (String) |
| 8 | parent_vbillcode | 上级生产订单号 | parent_vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | parent_moitemid | 上级生产订单明细 | parent_moitemid | varchar(50) |  | 字符串 (String) |
| 10 | parent_morowno | 上级生产订单行号 | parent_morowno | varchar(50) |  | 字符串 (String) |
| 11 | matiname | 物料名称 | matiname | varchar(50) |  | 字符串 (String) |
| 12 | matiname2 | 物料名称2 | matiname2 | varchar(50) |  | 字符串 (String) |
| 13 | matiname3 | 物料名称3 | matiname3 | varchar(50) |  | 字符串 (String) |