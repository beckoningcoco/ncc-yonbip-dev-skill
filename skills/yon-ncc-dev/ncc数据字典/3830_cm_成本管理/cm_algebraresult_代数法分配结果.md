# |<<

**代数法分配结果 (cm_algebraresult / nc.vo.cm.servicealloc.AlgebraResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | calgebraresultid | 代数法分配结果 | calgebraresultid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 分配工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | cperoid | 分配会计期间 | cperoid | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | cfactoryid | 工厂 | cfactoryid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | nprice | 实际单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |