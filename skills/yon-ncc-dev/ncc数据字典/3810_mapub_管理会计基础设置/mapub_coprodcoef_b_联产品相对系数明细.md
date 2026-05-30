# |<<

**联产品相对系数明细 (mapub_coprodcoef_b / nc.vo.mapub.coprodcoef.entity.CoprodcoefItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccoprodcoefbid | 联产品相对系数明细 | ccoprodcoefbid | char(20) | √ | 主键 (UFID) |
| 2 | ccoprodcoefid | 联产品相对系数 | ccoprodcoefid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | iproducttype | 产品类型 | iproducttype | int | √ | 产品类型 (ProductTypeEnum) |  | 1=主产品; |