# |<<

**标准成本查询(按产品结构) (sca_stdcost / nc.vo.sca.stdcoststruct.entity.StdCostQueryByStructVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5067.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdcostid | 标准成本查询(按产品结构) | cstdcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂（多版本） | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 9 | sumcost | 总成本 | sumcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nprice | 单位成本 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 主键 (UFID) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 主键 (UFID) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |