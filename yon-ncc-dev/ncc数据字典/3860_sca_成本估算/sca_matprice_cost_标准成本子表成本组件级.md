# |<<

**标准成本子表成本组件级 (sca_matprice_cost / nc.vo.sca.matprice.entity.MatpriceCostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice_cost | 标准成本子表成本组件级主键 | pk_matprice_cost | char(20) | √ | 主键 (UFID) |
| 2 | pk_matprice | 标准成本主键 | pk_matprice | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | thiscost | 本层成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | upcost | 上层成本 | upcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ncost | 总成本 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 10 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 11 | ccostcompstrucid | 成本组件结构 | ccostcompstrucid | varchar(20) |  | 成本组件结构 (bd_costcompstruc) |
| 12 | pk_setofbook | 财务账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 13 | updateversion | 更新版本 | updateversion | varchar(50) |  | 字符串 (String) |
| 14 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |