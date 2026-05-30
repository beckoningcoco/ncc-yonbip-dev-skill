# |<<

**出入库单据类型匹配 (ic_transtypematch / nc.vo.ic.transtypematch.entity.TransTypeMatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtypematch | 出入库类型匹配主键 | pk_transtypematch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cinventoryclassid | 物料分类 | cinventoryclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cinventoryvid | 物料编码 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | ctrantypeid | 出入库类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |