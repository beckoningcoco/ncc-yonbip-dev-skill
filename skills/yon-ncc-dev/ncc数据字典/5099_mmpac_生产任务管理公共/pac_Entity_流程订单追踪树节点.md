# |<<

**流程订单追踪树节点 (pac_Entity / nc.vo.mmpac.pmotrace.pac0402.entity.PmoTreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_moid | 生产订单主键 | pk_moid | char(20) | √ | 主键 (UFID) |
| 2 | parent_moid | 上级生产订单主键 | parent_moid | char(20) |  | 主键 (UFID) |
| 3 | parent_nodeid | 父节点 | parent_nodeid | char(20) |  | 主键 (UFID) |
| 4 | nodeid | 节点 | nodeid | char(20) |  | 主键 (UFID) |
| 5 | monum | 生产订单号 | monum | varchar(50) |  | 字符串 (String) |
| 6 | matiname | 物料名称 | matiname | varchar(50) |  | 字符串 (String) |