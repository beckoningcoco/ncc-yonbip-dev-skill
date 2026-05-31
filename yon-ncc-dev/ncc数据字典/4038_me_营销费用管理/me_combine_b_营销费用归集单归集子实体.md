# |<<

**营销费用归集单归集子实体 (me_combine_b / nc.vo.me.collectorder.entity.CombineBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_combine_b | 营销费用归集单归集子实体 | pk_combine_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 8 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 9 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 10 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 13 | nfeemny | 费用金额 | nfeemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |