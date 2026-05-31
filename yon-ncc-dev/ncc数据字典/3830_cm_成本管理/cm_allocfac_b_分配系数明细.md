# |<<

**分配系数明细 (cm_allocfac_b / nc.vo.mapub.allocfac.entity.AllocfacItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocfac_bid | 分配系数明细 | callocfac_bid | char(20) | √ | 主键 (UFID) |
| 2 | callocfacid | 分配系数 | callocfacid | char(20) |  | 主键 (UFID) |
| 3 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 4 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | cmarcostclassid | 成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 7 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | nfactor | 系数 | nfactor | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 14 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 16 | cstuffid | 材料 | cstuffid | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | cmarbaseclassid | 基本分类 | cmarbaseclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 18 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 19 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 20 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 21 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 22 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 23 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 24 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 25 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 26 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 27 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |