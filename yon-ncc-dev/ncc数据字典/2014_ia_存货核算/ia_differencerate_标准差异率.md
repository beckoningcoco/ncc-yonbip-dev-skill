# |<<

**标准差异率 (ia_differencerate / nc.vo.ia.differencerate.entity.DifferenceRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdifferencerateid | 差异率定义 | cdifferencerateid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | cinvclassid | 物料分类 | cinvclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | ndiffuplimit | 差异率上限 | ndiffuplimit | decimal(28, 15) |  | 数值 (UFDouble) |
| 8 | ndiffdownlimit | 差异率下限 | ndiffdownlimit | decimal(28, 15) |  | 数值 (UFDouble) |
| 9 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |