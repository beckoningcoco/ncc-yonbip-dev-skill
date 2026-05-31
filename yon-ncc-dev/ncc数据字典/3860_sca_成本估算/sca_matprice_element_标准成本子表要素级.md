# |<<

**标准成本子表要素级 (sca_matprice_element / nc.vo.sca.matprice.entity.MatpriceElementVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice_element | 标准成本子表要素级主键 | pk_matprice_element | char(20) | √ | 主键 (UFID) |
| 2 | pk_matprice | 标准成本主键 | pk_matprice | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_costtype | 成本类型 | pk_costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | thiscost | 本层成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | upcost | 上层成本 | upcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ncost | 总成本 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 12 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 13 | ccostcompstrucid | 成本组件结构 | ccostcompstrucid | varchar(20) |  | 成本组件结构 (bd_costcompstruc) |
| 14 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 15 | updateversion | 更新版本 | updateversion | varchar(50) |  | 字符串 (String) |