# |<<

**联副产品相对系数 (cm_productcoefficient / nc.vo.bd.productcoefficient.entity.ProductcoefficientHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1496.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmcoefficientid | 联副产品相对系数 | cmcoefficientid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 7 | cbomid | BOM | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 8 | crtid | 工艺路线 | crtid | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 9 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (NCMDEnum) |  | -1=自由; |