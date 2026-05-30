# |<<

**物料核算要素初始设置 (bd_accelement / nc.vo.bd.materialaccelement.AccelementVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/303.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accelements | 物料核算要素主键 | pk_accelements | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_cost | 成本域 | pk_cost | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | pk_setofbook | 核算帐簿 | pk_setofbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | productioncost | 计算生产成本 | productioncost | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | accelementstype | 物料核算要素类型 | accelementstype | varchar(10) |  | 物料核算要素类型 (accelementstype) |  | 1=财务成本; |