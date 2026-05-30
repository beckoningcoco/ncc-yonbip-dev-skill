# |<<

**标准成本维护 (sca_matprice / nc.vo.sca.matprice.entity.MatpriceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice | 标准成本主键 | pk_matprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 8 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 9 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 10 | pk_profitcenter_v | 利润中心版本 | pk_profitcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 11 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cmeasdoc | 计量单位 | cmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | normcost | 总成本 | normcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | sourcetype | 来源类型 | sourcetype | int |  | 来源类型 (sourcetype) |  | 1=系统维护; |