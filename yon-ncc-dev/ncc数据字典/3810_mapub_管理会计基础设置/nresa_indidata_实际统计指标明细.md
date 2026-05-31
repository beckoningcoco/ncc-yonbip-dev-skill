# |<<

**实际统计指标明细 (nresa_indidata / nc.vo.mapub.indi.indidata.IndiDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indidata | 指标数据主键 | pk_indidata | char(20) | √ | 主键 (UFID) |
| 2 | pk_staindi | 统计指标 | pk_staindi | varchar(20) |  | 统计指标 (staindi) |
| 3 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 4 | pk_org_this | 本方业务单元 | pk_org_this | varchar(20) |  | 组织 (org) |
| 5 | pk_pcorg_this | 本方利润中心 | pk_pcorg_this | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_org_other | 对方业务单元 | pk_org_other | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 8 | pk_pcorg_other | 对方利润中心 | pk_pcorg_other | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | indiclass | 指标分类 | indiclass | varchar(50) |  | 指标数据分类 (indiclassEnum) |  | 1=公共_实际统计指标管理; |