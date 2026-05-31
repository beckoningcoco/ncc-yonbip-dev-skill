# |<<

**工厂生产比例 (pd_orgpdrate / nc.vo.pd.orgproductionrate.entity.OrgProductionRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgpdrate | 工厂生产比例ID | pk_orgpdrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心版本 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 9 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 10 | fstatusflag | 单据状态 | fstatusflag | varchar(50) |  | 工厂生产比例状态 (OrgPDRateEnum) |  | 0=默认; |